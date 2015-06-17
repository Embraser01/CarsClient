/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsclient;

import carsclient.reseau.Client;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Marc-Antoine
 */
public class MaFenetre extends JFrame implements KeyListener{

    Client client;
    
    public MaFenetre() {
        this.setTitle("Semaine Spé 2 2015 | Client Interface");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        client = new Client("192.168.43.42");
        
        this.addKeyListener(this);
        
    }

    
    
    @Override
    public void keyTyped(KeyEvent e) {}

    
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP)
            client.getCo().setUp(true);
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            client.getCo().setRight(true);
        if(e.getKeyCode() == KeyEvent.VK_DOWN)
            client.getCo().setDown(true);
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
            client.getCo().setLeft(true);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP)
            client.getCo().setUp(false);
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            client.getCo().setRight(false);
        if(e.getKeyCode() == KeyEvent.VK_DOWN)
            client.getCo().setDown(false);
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
            client.getCo().setLeft(false);
    }
    
}
