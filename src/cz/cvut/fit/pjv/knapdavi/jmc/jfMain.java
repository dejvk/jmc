/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.pjv.knapdavi.jmc;

import cz.cvut.fit.pjv.knapdavi.jmc.dao.*;
import cz.cvut.fit.pjv.knapdavi.jmc.model.Character;
import cz.cvut.fit.pjv.knapdavi.jmc.model.Server;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author knapdavi
 */
public class jfMain extends javax.swing.JFrame {

    List<Character> chars;
    CharacterDao database;

    /**
     * Creates new form jfMain
     */
    public jfMain() {
        initComponents();
        try {
            database = new CharacterDaoMysql("wow.pk-nostalgia.cz", "pjv", "pjv2014");
            Timer timer = new Timer(0, new CharacterUpdateActionListener(this));
            timer.start();
            timer.setDelay(60*1000);
        } catch (CharacterDaoException ex) {
            JOptionPane.showMessageDialog(this, "Při připojení došlo k chybě: " + ex.getMessage(), "Chyba!", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(this, "Program byl přepnut na práci s testovacími daty.", "Změna poskytovatele dat", JOptionPane.WARNING_MESSAGE);
            database = new CharacterDaoTest();
            bgResourceSelection.setSelected(jmResourceTest.getModel(), true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgResourceSelection = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlOnlineList = new javax.swing.JList();
        jToolBar1 = new javax.swing.JToolBar();
        jbUpdateCharacterList = new javax.swing.JButton();
        jbShowCharDetail = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jbUpdateServerState = new javax.swing.JButton();
        jlDatabaseServer = new javax.swing.JLabel();
        jlAuthServer = new javax.swing.JLabel();
        jlGameServer = new javax.swing.JLabel();
        jlDevServer = new javax.swing.JLabel();
        jlDatabaseServerState = new javax.swing.JLabel();
        jlAuthServerState = new javax.swing.JLabel();
        jlGameServerState = new javax.swing.JLabel();
        jlDevServerState = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmHelp = new javax.swing.JMenuItem();
        jmExit = new javax.swing.JMenuItem();
        jmCharacters = new javax.swing.JMenu();
        jmUpdateCharacterList = new javax.swing.JMenuItem();
        jmFindCharacter = new javax.swing.JMenuItem();
        jmSources = new javax.swing.JMenu();
        jmResourceDatabase = new javax.swing.JRadioButtonMenuItem();
        jmResourceTest = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JMC");
        setMinimumSize(new java.awt.Dimension(300, 300));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Online postavy"));

        jlOnlineList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlOnlineList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlOnlineListFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jlOnlineListFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jlOnlineList);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jbUpdateCharacterList.setText("Obnovit");
        jbUpdateCharacterList.setFocusable(false);
        jbUpdateCharacterList.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbUpdateCharacterList.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbUpdateCharacterList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateCharacterListActionPerformed(evt);
            }
        });
        jToolBar1.add(jbUpdateCharacterList);

