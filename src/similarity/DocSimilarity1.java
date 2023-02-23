package similarity;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DocSimilarity1 extends javax.swing.JFrame {

    protected final JFileChooser openFileChooser;
    StringBuilder sb = new StringBuilder();
    JFileChooser Chooser = new JFileChooser();
    FileReader fileReader;
    File ff;
    FileReader fr = null;
    JFileChooser jf = new JFileChooser();

    public DocSimilarity1() {
        initComponents();

        openFileChooser = new JFileChooser();
        openFileChooser.setCurrentDirectory(new File("c:\\temp"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("txt", "docx"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtText1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtText2 = new javax.swing.JTextArea();
        btnOpenFile1 = new javax.swing.JToggleButton();
        txtAddress2 = new javax.swing.JTextField();
        txtAddress1 = new javax.swing.JTextField();
        btnOpenFile2 = new javax.swing.JToggleButton();
        finalResult = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tbfreq = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TbToken = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        finalResult1 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        Tbfreq1 = new javax.swing.JTable();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabel2.setText("Document Similarity Checker");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        txtText1.setColumns(20);
        txtText1.setRows(5);
        jScrollPane2.setViewportView(txtText1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 360, 220));

        txtText2.setColumns(20);
        txtText2.setRows(5);
        jScrollPane3.setViewportView(txtText2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 360, 220));

        btnOpenFile1.setText("Open File 1 ..");
        btnOpenFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFile1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpenFile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));
        getContentPane().add(txtAddress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 240, -1));
        getContentPane().add(txtAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 260, -1));

        btnOpenFile2.setText("Open File 2...");
        btnOpenFile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFile2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpenFile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        finalResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalResultActionPerformed(evt);
            }
        });
        getContentPane().add(finalResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, 100, 32));

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        jLabel7.setText("Hasil Tokenisasi");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jLabel4.setText("Term Frequency");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, -1));

        jLabel6.setText("Dokumen 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, -1));

        jLabel9.setText("Dokumen 1");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabel10.setText("Presentase Kemiripan");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 860, 20));

        Tbfreq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Daftar Kata", "Doc 2"
            }
        ));
        jScrollPane4.setViewportView(Tbfreq);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 180, 120));

        TbToken.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Doc 1", "Doc 2"
            }
        ));
        jScrollPane5.setViewportView(TbToken);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 290, 120));

        jLabel11.setText("Jarak euclidean antara kedua Docs");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));

        finalResult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalResult1ActionPerformed(evt);
            }
        });
        getContentPane().add(finalResult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 100, 32));

        Tbfreq1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Daftar Kata", "Doc 1"
            }
        ));
        jScrollPane6.setViewportView(Tbfreq1);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 190, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFile1ActionPerformed

        int Open = jf.showOpenDialog(null);

        if (Open == JFileChooser.APPROVE_OPTION) {
            try {
                ff = jf.getSelectedFile();
                txtAddress1.setText(ff.getAbsolutePath());
                System.out.println(ff);
                JOptionPane.showMessageDialog(rootPane, "Sukses dibuka");
                fr = new FileReader(ff);
                txtText1.read(fr, "");
            } catch (Exception ex) {

            } finally {
                try {
                    fr.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "File gagal dibuka! ");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No file choosen!");
        }
    }//GEN-LAST:event_btnOpenFile1ActionPerformed

    private void btnOpenFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFile2ActionPerformed

        int Choose = jf.showOpenDialog(null);

        if (Choose == JFileChooser.APPROVE_OPTION) {
            try {
                ff = jf.getSelectedFile();
                txtAddress2.setText(ff.getAbsolutePath());
                System.out.println(ff);
                JOptionPane.showMessageDialog(rootPane, "Sukses dibuka");
                fr = new FileReader(ff);
                txtText2.read(fr, "");
            
            } catch (Exception ex) {

            } finally {
                try {
                    fr.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "File gagal dibuka! ");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No file choosen!");
        }

    }//GEN-LAST:event_btnOpenFile2ActionPerformed
    
    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed

        ArrayList<String> wordsList1 = new ArrayList<>();
        ArrayList<String> wordsList2 = new ArrayList<>();
        
        String Text1 = txtText2.getText().toLowerCase();
        String Text2 = txtText1.getText().toLowerCase();


        String[] Words1 = Text1.split("\\s+");
        String[] Words2 = Text2.split("\\s+");

        for (String words1 : Words1) {
            wordsList1.add(words1);
        }

        for (String words2 : Words2) {
            wordsList2.add(words2);
        }

        int minTokenSize = 0;

        String[] stopWords = {"dan", "atau", "dari", "ini", "di", "untuk", "yang", "juga"};

        for (int i = 0; i < wordsList1.size(); i++) {
            for (int j = 0; j < stopWords.length; j++) {
                if (stopWords[j].contains(wordsList1.get(i))) {
                    wordsList1.remove(i);
                }
            }
        }

        for (int i = 0; i < wordsList2.size(); i++) {
            for (int j = 0; j < stopWords.length; j++) {
                if (stopWords[j].contains(wordsList2.get(i))) {
                    wordsList2.remove(i);
                }
            }
        }

        
        int x = 0;
        for (int i = 0; i < wordsList1.size(); i++) {
        TbToken.setValueAt(wordsList1.get(i), i, 0);
        }
        for (int i = 0; i < wordsList2.size(); i++) {
        TbToken.setValueAt(wordsList2.get(i), i, 1);
        }

        HashMap<String, Integer> dict1 = new HashMap<String, Integer>();
        HashMap<String, Integer> dict2 = new HashMap<String, Integer>();

        for (int i = 0; i < wordsList1.size(); i++) {
            if (!dict1.containsKey(wordsList1.get(i))) {
                dict1.put(wordsList1.get(i), 1);
            } else {
                Integer f1 = dict1.get(wordsList1.get(i));
                dict1.remove(wordsList1.get(i));
                dict1.put(wordsList1.get(i), f1 + 1);
            }
            if (!dict2.containsKey(wordsList1.get(i))) {
                dict2.put(wordsList1.get(i), -1);
            }
        }

        for (int i = 0; i < wordsList2.size(); i++) {
            if (!dict2.containsKey(wordsList2.get(i))) {
                dict2.put(wordsList2.get(i), 1);
            } else {
                Integer f2 = dict2.get(wordsList2.get(i));
                dict2.remove(wordsList2.get(i));
                dict2.put(wordsList2.get(i), f2 + 1);
            }
            if (!dict1.containsKey(wordsList2.get(i))) {
                dict1.put(wordsList2.get(i), -1);
            }
        }

        double dotProduct = 0.0;
        double hasilq = 0.0;
        
        
