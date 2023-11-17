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

        contenedor = getContentPane();
        gridLayout = new GridLayout(3,0);
        gridLayout2 = new GridLayout(0,3);//panel del medio
        gridLayout3 = new GridLayout(0,3);//panel de abajo
        gridLayout4 = new GridLayout(0,6);//para imprimir los cantidatos
        contenedor.setLayout(gridLayout);
        //subpanel del panel del medio
        flowLayout = new FlowLayout();
        flowLayout2 = new FlowLayout();
        flowLayout3 = new FlowLayout();
        //subpanel de panel de abajo
        flowLayout4 = new FlowLayout();
        flowLayout5 = new FlowLayout();
        flowLayout6 = new FlowLayout();
        //para el panel del medio
        panel1 = new JPanel(gridLayout2);//panel principal
        panel2 = new JPanel(flowLayout);
        panel3 = new JPanel(flowLayout2);
        panel4 = new JPanel(flowLayout3);
        panel9 = new JPanel(gridLayout4);//para imprimir todos los candidatos
        panelIncioActualizar = new JPanel(flowLayout);

    }
    
}
