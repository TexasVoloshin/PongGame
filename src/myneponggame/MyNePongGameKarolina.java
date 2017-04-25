/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myneponggame;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author KasiaW
 */
public class MyNePongGame extends JPanel {
    
    int x=0;
    int y=0;
    
    int border= 30;
    boolean ballGoesDown=true;
    boolean ballGoesRight=true;
    
    
    public void moveBall() 
            
    {
          if (ballGoesRight==true)
       {
            x= x+1; //przesuwa kulke o 1 piksel w prawo
    }
       
        if (ballGoesRight==false)
       {
            x= x-1; //przesuwa kulke o 1 piksel w lewo
    }
      
       if (ballGoesDown==true)
       {
            y= y+1; //przesuwa kulke o 1 piksel do góry
    }
       
        if (ballGoesDown==false)
       {
            y= y-1; //przesuwa kulke o 1 piksel w dół
    }
        // wykrywa kiedy kulka uderza w doł ramki i powoduje odbicie
       if (y==getHeight()- border)
       {
          ballGoesDown = false;
          System.out.println("Odbicie po Y");
    }
         // wykrywa kiedy kulka uderza w góre ramki i powoduje odbicie
      if (y==0)
       {
          ballGoesDown = true;
          System.out.println("Odbicie po Y");
    }
       // wykrywa kiedy kulka uderza  w prawa krawedz ramki i powoduje odbicie
       if (x==getWidth()-border)
       {
         ballGoesRight = false;
         System.out.println("Odbicie po X"); 
    }
       // wykrywa kiedy kulka uderza w lewą krawedz ramki i powoduje odbicie
        if (x==0)
       {
          ballGoesRight = true;
         System.out.println("Odbicie po X"); 
    }
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.fillOval(x,y,30,30);
        System.out.println("Look  in painting!");
    }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        JFrame myFrame = new JFrame("Moja gra w ponga! Autor: Karolina Woloszyn");
        myFrame.setSize(700,500);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        
        
        MyNePongGame game= new MyNePongGame();
        myFrame.add(game);
        
        while (true)
        {
            game.moveBall();
            game.repaint();
            
                Thread.sleep(10);
                
            }
            
            }

            /*System.out.println("Witaj nowy Graczu!");
            System.out.println("Witaj nowy Graczu!");
            */
                }
        
    
    