//        int size;
//        if(wordsList1.size() > wordsList2.size()){
//            size = wordsList1.size();
//        }else{
//            size = wordsList2.size();
//        }
//        
        for (int i = 0; i < wordsList1.size(); i++) {
            Integer f1 = dict1.get(wordsList1.get(i));
            Integer f2 = dict2.get(wordsList2.get(i));
    
            System.out.println(wordsList1.get(i) + " : " + f1);
            System.out.println(wordsList2.get(i) + " : " + f2);
              
               Tbfreq.setValueAt(wordsList1.get(i),i,0); 
               Tbfreq.setValueAt(f1,i,1);
               Tbfreq1.setValueAt(wordsList2.get(i),i,0); 
               Tbfreq1.setValueAt(f2,i,1);
               
               
            if (wordsList1.get(i).equals(wordsList2.get(i))) {
                dotProduct = Math.pow(f1 - f2, 2);
                System.out.println("hasil1 : " + f1 + " - " + f2 + " = " + dotProduct);
            } //else {
//                dotProduct = Math.pow(f1 - 0, 2);
//                System.out.println("hasil2 : "  + f1 + " - " + " 0 " + " = " + dotProduct);
//                dotProduct = Math.pow(f2 - 0, 2);
//                System.out.println("hasil2 : "  + f2 + " - " + " 0 " + " = " + dotProduct);
//            }
            hasilq += dotProduct;

        }
        double hasilAkar = sqrt(hasilq);
        System.out.println("Hasil Perhitungan :" + hasilq);
        System.out.println("Hasil Perhitungan fix :" + hasilAkar);
        
        double hasilk = 1/(1 + hasilAkar);
        finalResult1.setText(String.valueOf(hasilAkar));
        System.out.println("hasil :" + hasilk);
        double persen = (hasilk * 100);
        finalResult.setText(String.valueOf(persen + "%"));
        System.out.println("hasil % :" + persen + "%");
        

    }//GEN-LAST:event_hitungActionPerformed

    private void finalResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalResultActionPerformed

    private void finalResult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalResult1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalResult1ActionPerformed

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
            java.util.logging.Logger.getLogger(DocSimilarity1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocSimilarity1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocSimilarity1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocSimilarity1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocSimilarity1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbToken;
    private javax.swing.JTable Tbfreq;
    private javax.swing.JTable Tbfreq1;
    private javax.swing.JToggleButton btnOpenFile1;
    private javax.swing.JToggleButton btnOpenFile2;
    private javax.swing.JTextField finalResult;
    private javax.swing.JTextField finalResult1;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    protected javax.swing.JTextArea txtText1;
    protected javax.swing.JTextArea txtText2;
    // End of variables declaration//GEN-END:variables
}
