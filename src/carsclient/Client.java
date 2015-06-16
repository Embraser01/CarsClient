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


    try {

        System.out.println("Demande de connexion");
        socket = new Socket("127.0.0.1",42424);
        System.out.println("Connexion établie avec le serveur, authentification :"); // Si le message s'affiche c'est que je suis connecté

        t1 = new Thread(new Connexion(socket));
        t1.start();



    } catch (UnknownHostException e) {
        System.err.println("Impossible de se connecter à l'adresse "+socket.getLocalAddress());
    } catch (IOException e) {
        System.err.println("Aucun serveur à l'écoute du port "+socket.getLocalPort());
    }



    }

}
