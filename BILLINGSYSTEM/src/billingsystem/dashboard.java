/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package billingsystem;

/**
 *
 * @author dexte
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        admin = new javax.swing.JMenu();
        newC = new javax.swing.JMenuItem();
        cusD = new javax.swing.JMenuItem();
        depoD = new javax.swing.JMenuItem();
        calBill = new javax.swing.JMenuItem();
        information = new javax.swing.JMenu();
        upD = new javax.swing.JMenuItem();
        viewIn = new javax.swing.JMenuItem();
        User = new javax.swing.JMenu();
        paybils = new javax.swing.JMenuItem();
        billDetails = new javax.swing.JMenuItem();
        Report = new javax.swing.JMenu();
        generateB = new javax.swing.JMenuItem();
        Utility = new javax.swing.JMenu();
        notepad = new javax.swing.JMenuItem();
        calcu = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/homeP.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1);

        admin.setText("Admin");

        newC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon1 (1).png"))); // NOI18N
        newC.setText("New Customer");
        admin.add(newC);

        cusD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon2 (1).png"))); // NOI18N
        cusD.setText("Customer Details");
        admin.add(cusD);

        depoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon4 (1).png"))); // NOI18N
        depoD.setText("Deposit Details");
        depoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depoDActionPerformed(evt);
            }
        });
        admin.add(depoD);

        calBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon9 (1).png"))); // NOI18N
        calBill.setText("Calculate Bill");
        admin.add(calBill);

        jMenuBar1.add(admin);

        information.setText("Information");

        upD.setText("Update Information");
        information.add(upD);

        viewIn.setText("View Information");
        information.add(viewIn);

        jMenuBar1.add(information);

        User.setText("User");

        paybils.setText("Pay Bill");
        User.add(paybils);

        billDetails.setText("Bill Details");
        User.add(billDetails);

        jMenuBar1.add(User);

        Report.setText("Report");

        generateB.setText("Generate Bill");
        Report.add(generateB);

        jMenuBar1.add(Report);

        Utility.setText("Utility");

        notepad.setText("Notepad");
        Utility.add(notepad);

        calcu.setText("Calculator");
        Utility.add(calcu);

        jMenuBar1.add(Utility);

        logout.setText("Logout");

        exit.setText("Logout");
        logout.add(exit);

        jMenuBar1.add(logout);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depoDActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Report;
    private javax.swing.JMenu User;
    private javax.swing.JMenu Utility;
    private javax.swing.JMenu admin;
    private javax.swing.JMenuItem billDetails;
    private javax.swing.JMenuItem calBill;
    private javax.swing.JMenuItem calcu;
    private javax.swing.JMenuItem cusD;
    private javax.swing.JMenuItem depoD;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem generateB;
    private javax.swing.JMenu information;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu logout;
    private javax.swing.JMenuItem newC;
    private javax.swing.JMenuItem notepad;
    private javax.swing.JMenuItem paybils;
    private javax.swing.JMenuItem upD;
    private javax.swing.JMenuItem viewIn;
    // End of variables declaration//GEN-END:variables
}