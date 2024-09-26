package com.ciranet.utilities;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ciranet.constants.Constants;

public class XMLCredentialsReader {

    public static class userCredentials {
        private String usertype;
    	private String username;
        private String password;

        public userCredentials(String usertype, String username, String password) {
            this.usertype = usertype;
        	this.username = username;
            this.password = password;
        }

        public String getUsertype() {
            return usertype;
        }
        
        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        @Override
        public String toString() {
            return "Usertype: " + usertype + ", Username: " + username + ", Password: " + password;
        }
    }

    public static List<userCredentials> readCredentials(String filePath) {
        List<userCredentials> credentialsList = new ArrayList<>();
        try {
            // Create a DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Create a DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the XML file and load it into a Document
            Document document = builder.parse(filePath);

            // Normalize the XML structure
            document.getDocumentElement().normalize();

            // Get the list of <user> elements
            NodeList userList = document.getElementsByTagName("user");

            for (int i = 0; i < userList.getLength(); i++) {
                Node userNode = userList.item(i);

                if (userNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element userElement = (Element) userNode;

                    // Get the usertype, username and password elements
                    String usertype = userElement.getElementsByTagName("usertype").item(0).getTextContent();
                    String username = userElement.getElementsByTagName("username").item(0).getTextContent();
                    String password = userElement.getElementsByTagName("password").item(0).getTextContent();

                    // Add the credentials to the list
                    credentialsList.add(new userCredentials(usertype, username, password));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return credentialsList;
    }
    
    
    public static userCredentials findUserByUsername(String username) throws Exception {
    	String filePath = System.getProperty("user.dir")
				+ Constants.USER_CREDENTIALS_PATH;
        List<userCredentials> credentialsList = readCredentials(filePath);
        for (userCredentials credentials : credentialsList) {
            if (credentials.getUsername().equalsIgnoreCase(username)) {
                return credentials;
            }
        }

        throw new RuntimeException("User does not exist: " + username);
    }
    
}