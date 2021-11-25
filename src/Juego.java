import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Juego extends JPanel{
    Laberinto laberinto = new Laberinto();
    Personaje personaje = new Personaje();
    public static int nivel = 1;

    public Juego(){
        addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.teclaPresionada(e);
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });
        setFocusable(true);
    }
    public void paint(Graphics g){
        super.paintComponent(g);
        laberinto.paint(g);
        personaje.paint(g);
    }

    public static int cambiaNivel(){
        return nivel++;
    }

    public static int obtieneNivel(){
        return nivel;
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Are you Ready?");
        JFrame frame = new JFrame("Mazerdrix");
        Juego game = new Juego();
        frame.add(game);
        frame.setSize(920,540);
        frame.setLocation(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            game.validate();
            game.repaint();
            

            if (obtieneNivel() >3) {
                JOptionPane.showMessageDialog(null, "You Win!");
                System.exit(0);
            }
                
            }
        }

    }
    

