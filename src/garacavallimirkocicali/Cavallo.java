/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garacavallimirkocicali;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Mirko Cicali
 */
public class Cavallo extends JFrame {
    int cordx;
    int cordy;
    Image img;
    
    public Cavallo(int yy, int xx){
        cordx =0;
        cordy=yy;
        
        Toolkit tk= Toolkit.getDefaultToolkit();
        
        img = tk.getImage("cavallo.png");
        
        img = img.getScaledInstance(85, 80,Image.SCALE_SMOOTH);
                
        MediaTracker mt= new MediaTracker(this); // serve per la gestione di un num. arbitrario
        mt.addImage(img,1);// di immagini in parallelo
        setSize(1,2);
        

        try{mt.waitForID(1);}
        catch(InterruptedException e){}
    }
    
    public void setCordx(int n){
        cordx=n;
    }
    
    public int getCordx(){
        return cordx;
    }
    
    public void paint(Graphics ca){
        ca.drawImage(img, cordx, cordy, null);
    }
}
