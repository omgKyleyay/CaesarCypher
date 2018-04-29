/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcypher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.Set;
import java.lang.StringBuilder;
/**
 *
 * @author Kyle
 */
public class CypherGUI extends javax.swing.JFrame {

    /**
     * Creates new form CypherGUI
     */
    public CypherGUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        KeyTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRun = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtFreq = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtReplaced = new javax.swing.JTextArea();
        txtReplaceInitial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtReplaceFinal = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnReplace = new javax.swing.JButton();
        btnUndo = new javax.swing.JButton();
        btnAutoReplace = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtA.setColumns(20);
        txtA.setLineWrap(true);
        txtA.setRows(5);
        jScrollPane1.setViewportView(txtA);

        jLabel1.setText("Key");

        btnRun.setText("Run");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        TxtFreq.setColumns(20);
        TxtFreq.setLineWrap(true);
        TxtFreq.setRows(5);
        TxtFreq.setAlignmentX(1.0F);
        jScrollPane2.setViewportView(TxtFreq);

        txtReplaced.setColumns(20);
        txtReplaced.setLineWrap(true);
        txtReplaced.setRows(5);
        jScrollPane3.setViewportView(txtReplaced);

        jLabel3.setText("To");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReplace.setText("Replace");
        btnReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplaceActionPerformed(evt);
            }
        });

        btnUndo.setText("Undo");
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });

        btnAutoReplace.setText("Automatic Replace");
        btnAutoReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoReplaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(txtReplaceInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(txtReplaceFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSave))
                                        .addGap(32, 32, 32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(KeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnReplace)
                                        .addGap(99, 99, 99))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAutoReplace)
                                .addGap(78, 78, 78))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRun)
                        .addGap(16, 16, 16)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(btnAutoReplace)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtReplaceFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReplaceInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReplace)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUndo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        txtA.setText(null);
        TxtFreq.setText(null);
        BufferedReader br = null;
        FileReader fr = null;
        int key = Integer.parseInt(KeyTextField.getText()) % 94; // Modular 94 (# of ascii chars used) keeps key within range
        try{
            fr = new FileReader("test.txt"); //file to be read and encrypted
            br = new BufferedReader(fr);
             
            String line;
            while ((line = br.readLine()) != null){
                for (int i = 0; i < line.length(); i++){
                 char c = (line.charAt(i));
                 int ascii = (c + key);
                 if (ascii > 126) ascii = ascii - (126 - 32); //keeps new shifted value within range
                 String a = Character.toString((char) ascii);
                 txtA.append(a);
                }                 
            }
        }
        catch(IOException e){
             e.printStackTrace();
        }        // TODO add your handling code here:
        
        Map<String, Integer> map = new HashMap<>(); //dictionary for frequency display
        for (int i = 0; i < txtA.getText().length(); i++){
                String a_string = Character.toString(txtA.getText().charAt(i));
                Integer count = map.get(a_string);
                if (count == null) { //checks if key exists. if not, adds to dictionary
                    map.put(a_string, 1);
                }
                else {
                    map.put(a_string, count + 1); // +1 value to key
                }
        }
        
        map.entrySet().stream() //sorts dictionary by descending from highest value. had to stackoverflow this one.
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> TxtFreq.append(k.getKey() + " : " + k.getValue() + "\n"));
             
    }//GEN-LAST:event_btnRunActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        FileWriter fw = null;       
        try {
            String content = txtA.getText();
            String newFile = "ciphered.txt"; //new file name
            File file = new File(newFile);
            if (!file.exists()) try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(CypherGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            try {
                bw.write(content); //writes encyphered text to file
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(CypherGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(CypherGUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(CypherGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplaceActionPerformed

        if (txtReplaced.getText().equals("")){   //first time replace button is pressed
            String txt_to_replace = txtA.getText();
            for (int i= 0; i < txt_to_replace.length(); i++){
                String str_to_replace = Character.toString(txt_to_replace.charAt(i)); 
                if (str_to_replace.equals(txtReplaceInitial.getText())){
                    txt_to_replace = txt_to_replace.replace(str_to_replace, txtReplaceFinal.getText());    //replaces characters at i if it equals user's replace character            
                }               
            }            
            txtReplaced.setText(txt_to_replace);
        }
        
        else {          //subsequent press of the replace button
            String txt_to_replace = txtReplaced.getText();
            txtReplaced.setText(""); 
            for (int i= 0; i < txt_to_replace.length(); i++){
                String str_to_replace = Character.toString(txt_to_replace.charAt(i));
                if (str_to_replace.equals(txtReplaceInitial.getText())){
                    txt_to_replace = txt_to_replace.replace(str_to_replace, txtReplaceFinal.getText());       //replaces characters at i if it equals user's replace character           
                }               
            }
            txtReplaced.setText(txt_to_replace);
        }
         


    }//GEN-LAST:event_btnReplaceActionPerformed

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
        if (txtReplaceInitial.getText().matches("")){
            txtReplaced.setText(null);
            txtReplaced.append(txtA.getText());
        }
        else{
        String txt_to_replace = txtReplaced.getText(); 
        txtReplaced.setText(null);
        String new_text = txt_to_replace.replaceAll(txtReplaceFinal.getText(), txtReplaceInitial.getText());
        txtReplaced.append(new_text);  
        }
    }//GEN-LAST:event_btnUndoActionPerformed

    private void btnAutoReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoReplaceActionPerformed
        Map<String, Integer> map = new HashMap<>(); //dictionary for frequency display, same dictionary as earlier
        for (int i = 0; i < txtA.getText().length(); i++){
                String a_string = Character.toString(txtA.getText().charAt(i));
                Integer count = map.get(a_string);
                if (count == null) {
                    map.put(a_string, 1);
                }
                else {
                    map.put(a_string, count + 1);
                }
        }
        
        String max_key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey(); //takes highest value key in dictionary and replaces it with 'e'
        txtReplaced.setText(null);
        txtReplaced.append(txtA.getText().replaceAll(max_key, "e"));
            
        
    }//GEN-LAST:event_btnAutoReplaceActionPerformed
    
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
            java.util.logging.Logger.getLogger(CypherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CypherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CypherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CypherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CypherGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField KeyTextField;
    public javax.swing.JTextArea TxtFreq;
    private javax.swing.JButton btnAutoReplace;
    private javax.swing.JButton btnReplace;
    public javax.swing.JButton btnRun;
    public javax.swing.JButton btnSave;
    private javax.swing.JButton btnUndo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextArea txtA;
    public javax.swing.JTextField txtReplaceFinal;
    public javax.swing.JTextField txtReplaceInitial;
    public javax.swing.JTextArea txtReplaced;
    // End of variables declaration//GEN-END:variables
}
