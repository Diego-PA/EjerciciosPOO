import java.awt.*;
import javax.swing.*;

public class PruebaFlowLayout extends JFrame{
    /*
    private JButton botones[] = {
        new JButton("Botón 1"),
        new JButton("Botón 2"),
        new JButton("Botón 3"),
        new JButton("Botón 4"),
        new JButton("Botón 5"),
        new JButton("Botón 6")
    };
*/
    private JLabel botones[] = {
        new JLabel("Botón 1"),
        new JLabel("Botón 2"),
        new JLabel("Botón 3"),
        new JLabel("Botón 4"),
        new JLabel("Botón 5"),
        new JLabel("Botón 6")
    };

    public PruebaFlowLayout(){
        super("Prueba de FlowLayout()");
        Container contenedor = getContentPane();
        setLayout(new FlowLayout());
        for (int i = 0; i < botones.length; i++){
            contenedor.add(botones[i]);
        }
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        PruebaFlowLayout ventana = new PruebaFlowLayout();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
