/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmpptest;

import java.io.IOException;
import org.jivesoftware.smack.ConnectionConfiguration.SecurityMode;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;




/**
 *
 * @author Bruno
 */
public class XMPPTest {


    /**
     * @param args the command line arguments
     throws SmackException */
    public static void main(String[] args) throws SmackException, IOException, XMPPException {
        // TODO code application logic here
        
       
        
        XMPPTCPConnectionConfiguration config = XMPPTCPConnectionConfiguration.builder()  
        .setHost("127.0.0.1")  
        .setPort(9090)  
        .setServiceName("127.0.0.1")  
        .setUsernameAndPassword( "admin", "yasmin30092009")  
        .setCompressionEnabled(false)  
        .setSecurityMode(SecurityMode.ifpossible)  
        .setSendPresence(false)  
        .build();
        
        XMPPTCPConnection connection = new XMPPTCPConnection(config);
        connection.connect().login();
     
     /*   XMPPTCPConnection connection = new XMPPTCPConnection("admin", "yasmin30092009", "127.0.0.1");
     
        connection.connect().login();*/
    }

}
