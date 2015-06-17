/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsclient;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author Marc-Antoine
 */

public class ImageCam extends JComponent{
    
    
    public static Image getFile(){ 
        try {  
            URL url = new URL("http://192.168.1.12/cam_pic.php");
            return(ImageIO.read(url));
        }   
        catch (IOException e) {  
        }  
        return null;  
    } 

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(850,480);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(ImageCam.getFile(), 0, 0, null);
    }
    
    
}
