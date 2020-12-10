import java.awt.*;
import javax.swing.*;

public class PruebaGridLayout extends JFrame{
    
    private JTextField[] campos = {
        new JTextField(),
        new JTextField(),
        new JTextField(),
        new JTextField()
    };

    private JLabel[] etiquetas = {
        new JLabel("Etiqueta 1"),
        new JLabel("Etiqueta 2"),
        new JLabel("Etiqueta 3"),
        new JLabel("Etiqueta 4")
    };

    public PruebaGridLayout() {

        super("Prueba de GridLayout()");
        //Container cont = getContentPane();
        setLayout(new GridLayout(4, 2));

        for(int i = 0; i < etiquetas.length; i++){

            add(etiquetas[i]);
            add(campos[i]);

        }
/*
        add(new JLabel("Etiqueta 1"));
        add(new JTextField());
        add(new JLabel("Etiqueta 2"));
        add(new JTextField());
        add(new JLabel("Etiqueta 3"));
        add(new JTextField());
        add(new JLabel("Etiqueta 4"));
        add(new JTextField());
*/
        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        PruebaGridLayout ventana = new PruebaGridLayout();

    }
}