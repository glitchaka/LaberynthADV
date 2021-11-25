import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Personaje {
    Laberinto maze = new Laberinto();
    int x=40;
    int y = 40;
    int ancho= 40;
    int alto = 40;
    int movimientos = 40;

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, ancho, alto);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, ancho, alto);

        // Ojos

        g.setColor(Color.WHITE);
        g.fillOval(x+7, y+8,13,13);
        g.fillOval(x+21,y+8,13,13);
        g.setColor(Color.BLACK);
        g.fillOval(x+11,y+12,5,5);
        g.fillOval(x+25,y+12,5,5);

        // Boca 

        g.setColor(Color.BLACK);
        g.fillOval(x+7, y+24, 27, 7);

    }

    public void teclaPresionada(KeyEvent event){ 

        int [][]laberinto = maze.obtieneLaberinto();
        if (event.getKeyCode()==72) {//IZQUIERDA
            if(laberinto[y/40][(x/40)-1]!=1){
                x-=movimientos;
            }
        }
        if (event.getKeyCode()==76) {//DERECHA
            if(laberinto[y/40][(x/40)+1]!=1){
                x+=movimientos;
            }
        }
        if (event.getKeyCode()==74) {//ABAJO
            if(laberinto[(y/40)+1][x/40]!=1){
                y+=movimientos;
            }
        }
        if (event.getKeyCode()==75) {//ARRIBA
            if(laberinto[(y/40)-1][x/40]!=1){
                y-=movimientos;
            }
        }
        if (x==840 && y==440) {
            Juego.cambiaNivel();
            x=40;
            y=40;
        }
    }

}
