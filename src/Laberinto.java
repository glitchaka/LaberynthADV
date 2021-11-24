import java.awt.Graphics;
public class Laberinto {
    int [][] lab = new int[13][13]; 
    int fila = 0;
    int columna = 0;
    int numeroColumna = 13;
    int numeroFila = 13;
    int anchoBloque = 40;
    int altoBloque = 40;

    public void paint(Graphics g) {
        }
    public int [][] obtieneLaberinto() {
        return lab;
    }
 }
