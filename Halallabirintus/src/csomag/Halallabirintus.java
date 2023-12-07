package csomag;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Halallabirintus extends javax.swing.JFrame {

    int ugyesseg;
    int eletero;
    int szerencse;
    int oldal;
    String szoveg;
    String btnSzovegBal;
    String btnSzovegJobb;
    int arany;
    Random veletlen = new Random();
    int ellenfelUgyesseg;
    int ellenfelElet;
    String karakterNev;
    String ellensegNev;

    public Halallabirintus() {
        initComponents();
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            UIManager.put("control", new Color(79, 74, 69));
            UIManager.put("info", new Color(255, 140, 65));
            UIManager.put("nimbusBase", new Color(79, 74, 69));
            UIManager.put("nimbusAlertYellow", new Color(255, 140, 65));
            UIManager.put("nimbusDisabledText", new Color(108, 95, 91));
            UIManager.put("nimbusFocus", new Color(255, 140, 65));
            UIManager.put("nimbusGreen", new Color(255, 140, 65));
            UIManager.put("nimbusInfoBlue", new Color(255, 140, 65));
            UIManager.put("nimbusLightBackground", new Color(108, 95, 91));
            UIManager.put("nimbusOrange", new Color(255, 140, 65));
            UIManager.put("nimbusRed", new Color(255, 140, 65));
            UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
            UIManager.put("nimbusSelectionBackground", new Color(255, 140, 65));
            UIManager.put("text", new Color(255, 255, 255));
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException exc) {
            System.err.println("Nimbus: Unsupported Look and feel!");
        }
        oldal = 1;
        arany = 0;
        tpOssz.setEnabled(false);

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
        lblKez = new javax.swing.JLabel();
        lblJKep = new javax.swing.JLabel();
        bttnBal = new javax.swing.JButton();
        bttnJobb = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtJSzoveg = new javax.swing.JTextPane();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblArany = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        slUgy1 = new javax.swing.JSlider();
        txtSzerencse1 = new javax.swing.JTextField();
        slEletero1 = new javax.swing.JSlider();
        lblSzerencse1 = new javax.swing.JLabel();
        lblUgy1 = new javax.swing.JLabel();
        txtEletero1 = new javax.swing.JTextField();
        txtUgy1 = new javax.swing.JTextField();
        slSzerencse1 = new javax.swing.JSlider();
        lblEletero1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        pnlKarakter.setEnabled(false);

        slUgy.setMaximum(12);
        slUgy.setMinimum(7);
        slUgy.setToolTipText("");
        slUgy.setValue(0);
        slUgy.setEnabled(false);

        bttnGeneral.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttnGeneral.setForeground(new java.awt.Color(51, 51, 51));
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
                .addComponent(lblKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        bttnJatek.setForeground(new java.awt.Color(51, 51, 51));
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
                .addGap(11, 11, 11)
                .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addComponent(lblUgy)
                        .addGap(6, 6, 6)
                        .addComponent(slUgy, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addComponent(lblEletero)
                        .addGap(21, 21, 21)
                        .addComponent(slEletero, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addComponent(lblSzerencse)
                        .addGap(6, 6, 6)
                        .addComponent(slSzerencse, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtUgy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEletero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSzerencse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlKarakterLayout.createSequentialGroup()
                .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(bttnJatek, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(bttnGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(txtNev, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKarakterLayout.setVerticalGroup(
            pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKarakterLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblUgy))
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(slUgy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUgy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblEletero))
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(slEletero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEletero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblSzerencse))
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(slSzerencse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSzerencse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bttnGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(bttnJatek, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlKarakterLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpOssz.addTab("Karakter", pnlKarakter);

        pnlJatek.setLayout(null);
        pnlJatek.add(lblKez);
        lblKez.setBounds(21, 6, 256, 320);

        lblJKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csomag/320Magas/1. oldal.png"))); // NOI18N
        lblJKep.setText("jLabel1");
        pnlJatek.add(lblJKep);
        lblJKep.setBounds(6, 6, 256, 320);

        bttnBal.setForeground(new java.awt.Color(51, 51, 51));
        bttnBal.setText("Kinyitod a dobozt...");
        bttnBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBalActionPerformed(evt);
            }
        });
        pnlJatek.add(bttnBal);
        bttnBal.setBounds(6, 342, 256, 70);

        bttnJobb.setForeground(new java.awt.Color(51, 51, 51));
        bttnJobb.setText("Haladsz tovább...");
        bttnJobb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnJobbActionPerformed(evt);
            }
        });
        pnlJatek.add(bttnJobb);
        bttnJobb.setBounds(280, 342, 220, 70);

        txtJSzoveg.setEditable(false);
        txtJSzoveg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 65)));
        txtJSzoveg.setContentType("text/html"); // NOI18N
        txtJSzoveg.setForeground(new java.awt.Color(204, 204, 204));
        txtJSzoveg.setText("<html>\r\n  <head>\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0; color:white; padding:10px;\">\r\nMiután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal oldali fal mellett áll. Hat doboz van rajta, egyikükre a te neved festették.\n    </p>\r\n  </body>\r\n</html>\r\n");
        jScrollPane1.setViewportView(txtJSzoveg);

        pnlJatek.add(jScrollPane1);
        jScrollPane1.setBounds(270, 6, 230, 320);
        pnlJatek.add(jSeparator2);
        jSeparator2.setBounds(-10, 420, 530, 10);
        pnlJatek.add(jSeparator3);
        jSeparator3.setBounds(-10, 330, 510, 10);

        tpOssz.addTab("Játék", pnlJatek);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Arany:");

        lblArany.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblArany.setForeground(new java.awt.Color(255, 204, 0));
        lblArany.setText("0");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Statok", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        slUgy1.setMaximum(12);
        slUgy1.setMinimum(7);
        slUgy1.setToolTipText("");
        slUgy1.setValue(0);
        slUgy1.setEnabled(false);

        txtSzerencse1.setEnabled(false);

        slEletero1.setMaximum(24);
        slEletero1.setMinimum(14);
        slEletero1.setValue(0);
        slEletero1.setEnabled(false);

        lblSzerencse1.setText("Szerencse");

        lblUgy1.setText("Ügyesség");

        txtEletero1.setEnabled(false);

        txtUgy1.setEnabled(false);

        slSzerencse1.setMaximum(12);
        slSzerencse1.setMinimum(7);
        slSzerencse1.setValue(0);
        slSzerencse1.setEnabled(false);

        lblEletero1.setText("Életerő");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUgy1)
                        .addGap(110, 110, 110)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtEletero1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUgy1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(slEletero1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(slUgy1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblEletero1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblSzerencse1)
                                .addGap(109, 109, 109)
                                .addComponent(txtSzerencse1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(slSzerencse1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblUgy1)
                            .addComponent(slUgy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUgy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblEletero1)
                            .addComponent(slEletero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEletero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSzerencse1)
                    .addComponent(slSzerencse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSzerencse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csomag/320Magas/eszkoztar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblArany, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(174, 174, 174))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArany, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addComponent(tpOssz, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        ugyesseg = veletlen.nextInt(6) + 6;
        eletero = veletlen.nextInt(2, 12) + 12;
        szerencse = veletlen.nextInt(6) + 6;

        // Karakter oldal stat megjelenítés
        txtUgy.setText(Integer.toString(ugyesseg));
        txtEletero.setText(Integer.toString(eletero));
        txtSzerencse.setText(Integer.toString(szerencse));
        slUgy.setValue(ugyesseg);
        slEletero.setValue(eletero);
        slSzerencse.setValue(szerencse);

        // Eszköztár oldal stat megjelenítés
        txtUgy1.setText(Integer.toString(ugyesseg));
        txtEletero1.setText(Integer.toString(eletero));
        txtSzerencse1.setText(Integer.toString(szerencse));
        slUgy1.setValue(ugyesseg);
        slEletero1.setValue(eletero);
        slSzerencse1.setValue(szerencse);
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
        karakterNev = txtNev.getText();
        String szoveg = "Add meg a nevet!";
        String ures = "";
        if (txtNev.getText().equals(szoveg) || txtNev.getText().equals(ures)) {
            JOptionPane.showMessageDialog(null, "Adj meg egy nevet a karakterednek!", "HIBA!", JOptionPane.WARNING_MESSAGE);
        } else if ((ugyesseg == 0) || (eletero == 0) || (szerencse == 0)) {
            JOptionPane.showMessageDialog(null, "Generáld le a karaktered!", "HIBA!", JOptionPane.WARNING_MESSAGE);
        } else {
            tpOssz.setSelectedIndex(1);
            tpOssz.setEnabled(true);
            tpOssz.setEnabledAt(0, false);
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
        } else if (oldal == 66) {
            lap56();
        } else if (oldal == 293) {
            lap387();
        } else if (oldal == 56) {
            lap215();
        }
    }//GEN-LAST:event_bttnJobbActionPerformed

    private void bttnBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBalActionPerformed
        if (oldal == 1) {
            lap270();
        } else if (oldal == 270) {
            bttnJobb.setEnabled(true);
            lap66();
        } else if (oldal == 66) {
            lap293();
        } else if (oldal == 293) {
            lap137();
        } else if (oldal == 137) {
            kijarat();
        } else if (oldal == 387) {
            ellenfelUgyesseg = 7;
            ellenfelElet = 7;
            ellensegNev = "Barlangi Ember";
            oldal = 0;
        } else if (oldal == 56) {
            lap373();
        }  else if (oldal == 373) {
            kijarat();
        } else if (oldal == 215) {
            kijarat();
        }
        if (oldal == 0) {
            csata(ellenfelUgyesseg, ellensegNev);
        }
    }//GEN-LAST:event_bttnBalActionPerformed

    public static void main(String args[]) {
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblArany;
    private javax.swing.JLabel lblEletero;
    private javax.swing.JLabel lblEletero1;
    private javax.swing.JLabel lblJKep;
    private javax.swing.JLabel lblKep;
    private javax.swing.JLabel lblKez;
    private javax.swing.JLabel lblSzerencse;
    private javax.swing.JLabel lblSzerencse1;
    private javax.swing.JLabel lblUgy;
    private javax.swing.JLabel lblUgy1;
    private javax.swing.JMenu mProgram;
    private javax.swing.JMenuItem miKilepes;
    private javax.swing.JMenuItem miMentes;
    private javax.swing.JPanel pnlJatek;
    private javax.swing.JPanel pnlKarakter;
    private javax.swing.JRadioButton rbttnFerfi;
    private javax.swing.JRadioButton rbttnNo;
    private javax.swing.JSlider slEletero;
    private javax.swing.JSlider slEletero1;
    private javax.swing.JSlider slSzerencse;
    private javax.swing.JSlider slSzerencse1;
    private javax.swing.JSlider slUgy;
    private javax.swing.JSlider slUgy1;
    private javax.swing.JTabbedPane tpOssz;
    private javax.swing.JTextField txtEletero;
    private javax.swing.JTextField txtEletero1;
    private javax.swing.JTextPane txtJSzoveg;
    private javax.swing.JTextField txtNev;
    private javax.swing.JTextField txtSzerencse;
    private javax.swing.JTextField txtSzerencse1;
    private javax.swing.JTextField txtUgy;
    private javax.swing.JTextField txtUgy1;
    // End of variables declaration//GEN-END:variables

    private String leiras(String jSzoveg) {
        String kiirat = "<html>\n"
                + "  <head>\n"
                + "  </head>\n"
                + "  <body>\n"
                + "    <p style=\"margin-top: 0; color:white; padding:10px;\">\n"
                + jSzoveg
                + "    </p>\n"
                + "  </body>\n"
                + "</html>\n"
                + "";
        return kiirat;
    }

    private String leirasGomb(String jSzoveg) {
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

    private void csata(int ellenfelUgyesseg, String ellensegNev) {
        int ellensegTamadoEro = ellenfelUgyesseg + veletlen.nextInt(2, 12);
        int sajatTamadoEro = ugyesseg + veletlen.nextInt(2, 12);

        txtEletero1.setText(Integer.toString(eletero));
        slEletero1.setValue(eletero);
        oldal0(eletero, sajatTamadoEro, ellensegNev, ellenfelElet, ellensegTamadoEro);

        if ((eletero > 0) && (ellenfelElet > 0)) {
            if (sajatTamadoEro > ellensegTamadoEro) {
                ellenfelElet -= 2;
            }
            if (sajatTamadoEro < ellensegTamadoEro) {
                eletero -= 2;
            }
            if (sajatTamadoEro == ellensegTamadoEro) {
                csata(ellenfelUgyesseg, ellensegNev);
            }
        } else {
            if (eletero > 0) {
                String u = "Legyőzted a(z) '" + ellensegNev + "' ellenséget!\n"
                        + "Kijutottál a labirintusból!";
                String c = "VÉGE";
                int ot = JOptionPane.DEFAULT_OPTION;
                int mt = JOptionPane.PLAIN_MESSAGE;
                int kilep = JOptionPane.showConfirmDialog(rootPane, u, c, ot, mt);
                if (kilep == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            } else {
                String u = "Meghaltál!\n"
                        + ellensegNev + " legyőzött téged!";
                String c = "VÉGE";
                int ot = JOptionPane.DEFAULT_OPTION;
                int mt = JOptionPane.PLAIN_MESSAGE;
                int kilep = JOptionPane.showConfirmDialog(rootPane, u, c, ot, mt);
                if (kilep == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        }
    }

    private void oldal0(int eletero, int sajatTamadoEro, String ellensegNev, int ellensegEletero, int ellensegTamadoEro) {
        szoveg = String.format("--- %s:<span style='font-weight:bold'><br>Életerő: %d</span><br>Támadóerő: %d<br><br>--- %s:<br><span style='font-weight:bold'>Életerő: %d</span><br>Támadóerő: %d", karakterNev, eletero, sajatTamadoEro, ellensegNev, ellensegEletero, ellensegTamadoEro);
        txtJSzoveg.setText(leiras(szoveg));
    }

    private void kijarat() {
        String u = "Elhagyod a labirintust...";
        String c = "VÉGE";
        int ot = JOptionPane.DEFAULT_OPTION;
        int mt = JOptionPane.PLAIN_MESSAGE;
        int kilep = JOptionPane.showConfirmDialog(rootPane, u, c, ot, mt);
        if (kilep == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    private void lap66() {
        oldal = 66;
        szoveg = "Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban. Egy, a falra festett fehér nyíl nyugatfelé mutat. A földön nedves lábnyomok jelzik, merre haladtak az előtted járók. Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy. \n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "Nyugat felé kívánsz menni...";
        btnSzovegJobb = "Kelet felé kívánsz menni...";
        bttnBal.setText(leirasGomb(btnSzovegBal));
        bttnJobb.setText(leirasGomb(btnSzovegJobb));
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\66. oldal.png");
        lblJKep.setIcon(icon);
    }

    private void lap270() {
        oldal = 270;
        arany += 2;
        lblArany.setText(String.valueOf(arany));
        szoveg = "A doboz teteje könnyedén nyílik. Benne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól. Előbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet: - „Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. Most azt tanácsolom neked, hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.” Azaláírás Szukumvit.\n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "Megjegyzed a tanácsot, apródarabokra téped a pergament,\nés tovább mészészak felé.";
        bttnJobb.setEnabled(false);
        bttnBal.setText(leirasGomb(btnSzovegBal));
        bttnJobb.setText("");
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\270. oldal 2.png");
        lblJKep.setIcon(icon);
    }

    private void lap293() {
        oldal = 293;
        szoveg = "A három pár nedves lábnyomot követve az alagútnyugati elágazásában hamarosan egy újabb el-ágazáshoz érsz.\n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "Továbbmész nyugat felé a lábnyomokat követve...";
        btnSzovegJobb = "Észak felé mész a harmadik pár lábnyom után...";
        bttnBal.setText(leirasGomb(btnSzovegBal));
        bttnJobb.setText(leirasGomb(btnSzovegJobb));
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\293. oldal.png");
        lblJKep.setIcon(icon);
    }

    private void lap56() {
        oldal = 56;
        szoveg = "Látod, hogy az akadály egy széles, barna, sziklaszerű tárgy. Megérinted, és meglepve tapasztalod, hogy lágy, szivacsszerű. \n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "Átmászok rajta...";
        btnSzovegJobb = "Kettévágom a kardommal...";
        bttnBal.setText(leirasGomb(btnSzovegBal));
        bttnJobb.setText(leirasGomb(btnSzovegJobb));
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\56. oldal.png");
        lblJKep.setIcon(icon);
    }

    private void lap137() {
        oldal = 137;
        szoveg = "Ahogy végigmész az alagúton, csodálkozva látod, hogy egy jókora vasharang csüng alá a boltozatról.\n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "Labirintus elhagyása...";
        bttnJobb.setEnabled(false);
        btnSzovegJobb = "";
        bttnBal.setText(leirasGomb(btnSzovegBal));
        bttnJobb.setText(leirasGomb(btnSzovegJobb));
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\137olda.png");
        lblJKep.setIcon(icon);
    }

    private void lap387() {
        oldal = 387;
        szoveg = "Hallod, hogy elölről súlyos lépések közelednek. Egy széles, állatbőrökbe öltözött, kőbaltás, primitívlény lép elő. Ahogy meglát, morog, a földre köp, majd a kőbaltát felemelve közeledik, és mindennek kinéz, csak barátságosnak nem. Előhúzod kardodat, és felkészülsz, hogy megküzdj a Barlangi Emberrel. <br><span style='font-weight:bold'>Barlangi Ember:</span><br> ÜGYESSÉG 7 ÉLETERŐ 7\n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "Csata...";
        bttnJobb.setEnabled(false);
        btnSzovegJobb = "";
        bttnBal.setText(leirasGomb(btnSzovegBal));
        bttnJobb.setText(leirasGomb(btnSzovegJobb));
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\387. oldal.png");
        lblJKep.setIcon(icon);
        icon = new ImageIcon("src\\csomag\\320Magas\\kéz_kard_png.png");
        lblKez.setIcon(icon);
    }

    private void lap373() {
        oldal = 373;
        szoveg = "Fölmászol a lágy sziklára, attól tartasz, hogy bár-melyik pillanatban elnyelhet. Nehéz átvergődni rajta, mert puha anyagában alig tudod a lábadat emelni, de végül átvergődsz rajta. Megkönnyebbülten érsz újra szilárd talajra, és fordulsz a kijárat felé.\n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "Labirintus elhagyása...";
        bttnJobb.setEnabled(false);
        btnSzovegJobb = "";
        bttnBal.setText(leirasGomb(btnSzovegBal));
        bttnJobb.setText(leirasGomb(btnSzovegJobb));
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\373. oldal.png");
        lblJKep.setIcon(icon);
    }

    private void lap215() {
        eletero -= 2;
        oldal = 215;
        szoveg = "Kardod könnyedén áthatol a spóragolyó vékonykülső burkán. Sűrű barna spórafelhő csap ki a golyóból, és körülvesz. Némelyik spóra a bőrödhöz tapad, és rettenetes viszketést okoz. Nagy daganatok nőnek az arcodon és karodon, és a bőröd mintha égne. 2 ÉLETERŐ pontot veszítesz. Vadul vakarózva átléped a leeresztett golyót, és megpillantod a kijáratot.\n";
        txtJSzoveg.setText(leiras(szoveg));
        btnSzovegBal = "Labirintus elhagyása...";
        bttnJobb.setEnabled(false);
        btnSzovegJobb = "";
        bttnBal.setText(leirasGomb(btnSzovegBal));
        bttnJobb.setText(leirasGomb(btnSzovegJobb));
        ImageIcon icon = new ImageIcon("src\\csomag\\320Magas\\215. oldal 2.png");
        lblJKep.setIcon(icon);
        icon = new ImageIcon("src\\csomag\\320Magas\\kéz_png.png");
        lblKez.setIcon(icon);
    }
}
