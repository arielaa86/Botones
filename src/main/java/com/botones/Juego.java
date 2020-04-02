/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.botones;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;

/**
 *
 * @author ariel
 */
public class Juego {
    
   
    private JButton[] botones;
     private int cont = 0;

    public Juego() {
        botones = new JButton[10];
        
        for (int i = 0; i < botones.length; i++) {
            
            botones[i] = new JButton(String.valueOf(i));
            botones[i].setSize(40, 40);
        }
    }

    public JButton[] getBotones() {
        return botones;
    }

    public void setBotones(JButton[] botones) {
        this.botones = botones;
    }
    
    
    public void comenzar(){
        
        Timer timer = new Timer();
         
      
        timer.schedule(new TimerTask() {
            @Override
            public void run () {
                
                  
                    if(cont < botones.length){
                        
                        if(cont > 0 ){
                              botones[cont-1].setBackground(null);
                        }
                        
                         botones[cont].setBackground(Color.red);
                         cont++;
                         
                         
                         
                    }else{
                      
                        botones[cont-1].setBackground(null);
                        cont=0;
                       
                    }
                   
                    
                }

        }, 2000, 300);
        
        
    }
  
    
    
    
    
}
