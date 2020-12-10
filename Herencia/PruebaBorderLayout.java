import java.awt.*;
import javax.swing.*;

public class PruebaBorderLayout extends JFrame{
    
    public PruebaBorderLayout() {

        super("Prueba de BorderLayout()");
        //Container cont = getContentPane();
        setLayout(new BorderLayout());

        add(new JLabel("Etiqueta Norte"), BorderLayout.NORTH);
        add(new JButton("Etiqueta Sur"), BorderLayout.SOUTH);
        add(new JLabel("Etiqueta Centro"), BorderLayout.CENTER);
        add(new JLabel("Etiqueta Este"), BorderLayout.EAST);
        add(new JLabel("Etiqueta Oeste"), BorderLayout.WEST);

        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        PruebaBorderLayout ventana = new PruebaBorderLayout();

    }
}
