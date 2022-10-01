package GestionProyecto;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static GestionProyecto.LoginFrame.txtuser;
import java.util.LinkedList;

/**
 *
 * @author kalfe
 */
public class GestionForm extends javax.swing.JFrame {
public static LinkedList ContenedorCodigos = new LinkedList();
public static LinkedList listaalumnos = new LinkedList();

int xMouse, yMouse;
public static DefaultTableModel modelo; 
public GestionForm(){
    initComponents();
    Cargardatos();        
}

    int contador = 0;
    public void Cargardatos(){           
    String Datos[][] = {};
    String columna[] = {"Codigo", "Apellido Paterno", "Apellido Materno", "Nombre", 
        "Parcial I","Parcial II","Parcial III"};
    modelo = new DefaultTableModel(Datos,columna);
    tabla.setModel(modelo);
}
    
    public void Actualizar(){
        modelo.getDataVector().removeAllElements();
        tabla.updateUI();
        EstudianteFunciones e ;
   
        for(int i = listaalumnos.size() -1; i >= 0; i--){
            e=(EstudianteFunciones) listaalumnos.get(i);
            modelo.insertRow(contador, new Object[]{});
            modelo.setValueAt(e.getCodigo(), contador,0);
            modelo.setValueAt(e.getAppP(), contador,1);
            modelo.setValueAt(e.getAppM(), contador,2);
            modelo.setValueAt(e.getNombre(), contador,3);
            modelo.setValueAt(e.getParcial1(), contador,4);
            modelo.setValueAt(e.getParcial2(), contador,5);
            modelo.setValueAt(e.getParcial3(), contador,6);
        }  
    }
    
    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btteliminar = new javax.swing.JButton();
        bttvolver = new javax.swing.JButton();
        nombretxt = new javax.swing.JTextField();
        parcial1txt = new javax.swing.JTextField();
        parcial2txt = new javax.swing.JTextField();
        parcial3txt = new javax.swing.JTextField();
        btteditar = new javax.swing.JButton();
        bttagregar = new javax.swing.JButton();
        bttnuevo = new javax.swing.JButton();
        parcial1 = new javax.swing.JLabel();
        parcial2 = new javax.swing.JLabel();
        parcial3 = new javax.swing.JLabel();
        nombres = new javax.swing.JLabel();
        apellidom = new javax.swing.JLabel();
        apellidomtxt = new javax.swing.JTextField();
        apellidoptxt = new javax.swing.JTextField();
        apellidop = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        codigotxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        PanelMove = new javax.swing.JPanel();
        ButtExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btteliminar.setBackground(new java.awt.Color(102, 255, 255));
        btteliminar.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btteliminar.setForeground(new java.awt.Color(255, 255, 255));
        btteliminar.setText("Eliminar");
        btteliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btteliminar.setContentAreaFilled(false);
        btteliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btteliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 70, 30));

        bttvolver.setBackground(new java.awt.Color(102, 255, 255));
        bttvolver.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        bttvolver.setForeground(new java.awt.Color(255, 255, 255));
        bttvolver.setText("Volver");
        bttvolver.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        bttvolver.setContentAreaFilled(false);
        bttvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttvolverActionPerformed(evt);
            }
        });
        jPanel1.add(bttvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 60, 30));

        nombretxt.setBackground(new java.awt.Color(51, 51, 51));
        nombretxt.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        nombretxt.setForeground(new java.awt.Color(255, 255, 255));
        nombretxt.setBorder(null);
        jPanel1.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 160, -1));

        parcial1txt.setBackground(new java.awt.Color(51, 51, 51));
        parcial1txt.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        parcial1txt.setForeground(new java.awt.Color(255, 255, 255));
        parcial1txt.setBorder(null);
        jPanel1.add(parcial1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 90, -1));

        parcial2txt.setBackground(new java.awt.Color(51, 51, 51));
        parcial2txt.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        parcial2txt.setForeground(new java.awt.Color(255, 255, 255));
        parcial2txt.setBorder(null);
        parcial2txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcial2txtActionPerformed(evt);
            }
        });
        jPanel1.add(parcial2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 90, -1));

        parcial3txt.setBackground(new java.awt.Color(51, 51, 51));
        parcial3txt.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        parcial3txt.setForeground(new java.awt.Color(255, 255, 255));
        parcial3txt.setBorder(null);
        jPanel1.add(parcial3txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 90, -1));

        btteditar.setBackground(new java.awt.Color(102, 255, 255));
        btteditar.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btteditar.setForeground(new java.awt.Color(255, 255, 255));
        btteditar.setText("Editar (Actualizar)");
        btteditar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btteditar.setContentAreaFilled(false);
        btteditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btteditarActionPerformed(evt);
            }
        });
        jPanel1.add(btteditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 160, 30));

        bttagregar.setBackground(new java.awt.Color(102, 255, 255));
        bttagregar.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        bttagregar.setForeground(new java.awt.Color(255, 255, 255));
        bttagregar.setText("Agregar");
        bttagregar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        bttagregar.setContentAreaFilled(false);
        bttagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttagregarActionPerformed(evt);
            }
        });
        jPanel1.add(bttagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 70, 30));

        bttnuevo.setBackground(new java.awt.Color(102, 255, 255));
        bttnuevo.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        bttnuevo.setForeground(new java.awt.Color(255, 255, 255));
        bttnuevo.setText("Nuevo");
        bttnuevo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        bttnuevo.setContentAreaFilled(false);
        bttnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnuevoActionPerformed(evt);
            }
        });
        jPanel1.add(bttnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 70, 30));

        parcial1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        parcial1.setForeground(new java.awt.Color(255, 255, 255));
        parcial1.setText("Parcial 1:");
        jPanel1.add(parcial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 60, -1));

        parcial2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        parcial2.setForeground(new java.awt.Color(255, 255, 255));
        parcial2.setText("Parcial 2:");
        jPanel1.add(parcial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 60, -1));

        parcial3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        parcial3.setForeground(new java.awt.Color(255, 255, 255));
        parcial3.setText("Parcial 3:");
        jPanel1.add(parcial3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 60, -1));

        nombres.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(255, 255, 255));
        nombres.setText("Nombres:");
        jPanel1.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        apellidom.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        apellidom.setForeground(new java.awt.Color(255, 255, 255));
        apellidom.setText("Apellido Materno:");
        jPanel1.add(apellidom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        apellidomtxt.setBackground(new java.awt.Color(51, 51, 51));
        apellidomtxt.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        apellidomtxt.setForeground(new java.awt.Color(255, 255, 255));
        apellidomtxt.setBorder(null);
        jPanel1.add(apellidomtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 160, -1));

        apellidoptxt.setBackground(new java.awt.Color(51, 51, 51));
        apellidoptxt.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        apellidoptxt.setForeground(new java.awt.Color(255, 255, 255));
        apellidoptxt.setBorder(null);
        apellidoptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoptxtActionPerformed(evt);
            }
        });
        jPanel1.add(apellidoptxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 160, -1));

        apellidop.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        apellidop.setForeground(new java.awt.Color(255, 255, 255));
        apellidop.setText("Apellido Paterno:");
        jPanel1.add(apellidop, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        codigo.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        codigo.setForeground(new java.awt.Color(255, 255, 255));
        codigo.setText("Código:");
        jPanel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        codigotxt.setBackground(new java.awt.Color(51, 51, 51));
        codigotxt.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        codigotxt.setForeground(new java.awt.Color(255, 255, 255));
        codigotxt.setBorder(null);
        codigotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigotxtActionPerformed(evt);
            }
        });
        jPanel1.add(codigotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 160, -1));

        tabla.setBackground(new java.awt.Color(204, 204, 204));
        tabla.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 850, 250));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tabla de Registros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 160, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 90, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 160, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 160, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 160, 10));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 160, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 90, 10));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 90, 10));

        PanelMove.setBackground(new java.awt.Color(51, 51, 51));
        PanelMove.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelMoveMouseDragged(evt);
            }
        });
        PanelMove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelMoveMousePressed(evt);
            }
        });
        PanelMove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtExit.setBackground(new java.awt.Color(255, 0, 0));
        ButtExit.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 24)); // NOI18N
        ButtExit.setForeground(new java.awt.Color(255, 0, 0));
        ButtExit.setText("X");
        ButtExit.setBorderPainted(false);
        ButtExit.setContentAreaFilled(false);
        ButtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtExitActionPerformed(evt);
            }
        });
        PanelMove.add(ButtExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel1.add(PanelMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //DefaultTableModel modelo = new DefaultTableModel();     
    
    private void codigotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigotxtActionPerformed

    private void apellidoptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoptxtActionPerformed

    private void parcial2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcial2txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parcial2txtActionPerformed

    private void bttagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttagregarActionPerformed
        // TODO add your handling code here:
        String nombre = nombretxt.getText();
        String ApellidoP = apellidoptxt.getText();
        String ApellidoM = apellidomtxt.getText();
        String codigo = codigotxt.getText();
        String parcial1 = parcial1txt.getText();
        String parcial2 = parcial2txt.getText();
        String parcial3 = parcial3txt.getText();
        EstudianteFunciones datos =new EstudianteFunciones(codigo, ApellidoP, ApellidoM, nombre, parcial1, parcial2, parcial3);
        
        ContenedorCodigos.add(codigo);
            listaalumnos.add(datos);
            codigotxt.setText("");
            apellidoptxt.setText("");
            apellidomtxt.setText("");
            nombretxt.setText("");
            parcial1txt.setText("");
            parcial2txt.setText("");
            parcial3txt.setText("");
            modelo.getDataVector().removeAllElements();
            Actualizar();
    
    }//GEN-LAST:event_bttagregarActionPerformed

    private void bttnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnuevoActionPerformed
        // TODO add your handling code here:
        this.codigotxt.setText("");
        this.apellidoptxt.setText("");
        this.apellidomtxt.setText("");
        this.nombretxt.setText("");
        this.parcial1txt.setText("");
        this.parcial2txt.setText("");
        this.parcial3txt.setText("");          
    }//GEN-LAST:event_bttnuevoActionPerformed
    
     int filas;
    
    private void btteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btteditarActionPerformed
        // TODO add your handling code here:
        //Editar/Actualizar
   
        int fila_seleccionad = tabla.getSelectedRow();
            String nombre = nombretxt.getText();
            String ApellidoP = apellidoptxt.getText();
            String ApellidoM = apellidomtxt.getText();
            String codigo = codigotxt.getText();
            String parcial1 = parcial1txt.getText();
            String parcial2 = parcial2txt.getText();
            String parcial3 = parcial3txt.getText();
 
        EstudianteFunciones e = new EstudianteFunciones(codigo, ApellidoP, ApellidoM, nombre, parcial1, parcial2, parcial3);
        listaalumnos.set(fila_seleccionad, e);
        System.out.println(fila_seleccionad);
        codigotxt.setText("");
        apellidoptxt.setText("");
        apellidomtxt.setText("");
        nombretxt.setText("");
        parcial1txt.setText("");
        parcial2txt.setText("");
        parcial3txt.setText("");
        //Limpiar despues de modificar

        Actualizar();
    }//GEN-LAST:event_btteditarActionPerformed

    private void btteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btteliminarActionPerformed
        // TODO add your handling code here:
        //Eliminar
        int fila_seleccionada = tabla.getSelectedRow();
        if(fila_seleccionada >= 0){
            modelo.removeRow(fila_seleccionada);
            listaalumnos.remove(fila_seleccionada);  
            codigotxt.setText("");
            apellidoptxt.setText("");
            apellidomtxt.setText("");
            nombretxt.setText("");
            parcial1txt.setText("");
            parcial2txt.setText("");
            parcial3txt.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione una fila" );
        }
        Actualizar();
    }//GEN-LAST:event_btteliminarActionPerformed
 
    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
       
        int fila_seleccionada=tabla.getSelectedRow();
            codigotxt.setText(tabla.getValueAt(fila_seleccionada, 0).toString());
            apellidoptxt.setText(tabla.getValueAt(fila_seleccionada, 1).toString());
            apellidomtxt.setText(tabla.getValueAt(fila_seleccionada, 2).toString());
            nombretxt.setText(tabla.getValueAt(fila_seleccionada, 3).toString());
            parcial1txt.setText(tabla.getValueAt(fila_seleccionada, 4).toString());
            parcial2txt.setText(tabla.getValueAt(fila_seleccionada, 5).toString());
            parcial3txt.setText(tabla.getValueAt(fila_seleccionada, 6).toString());
            filas = fila_seleccionada;
            System.out.println(fila_seleccionada);
        
    }//GEN-LAST:event_tablaMouseClicked

    private void bttvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttvolverActionPerformed
        // TODO add your handling code here:
        LoginFrame VentanaLogin = new LoginFrame();
        VentanaLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttvolverActionPerformed

    private void PanelMoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMoveMousePressed
        // TODO add your handling code here:        
        xMouse = evt.getX();
        yMouse = evt.getY();            
    }//GEN-LAST:event_PanelMoveMousePressed

    private void PanelMoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMoveMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);   
    }//GEN-LAST:event_PanelMoveMouseDragged

    private void ButtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ButtExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtExit;
    private javax.swing.JPanel PanelMove;
    private javax.swing.JLabel apellidom;
    public static javax.swing.JTextField apellidomtxt;
    private javax.swing.JLabel apellidop;
    public static javax.swing.JTextField apellidoptxt;
    public static javax.swing.JButton bttagregar;
    public static javax.swing.JButton btteditar;
    public static javax.swing.JButton btteliminar;
    public static javax.swing.JButton bttnuevo;
    private javax.swing.JButton bttvolver;
    private javax.swing.JLabel codigo;
    public static javax.swing.JTextField codigotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel nombres;
    public static javax.swing.JTextField nombretxt;
    private javax.swing.JLabel parcial1;
    public static javax.swing.JTextField parcial1txt;
    private javax.swing.JLabel parcial2;
    public static javax.swing.JTextField parcial2txt;
    private javax.swing.JLabel parcial3;
    public static javax.swing.JTextField parcial3txt;
    public static javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
