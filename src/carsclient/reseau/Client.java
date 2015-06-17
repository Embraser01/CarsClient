/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsclient.reseau;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Marc-Antoine
 */
public class Client {

    private static Socket socket = null;
    private static Thread t1;
    private Connexion co;

    public Client() {

        try {
            System.out.println("Adresse IP du Robot ?");
            
            socket = new Socket((new Scanner(System.in)).next(),42424);
            System.out.println("Connexion établie avec le serveur, authentification :");
            co = new Connexion(socket);
            t1 = new Thread(co);
            t1.start();
            //socket.close();
            
        } catch (IOException ex) {
            System.out.println("Impossible de se connecter au robot (mauvaise adresse ?)");
        }
    }

    public Client(String adresse) {

        try {
            socket = new Socket(adresse,42424);
            System.out.println("Connexion établie a " + adresse + ", authentification :");
            co = new Connexion(socket);
            t1 = new Thread(co);
            t1.start();
            //socket.close();
            
            
        } catch (IOException ex) {
            System.out.println("Impossible de se connecter au robot (mauvaise adresse ?)");
        }
    }

    public Connexion getCo() {
        return co;
    }
    
    
}
