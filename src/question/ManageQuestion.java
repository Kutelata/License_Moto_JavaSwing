/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import level.Level;
import level.LevelManager;

/**
 *
 * @author WOLF
 */
public class ManageQuestion extends javax.swing.JDialog {

    CallbackQuestion callbackQuestion;

    public interface CallbackQuestion {

        public void actionloadQuestion();
    }

    /**
     * Creates new form ManageQuestions
     */
    public ManageQuestion(java.awt.Frame parent, boolean modal, CallbackQuestion callbackQuestion) {
        super(parent, modal);
        initComponents();
        this.callbackQuestion = callbackQuestion;
        loadLevel();
        loadImg();
    }

    public void loadImg() {
        ImageIcon b11 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/attach.png")));
        Image iB11 = b11.getImage();
        Image img11 = iB11.getScaledInstance(50, 40, Image.SCALE_SMOOTH);
        ImageIcon ic11 = new ImageIcon(img11);
        buttonAttachImage.setIcon(ic11);
        ImageIcon b1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/cancel.png")));
        Image iB1 = b1.getImage();
        Image img1 = iB1.getScaledInstance(50, 40, Image.SCALE_SMOOTH);
        ImageIcon ic1 = new ImageIcon(img1);
        buttonCancel.setIcon(ic1);
        ImageIcon b2 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/updateQues.png")));
        Image iB2 = b2.getImage();
        Image img2 = iB2.getScaledInstance(50, 40, Image.SCALE_SMOOTH);
        ImageIcon ic2 = new ImageIcon(img2);
        buttonUpdateQuestion.setIcon(ic2);
        ImageIcon b3 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/addQues.png")));
        Image iB3 = b3.getImage();
        Image img3 = iB3.getScaledInstance(50, 40, Image.SCALE_SMOOTH);
        ImageIcon ic3 = new ImageIcon(img3);
        buttonAddQuestion.setIcon(ic3);
        ImageIcon b4 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/detach.png")));
        Image iB4 = b4.getImage();
        Image img4 = iB4.getScaledInstance(50, 40, Image.SCALE_SMOOTH);
        ImageIcon ic4 = new ImageIcon(img4);
        buttonCloseImage.setIcon(ic4);
    }

    public void loadLevel() {
        LevelManager lm = new LevelManager();
        cbxLevel.setModel(lm.getAllLevel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPathImage = new javax.swing.JLabel();
        buttonAttachImage = new javax.swing.JButton();
        buttonAddQuestion = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonUpdateQuestion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaQuestion = new javax.swing.JTextArea();
        lblFieldId = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonCloseImage = new javax.swing.JButton();
        cbxLevel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonAttachImage.setText("Attach");
        buttonAttachImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAttachImageActionPerformed(evt);
            }
        });

        buttonAddQuestion.setText("Add");
        buttonAddQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddQuestionActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        jLabel1.setText("Question:");

        buttonUpdateQuestion.setText("Update");
        buttonUpdateQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateQuestionActionPerformed(evt);
            }
        });

        txaQuestion.setColumns(20);
        txaQuestion.setRows(5);
        jScrollPane1.setViewportView(txaQuestion);

        lblFieldId.setText("Id:");

        jLabel2.setText("Level:");

        buttonCloseImage.setText("Close Image");
        buttonCloseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseImageActionPerformed(evt);
            }
        });

        jLabel3.setText("Image:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPathImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonAttachImage, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonCloseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 308, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonUpdateQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAddQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPathImage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonAttachImage, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCloseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonAddQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonUpdateQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAttachImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAttachImageActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String fileName = f.getAbsolutePath();
        lblPathImage.setText(fileName);
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(fileName);
        Image image = icon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
        lblImage.setIcon(icon);
    }//GEN-LAST:event_buttonAttachImageActionPerformed

    private void buttonAddQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddQuestionActionPerformed
        // TODO add your handling code here:
        String question = txaQuestion.getText();
        int levelId = ((Level) cbxLevel.getSelectedItem()).getId();
        String image = lblPathImage.getText();

        if (question.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Please enter question");
        } else {
            QuestionManager em = new QuestionManager();
            Question e = new Question(question, levelId, image);
            int row = em.createQuestion(e);
            if (row == 0) {
                JOptionPane.showMessageDialog(rootPane, "Add question success");
                callbackQuestion.actionloadQuestion();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Add question fail, please try again!!!");
            }
        }
    }//GEN-LAST:event_buttonAddQuestionActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonUpdateQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateQuestionActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(lblId.getText());
        String question = txaQuestion.getText();
        int levelId = ((Level) cbxLevel.getSelectedItem()).getId();
        String image = lblPathImage.getText();

        int choose = JOptionPane.showConfirmDialog(rootPane, "Are you sure want to update this question?", "Message", JOptionPane.OK_CANCEL_OPTION);
        if (choose == JOptionPane.OK_OPTION) {
            if (question.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Please enter question");
            } else {
                QuestionManager em = new QuestionManager();
                Question e = new Question(id, question, levelId, image);
                int row = em.updateQuestion(e);
                if (row == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Update question success");
                    callbackQuestion.actionloadQuestion();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Update question fail, please try again!!!");
                }
            }
        }
    }//GEN-LAST:event_buttonUpdateQuestionActionPerformed

    private void buttonCloseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseImageActionPerformed
        // TODO add your handling code here:
        lblImage.setIcon(null);
        lblPathImage.setText(null);
        buttonCloseImage.setVisible(false);
    }//GEN-LAST:event_buttonCloseImageActionPerformed

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
            java.util.logging.Logger.getLogger(ManageQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManageQuestion dialog = new ManageQuestion(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton buttonAddQuestion;
    private javax.swing.JButton buttonAttachImage;
    private javax.swing.JButton buttonCancel;
    public static javax.swing.JButton buttonCloseImage;
    public static javax.swing.JButton buttonUpdateQuestion;
    public static javax.swing.JComboBox<Level> cbxLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblFieldId;
    public static javax.swing.JLabel lblId;
    public static javax.swing.JLabel lblImage;
    public static javax.swing.JLabel lblPathImage;
    public static javax.swing.JTextArea txaQuestion;
    // End of variables declaration//GEN-END:variables
}
