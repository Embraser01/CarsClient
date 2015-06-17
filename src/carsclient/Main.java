/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsclient;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Marc-Antoine
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Socket socket = null;
        Client client;
        
        try {
            System.out.println("Demande de connexion");
            socket = new Socket("127.0.0.1",42424);
            
            client = new Client(socket);
            //socket.close();
            
        } catch (IOException ex) {
            System.out.println("BUG");
        }
    }
    
}
