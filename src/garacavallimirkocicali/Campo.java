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
public class Campo extends JPanel{ //pannello campo
    public void paint(Graphics l){
        l.setColor(Color.green);
        l.fillRect(0, 0, 1000, 1600);
        //Linee Laterali
        l.setColor(Color.white);
        l.fillRect(0, 0, 1000, 10);
        l.fillRect(0, 100, 1000, 10);
        l.fillRect(0, 200, 1000, 10);
        l.fillRect(0, 300, 1000, 10);
        l.fillRect(0, 400, 1000, 10);
        l.fillRect(0, 500, 1000, 10);
        l.fillRect(0, 600, 1000, 10);
        l.fillRect(0, 700, 1000, 10);
        l.fillRect(0, 800, 1000, 10);
        l.fillRect(0, 900, 1000, 10);
        l.fillRect(0, 1000, 1000, 10);
        //Traguardo   
        l.fillRect(960, 0, 5, 1600);
        l.fillRect(960, 0, 5, 1600);
        l.fillRect(960, 0, 5, 1600);
    }
}