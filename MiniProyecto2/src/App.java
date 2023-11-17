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
        // Agregar un ActionListener al elemento del menú "Salir"
        MenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        MenuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ciudadEncontrada = false;
                limpiarContenedor();
                etiqueta3 = new JLabel("-             Menu Crear Candidatos:   -");
                contenedor.add(etiqueta3);
                
                JLabel label = new JLabel("Nombre: ");
                textField = new JTextField(8);
                JLabel label2 = new JLabel("Cedula: ");
                JTextField textField2 = new JTextField(8);
                button = new JButton("CREAR CANDIDATO");
                panel2.add(label);
                panel2.add(textField);
                panel2.add(label2);
                panel2.add(textField2);
                panel2.add(button);
                panel1.add(panel2);

                JLabel label3 = new JLabel("Ciudad: ");
                textField3 = new JTextField(8);
                JLabel label4 = new JLabel("Derecha o Izquierda: ");
                JTextField textField4 = new JTextField(8);
                //button2 = new JButton("SEGURO");
                panel3.add(label3);
                panel3.add(textField3);
                panel3.add(label4);
                panel3.add(textField4);
                //panel3.add(button2);
                panel1.add(panel3);

                JLabel label6_3 = new JLabel("Casillas Partido, Promesa 1 y 2 favor con numero  ");
                JLabel label5 = new JLabel("         Partido Politico: ");
                textField5 = new JTextField(10);
                JLabel label6 = new JLabel("                             Promesa1: ");
                JTextField textField6 = new JTextField(10);
                JLabel label6_2 = new JLabel("                                 Promesa2: ");
                JTextField textField6_2 = new JTextField(10);
                panel4.add(label5);
                panel4.add(textField5);
                panel4.add(label6);
                panel4.add(textField6);
                panel4.add(label6_2);
                panel4.add(textField6_2);
                panel4.add(label6_3);
                panel1.add(panel4);


                contenedor.add(panel1);

                JLabel label7 = new JLabel("                                                     CIUDADES:                                ");
                panel6.add(label7);
                recorrerCiudades();
                
                JLabel label8 = new JLabel("                           PARTIDOS:                 ");
                panel7.add(label8);
                recorrerPartidos();

                JLabel label9 = new JLabel("                 PROMESAS: ");
                panel8.add(label9);
                recorrerPromesas();


                panel5.add(panel6);
                panel5.add(panel7);
                panel5.add(panel8);

                contenedor.add(panel5);


                contenedor.repaint();
                contenedor.revalidate();
                
                
                
                
                button.addActionListener(new ActionListener() {
                    
                    
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        try{
                            if(textField .getText().isEmpty() ||  textField2 .getText().isEmpty() || textField3 .getText().isEmpty()|| textField4 .getText().isEmpty()||
                            textField5 .getText().isEmpty()|| textField6 .getText().isEmpty()||textField6_2.getText().isEmpty()){
                                throw new CandidatoExcepcion("Alguna o todas las casilla estan vacias...");}
                            System.out.println("nombre: "+textField.getText());
                            String nombre = textField.getText();

                            String cedula = textField2.getText();
                            try{
                                Integer.parseInt(cedula);
                                
                                }catch(NumberFormatException  ex){
                                    JOptionPane.showMessageDialog(contenedor, "Solo se permiten numero en la cedula");
                                    return;
                            }

                            String ciudad = ""; 
                            Ciudades lestCiudades[] = Ciudades.values();

                            
                            //Ciudad
                            try{
                            for (int i = 0; i < lestCiudades.length; i++) {
                                String corrovorarCiudad = lestCiudades[i].toString();
                                
                                if(textField3.getText().equals(corrovorarCiudad)){
                                    ciudad = textField3.getText();
                                    ciudadEncontrada = true;
                                    }
                                                                    
                                }
                                if (!ciudadEncontrada) {
                                    throw new UnivalleException("Error... Favor verificar que el nombre de la ciudad sea igual al de la lista.");
                                }
                            }catch(CandidatoExcepcion ex){
                                    String mensaje = ex.getMessage();
                                    JOptionPane.showMessageDialog(contenedor, mensaje);
                                    return;
                                }
                            


                            boolean decision = false ;
                            try{
                                if(textField4.getText().equals("derecha") || textField4.getText().equals("izquierda")){
                                    //bien
                                }else{
                                    throw new CandidatoExcepcion("Error..verifique que su eleccion sea igual a dercha o izquierda(todo minusculas)");
                                }

                            }catch(CandidatoExcepcion ex){
                                String mensaje = ex.getMessage();
                                JOptionPane.showMessageDialog(contenedor, mensaje);return;
                                }                   
                            //Derecha o izquierda
                            if(textField4.getText().equals("derecha")){
                                decision = true;}else if(textField4.getText().equals("izquierda")){decision=false;}
                            
                            PartidosPoliticos partido = PartidosPoliticos.Aico;
                            PartidosPoliticos partidosPoliticos[] = PartidosPoliticos.values();
                            //PartidoPolitico
                            int numPromesa=0;
                            int numPartido=0;
                            int numPromesa2=0;
                            try{
                                numPartido = Integer.parseInt(textField5.getText());
                                numPromesa = Integer.parseInt(textField6.getText());
                                numPromesa2 = Integer.parseInt(textField6_2.getText());
                                if(1 > numPartido || numPartido > 11 || 1 > numPromesa || numPromesa > 7 ||1 > numPromesa2 || numPromesa2 >7 ){
                                    throw new CandidatoExcepcion("Error, posicion no encontrada en PartidoP o alguna de las promesas");
                                }
                                
                                }catch(NumberFormatException ex){
                                    JOptionPane.showMessageDialog(contenedor, "Solo se permiten numeros en las casilla de partido y promesas");
                                    return;
                                }catch(CandidatoExcepcion ex){
                                    String mensaje = ex.getMessage();
                                    JOptionPane.showMessageDialog(contenedor,mensaje);
                                    return;
                                }
                            for (int j = 0; j < partidosPoliticos.length; j++) {
                                if (partidosPoliticos[numPartido-1] == partidosPoliticos[j]) {
                                    partido = partidosPoliticos[j];
                                    listaCantPartidos[j] +=1;
                                }
                            }
                            //Promesas 1 y 2
                            Promesas promesa = Promesas.Aumento_seguridad;
                            Promesas promesa2 = Promesas.Aumento_seguridad;
                            Promesas lestpromesas[] = Promesas.values();
                            //Promesa1
                            
                            
                            for (int k = 0; k < lestpromesas.length; k++) {
                                if (lestpromesas[numPromesa-1] == lestpromesas[k]) {
                                    promesa = lestpromesas[k];
                                }
                            }
                            //Promesa2
                            
                            for (int k = 0; k < lestpromesas.length; k++) {
                                if (lestpromesas[numPromesa2-1] == lestpromesas[k]) {
                                    promesa2 = lestpromesas[k];
                                }
                            }Candidato nuevoCandidato = new Candidato(nombre, cedula,ciudad, decision, partido, promesa, promesa2);
                        
                        
                            miLista.add(numero, nuevoCandidato);
                            numero +=1;
                            }catch(CandidatoExcepcion ex){
                            String mensaje = ex.getMessage();
                            JOptionPane.showMessageDialog(contenedor, mensaje);
                        return;}
                        
//Para volverlo a subir lo borra porfa
                    
                    }
                    
                });
                
                
            }
        });
        MenuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button3;
                
                limpiarContenedor();
                etiqueta3 = new JLabel("-             Menu Actualizar Candidatos:   -");
                JLabel labelespacion = new JLabel("                                                                                                                                                                                                                                                                                                      ");
                JLabel label12 = new JLabel("Cedula del cantididato a actualizar: ");
                JTextField textField12 = new JTextField(8);
                button = new JButton("Enviar Solicitud");
                panelIncioActualizar.add(etiqueta3);
                panelIncioActualizar.add(labelespacion);
                panelIncioActualizar.add(label12);
                panelIncioActualizar.add(textField12); 
                panelIncioActualizar.add(button);
                contenedor.add(panelIncioActualizar);
                 

                
                JLabel label = new JLabel("Nombre: ");
                textField = new JTextField(8);
                panel2.add(label);
                panel2.add(textField);
                panel1.add(panel2);

                JLabel label3 = new JLabel("Ciudad: ");
                textField3 = new JTextField(8);
                JLabel label4 = new JLabel("Derecha o Izquierda: ");
                JTextField textField4 = new JTextField(8);
                button3 = new JButton("ACTUALIZAR CANDIDATO");
                button3.setEnabled(false);

                panel3.add(label3);
                panel3.add(textField3);
                panel3.add(label4);
                panel3.add(textField4);
                panel3.add(button3);
                panel1.add(panel3);

                button.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(miLista.size() == 0 || textField12.getText().isEmpty()){
                            JOptionPane.showMessageDialog(contenedor, "Aun no se an registrado Candidatos o la casilla esta vacia");
                        }else{
                        boolean comprobarCedula = false;
                        for (Candidato candidato : miLista) {
                            if(candidato.getCedula().equals(textField12.getText())){
                                button3.setEnabled(true);
                                JOptionPane.showMessageDialog(contenedor, "Se a encontrado la cedula con exito puede actualizar sus siguientes opciones");
                                comprobarCedula = true;
                            }

                            }if(comprobarCedula == false){
                            JOptionPane.showMessageDialog(contenedor,"No se a encontrado la Cedula buscada, favor revise si se dijito bien y vuelva a intentarlo");
                        }
                    }

                    }
                   
                    
                });
                JLabel label6_3 = new JLabel("Casillas Partido, Promesa 1 y 2 favor con numero  ");
                JLabel label5 = new JLabel("         Partido Politico: ");
                textField5 = new JTextField(10);
                JLabel label6 = new JLabel("                             Promesa1: ");
                JTextField textField6 = new JTextField(10);
                JLabel label6_2 = new JLabel("                                 Promesa2: ");
                JTextField textField6_2 = new JTextField(10);
                panel4.add(label5);
                panel4.add(textField5);
                panel4.add(label6);
                panel4.add(textField6);
                panel4.add(label6_2);
                panel4.add(textField6_2);
                panel4.add(label6_3);
                panel1.add(panel4);
                contenedor.add(panel1);

                JLabel label7 = new JLabel("                                                     CIUDADES:                                ");
                panel6.add(label7);
                recorrerCiudades();
                
                JLabel label8 = new JLabel("                           PARTIDOS:                 ");
                panel7.add(label8);
                recorrerPartidos();

                JLabel label9 = new JLabel("                 PROMESAS: ");
                panel8.add(label9);
                recorrerPromesas();


                panel5.add(panel6);
                panel5.add(panel7);
                panel5.add(panel8);

                contenedor.add(panel5);


                contenedor.repaint();
                contenedor.revalidate();

                button3.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                            ciudadEncontrada = false;
                            int size = miLista.size();
                            
                            for (int j = 0; j < size; j++) { 
                                Candidato candidato = miLista.get(j);
                                if(candidato.getCedula().equals(textField12.getText())){
                                    try{
                                        if(textField .getText().isEmpty() ||  textField3 .getText().isEmpty()|| textField4 .getText().isEmpty()||
                                        textField5 .getText().isEmpty()|| textField6 .getText().isEmpty()||textField6_2.getText().isEmpty()){
                                        throw new UnivalleException("Alguna o todas las casilla estan vacias...");}

                                
                                        String nombre = textField.getText();
                                        String ciudad = ""; 
                            Ciudades lestCiudades[] = Ciudades.values();

                            
                            //Ciudad
                            try{
                            for (int i = 0; i < lestCiudades.length; i++) {
                                String corrovorarCiudad = lestCiudades[i].toString();
                                
                                if(textField3.getText().equals(corrovorarCiudad)){
                                    ciudad = textField3.getText();
                                    ciudadEncontrada = true;
                                    }
                                                                    
                                }
                                if (!ciudadEncontrada) {
                                    throw new UnivalleException("Error... Favor verificar que el nombre de la ciudad sea igual al de la lista.");
                                }
                            }catch(UnivalleException ex){
                                    String mensaje = ex.getMessage();
                                    JOptionPane.showMessageDialog(contenedor, mensaje);
                                    return;
                                }
                            


                            boolean decision = false ;
                            try{
                                if(textField4.getText().equals("derecha") || textField4.getText().equals("izquierda")){
                                    //bien
                                }else{
                                    throw new UnivalleException("Error..verifique que su eleccion sea igual a dercha o izquierda(todo minusculas)");
                                }

                            }catch(UnivalleException ex){
                                String mensaje = ex.getMessage();
                                JOptionPane.showMessageDialog(contenedor, mensaje);return;
                                }                   
                            //Derecha o izquierda
                            if(textField4.getText().equals("derecha")){
                                decision = true;}else if(textField4.getText().equals("izquierda")){decision=false;}
                            
                            PartidosPoliticos partido = PartidosPoliticos.Aico;
                            PartidosPoliticos partidosPoliticos[] = PartidosPoliticos.values();
                            //PartidoPolitico
                            int numPromesa=0;
                            int numPartido=0;
                            int numPromesa2=0;
                            try{
                                numPartido = Integer.parseInt(textField5.getText());
                                numPromesa = Integer.parseInt(textField6.getText());
                                numPromesa2 = Integer.parseInt(textField6_2.getText());
                                if(1 > numPartido || numPartido > 11 || 1 > numPromesa || numPromesa > 7 ||1 > numPromesa2 || numPromesa2 >7 ){
                                    throw new UnivalleException("Error, posicion no encontrada en PartidoP o alguna de las promesas");
                                }
                                
                                }catch(NumberFormatException ex){
                                    JOptionPane.showMessageDialog(contenedor, "Solo se permiten numeros en las casilla de partido y promesas");
                                    return;
                                }catch(UnivalleException ex){
                                    String mensaje = ex.getMessage();
                                    JOptionPane.showMessageDialog(contenedor,mensaje);
                                    return;}
                                for (int w = 0; w < partidosPoliticos.length; w++) {
                                    if (partidosPoliticos[numPartido-1] == partidosPoliticos[w]) {
                                        partido = partidosPoliticos[w];
                                    }
                                }
                                //Promesas 1 y 2
                                Promesas promesa = Promesas.invalide;
                                Promesas promesa2 = Promesas.invalide;
                                Promesas lestpromesas[] = Promesas.values();
                                //Promesa1
                                
                                for (int k = 0; k < lestpromesas.length; k++) {
                                    if (lestpromesas[numPromesa-1] == lestpromesas[k]) {
                                        promesa = lestpromesas[k];
                                    }
                                }
                                //Promesa2
                                
                                for (int k = 0; k < lestpromesas.length; k++) {
                                    if (lestpromesas[numPromesa2-1] == lestpromesas[k]) {
                                        promesa2 = lestpromesas[k];
                                    }
                                }
                                Candidato nuevoCandidato = new Candidato(nombre, candidato.getCedula(),ciudad, decision, partido, promesa, promesa2);
                                
                                miLista.set(j, nuevoCandidato);
                                }catch(UnivalleException ex){
                                    String mensaje = ex.getMessage();
                                    JOptionPane.showMessageDialog(contenedor, mensaje);
                                    return;}
                                }
                                
                                }JOptionPane.showMessageDialog(contenedor, "Se a actualizado con exito");
                            }
                        
                            
                    });
                    
            }
        })
    }
    
}
