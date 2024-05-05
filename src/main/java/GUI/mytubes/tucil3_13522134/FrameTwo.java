/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.mytubes.tucil3_13522134;

/**
 *
 * @author Shabrina Maharani
*/
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
import java.awt.Font;
import javax.swing.JOptionPane;


public class FrameTwo extends javax.swing.JFrame {

    public FrameTwo() {
        initComponents();
    }
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(94, 116, 185));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EndWord");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("StartWord");

        jTextField1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uniform Cost Search (UCS)", "Greedy Best-First Search (GBFS)", "A*" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose your algorithm here to find the solution!");

        jButton1.setBackground(new java.awt.Color(178, 216, 255));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton1.setText("FIND!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 540, 350));

        jPanel4.setBackground(new java.awt.Color(217, 174, 174));

        jScrollPane3.setViewportView(jTextPane1);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Solution");

        jButton2.setBackground(new java.awt.Color(153,214,255));
        jButton2.setFont(new java.awt.Font("Arial Black",1,12));
        jButton2.setText("Save solution to file.txt!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea3.setColumns(15);
        jTextArea3.setFont(new java.awt.Font("Calibri", Font.BOLD,24)); // NOI18N
        jTextArea3.setRows(1);
        jScrollPane4.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 570, 520));



        jPanel5.setBackground(new java.awt.Color(130, 147, 198));

        jTextArea1.setColumns(15);
        jTextArea1.setRows(1);
        //jTextArea1.setText("okey");
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setFont(new Font("Calibri", Font.BOLD, 18));

        jTextPane1.setFont(new Font("Times New Roman", Font.BOLD, 24));
        //jTextPane1.setPreferredSize(new Dimension(519, 200));
        //jTextPane1.setBounds(x, y, 519, 394);


        jTextArea2.setColumns(15);
        jTextArea2.setRows(1);
        //jTextArea2.setText("okey");
        jScrollPane2.setViewportView(jTextArea2);
        jTextArea2.setFont(new Font("Calibri", Font.BOLD, 18));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Visited Node      :");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Execution Time :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 540, 140));

        jLabel5.setBackground(new java.awt.Color(255, 204, 204));
        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\GUI\\images\\pastel-mountain-range-aesthetic-mac-d2scpr7wfxa3fuda.jpg"));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -4, 1290, 700));

        setSize(new java.awt.Dimension(1300, 702));
        setLocationRelativeTo(null);
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String endWord = jTextField1.getText().toLowerCase().trim();
        String startWord = jTextField2.getText().toLowerCase().trim();
        
        String choice = (String) jComboBox1.getSelectedItem();

        try {
            Set<String> dictionary = loadDict("src/main/java/CLI/text/dictionary.txt");
            List<String> solution= new ArrayList<>();;
            UCS ucsSolver = new UCS(dictionary);
            GBFS gbfsSolver = new GBFS(dictionary);
            Astar astarSolver = new Astar(dictionary);
            double startTime =0;
            double endTime =0;

            int currentMemory = (int) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024;
            //int endMemory =0;
            if(choice.equals("Uniform Cost Search (UCS)")){
                //System.out.println("ucs");
                startTime = System.currentTimeMillis();
                solution = ucsSolver.searchSolution(startWord, endWord);
                endTime = System.currentTimeMillis();
            } else if(choice.equals("Greedy Best-First Search (GBFS)")){
                //System.out.println("gbfs");
                startTime = System.currentTimeMillis();
                solution = gbfsSolver.searchSolution(startWord, endWord);
                endTime = System.currentTimeMillis();
            } else{
                //System.out.println("astar");
                startTime = System.currentTimeMillis();
                solution = astarSolver.searchSolution(startWord, endWord);
                endTime = System.currentTimeMillis();
            }
            int endMemory = (int) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024;

            if (!solution.isEmpty()) {
                // Menampilkan solusi di JTextPane
                StringBuilder solutionText = new StringBuilder();
                for (String word : solution) {
                    solutionText.append(word).append("\n");
                }
               
                jTextPane1.setText(solutionText.toString());
                
                // Menampilkan execution time di JTextArea
                double duration = endTime - startTime;
                String executionTime = "";
                if (duration > 60000) {
                    double durationInMinutes = duration / 60000.0;
                    executionTime = durationInMinutes + " minutes";
                } else if (duration > 1000) {
                    double durationInSeconds = duration / 1000.0;
                    executionTime = durationInSeconds + " seconds";
                } else {
                    executionTime = duration + " miliseconds";
                }
                jTextArea2.setText(executionTime);
                
                // Menampilkan jumlah visited node di JTextArea
                int visitedNodeCount = ucsSolver.getnodeCount();
                jTextArea1.setText(visitedNodeCount + " Nodes");
            } else {
                displayNoPathDialog();
            }
            int memoryUsage =  endMemory - currentMemory;
            jTextArea3.setText("Memory Usage : " + memoryUsage + " kb");
        } catch (Exception e) {
            displayErrorDialog("Error: " + e.getMessage());
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String fileName = JOptionPane.showInputDialog(this, "Enter file name: (Example : solution1)");
        String filePath = JOptionPane.showInputDialog(this, "Enter file path: (Example : C:/Users/Shabrina Maharani/Documents/4th sem/STIMA/Tucil3_13522134/test/)");

    
        if (fileName != null && !fileName.isEmpty() && !jTextPane1.getText().isEmpty()) {
            try {
                FileWriter writer = new FileWriter(filePath + fileName + ".txt");

                writer.write("Start Word : " + jTextField2.getText() + "\n");
                writer.write("End Word : " + jTextField1.getText() + "\n");
                writer.write("Solution: \n");

                String solution = jTextPane1.getText();
                writer.write(solution);

                writer.write("Execution Time : " + jTextArea2.getText() + "\n");
                writer.write("Visited Nodes : " + jTextArea1.getText());

                writer.close();
                JOptionPane.showMessageDialog(this, "Solution saved to " + fileName + ".txt");

            } catch (IOException ex) {

                JOptionPane.showMessageDialog(this, "Error saving solution to file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a valid file name.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    public static Set<String> loadDict(String filePath) throws FileNotFoundException {
        Set<String> dictionary = new HashSet<>(); //Penggunaan Set agar kata pada dictionary tidak redundant
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                dictionary.add(scanner.nextLine().toLowerCase());
            }
        } catch (FileNotFoundException e) {
            throw e;
        }
        return dictionary;
    }

    private void displayErrorDialog(String errorMessage) {
        DialogException dialog = new DialogException(errorMessage);
    }

    private void displayNoPathDialog() {
        DialogMessage dialog = new DialogMessage("No path found from " + jTextField2.getText() + " to " + jTextField1.getText());
    }    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {}


    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTwo().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea3;
}
