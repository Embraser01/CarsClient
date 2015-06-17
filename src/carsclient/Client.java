/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsclient;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Marc-Antoine
 */
public class Client {

    public static Socket socket = null;
    public static Thread t1;

    public Client(Socket socket) {


        System.out.println("Connexion établie avec le serveur, authentification :");
        t1 = new Thread(new Connexion(socket));
        t1.start();



    }

}
