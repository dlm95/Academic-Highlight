package diagnostic;

/*
 * FinchTester.java
 * Author:  Tom Lauwers
 * Created on Oct 1, 2010, 11:19:21 AM
 * This program is used at the factory to check if the Finch is working properly.
 * It allows the user to verify the motors, LED, and buzzer, and checks the sensors
 * to see if they are in the expected ranges.
 */


import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;


public class FinchTester extends javax.swing.JFrame {

    Finch tester;
    /** Creates new form FinchTester */
    public FinchTester() {
        initComponents();
        tester = new Finch();
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        label1 = new java.awt.Label();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(java.awt.Color.green);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton1.setText("Test Buzzer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.Color.green);
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton3.setText("Test Motors");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setBackground(java.awt.Color.green);
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton7.setText("Test Sensors");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setBackground(java.awt.Color.green);
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton9.setText("Test IR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 0, 18));
        label1.setText("Finch Testing Program");

        jButton13.setBackground(new java.awt.Color(51, 255, 51));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton13.setText("Test LED");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Buzzer test
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        for(int i = 0; i < 3; i++) {
            tester.buzz(440*(i+1), 1000);
            tester.sleep(1000);
        }
        jTextArea1.setText("The buzzer should have beeped twice");
    }//GEN-LAST:event_jButton1ActionPerformed
    // Test motors - two seconds forward, two seconds back
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tester.setWheelVelocities(255,255, 2000);
        tester.setWheelVelocities(-255,-255, 2000);
    }//GEN-LAST:event_jButton3ActionPerformed
    // Makes sure light and temperature sensors are within range (a value of 0 or 255 would indicate a shorted wire.  Also checks accelerometers
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextArea1.setText("Testing sensors...\n");
        boolean sensorWorks = true;
        if(tester.getLeftLightSensor() > 0 && tester.getLeftLightSensor() < 255 && tester.getRightLightSensor() > 0 && tester.getRightLightSensor() < 255) {
            jTextArea1.append("Light sensors working\n");
        }
        else {
            sensorWorks = false;
            jTextArea1.append("Light sensors FAILED\n");
        }
        if(tester.getTemperature() > 10 && tester.getTemperature() < 35) {
            jTextArea1.append("Temperature sensor working\n");
        }
        else {
            sensorWorks = false;
            jTextArea1.append("Temperature sensor FAILED\n");
        }
        double[] accels = new double[3];
        accels = tester.getAccelerations();
        if(accels[0] < 1.5 && accels[0] > -1.5 && accels[1] < 1.5 && accels[1] > -1.5 && accels[2] < 1.5 && accels[2] > -1.5) {
            jTextArea1.append("Accelerometer working\n");
        }
        else {
            sensorWorks = false;
            jTextArea1.append("Accelerometer FAILED\n");
        }
        if(sensorWorks){
            tester.setLED(0,255,0);
        }
    }//GEN-LAST:event_jButton7ActionPerformed
    // Checks if the obstacle sensors work using the LED to provide feedback - can be stopped by pointing the beak down at the ground
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        boolean leftIR, rightIR;
        while(!tester.isBeakDown()) {
        //    jTextArea1.setText("Testing IR Obstacle sensor.\n");
        //    jTextArea1.append("LED will turn green for left obstacle\n");
        //    jTextArea1.append("blue for right obstacle\n");
        //    jTextArea1.append("red for both obstacles\n");
        //    jTextArea1.append("Exit this test by pointing the beak down");

            leftIR = tester.isObstacleLeftSide();
	    rightIR = tester.isObstacleRightSide();
            if(leftIR && rightIR) {
                    tester.setLED(255,0,0);
            }
            else if(leftIR) {
                    tester.setLED(0, 255, 0);
            }
            else if(rightIR) {
                    tester.setLED(0,0,255);
            }
            else {
                    tester.setLED(0,0,0);
            }
        }
        tester.setLED(0,0,0);

    }//GEN-LAST:event_jButton9ActionPerformed
    // Tests the LED's three color elements (red, green, blue)
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        tester.setLED(255,0,0);
        tester.sleep(1000);
        tester.setLED(0,255,0);
        tester.sleep(1000);
        tester.setLED(0,0,255);
        tester.sleep(1000);
        tester.setLED(0,0,0);
        jTextArea1.setText("The LED should have changed from red \n to green to blue.");
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinchTester().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

}
