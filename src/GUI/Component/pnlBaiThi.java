
package GUI.Component;

import javax.swing.JLayeredPane;


public class pnlBaiThi extends JLayeredPane {

    public pnlBaiThi(String tenBaiThi, int soLuotLam, double diem) {
    initComponents();
    lblBaiThi.setText(tenBaiThi);
    lblLuotLam.setText("Số lượt làm: " + soLuotLam);
    lblDiem.setText("Điểm: " + diem);
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        testpnl1 = new com.raven.suportSwing.PanelBorder();
        lblBaiThi = new javax.swing.JLabel();
        lblLuotLam = new javax.swing.JLabel();
        lblDiem = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        testpnl1.setBackground(new java.awt.Color(153, 255, 255));
        testpnl1.setPreferredSize(new java.awt.Dimension(250, 150));

        lblBaiThi.setBackground(new java.awt.Color(255, 255, 255));
        lblBaiThi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblBaiThi.setForeground(new java.awt.Color(0, 0, 0));
        lblBaiThi.setText("Bài thi môn ABC");

        lblLuotLam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLuotLam.setForeground(new java.awt.Color(0, 0, 0));
        lblLuotLam.setText("Số lượt làm: ");

        lblDiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDiem.setForeground(new java.awt.Color(0, 0, 0));
        lblDiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiem.setText("Điểm:");
        lblDiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout testpnl1Layout = new javax.swing.GroupLayout(testpnl1);
        testpnl1.setLayout(testpnl1Layout);
        testpnl1Layout.setHorizontalGroup(
            testpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testpnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(testpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBaiThi)
                    .addComponent(lblLuotLam)
                    .addComponent(lblDiem))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        testpnl1Layout.setVerticalGroup(
            testpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testpnl1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblBaiThi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLuotLam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDiem)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setLayer(testpnl1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(testpnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(testpnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBaiThi;
    private javax.swing.JLabel lblDiem;
    private javax.swing.JLabel lblLuotLam;
    private javax.swing.JPanel testpnl1;
    // End of variables declaration//GEN-END:variables
}
