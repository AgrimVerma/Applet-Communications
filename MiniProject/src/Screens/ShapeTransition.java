package Screens;

import java.awt.Color;

public class ShapeTransition extends javax.swing.JFrame {

    Color selectedColor;
    int height, width;
    static DisplayPanel outputPanel = new DisplayPanel();
    Boolean isShapeTransitionStarted;
    final Transition transition = Transition.SHAPE;

    public ShapeTransition() {
        initComponents();
        isShapeTransitionStarted = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        colorSelector = new javax.swing.JColorChooser();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        heightLabel = new javax.swing.JLabel();
        heightChanger = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        widthLabel = new javax.swing.JLabel();
        widthChanger = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Shape Transition Input");
        setBackground(new java.awt.Color(255, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        Heading.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Heading.setForeground(new java.awt.Color(0, 102, 102));
        Heading.setText("User Input for Shape transition");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(Heading)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Heading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, java.awt.BorderLayout.NORTH);

        jPanel10.setForeground(new java.awt.Color(255, 255, 204));
        jPanel10.setLayout(new java.awt.BorderLayout());

        colorSelector.setBackground(new java.awt.Color(255, 255, 255));
        colorSelector.setAutoscrolls(true);
        colorSelector.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        colorSelector.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel10.add(colorSelector, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 204));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        heightLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        heightLabel.setText("Height:");

        heightChanger.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        heightChanger.setModel(new javax.swing.SpinnerNumberModel(50, null, null, 5));
        heightChanger.setMinimumSize(new java.awt.Dimension(500, 320));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heightLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heightChanger, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightChanger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightLabel))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel11);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        widthLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        widthLabel.setText("Width:");

        widthChanger.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        widthChanger.setModel(new javax.swing.SpinnerNumberModel(50, null, null, 5));
        widthChanger.setMinimumSize(new java.awt.Dimension(500, 320));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(widthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(widthChanger, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(widthChanger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(widthLabel))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1);

        jPanel10.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        startButton.setBackground(new java.awt.Color(204, 255, 204));
        startButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        startButton.setForeground(new java.awt.Color(0, 204, 0));
        startButton.setText("Start");
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        jPanel9.add(startButton);

        stopButton.setBackground(new java.awt.Color(255, 204, 204));
        stopButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        stopButton.setForeground(new java.awt.Color(255, 51, 51));
        stopButton.setText("Stop");
        stopButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stopButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });
        jPanel9.add(stopButton);

        getContentPane().add(jPanel9, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        selectedColor = colorSelector.getColor();
        height = Integer.parseInt(heightChanger.getValue().toString());
        width = Integer.parseInt(widthChanger.getValue().toString());
        System.out.println("Color Selected: " + selectedColor.toString() + "\n width: " + width + "\n height: " + height);
        if (isShapeTransitionStarted) {
            outputPanel.stop();
            System.out.println("Previous timer stopped and starting again.");
            outputPanel.setdetails(transition, height, width, selectedColor);
        } else {
            outputPanel.setdetails(transition, height, width, selectedColor);
            System.out.println("fresh timer started");
            isShapeTransitionStarted = true;
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Shape transition stopped");
        outputPanel.stop();
        isShapeTransitionStarted = false;
    }//GEN-LAST:event_stopButtonActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapeTransition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JColorChooser colorSelector;
    private javax.swing.JSpinner heightChanger;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JSpinner widthChanger;
    private javax.swing.JLabel widthLabel;
    // End of variables declaration//GEN-END:variables
}
