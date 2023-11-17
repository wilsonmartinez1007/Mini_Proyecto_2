import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.util.ArrayList;
import java.util.List;


public class App extends JFrame {
    Container contenedor;
    GridLayout gridLayout,gridLayout2, gridLayout3,gridLayout4;
    FlowLayout flowLayout,flowLayout2, flowLayout3,flowLayout4,flowLayout5, flowLayout6;
    JButton button, button2;
    JTextField textField, textField3, textField5;
    JLabel etiqueta3 = new JLabel(" ");
    JPanel panel1, panel2, panel3, panel4,panel5,panel6, panel7, panel8, panel9,panelIncioActualizar;
    JScrollPane scroll, scroll2, scroll3, scroll4, scroll5,scroll6;
    List<Candidato> miLista = new ArrayList<>();
    int numero = 0;
    int[] listaCantPartidos = {0,0,0,0,0,0,0,0,0,0,0};

    
    int i= 0;
    
 
    
    public App() {

        this.contenedor = this.getContentPane();
        this.gridLayout = new GridLayout(3,0);
        this.gridLayout2 = new GridLayout(0,3);//panel del medio
        this.gridLayout3 = new GridLayout(0,3);//panel de abajo
        this.gridLayout4 = new GridLayout(0,6);//para imprimir los cantidatos
        this.contenedor.setLayout(this.gridLayout);
        //subpanel del panel del medio
        this.flowLayout = new FlowLayout();
        this.flowLayout2 = new FlowLayout();
        this.flowLayout3 = new FlowLayout();
        //subpanel de panel de abajo
        this.flowLayout4 = new FlowLayout();
        this.flowLayout5 = new FlowLayout();
        this.flowLayout6 = new FlowLayout();
        //para el panel del medio
        this.panel1 = new JPanel(this.gridLayout2);//panel principal
        this.panel2 = new JPanel(this.flowLayout);
        this.panel3 = new JPanel(this.flowLayout2);
        this.panel4 = new JPanel(this.flowLayout3);
        this.panel9 = new JPanel(this.gridLayout4);//para imprimir todos los candidatos
        this.panelIncioActualizar = new JPanel(this.flowLayout);
        //para el panel de abajo
        this.panel5 = new JPanel(this.gridLayout3);//panel principal
        this.panel6 = new JPanel(this.flowLayout4);
        this.panel7 = new JPanel(this.flowLayout5);
        this.panel8 = new JPanel(this.flowLayout5);
        
        // Configurar la ventana

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear los elementos del menú
        JMenu fileMenu = new JMenu("Inicio");
        JMenuItem MenuItem = new JMenuItem("Salir");
        JMenu fileMenu2 = new JMenu("Candidatos");
        JMenuItem MenuItem2 = new JMenuItem("Crear Candidatos");
        JMenuItem MenuItem3 = new JMenuItem("Actualizar Candidatos");
        JMenuItem MenuItem4 = new JMenuItem("Eliminar Candidato");
        JMenu fileMenu3 = new JMenu("Informacion Candidatos");
        JMenuItem MenuItem5 = new JMenuItem("Buscar Candidatos");
        JMenuItem MenuItem6 = new JMenuItem("Mostrar Candidatos");
        JMenu fileMenu4 = new JMenu("Salir CRUD");
        JMenuItem MenuItem7 = new JMenuItem("Salir del CRUD");
    }
    
}
