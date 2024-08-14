package app;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import custom.MenuCustom;
import custom.NoBorderStack;

import custom.CustomTable;
import custom.FrameMoving;
import java.awt.Color;

import javax.swing.*;

public class MainWindow extends javax.swing.JFrame {

    int currentindex = 0;

    public MainWindow() {
        // quitar barra de tareas
        setUndecorated(true);

        //mover ventana
        FrameMoving.initMoving(this);

        //inicar componentes
        initComponents();

        // Centra el frame en la pantalla
        setLocationRelativeTo(null);

        // customizar tabla
        CustomTable.personalizeTable(this.jTable1);

        // customizar menu button
        JPanel[] opciones = {opc_1, opc_2, opc_3, opc_4, opc_5, opc_6};

        for (JPanel opcion : opciones) {
            opcion.setBackground(new Color(24, 30, 54)); // Color base inicial
        }
        MenuCustom menuCustom = new MenuCustom(stack);

        menuCustom.agregarEventos(opciones);

        //customizar TabbedPan
        NoBorderStack.removeBorders(stack);
    }

    DefaultTableModel model;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customTable1 = new custom.CustomTable();
        customTable2 = new custom.CustomTable();
        customTable3 = new custom.CustomTable();
        JPanel2 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        logOut = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelBorder2 = new custom.PanelBorder();
        jLabel6 = new javax.swing.JLabel();
        panelBorder4 = new custom.PanelBorder();
        jLabel7 = new javax.swing.JLabel();
        opc_3 = new javax.swing.JPanel();
        opc1 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        opc_1 = new javax.swing.JPanel();
        opc7 = new javax.swing.JPanel();
        lb2 = new javax.swing.JLabel();
        opc_2 = new javax.swing.JPanel();
        opc8 = new javax.swing.JPanel();
        lb4 = new javax.swing.JLabel();
        opc_4 = new javax.swing.JPanel();
        opc9 = new javax.swing.JPanel();
        lb9 = new javax.swing.JLabel();
        opc_5 = new javax.swing.JPanel();
        opc10 = new javax.swing.JPanel();
        lb10 = new javax.swing.JLabel();
        opc_6 = new javax.swing.JPanel();
        opc11 = new javax.swing.JPanel();
        lb11 = new javax.swing.JLabel();
        stack = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panelBorder1 = new custom.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelBorder8 = new custom.PanelBorder();
        lbTitle6 = new javax.swing.JLabel();
        lbValues6 = new javax.swing.JLabel();
        lbDescription6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbDescription7 = new javax.swing.JLabel();
        panelBorder10 = new custom.PanelBorder();
        lbTitle7 = new javax.swing.JLabel();
        lbValues7 = new javax.swing.JLabel();
        lbDescription8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbDescription9 = new javax.swing.JLabel();
        panelBorder11 = new custom.PanelBorder();
        lbTitle8 = new javax.swing.JLabel();
        lbValues8 = new javax.swing.JLabel();
        lbDescription10 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbDescription11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1180, 658));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel2.setMaximumSize(new java.awt.Dimension(1180, 658));
        JPanel2.setMinimumSize(new java.awt.Dimension(1180, 658));
        JPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(127, 127, 127));
        jLabel2.setText("Managment System");
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mini.png"))); // NOI18N
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniMouseExited(evt);
            }
        });
        header.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 34, 34));

        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close.png"))); // NOI18N
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
        });
        header.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 34, 34));

        JPanel2.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 970, 40));

        menu.setBackground(new java.awt.Color(24, 30, 54));
        menu.setMaximumSize(new java.awt.Dimension(215, 555));
        menu.setMinimumSize(new java.awt.Dimension(215, 555));
        menu.setPreferredSize(new java.awt.Dimension(215, 555));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logOut.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        logOut.setForeground(new java.awt.Color(211, 47, 47));
        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/log-out.png"))); // NOI18N
        logOut.setText("   Log-out");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutMouseExited(evt);
            }
        });
        menu.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 90, 33));

        jLabel4.setBackground(new java.awt.Color(204, 255, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User-Circle-Single--Streamline-Core(1).png"))); // NOI18N
        jLabel4.setText("jLabel4");
        menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 90));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(241, 241, 241));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("User name");
        menu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 130, 20));

        panelBorder2.setBackground(new java.awt.Color(90, 90, 241));
        panelBorder2.setLayout(new java.awt.CardLayout());

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(218, 210, 210));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Data");
        panelBorder2.add(jLabel6, "card2");

        menu.add(panelBorder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 50, 20));

        panelBorder4.setBackground(new java.awt.Color(30, 43, 78));
        panelBorder4.setForeground(new java.awt.Color(30, 43, 78));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Any Info Here");

        javax.swing.GroupLayout panelBorder4Layout = new javax.swing.GroupLayout(panelBorder4);
        panelBorder4.setLayout(panelBorder4Layout);
        panelBorder4Layout.setHorizontalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel7)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panelBorder4Layout.setVerticalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder4Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.add(panelBorder4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, 70));

        opc_3.setBackground(new java.awt.Color(49, 60, 105));
        opc_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opc1.setBackground(new java.awt.Color(49, 60, 105));
        opc1.setLayout(new javax.swing.BoxLayout(opc1, javax.swing.BoxLayout.LINE_AXIS));
        opc_3.add(opc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lb1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb1.setForeground(new java.awt.Color(241, 241, 241));
        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2.png"))); // NOI18N
        lb1.setText("  Option_2");
        opc_3.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        menu.add(opc_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 180, 30));

        opc_1.setBackground(new java.awt.Color(49, 60, 105));
        opc_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opc7.setBackground(new java.awt.Color(49, 60, 105));
        opc7.setLayout(new javax.swing.BoxLayout(opc7, javax.swing.BoxLayout.LINE_AXIS));
        opc_1.add(opc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lb2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb2.setForeground(new java.awt.Color(241, 241, 241));
        lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5.png"))); // NOI18N
        lb2.setText("  Home");
        opc_1.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        menu.add(opc_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 180, 30));

        opc_2.setBackground(new java.awt.Color(49, 60, 105));
        opc_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opc8.setBackground(new java.awt.Color(49, 60, 105));
        opc8.setLayout(new javax.swing.BoxLayout(opc8, javax.swing.BoxLayout.LINE_AXIS));
        opc_2.add(opc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lb4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb4.setForeground(new java.awt.Color(241, 241, 241));
        lb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/8.png"))); // NOI18N
        lb4.setText("  Option_1");
        opc_2.add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        menu.add(opc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 180, 30));

        opc_4.setBackground(new java.awt.Color(49, 60, 105));
        opc_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opc9.setBackground(new java.awt.Color(49, 60, 105));
        opc9.setLayout(new javax.swing.BoxLayout(opc9, javax.swing.BoxLayout.LINE_AXIS));
        opc_4.add(opc9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lb9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb9.setForeground(new java.awt.Color(241, 241, 241));
        lb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Shopping-Cart-1--Streamline-Core.png"))); // NOI18N
        lb9.setText("   Option_3");
        opc_4.add(lb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        menu.add(opc_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 30));

        opc_5.setBackground(new java.awt.Color(49, 60, 105));
        opc_5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opc10.setBackground(new java.awt.Color(49, 60, 105));
        opc10.setLayout(new javax.swing.BoxLayout(opc10, javax.swing.BoxLayout.LINE_AXIS));
        opc_5.add(opc10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lb10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb10.setForeground(new java.awt.Color(241, 241, 241));
        lb10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/6.png"))); // NOI18N
        lb10.setText("  Option_4");
        opc_5.add(lb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        menu.add(opc_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 180, 30));

        opc_6.setBackground(new java.awt.Color(49, 60, 105));
        opc_6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opc11.setBackground(new java.awt.Color(49, 60, 105));
        opc11.setLayout(new javax.swing.BoxLayout(opc11, javax.swing.BoxLayout.LINE_AXIS));
        opc_6.add(opc11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lb11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb11.setForeground(new java.awt.Color(241, 241, 241));
        lb11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Information-Circle--Streamline-Core.png"))); // NOI18N
        lb11.setText("   Option_5");
        opc_6.add(lb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        menu.add(opc_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 180, 30));

        JPanel2.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 660));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("General Report");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 890, 360));

        panelBorder8.setBackground(new java.awt.Color(167, 94, 236));
        panelBorder8.setMaximumSize(new java.awt.Dimension(379, 191));
        panelBorder8.setMinimumSize(new java.awt.Dimension(379, 191));

        lbTitle6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbTitle6.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle6.setText("Title");

        lbValues6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbValues6.setForeground(new java.awt.Color(255, 255, 255));
        lbValues6.setText("Values");

        lbDescription6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDescription6.setForeground(new java.awt.Color(255, 255, 255));
        lbDescription6.setText("Description");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pie-Line-Graph-Desktop--Streamline-Ultimate.png"))); // NOI18N

        lbDescription7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDescription7.setForeground(new java.awt.Color(255, 255, 255));
        lbDescription7.setText("Description");

        javax.swing.GroupLayout panelBorder8Layout = new javax.swing.GroupLayout(panelBorder8);
        panelBorder8.setLayout(panelBorder8Layout);
        panelBorder8Layout.setHorizontalGroup(
            panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescription7)
                    .addComponent(jLabel3)
                    .addComponent(lbDescription6)
                    .addComponent(lbTitle6)
                    .addComponent(lbValues6))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        panelBorder8Layout.setVerticalGroup(
            panelBorder8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTitle6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbValues6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDescription7)
                .addGap(28, 28, 28)
                .addComponent(lbDescription6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelBorder8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 290, 180));

        panelBorder10.setBackground(new java.awt.Color(123, 123, 245));
        panelBorder10.setMaximumSize(new java.awt.Dimension(379, 191));
        panelBorder10.setMinimumSize(new java.awt.Dimension(379, 191));

        lbTitle7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbTitle7.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle7.setText("Title");

        lbValues7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbValues7.setForeground(new java.awt.Color(255, 255, 255));
        lbValues7.setText("Values");

        lbDescription8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDescription8.setForeground(new java.awt.Color(255, 255, 255));
        lbDescription8.setText("Description");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pie-Line-Graph-Desktop--Streamline-Ultimate.png"))); // NOI18N

        lbDescription9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDescription9.setForeground(new java.awt.Color(255, 255, 255));
        lbDescription9.setText("Description");

        javax.swing.GroupLayout panelBorder10Layout = new javax.swing.GroupLayout(panelBorder10);
        panelBorder10.setLayout(panelBorder10Layout);
        panelBorder10Layout.setHorizontalGroup(
            panelBorder10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelBorder10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle7)
                    .addComponent(lbDescription9)
                    .addComponent(lbDescription8)
                    .addComponent(lbValues7)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder10Layout.setVerticalGroup(
            panelBorder10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGap(21, 21, 21)
                .addComponent(lbTitle7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbValues7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDescription9)
                .addGap(28, 28, 28)
                .addComponent(lbDescription8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelBorder10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 290, 180));

        panelBorder11.setBackground(new java.awt.Color(241, 150, 62));
        panelBorder11.setMaximumSize(new java.awt.Dimension(379, 191));
        panelBorder11.setMinimumSize(new java.awt.Dimension(379, 191));

        lbTitle8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbTitle8.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle8.setText("Title");

        lbValues8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbValues8.setForeground(new java.awt.Color(255, 255, 255));
        lbValues8.setText("Values");

        lbDescription10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDescription10.setForeground(new java.awt.Color(255, 255, 255));
        lbDescription10.setText("Description");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pie-Line-Graph-Desktop--Streamline-Ultimate.png"))); // NOI18N

        lbDescription11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDescription11.setForeground(new java.awt.Color(255, 255, 255));
        lbDescription11.setText("Description");

        javax.swing.GroupLayout panelBorder11Layout = new javax.swing.GroupLayout(panelBorder11);
        panelBorder11.setLayout(panelBorder11Layout);
        panelBorder11Layout.setHorizontalGroup(
            panelBorder11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelBorder11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescription11)
                    .addComponent(jLabel10)
                    .addComponent(lbDescription10)
                    .addComponent(lbTitle8)
                    .addComponent(lbValues8))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        panelBorder11Layout.setVerticalGroup(
            panelBorder11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTitle8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbValues8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDescription11)
                .addGap(28, 28, 28)
                .addComponent(lbDescription10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelBorder11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 290, 180));

        stack.addTab("tab1", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(127, 127, 127));
        jLabel11.setText("Opt_1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel11)
                .addContainerGap(475, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(261, 261, 261))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        stack.addTab("tab2", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(127, 127, 127));
        jLabel12.setText("Opt_2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel12)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel12)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        stack.addTab("tab3", jPanel3);

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(127, 127, 127));
        jLabel13.setText("Opt_3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel13)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel13)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        stack.addTab("tab4", jPanel4);

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(127, 127, 127));
        jLabel14.setText("Opt_4");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel14)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel14)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        stack.addTab("tab5", jPanel7);

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(127, 127, 127));
        jLabel15.setText("Opt_5");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel15)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel15)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        stack.addTab("tab6", jPanel8);

        JPanel2.add(stack, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 980, 650));

        getContentPane().add(JPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        logOut.setForeground(new Color(183, 28, 28)); // pressed 
    }//GEN-LAST:event_logOutMouseClicked

    private void logOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseEntered
        logOut.setForeground(new Color(229, 115, 115)); // hover
    }//GEN-LAST:event_logOutMouseEntered

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
        logOut.setForeground(new Color(211, 47, 47)); // base
    }//GEN-LAST:event_logOutMouseExited

    // Cerrar y Minizar
    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        setState(MainWindow.ICONIFIED);

    }//GEN-LAST:event_miniMouseClicked

    private void miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseEntered
        mini.setIcon(new ImageIcon(getClass().getResource("/icon/miniHover.png"))); // Establecer ícono de hover
    }//GEN-LAST:event_miniMouseEntered

    private void miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseExited
        mini.setIcon(new ImageIcon(getClass().getResource("/icon/mini.png"))); // Establecer ícono de hover
    }//GEN-LAST:event_miniMouseExited

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        this.dispose();
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        x.setIcon(new ImageIcon(getClass().getResource("/icon/closeHover.png"))); // Establecer ícono de hover
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        x.setIcon(new ImageIcon(getClass().getResource("/icon/close.png"))); // Establecer ícono de hover
    }//GEN-LAST:event_xMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel2;
    private custom.CustomTable customTable1;
    private custom.CustomTable customTable2;
    private custom.CustomTable customTable3;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel lbDescription10;
    private javax.swing.JLabel lbDescription11;
    private javax.swing.JLabel lbDescription6;
    private javax.swing.JLabel lbDescription7;
    private javax.swing.JLabel lbDescription8;
    private javax.swing.JLabel lbDescription9;
    private javax.swing.JLabel lbTitle6;
    private javax.swing.JLabel lbTitle7;
    private javax.swing.JLabel lbTitle8;
    private javax.swing.JLabel lbValues6;
    private javax.swing.JLabel lbValues7;
    private javax.swing.JLabel lbValues8;
    private javax.swing.JLabel logOut;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel mini;
    private javax.swing.JPanel opc1;
    private javax.swing.JPanel opc10;
    private javax.swing.JPanel opc11;
    private javax.swing.JPanel opc7;
    private javax.swing.JPanel opc8;
    private javax.swing.JPanel opc9;
    private javax.swing.JPanel opc_1;
    private javax.swing.JPanel opc_2;
    private javax.swing.JPanel opc_3;
    private javax.swing.JPanel opc_4;
    private javax.swing.JPanel opc_5;
    private javax.swing.JPanel opc_6;
    private custom.PanelBorder panelBorder1;
    private custom.PanelBorder panelBorder10;
    private custom.PanelBorder panelBorder11;
    private custom.PanelBorder panelBorder2;
    private custom.PanelBorder panelBorder4;
    private custom.PanelBorder panelBorder8;
    private javax.swing.JTabbedPane stack;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
