package GestionProyecto;

import static GestionProyecto.GestionForm.apellidomtxt;
import static GestionProyecto.GestionForm.apellidoptxt;
import static GestionProyecto.GestionForm.ContenedorCodigos;
import static GestionProyecto.GestionForm.codigotxt;
import static GestionProyecto.GestionForm.listaalumnos;
import static GestionProyecto.GestionForm.modelo;
import static GestionProyecto.GestionForm.nombretxt;
import static GestionProyecto.GestionForm.parcial1txt;
import static GestionProyecto.GestionForm.parcial2txt;
import static GestionProyecto.GestionForm.tabla;
import javax.swing.table.DefaultTableModel;
import static GestionProyecto.LoginFrame.txtuser;
/**
 *
 * @author kalfe
 */
public class Estudiante extends javax.swing.JFrame {
private DefaultTableModel modelo;
    int cont=0;
    int pos=0;
    /**
     * Creates new form Estudiante
     */
    int xMouse, yMouse;
    public Estudiante() {
        initComponents();
        cargarinterfaaz();
        cargardatos();
         
    }
   
    public void cargardatos(){
    int tamaLista = ContenedorCodigos.size();
       for (int i=0;i<tamaLista;i++){
           if (ContenedorCodigos.get(i).equals(txtuser.getText())){
                pos=i;   
                break;
            }
       }
    }
        
    public void cargarinterfaaz(){    
    String Datos[][]={};
    String columna[]={"Codigo","Apellido Paterno","Apellido Materno","Nombre","Parcial I","Parcial II","Parcial III"};
    modelo=new DefaultTableModel(Datos,columna);
    Tablaestudiante.setModel(modelo);
}
  

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        recibe = new javax.swing.JTextField();
        CodigoLabel = new javax.swing.JLabel();
        BttMostrar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablaestudiante = new javax.swing.JTable();
        PanelMove = new javax.swing.JPanel();
        BttSalir = new javax.swing.JButton();
        TituloLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recibe.setBackground(new java.awt.Color(51, 51, 51));
        recibe.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        recibe.setForeground(new java.awt.Color(255, 255, 255));
        recibe.setBorder(null);
        jPanel1.add(recibe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 80, 20));

        CodigoLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        CodigoLabel.setForeground(new java.awt.Color(255, 255, 255));
        CodigoLabel.setText("Codigo:");
        jPanel1.add(CodigoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 110, 60, -1));

        BttMostrar.setBackground(new java.awt.Color(102, 255, 255));
        BttMostrar.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        BttMostrar.setForeground(new java.awt.Color(255, 255, 255));
        BttMostrar.setText("Mostrar Datos");
        BttMostrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BttMostrar.setContentAreaFilled(false);
        BttMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BttMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(BttMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 120, 30));

        volver.setBackground(new java.awt.Color(102, 255, 255));
        volver.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        volver.setContentAreaFilled(false);
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 70, 30));

        Tablaestudiante.setBackground(new java.awt.Color(204, 204, 204));
        Tablaestudiante.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Tablaestudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tablaestudiante.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(Tablaestudiante);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 700, 90));

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

        BttSalir.setBackground(new java.awt.Color(255, 0, 0));
        BttSalir.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 18)); // NOI18N
        BttSalir.setForeground(new java.awt.Color(255, 0, 0));
        BttSalir.setText("X");
        BttSalir.setBorderPainted(false);
        BttSalir.setContentAreaFilled(false);
        BttSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BttSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttSalirActionPerformed(evt);
            }
        });
        PanelMove.add(BttSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel1.add(PanelMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 30));

        TituloLabel.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        TituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        TituloLabel.setText("Ventana estudiante");
        jPanel1.add(TituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BttMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttMostrarActionPerformed
        EstudianteFunciones e;
            e=(EstudianteFunciones) listaalumnos.get(pos);
            modelo.insertRow(cont,new Object[]{});
            modelo.setValueAt(e.getCodigo(),cont,0);
            modelo.setValueAt(e.getAppP(),cont,1);
            modelo.setValueAt(e.getAppM(),cont,2);
            modelo.setValueAt(e.getNombre(),cont,3);
            modelo.setValueAt(e.getParcial1(),cont,4);
            modelo.setValueAt(e.getParcial2(),cont,5);
            modelo.setValueAt(e.getParcial3(),cont,6);        
    }//GEN-LAST:event_BttMostrarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        LoginFrame login= new LoginFrame();
        login.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_volverActionPerformed

    private void BttSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttSalirActionPerformed
        // TODO add your handling code here:        
        System.exit(0);
    }//GEN-LAST:event_BttSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttMostrar;
    private javax.swing.JButton BttSalir;
    private javax.swing.JLabel CodigoLabel;
    private javax.swing.JPanel PanelMove;
    private javax.swing.JTable Tablaestudiante;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField recibe;
    public static javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
