package GestionProyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author kalfe
 */
public class LoginFrame extends javax.swing.JFrame {    
    int xMouse, yMouse;
    
    public LoginFrame(){
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userlabel = new javax.swing.JLabel();
        passwordlabel = new javax.swing.JLabel();
        bttiniciar = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        PanelMove = new javax.swing.JPanel();
        ExitBtt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userlabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        userlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acceso.png"))); // NOI18N
        jPanel1.add(userlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 30, 30));

        passwordlabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        passwordlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/accesop.png"))); // NOI18N
        jPanel1.add(passwordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 40, -1));

        bttiniciar.setBackground(new java.awt.Color(153, 255, 255));
        bttiniciar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bttiniciar.setForeground(new java.awt.Color(102, 255, 255));
        bttiniciar.setText("Iniciar Sesión");
        bttiniciar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.cyan));
        bttiniciar.setContentAreaFilled(false);
        bttiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttiniciarMouseClicked(evt);
            }
        });
        bttiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(bttiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 190, 30));

        txtuser.setBackground(new java.awt.Color(51, 51, 51));
        txtuser.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setBorder(null);
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 180, 20));

        txtpassword.setBackground(new java.awt.Color(51, 51, 51));
        txtpassword.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setBorder(null);
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 180, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar-sesion.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 130, 130));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 180, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 180, 10));

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
        jPanel1.add(PanelMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 30));

        ExitBtt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        ExitBtt.setBorderPainted(false);
        ExitBtt.setContentAreaFilled(false);
        ExitBtt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBttActionPerformed(evt);
            }
        });
        jPanel1.add(ExitBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttiniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttiniciarActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:         
    }//GEN-LAST:event_txtuserActionPerformed

    private void bttiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttiniciarMouseClicked
        // TODO add your handling code here:
        
        String usuario = "admin";
        String contrasena = "admin";
        
        String Pass = new String(txtpassword.getPassword()); 
        
        String usu = txtuser.getText();
        int CodASCII=0;
        char Caracter;
        boolean band=true;
         for(int i=0;i<usu.length();i++){
            Caracter = usu.charAt(i);
            CodASCII = (int)Caracter;
            if(CodASCII >= 48 && CodASCII <= 57){
                band=false;
                break;
            }}
        if(band==false){
            if(Gestion.comprobar(txtuser.getText())== true){
                    Estudiante VentanaEstudiante = new Estudiante();
                    VentanaEstudiante.setVisible(true);
                    Estudiante.recibe.setText(usu);
                    this.dispose(); 
            }
                else{
                    JOptionPane.showMessageDialog(this, "Usted no esta registrado por el Docente");
                }
        }
        else{
        if(txtuser.getText().equals(usuario) && Pass.equals(contrasena)){
            GestionForm VentanaGestion = new GestionForm();
            VentanaGestion.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "El Usuario y/o Contraseña son Incorrectas");
        }
        }       
    }//GEN-LAST:event_bttiniciarMouseClicked

    private void ExitBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBttActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_ExitBttActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtt;
    private javax.swing.JPanel PanelMove;
    public static javax.swing.JButton bttiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel passwordlabel;
    public static javax.swing.JPasswordField txtpassword;
    public static javax.swing.JTextField txtuser;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}
