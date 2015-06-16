/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marc-Antoine
 */
public class Connexion implements Runnable{
    
    private Socket socket = null;

    private Scanner scan = null;
    private String adresseIp = null;
    private String numeroPort = null;

    public Connexion(Socket socket) {
        this.socket = socket;
        
    }

    @Override
    public void run() {
        
        Emission emission = new Emission(socket);
        emission.emettre("TROLOLOL");
        /*Thread threadReception = null;
        
        try {
            threadReception = new Thread(new Reception(new BufferedReader(new InputStreamReader(socket.getInputStream()))));
        } catch (IOException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        threadReception.start();*/
    }
}
