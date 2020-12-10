import javax.swing.*;
import java.awt.*;

public class IGUMenu extends JFrame{
    
    public IGUMenu(){
        
        super("IGUMenu"); //Título de la ventana

        add(getBarraHtas(), BorderLayout.NORTH);

        setJMenuBar(getBarraMenu());//agregamos la barra de menú
        setSize(600, 500);
        setLocation(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public JMenu getMenuVentas(){ //Regresa un menú
        //Crear el menú
        JMenuItem miClientes = new JMenuItem("Clientes");
        JMenuItem miPedidos = new JMenuItem("Pedidos");
        JMenuItem miVentas = new JMenuItem("Ventas");

        JMenu mmVentas = new JMenu("Ventas");

        mmVentas.setFont(new Font("TimesRoman", Font.PLAIN, 32));
        mmVentas.setMnemonic('V');

        //Agregamos los elementos al menú
        mmVentas.add(miClientes);
        mmVentas.add(miPedidos);
        mmVentas.add(miVentas);

        return mmVentas;

    }

    public JMenuBar getBarraMenu(){

        JMenuBar mbBarraMenu =  new JMenuBar();
        //agregar lo que me regrese getmenuventas
        mbBarraMenu.add(getMenuVentas());
        mbBarraMenu.add(getMenuCompras());

        return mbBarraMenu;

    }

    public JMenu getMenuCompras(){ //Regresa un menú
        //Crear el menú
        JMenuItem miProveedores = new JMenuItem("Proveedores");
        JMenuItem miOrdenes = new JMenuItem("\u00d3rdenes");
        JMenuItem miCompras = new JMenuItem("Compras");

        miCompras.setIcon(new ImageIcon("Dance.gif"));

        JMenu mmCompras = new JMenu("Compras");
        //Tipo de letra
        mmCompras.setFont(new Font("TimesRoman", Font.PLAIN, 32));
        mmCompras.setMnemonic('C');

        //Agregamos los elementos al menú
        mmCompras.add(miProveedores);
        mmCompras.add(miOrdenes);
        mmCompras.addSeparator();
        mmCompras.add(miCompras);

        return mmCompras;

    }

    public JToolBar getBarraHtas(){

        JToolBar barraHtas = new JToolBar();
        JButton btSalir = new JButton(new ImageIcon("Dance.gif"));

        btSalir.setToolTipText("Salir del sistema");

        barraHtas.add(btSalir);

        return barraHtas;

    }

    public static void main(String[] args) {
        
        IGUMenu oIguMenu = new IGUMenu();

    }

}
