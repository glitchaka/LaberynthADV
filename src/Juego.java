import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Juego extends JPanel{

    public Juego(){}
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
            game.repaint();
        }

    }
    
}