        jbShowCharDetail.setText("Detail");
        jbShowCharDetail.setEnabled(false);
        jbShowCharDetail.setFocusable(false);
        jbShowCharDetail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbShowCharDetail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbShowCharDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbShowCharDetailActionPerformed(evt);
            }
        });
        jToolBar1.add(jbShowCharDetail);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Stav serverů"));

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jbUpdateServerState.setText("Obnovit");
        jbUpdateServerState.setFocusable(false);
        jbUpdateServerState.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbUpdateServerState.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbUpdateServerState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateServerStateActionPerformed(evt);
            }
        });
        jToolBar2.add(jbUpdateServerState);

        jlDatabaseServer.setText("Databáze:");

        jlAuthServer.setText("Autentifikace:");

        jlGameServer.setText("Hra:");

        jlDevServer.setText("Vývoj:");

        jlDatabaseServerState.setText("neznámý");

        jlAuthServerState.setText("neznámý");

        jlGameServerState.setText("neznámý");

        jlDevServerState.setText("neznámý");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDatabaseServer)
                    .addComponent(jlAuthServer)
                    .addComponent(jlGameServer)
                    .addComponent(jlDevServer))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAuthServerState)
                    .addComponent(jlDatabaseServerState)
                    .addComponent(jlGameServerState)
                    .addComponent(jlDevServerState))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDatabaseServer)
                    .addComponent(jlDatabaseServerState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAuthServer)
                    .addComponent(jlAuthServerState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGameServer)
                    .addComponent(jlGameServerState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDevServer)
                    .addComponent(jlDevServerState))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmFile.setText("Soubor");

        jmHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmHelp.setMnemonic('H');
        jmHelp.setText("Nápověda");
        jmHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmHelpActionPerformed(evt);
            }
        });
        jmFile.add(jmHelp);

        jmExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmExit.setMnemonic('Z');
        jmExit.setText("Zavřít");
        jmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmExitActionPerformed(evt);
            }
        });
        jmFile.add(jmExit);

        jMenuBar1.add(jmFile);

        jmCharacters.setText("Postavy");

        jmUpdateCharacterList.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmUpdateCharacterList.setText("Obnovit seznam postav");
        jmUpdateCharacterList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUpdateCharacterListActionPerformed(evt);
            }
        });
        jmCharacters.add(jmUpdateCharacterList);

        jmFindCharacter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jmFindCharacter.setText("Vyhledat postavu...");
        jmFindCharacter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFindCharacterActionPerformed(evt);
            }
        });
        jmCharacters.add(jmFindCharacter);

        jMenuBar1.add(jmCharacters);

        jmSources.setText("Zdroje");

        bgResourceSelection.add(jmResourceDatabase);
        jmResourceDatabase.setSelected(true);
        jmResourceDatabase.setText("Databáze");
        jmResourceDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmResourceDatabaseActionPerformed(evt);
            }
        });
        jmSources.add(jmResourceDatabase);

        bgResourceSelection.add(jmResourceTest);
        jmResourceTest.setText("Testovací sada dat");
        jmResourceTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmResourceTestActionPerformed(evt);
            }
        });
        jmSources.add(jmResourceTest);

        jMenuBar1.add(jmSources);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbUpdateServerStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateServerStateActionPerformed
        jbUpdateServerState.setText("Obnovuji...");

        String hostname = "wow.pk-nostalgia.cz";
        Server data = new Server(hostname, 3306);
        Server auth = new Server(hostname, 3724);
        Server game = new Server(hostname, 8090);
        Server dev = new Server(hostname, 8091);

        jlDatabaseServerState.setText((data.getState()) ? "online" : "offline");
        jlAuthServerState.setText((auth.getState()) ? "online" : "offline");
        jlGameServerState.setText((game.getState()) ? "online" : "offline");
        jlDevServerState.setText((dev.getState()) ? "online" : "offline");

        jbUpdateServerState.setText("Obnovit");
    }//GEN-LAST:event_jbUpdateServerStateActionPerformed

    private void jbUpdateCharacterListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateCharacterListActionPerformed
        this.updateOnlineCharacters();
    }//GEN-LAST:event_jbUpdateCharacterListActionPerformed

    private void jlOnlineListFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlOnlineListFocusLost
        jbShowCharDetail.setEnabled(false);
    }//GEN-LAST:event_jlOnlineListFocusLost

    private void jlOnlineListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlOnlineListFocusGained
        jbShowCharDetail.setEnabled(true);
    }//GEN-LAST:event_jlOnlineListFocusGained

    private void jbShowCharDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbShowCharDetailActionPerformed
        if (jlOnlineList.getSelectedValue() instanceof Character) {
            JFrame jf = new jfCharacterDetail((Character) jlOnlineList.getSelectedValue());
            jf.setVisible(true);
        } else {
            this.findCharacter();
        }
    }//GEN-LAST:event_jbShowCharDetailActionPerformed

    private void jmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmExitActionPerformed

    private void jmUpdateCharacterListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUpdateCharacterListActionPerformed
        this.jbUpdateCharacterListActionPerformed(evt);
    }//GEN-LAST:event_jmUpdateCharacterListActionPerformed

    private void jmFindCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFindCharacterActionPerformed
        this.findCharacter();
    }//GEN-LAST:event_jmFindCharacterActionPerformed

    /**
     * Switch to live data and enable finding characters by name
     * @param evt 
     */
    private void jmResourceDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmResourceDatabaseActionPerformed
        try {
            database = new CharacterDaoMysql("wow.pk-nostalgia.cz", "pjv", "pjv2014");
            jmFindCharacter.setEnabled(true);
        } catch (CharacterDaoException ex) {
            JOptionPane.showMessageDialog(this, "Při připojení došlo k chybě: " + ex.getMessage(), "Chyba!", JOptionPane.ERROR_MESSAGE);
            bgResourceSelection.setSelected(jmResourceTest.getModel(), true);
        }
    }//GEN-LAST:event_jmResourceDatabaseActionPerformed

    /**
     * Switch to test data and enable finding characters by name
     * @param evt 
     */
    private void jmResourceTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmResourceTestActionPerformed
        database = new CharacterDaoTest();
        jmFindCharacter.setEnabled(false);
    }//GEN-LAST:event_jmResourceTestActionPerformed

    private void jmHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmHelpActionPerformed
        JFrame jf = new jfHelp();
        jf.setVisible(true);
    }//GEN-LAST:event_jmHelpActionPerformed

    
    /**
     * Asks for character name and tries to find it
     */
    private void findCharacter() {
        String charname = JOptionPane.showInputDialog("Zadejte prosím jméno postavy");
        try {
            Character chr = database.getCharacter(charname);
            new jfCharacterDetail(chr).setVisible(true);
        } catch (CharacterDaoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Chyba", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateOnlineCharacters ()
    {
        jbUpdateCharacterList.setText("Obnovuji...");
        try {
            chars = database.getOnlineCharacters();
        } catch (CharacterDaoException ex) {
            JOptionPane.showMessageDialog(this, "Spojení se serverem bylo ztraceno.", "Chyba připojení", JOptionPane.ERROR_MESSAGE);
        }
        DefaultListModel charsModel = new DefaultListModel();
        for (Character c : chars) {
            charsModel.addElement(c);
        }
        jlOnlineList.setModel(charsModel);
        jbUpdateCharacterList.setText("Obnovit");
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgResourceSelection;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton jbShowCharDetail;
    private javax.swing.JButton jbUpdateCharacterList;
    private javax.swing.JButton jbUpdateServerState;
    private javax.swing.JLabel jlAuthServer;
    private javax.swing.JLabel jlAuthServerState;
    private javax.swing.JLabel jlDatabaseServer;
    private javax.swing.JLabel jlDatabaseServerState;
    private javax.swing.JLabel jlDevServer;
    private javax.swing.JLabel jlDevServerState;
    private javax.swing.JLabel jlGameServer;
    private javax.swing.JLabel jlGameServerState;
    private javax.swing.JList jlOnlineList;
    private javax.swing.JMenu jmCharacters;
    private javax.swing.JMenuItem jmExit;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenuItem jmFindCharacter;
    private javax.swing.JMenuItem jmHelp;
    private javax.swing.JRadioButtonMenuItem jmResourceDatabase;
    private javax.swing.JRadioButtonMenuItem jmResourceTest;
    private javax.swing.JMenu jmSources;
    private javax.swing.JMenuItem jmUpdateCharacterList;
    // End of variables declaration//GEN-END:variables

    private static class CharacterUpdateActionListener implements ActionListener {
        jfMain parent;

        private CharacterUpdateActionListener(jfMain frame) {
            parent = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            parent.updateOnlineCharacters();
        }
    }
}
