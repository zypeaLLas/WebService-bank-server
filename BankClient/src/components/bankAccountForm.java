/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class bankAccountForm extends javax.swing.JFrame {
    User user = null;
    /**
     * Creates new form bankAccountForm
     */
    DefaultTableModel transferModel;
    DefaultTableModel drawModel;
            
    public bankAccountForm() {
        initComponents();
    }
    
    public bankAccountForm(User user) {
        initComponents();
        this.user = user;
        
        transferModel = (DefaultTableModel)tbltransfer.getModel();
        drawModel = (DefaultTableModel)tblDraw.getModel();
        //show table data
        showData();
        
        //show balance number
        lb_balance.setText(String.format("%.2f", user.getTotalMoney()));
        lb_username.setText(user.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTransfer = new javax.swing.JPanel();
        lbtransferTouser = new javax.swing.JLabel();
        txtTransferTousername = new javax.swing.JTextField();
        btntransfer = new javax.swing.JButton();
        txtTransferMoney = new javax.swing.JTextField();
        lbtransferMoney = new javax.swing.JLabel();
        transfer_lb_note = new javax.swing.JLabel();
        txt_transferNote = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltransfer = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDraw = new javax.swing.JTable();
        pnlWithdraw = new javax.swing.JPanel();
        btnWithDraw = new javax.swing.JButton();
        txtWithDraw = new javax.swing.JTextField();
        lbWithdrawMoney = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_balance = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Account Action Form");

        pnlTransfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Transfer"));

        lbtransferTouser.setText("To username :");
        lbtransferTouser.setToolTipText("");

        btntransfer.setText("Transfer");
        btntransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransferActionPerformed(evt);
            }
        });

        lbtransferMoney.setText("Money: ");
        lbtransferMoney.setToolTipText("");

        transfer_lb_note.setText("Note");
        transfer_lb_note.setToolTipText("");

        javax.swing.GroupLayout pnlTransferLayout = new javax.swing.GroupLayout(pnlTransfer);
        pnlTransfer.setLayout(pnlTransferLayout);
        pnlTransferLayout.setHorizontalGroup(
            pnlTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransferLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTransferLayout.createSequentialGroup()
                        .addComponent(transfer_lb_note, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_transferNote, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTransferLayout.createSequentialGroup()
                        .addComponent(lbtransferTouser, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTransferTousername, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTransferLayout.createSequentialGroup()
                        .addComponent(lbtransferMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTransferMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btntransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pnlTransferLayout.setVerticalGroup(
            pnlTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransferLayout.createSequentialGroup()
                .addGroup(pnlTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTransferLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbtransferTouser)
                            .addComponent(txtTransferTousername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbtransferMoney)
                            .addComponent(txtTransferMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlTransferLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btntransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(pnlTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transfer_lb_note)
                    .addComponent(txt_transferNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tbltransfer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "To username", "Money", "Transfer date", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbltransfer);

        tblDraw.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Money", "WithDraw date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDraw);

        pnlWithdraw.setBorder(javax.swing.BorderFactory.createTitledBorder("Draw Money"));

        btnWithDraw.setText("confirm");
        btnWithDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithDrawActionPerformed(evt);
            }
        });

        lbWithdrawMoney.setText("Money: ");
        lbWithdrawMoney.setToolTipText("");

        javax.swing.GroupLayout pnlWithdrawLayout = new javax.swing.GroupLayout(pnlWithdraw);
        pnlWithdraw.setLayout(pnlWithdrawLayout);
        pnlWithdrawLayout.setHorizontalGroup(
            pnlWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWithdrawLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbWithdrawMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtWithDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnWithDraw)
                .addGap(20, 20, 20))
        );
        pnlWithdrawLayout.setVerticalGroup(
            pnlWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWithdrawLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbWithdrawMoney)
                        .addComponent(txtWithDraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnWithDraw))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Welcome,");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Your balance : ");

        lb_balance.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_balance.setText("not-set");

        jLabel4.setText("VND");

        lb_username.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_username.setText("not-set");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lb_balance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_username)))
                        .addGap(37, 98, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(pnlWithdraw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlTransfer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(pnlWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_username, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransferActionPerformed
        // TODO add your handling code here:
        String toUserName = txtTransferTousername.getText();
        float money = Float.parseFloat(txtTransferMoney.getText());
        String note  = txt_transferNote.getText();
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        // Định dạng ngày và giờ theo yêu cầu của bạn
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        String message = transfer(user.getUsername(), toUserName, money, note);
        transferModel.addRow(new Object[]{transferModel.getRowCount() + 1,
                toUserName,
                money, 
                formattedDateTime,
                note
        });
        JOptionPane.showConfirmDialog(rootPane, message);

    }//GEN-LAST:event_btntransferActionPerformed

    private void btnWithDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithDrawActionPerformed
        // TODO add your handling code here:
        
        float money = Float.parseFloat(txtWithDraw.getText());
        String message = draw(user.getUsername(),money);
        LocalDateTime currentDateTime = LocalDateTime.now();
        // Định dạng ngày và giờ theo yêu cầu của bạn
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        drawModel.addRow(new Object[]{drawModel.getRowCount() + 1, money, formattedDateTime.toString()});
        JOptionPane.showConfirmDialog(rootPane, message);
        
       

    }//GEN-LAST:event_btnWithDrawActionPerformed

    
    private void showData() {
        transferModel.setRowCount(0);
        for (Transferhistory transferHistory : user.getTransferhistory()) {
            transferModel.addRow(new Object[] {transferModel.getRowCount() + 1,
                transferHistory.getToUsername(), 
                transferHistory.getTotalTransfer(), 
                transferHistory.getTransferDate().toString(),
                transferHistory.getNote()
            });
        }
        drawModel.setRowCount(0);
        for (Drawmoneyhistory drawMoneyHistory : user.getDrawMoneyHistory()) {
            drawModel.addRow(new Object[] {drawModel.getRowCount() + 1,
                                           drawMoneyHistory.getTotalDraw(),
                                           drawMoneyHistory.getDrawDate().toString()});
        }
    }
   
   
   
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
            java.util.logging.Logger.getLogger(bankAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bankAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bankAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bankAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bankAccountForm().setVisible(true);
            }
        });
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnWithDraw;
    private javax.swing.JButton btntransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbWithdrawMoney;
    private javax.swing.JLabel lb_balance;
    private javax.swing.JLabel lb_username;
    private javax.swing.JLabel lbtransferMoney;
    private javax.swing.JLabel lbtransferTouser;
    private javax.swing.JPanel pnlTransfer;
    private javax.swing.JPanel pnlWithdraw;
    private javax.swing.JTable tblDraw;
    private javax.swing.JTable tbltransfer;
    private javax.swing.JLabel transfer_lb_note;
    private javax.swing.JTextField txtTransferMoney;
    private javax.swing.JTextField txtTransferTousername;
    private javax.swing.JTextField txtWithDraw;
    private javax.swing.JTextField txt_transferNote;
    // End of variables declaration//GEN-END:variables

    private static String draw(java.lang.String arg0, float arg1) {
        components.MyBankWS_Service service = new components.MyBankWS_Service();
        components.MyBankWS port = service.getMyBankWSPort();
        return port.draw(arg0, arg1);
    }

    private static String transfer(java.lang.String arg0, java.lang.String arg1, float arg2, java.lang.String arg3) {
        components.MyBankWS_Service service = new components.MyBankWS_Service();
        components.MyBankWS port = service.getMyBankWSPort();
        return port.transfer(arg0, arg1, arg2, arg3);
    }
}
