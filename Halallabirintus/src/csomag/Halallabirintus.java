package csomag;

import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Halallabirintus extends javax.swing.JFrame {

    int ugyesseg;
    int eletero;
    int szerencse;
    int oldal;
    String szoveg;
    String btnSzovegBal;
    String btnSzovegJobb;

    public Halallabirintus() {
        initComponents();
        oldal = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        tpOssz = new javax.swing.JTabbedPane();
        pnlKarakter = new javax.swing.JPanel();
        slUgy = new javax.swing.JSlider();
        bttnGeneral = new javax.swing.JButton();
        lblSzerencse = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbttnFerfi = new javax.swing.JRadioButton();
        rbttnNo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        lblEletero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblKep = new javax.swing.JLabel();
        txtEletero = new javax.swing.JTextField();
        slEletero = new javax.swing.JSlider();
        bttnJatek = new javax.swing.JButton();
        txtSzerencse = new javax.swing.JTextField();
        txtUgy = new javax.swing.JTextField();
        lblUgy = new javax.swing.JLabel();
        txtNev = new javax.swing.JTextField();
        slSzerencse = new javax.swing.JSlider();
        pnlJatek = new javax.swing.JPanel();
        lblJKep = new javax.swing.JLabel();
        bttnBal = new javax.swing.JButton();
        bttnJobb = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtJSzoveg = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mProgram = new javax.swing.JMenu();
        miMentes = new javax.swing.JMenuItem();
        miKilepes = new javax.swing.JMenuItem();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Halállabirintus");
        setMaximumSize(new java.awt.Dimension(468, 487));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        slUgy.setMaximum(12);
        slUgy.setMinimum(7);
        slUgy.setToolTipText("");
        slUgy.setValue(0);
        slUgy.setEnabled(false);

        bttnGeneral.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttnGeneral.setText("Karakter Generálás");
        bttnGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnGeneralActionPerformed(evt);
            }
        });

        lblSzerencse.setText("Szerencse");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Neme:"));

        buttonGroup1.add(rbttnFerfi);
        rbttnFerfi.setSelected(true);
        rbttnFerfi.setText("Férfi");
        rbttnFerfi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbttnFerfiStateChanged(evt);
            }
        });

        buttonGroup1.add(rbttnNo);
        rbttnNo.setText("Nő");
        rbttnNo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbttnNoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbttnFerfi)
                .addGap(18, 18, 18)
                .addComponent(rbttnNo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbttnFerfi)
                    .addComponent(rbttnNo))
                .addContainerGap())
        );

        jLabel2.setText("Név:");

        lblEletero.setText("Életerő");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Karakter:"));

        lblKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csomag/320Magas/karakter_370.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKep, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtEletero.setEnabled(false);

        slEletero.setMaximum(24);
        slEletero.setMinimum(14);
        slEletero.setValue(0);
        slEletero.setEnabled(false);

        bttnJatek.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttnJatek.setText("Játék");
        bttnJatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnJatekActionPerformed(evt);
            }
        });

        txtSzerencse.setEnabled(false);

        txtUgy.setEnabled(false);

        lblUgy.setText("Ügyesség");

        txtNev.setText("Add meg a nevet!");

        slSzerencse.setMaximum(12);
        slSzerencse.setMinimum(7);
        slSzerencse.setValue(0);
        slSzerencse.setEnabled(false);

        javax.swing.GroupLayout pnlKarakterLayout = new javax.swing.GroupLayout(pnlKarakter);
        pnlKarakter.setLayout(pnlKarakterLayout);
        pnlKarakterLayout.setHorizontalGroup(
            pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKarakterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlKarakterLayout.createSequentialGroup()
                                .addComponent(lblEletero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(slEletero, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlKarakterLayout.createSequentialGroup()
                                .addComponent(lblUgy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slUgy, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlKarakterLayout.createSequentialGroup()
                                .addComponent(lblSzerencse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slSzerencse, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtUgy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEletero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSzerencse, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bttnJatek, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnGeneral, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlKarakterLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel2)
                            .addGap(23, 23, 23)
                            .addComponent(txtNev, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlKarakterLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {slEletero, slSzerencse, slUgy});

        pnlKarakterLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEletero, txtSzerencse, txtUgy});

        pnlKarakterLayout.setVerticalGroup(
            pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKarakterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(slUgy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUgy)
                            .addComponent(txtUgy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(slEletero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEletero)
                            .addComponent(txtEletero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(slSzerencse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSzerencse)
                            .addComponent(txtSzerencse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(bttnGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttnJatek, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlKarakterLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEletero, txtSzerencse, txtUgy});

        tpOssz.addTab("Karakter", pnlKarakter);

        lblJKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csomag/320Magas/1. oldal.png"))); // NOI18N
        lblJKep.setText("jLabel1");

        bttnBal.setText("Kinyitod a dobozt...");
        bttnBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBalActionPerformed(evt);
            }
        });

        bttnJobb.setText("Haladsz tovább...");
        bttnJobb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnJobbActionPerformed(evt);
            }
        });

        txtJSzoveg.setEditable(false);
        txtJSzoveg.setContentType("text/html"); // NOI18N
        txtJSzoveg.setText("<html>\r\n  <head>\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\nMiután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal oldali fal mellett áll. Hat doboz van rajta, egyikükre a te neved festették.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jScrollPane1.setViewportView(txtJSzoveg);

        javax.swing.GroupLayout pnlJatekLayout = new javax.swing.GroupLayout(pnlJatek);
        pnlJatek.setLayout(pnlJatekLayout);
        pnlJatekLayout.setHorizontalGroup(
            pnlJatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJatekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblJKep, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnBal, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlJatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJatekLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bttnJobb, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addGroup(pnlJatekLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );
        pnlJatekLayout.setVerticalGroup(
            pnlJatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJatekLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlJatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblJKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(16, 16, 16)
                .addGroup(pnlJatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttnJobb, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(bttnBal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tpOssz.addTab("Játék", pnlJatek);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        tpOssz.addTab("Eszköztár", jPanel3);

        mProgram.setText("Program");

        miMentes.setText("Mentés");
        mProgram.add(miMentes);

        miKilepes.setText("Kilepés");
        miKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKilepesActionPerformed(evt);
            }
        });
        mProgram.add(miKilepes);

        jMenuBar1.add(mProgram);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpOssz)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpOssz))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttnGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnGeneralActionPerformed
        Random veletlen = new Random();
        ugyesseg = veletlen.nextInt(6) + 6;
        eletero = veletlen.nextInt(2, 12) + 12;
        szerencse = veletlen.nextInt(6) + 6;

        txtUgy.setText(Integer.toString(ugyesseg));
        txtEletero.setText(Integer.toString(eletero));
        txtSzerencse.setText(Integer.toString(szerencse));

        slUgy.setValue(ugyesseg);
        slEletero.setValue(eletero);
        slSzerencse.setValue(szerencse);
    }//GEN-LAST:event_bttnGeneralActionPerformed

    private void rbttnFerfiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbttnFerfiStateChanged
        karakterNemValtas();
    }//GEN-LAST:event_rbttnFerfiStateChanged

    private void karakterNemValtas() {
        if (rbttnFerfi.isSelected()) {
            ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\karakter_370.png");
            lblKep.setIcon(icon);
        }
        if (rbttnNo.isSelected()) {
            ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\karakter1_370.png");
            lblKep.setIcon(icon);
        }
    }

    private void rbttnNoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbttnNoStateChanged
        karakterNemValtas();
    }//GEN-LAST:event_rbttnNoStateChanged

    private void bttnJatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnJatekActionPerformed

        String szoveg = "Add meg a nevet!";
        String ures = "";
        if (txtNev.getText().equals(szoveg) || txtNev.getText().equals(ures)) {
            JOptionPane.showMessageDialog(null, "Adj meg egy nevet a karakterednek!", "HIBA!", JOptionPane.WARNING_MESSAGE);
        } else {
            tpOssz.setSelectedIndex(1);
        }
    }//GEN-LAST:event_bttnJatekActionPerformed

    private void kilepes() throws HeadlessException {
        String u = "Biztos kilépsz?";
        String c = "KILÉPÉS";
        int ot = JOptionPane.OK_CANCEL_OPTION;
        int mt = JOptionPane.WARNING_MESSAGE;
        int kilep = JOptionPane.showConfirmDialog(rootPane, u, c, ot, mt);
        if (kilep == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    private void miKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKilepesActionPerformed
        kilepes();
    }//GEN-LAST:event_miKilepesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kilepes();
    }//GEN-LAST:event_formWindowClosing

    private void bttnJobbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnJobbActionPerformed
        if (oldal == 1) {
            lap66();
        }
        else if (oldal == 66) {
            lap56();
        }
    }//GEN-LAST:event_bttnJobbActionPerformed

    private void bttnBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBalActionPerformed
        if (oldal == 1) {
            lap270();
        }
        else if (oldal == 270) {
            bttnJobb.setEnabled(true);
            lap66();
        }
        else if (oldal == 66) {
            lap293();
        }
        else if (oldal == 293) {
            lap137();
        }
    }//GEN-LAST:event_bttnBalActionPerformed

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
            java.util.logging.Logger.getLogger(Halallabirintus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Halallabirintus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Halallabirintus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Halallabirintus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Halallabirintus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnBal;
    private javax.swing.JButton bttnGeneral;
    private javax.swing.JButton bttnJatek;
    private javax.swing.JButton bttnJobb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEletero;
    private javax.swing.JLabel lblJKep;
    private javax.swing.JLabel lblKep;
    private javax.swing.JLabel lblSzerencse;
    private javax.swing.JLabel lblUgy;
    private javax.swing.JMenu mProgram;
    private javax.swing.JMenuItem miKilepes;
    private javax.swing.JMenuItem miMentes;
    private javax.swing.JPanel pnlJatek;
    private javax.swing.JPanel pnlKarakter;
    private javax.swing.JRadioButton rbttnFerfi;
    private javax.swing.JRadioButton rbttnNo;
    private javax.swing.JSlider slEletero;
    private javax.swing.JSlider slSzerencse;
    private javax.swing.JSlider slUgy;
    private javax.swing.JTabbedPane tpOssz;
    private javax.swing.JTextField txtEletero;
    private javax.swing.JTextPane txtJSzoveg;
    private javax.swing.JTextField txtNev;
    private javax.swing.JTextField txtSzerencse;
    private javax.swing.JTextField txtUgy;
    // End of variables declaration//GEN-END:variables

    private void lap66() {
        oldal = 66;
        szoveg = "Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban. Egy, a falra festett fehér nyíl nyugatfelé mutat. A földön nedves lábnyomok jelzik, merre haladtak az előtted járók. Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy. \n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "Nyugat felé kívánsz menni.";
        btnSzovegJobb = "Kelet felé kívánsz menni.";
        bttnBal.setText(leiras(btnSzovegBal));
        bttnJobb.setText(leiras(btnSzovegJobb));
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\66. oldal.png");
        lblJKep.setIcon(icon);
    }
    
    private void lap270() {
        oldal = 270;
        szoveg = "A doboz teteje könnyedén nyílik. Benne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól. Előbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet: - „Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. Most azt tanácsolom neked, hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.” Azaláírás Szukumvit.\n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "Megjegyzed a tanácsot, apródarabokra téped a pergament,\nés tovább mészészak felé.";
        bttnJobb.setEnabled(false);
        bttnBal.setText(leiras(btnSzovegBal));
        bttnJobb.setText("");
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\270. oldal 2.png");
        lblJKep.setIcon(icon);
    }

    private String leiras(String jSzoveg) {
        String kiirat = "<html>\n"
            + "  <head>\n"
            + "  </head>\n"
            + "  <body>\n"
            + "    <p style=\"margin-top: 0\">\n"
            + jSzoveg
            + "    </p>\n"
            + "  </body>\n"
            + "</html>\n"
            + "";
        return kiirat;
    }

    private void lap293() {
        oldal = 293;
        szoveg = "A három pár nedves lábnyomot követve az alagútnyugati elágazásában hamarosan egy újabb el-ágazáshoz érsz.\n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "Továbbmész nyugat felé a lábnyomokat követve...";
        btnSzovegJobb = "Észak felé mész a harmadik pár lábnyom után...";
        bttnBal.setText(leiras(btnSzovegBal));
        bttnJobb.setText(leiras(btnSzovegJobb));
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\293. oldal.png");
        lblJKep.setIcon(icon);
    }
    
    private void lap56() {
        oldal = 56;
        szoveg = "Látod, hogy az akadály egy széles, barna, sziklaszerű tárgy. Megérinted, és meglepve tapasztalod, hogy lágy, szivacsszerű. \n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "Átmászok rajta...";
        btnSzovegJobb = "Kettévágom a kardommal...";
        bttnBal.setText(leiras(btnSzovegBal));
        bttnJobb.setText(leiras(btnSzovegJobb));
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\56. oldal.png");
        lblJKep.setIcon(icon);
    }

    private void lap137() {
        oldal = 137;
        szoveg = "Ahogy végigmész az alagúton, csodálkozva látod, hogy egy jókora vasharang csüng alá a boltozatról.\n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "";
        bttnJobb.setEnabled(false);
        btnSzovegJobb = "";
        bttnBal.setEnabled(false);
        bttnBal.setText(leiras(btnSzovegBal));
        bttnJobb.setText(leiras(btnSzovegJobb));
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\137olda.png");
        lblJKep.setIcon(icon);
    }

    
}
