package stopwatch;

import static java.lang.Thread.sleep;

public class anotherStopwatch extends javax.swing.JFrame {

    static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;

    static int seconds2x = 0;
    static int minutes2x = 0;
    static int hours2x = 0;

    static int secondsHalf = 0;
    static int minutesHalf = 0;
    static int hoursHalf = 0;
    
    static boolean state = true;
    
    public anotherStopwatch() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jMenu1 = new javax.swing.JMenu();
        minute = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        startBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        stopBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        minute2x = new javax.swing.JLabel();
        second2x = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hour2x = new javax.swing.JLabel();
        minuteHalf = new javax.swing.JLabel();
        secondHalf = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hourHalf = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

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

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        minute.setFont(new java.awt.Font("Mshtakan", 0, 36)); // NOI18N
        minute.setText(" 00 :");

        second.setFont(new java.awt.Font("Mshtakan", 0, 36)); // NOI18N
        second.setText("  00");

        hour.setFont(new java.awt.Font("Mshtakan", 0, 36)); // NOI18N
        hour.setText("00 :");

        startBtn.setText("Start");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        stopBtn.setText("Stop");
        stopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Regular Clock");

        minute2x.setFont(new java.awt.Font("Mshtakan", 0, 36)); // NOI18N
        minute2x.setText(" 00 :");

        second2x.setFont(new java.awt.Font("Mshtakan", 0, 36)); // NOI18N
        second2x.setText("  00");

        jLabel2.setText("Clock twice as fast");

        hour2x.setFont(new java.awt.Font("Mshtakan", 0, 36)); // NOI18N
        hour2x.setText("00 :");

        minuteHalf.setFont(new java.awt.Font("Mshtakan", 0, 36)); // NOI18N
        minuteHalf.setText(" 00 :");

        secondHalf.setFont(new java.awt.Font("Mshtakan", 0, 36)); // NOI18N
        secondHalf.setText("  00");

        jLabel3.setText("Clock half as fast");

        hourHalf.setFont(new java.awt.Font("Mshtakan", 0, 36)); // NOI18N
        hourHalf.setText("00 :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hourHalf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(minuteHalf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addComponent(secondHalf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hour2x, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(minute2x, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addComponent(second2x, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minute2x, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(second2x, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hour2x, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minuteHalf, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondHalf, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourHalf, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        state = false;
        
        hours = 0;
        minutes = 0;
        seconds = 0;
        
        hours2x = 0;
        minutes2x = 0;
        seconds2x = 0;
        
        hoursHalf = 0;
        minutesHalf = 0;
        secondsHalf = 0;
        
        hour.setText("00 : ");
        minute.setText("00 : ");
        second.setText("00  ");
        hour2x.setText("00 : ");
        minute2x.setText("00 : ");
        second2x.setText("00  ");
        hourHalf.setText("00 : ");
        minuteHalf.setText("00 : ");
        secondHalf.setText("00  ");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        state = true;
        
        Thread t = new Thread(){
            public void run(){ 
                for ( ; ;){
                    if (state == true){
                        try {
                            sleep(1000);
                         
                            
                            if (seconds > 60){
                                seconds = 0;
                                minutes++;
                            }
                            if (minutes > 60){
                                seconds = 0;
                                minutes = 0;
                                hours++;
                            }
                            
                            seconds++;
                            
                            second.setText(" : "+seconds);
                            minute.setText(" : "+minutes);
                            hour.setText(""+hours);
                            
                        } catch (Exception e){
                            
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        
        Thread t2 = new Thread(){
            public void run(){ 
                for ( ; ;){
                    if (state == true){
                        try {
                            sleep(500);
                            
                        
                            if (seconds2x > 60){
                                seconds2x = 0;
                                minutes2x++;
                            }
                            if (minutes2x > 60){
                                seconds2x = 0;
                                minutes2x = 0;
                                hours2x++;
                            }
                         
                            seconds2x++;
                            
                            second2x.setText(" : "+seconds2x);
                            minute2x.setText(" : "+minutes2x);
                            hour2x.setText(""+hours2x);
                            
                        } catch (Exception e){
                            
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        
        Thread t3 = new Thread(){
            public void run(){ 
                for ( ; ;){
                    if (state == true){
                        try {
                            sleep(2000);

                            if (secondsHalf > 60){
                                secondsHalf = 0;
                                minutesHalf++;
                            }
                            if (minutesHalf > 60){
                                secondsHalf = 0;
                                minutesHalf = 0;
                                hoursHalf++;
                            }

                            secondsHalf++;
                            
                            secondHalf.setText(" : "+secondsHalf);
                            minuteHalf.setText(" : "+minutesHalf);
                            hourHalf.setText(""+hoursHalf);
                            
                        } catch (Exception e){
                            
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        
        t.start();
        t2.start();
        t3.start();
     
    }//GEN-LAST:event_startBtnActionPerformed

    private void stopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnActionPerformed
        state = false;
    }//GEN-LAST:event_stopBtnActionPerformed

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
            java.util.logging.Logger.getLogger(anotherStopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anotherStopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anotherStopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anotherStopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anotherStopwatch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hour;
    private javax.swing.JLabel hour2x;
    private javax.swing.JLabel hourHalf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel minute;
    private javax.swing.JLabel minute2x;
    private javax.swing.JLabel minuteHalf;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel second;
    private javax.swing.JLabel second2x;
    private javax.swing.JLabel secondHalf;
    private javax.swing.JButton startBtn;
    private javax.swing.JButton stopBtn;
    // End of variables declaration//GEN-END:variables
}
