/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.srohter.LauncherX.MainMenu;

import com.srohter.LauncherX.LoginMenu.Utils.UIUtils;
import com.srohter.LauncherX.database.Utils.Colors;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

/**
 *
 * @author skylarrohter
 */
public class MainMenu extends JFrame {

    /**
     * Creates new form Login
     */
    public MainMenu() {
        setUndecorated(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        loginButton = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LogoBorder = new javax.swing.JPanel();
        OpenersBtn = new javax.swing.JLabel();
        assBtn = new javax.swing.JButton();
        browBtn = new javax.swing.JButton();
        setBtn = new javax.swing.JButton();
        winBtns = new javax.swing.JPanel();
        sBtn = new javax.swing.JLabel();
        mBtn = new javax.swing.JLabel();
        xBtn = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        oFrame = new javax.swing.JInternalFrame();
        AccentLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(Colors.BACKGROUND_COLOR);
        MainPanel.setForeground(new java.awt.Color(255, 51, 102));

        MenuPanel.setBackground(Colors.BACKGROUND_COLOR);
        MenuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(Colors.TRIM_COLOR, 3));
        MenuPanel.setToolTipText("");

        jLabel1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("ok.png")).getFile())); // NOI18N

        LogoBorder.setBackground(Colors.BACKGROUND_COLOR);
        LogoBorder.setBorder(new javax.swing.border.LineBorder(Colors.TRIM_COLOR, 2, true));
        LogoBorder.setPreferredSize(new java.awt.Dimension(280, 6));

        javax.swing.GroupLayout LogoBorderLayout = new javax.swing.GroupLayout(LogoBorder);
        LogoBorder.setLayout(LogoBorderLayout);
        LogoBorderLayout.setHorizontalGroup(
                LogoBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        LogoBorderLayout.setVerticalGroup(
                LogoBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        OpenersBtn.setBackground(Colors.BACKGROUND_COLOR);
        OpenersBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        OpenersBtn.setForeground(new java.awt.Color(255, 255, 255));
        OpenersBtn.setBorder(javax.swing.BorderFactory.createLineBorder(Colors.TRIM_COLOR, 2));
        OpenersBtn.setFocusable(false);
        OpenersBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenersBtnMouseClicked(evt);
            }
        });


        assBtn.setBackground(Colors.BACKGROUND_COLOR);
        assBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        assBtn.setForeground(new java.awt.Color(255, 255, 255));
        assBtn.setText("Assignments");
        assBtn.setBorder(javax.swing.BorderFactory.createLineBorder(Colors.TRIM_COLOR, 2));
        assBtn.setContentAreaFilled(false);
        assBtn.setFocusable(false);

        browBtn.setBackground(Colors.BACKGROUND_COLOR);
        browBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        browBtn.setForeground(new java.awt.Color(255, 255, 255));
        browBtn.setText("Browser");
        browBtn.setBorder(javax.swing.BorderFactory.createLineBorder(Colors.TRIM_COLOR, 2));
        browBtn.setContentAreaFilled(false);
        browBtn.setFocusable(false);

        setBtn.setBackground(Colors.BACKGROUND_COLOR);
        setBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        setBtn.setForeground(new java.awt.Color(255, 255, 255));
        setBtn.setText("Settings");
        setBtn.setBorder(javax.swing.BorderFactory.createLineBorder(Colors.TRIM_COLOR, 2));
        setBtn.setContentAreaFilled(false);
        setBtn.setFocusable(false);
        setBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setBtnActionPerformed(evt);
            }
        });

        winBtns.setBackground(Colors.BACKGROUND_COLOR);
        winBtns.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        sBtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("rec.png")).getFile())); // NOI18N
        sBtn.setToolTipText("");
        sBtn.setSize(new java.awt.Dimension(48, 48));

        mBtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("m.png")).getFile()));// NOI18N
        mBtn.setToolTipText("");
        mBtn.setSize(new java.awt.Dimension(48, 48));

        xBtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("x.png")).getFile())); // NOI18N
        xBtn.setToolTipText("");
        xBtn.setSize(new java.awt.Dimension(48, 48));

        javax.swing.GroupLayout winBtnsLayout = new javax.swing.GroupLayout(winBtns);
        winBtns.setLayout(winBtnsLayout);
        winBtnsLayout.setHorizontalGroup(
                winBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winBtnsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(sBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(xBtn)
                                .addContainerGap())
        );
        winBtnsLayout.setVerticalGroup(
                winBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(winBtnsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(winBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mBtn)
                                        .addComponent(sBtn)
                                        .addComponent(xBtn))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
                MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuPanelLayout.createSequentialGroup()
                                                        .addGap(19, 19, 19)
                                                        .addComponent(jLabel1))
                                                .addGroup(MenuPanelLayout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(LogoBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(OpenersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(assBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                                                .addComponent(browBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(setBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                                .addGap(99, 99, 99)
                                                .addComponent(winBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
                MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LogoBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(winBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(OpenersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(assBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(browBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(setBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
        );

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(745, 0));

        oFrame.setBorder(null);
        oFrame.setFocusCycleRoot(false);
        oFrame.setFocusable(false);
        oFrame.setRequestFocusEnabled(false);
        oFrame.setVisible(true);
        BasicInternalFrameUI bi = (BasicInternalFrameUI)oFrame.getUI();
        bi.setNorthPane(null);

        AccentLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        AccentLabel.setText("Accent Color");

        javax.swing.GroupLayout oFrameLayout = new javax.swing.GroupLayout(oFrame.getContentPane());
        oFrame.getContentPane().setLayout(oFrameLayout);
        oFrameLayout.setHorizontalGroup(
                oFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(oFrameLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(AccentLabel)
                                .addContainerGap(617, Short.MAX_VALUE))
        );
        oFrameLayout.setVerticalGroup(
                oFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(oFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(AccentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(665, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(oFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(oFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(oFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        try {
            oFrame.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MainPanelLayout.setVerticalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void addOpenersButton(JPanel panel1) {
        final Color[] loginButtonColors = {UIUtils.COLOR_INTERACTIVE, Color.white};

        JLabel loginButton = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = UIUtils.get2dGraphics(g);
                super.paintComponent(g2);

                Insets insets = getInsets();
                int w = getWidth() - insets.left - insets.right;
                int h = getHeight() - insets.top - insets.bottom;
                g2.setColor(loginButtonColors[0]);
                g2.fillRoundRect(insets.left, insets.top, w, h, UIUtils.ROUNDNESS, UIUtils.ROUNDNESS);

                FontMetrics metrics = g2.getFontMetrics(UIUtils.FONT_GENERAL_UI);
                int x2 = (getWidth() - metrics.stringWidth(UIUtils.BUTTON_TEXT_LOGIN)) / 2;
                int y2 = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g2.setFont(UIUtils.FONT_GENERAL_UI);
                g2.setColor(loginButtonColors[1]);
                g2.drawString(UIUtils.BUTTON_TEXT_LOGIN, x2, y2);
            }
        };

        loginButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                //loginEventHandler();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                loginButtonColors[0] = UIUtils.COLOR_INTERACTIVE_DARKER;
                loginButtonColors[1] = UIUtils.OFFWHITE;
                loginButton.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginButtonColors[0] = UIUtils.COLOR_INTERACTIVE;
                loginButtonColors[1] = Color.white;
                loginButton.repaint();
            }
        });
        panel1.add(loginButton);
    }

    private void OpenersBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void setBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void OpenersBtnMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

    }


    public void main() {
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JLabel loginButton = new JLabel() {
        @Override
        protected void paintComponent(Graphics g) {
            final Color[] loginButtonColors = {UIUtils.COLOR_INTERACTIVE, Color.white};
            Graphics2D g2 = UIUtils.get2dGraphics(g);
            super.paintComponent(g2);

            Insets insets = getInsets();
            int w = getWidth() - insets.left - insets.right;
            int h = getHeight() - insets.top - insets.bottom;
            g2.setColor(loginButtonColors[0]);
            g2.fillRoundRect(insets.left, insets.top, w, h, UIUtils.ROUNDNESS, UIUtils.ROUNDNESS);

            FontMetrics metrics = g2.getFontMetrics(UIUtils.FONT_GENERAL_UI);
            int x2 = (getWidth() - metrics.stringWidth(UIUtils.BUTTON_TEXT_LOGIN)) / 2;
            int y2 = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
            g2.setFont(UIUtils.FONT_GENERAL_UI);
            g2.setColor(loginButtonColors[1]);
            g2.drawString(UIUtils.BUTTON_TEXT_LOGIN, x2, y2);

            loginButton.setBackground(UIUtils.COLOR_BACKGROUND);
            loginButton.setBounds(10, 10, 250, 44);
            loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    };
    private javax.swing.JLabel AccentLabel;
    private javax.swing.JPanel LogoBorder;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel OpenersBtn;
    private javax.swing.JButton assBtn;
    private javax.swing.JButton browBtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mBtn;
    private javax.swing.JInternalFrame oFrame;
    private javax.swing.JLabel sBtn;
    private javax.swing.JButton setBtn;
    private javax.swing.JPanel winBtns;
    private javax.swing.JLabel xBtn;
    // End of variables declaration
}