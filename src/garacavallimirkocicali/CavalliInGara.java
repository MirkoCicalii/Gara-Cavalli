/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garacavallimirkocicali;

/**
 *
 * @author Mirko Cicali
 */
public class CavalliInGara implements Runnable{
    Cavallo cavallo;
    GaraCavalli campo;
    int velocita; //Numero di pixel di spostamento al secondo: range 1-4
    Thread t;
    int conta; //Ogni 10 spostamenti cambio la velocità
    int posizione; //coordinata X in espressa in pixel

    public CavalliInGara(Cavallo c, GaraCavalli l) {
        cavallo = c; //Identificativo del ciclista
        campo = l; //Campo di gara-pista
        velocita = 3;
        t = new Thread(this);
        t.start();
        conta = 0;
        posizione = 0;
    }
    
    public void run() {
        //Muove il ciclista lungo il percorso, cambiando la velocità
       int dimImmagine = 79; //Dimensione del JPG del corridore
       int dimPista = 960;
       while((cavallo.getCordx()+dimImmagine)<dimPista){ //corsa non finita
           if((conta%10)==0)                             //Ogni dieci spostamenti
               velocita = (int)(Math.random()*4+1);      //Modifica la velocità
           cavallo.setCordx(cavallo.getCordx()+velocita);
           conta++;
           try{Thread.sleep(75);} //delay
           catch(Exception e){}
           campo.repaint();
       }
       //scrivo in che posizione è arrivato nella classifica finale
       posizione = campo.getPosizione();
       campo.controlloArrivi();
    }
    
}
