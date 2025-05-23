/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventorymanagementsystem;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author user
 */
public class PaySupplierGUI extends javax.swing.JFrame {
    // Encapsulation
    private Invoice invoice; // Composition: PaySupplierGUI has Invoice
    private String[] orderNames = new String[10];
    
    /**
     * Creates new form PaySupplierGUI
     */
    public PaySupplierGUI() {
        initComponents();
        populateInvoiceList();
        setupInvoiceListSelectionListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentFormPanel = new javax.swing.JPanel();
        paymentFormLabel = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        invoiceList = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceListPanel = new javax.swing.JList<>();
        paymentDetailspnl = new javax.swing.JPanel();
        paymentDetailsLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        amountLbl = new javax.swing.JLabel();
        paymentLbl = new javax.swing.JLabel();
        InvoiceDateTxtField = new javax.swing.JTextField();
        amountTxtField = new javax.swing.JTextField();
        payButton = new javax.swing.JToggleButton();
        cancelButton = new javax.swing.JToggleButton();
        paymentMethodTxtField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paymentFormPanel.setBackground(new java.awt.Color(2, 50, 70));

        paymentFormLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        paymentFormLabel.setForeground(new java.awt.Color(255, 255, 255));
        paymentFormLabel.setText("Payment Form");

        javax.swing.GroupLayout paymentFormPanelLayout = new javax.swing.GroupLayout(paymentFormPanel);
        paymentFormPanel.setLayout(paymentFormPanelLayout);
        paymentFormPanelLayout.setHorizontalGroup(
            paymentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentFormPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paymentFormLabel)
                .addGap(188, 188, 188))
        );
        paymentFormPanelLayout.setVerticalGroup(
            paymentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentFormPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(paymentFormLabel)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        bodyPanel.setBackground(new java.awt.Color(40, 112, 148));

        invoiceList.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        invoiceList.setForeground(new java.awt.Color(255, 255, 255));
        invoiceList.setText("Invoice List");

        jScrollPane2.setViewportView(invoiceListPanel);

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(invoiceList)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(invoiceList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paymentDetailsLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paymentDetailsLbl.setText("Payment Details");

        dateLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dateLbl.setText("Date:");

        amountLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        amountLbl.setText("Amount of Payment:               RM");

        paymentLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        paymentLbl.setText("Payment Method:");

        payButton.setBackground(new java.awt.Color(40, 112, 148));
        payButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        payButton.setForeground(new java.awt.Color(255, 255, 255));
        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(40, 112, 148));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paymentDetailspnlLayout = new javax.swing.GroupLayout(paymentDetailspnl);
        paymentDetailspnl.setLayout(paymentDetailspnlLayout);
        paymentDetailspnlLayout.setHorizontalGroup(
            paymentDetailspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentDetailspnlLayout.createSequentialGroup()
                .addGroup(paymentDetailspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentDetailspnlLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(payButton)
                        .addGap(27, 27, 27)
                        .addComponent(cancelButton))
                    .addGroup(paymentDetailspnlLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(paymentDetailsLbl))
                    .addGroup(paymentDetailspnlLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(paymentDetailspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountLbl)
                            .addGroup(paymentDetailspnlLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(dateLbl))
                            .addGroup(paymentDetailspnlLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(paymentLbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paymentDetailspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvoiceDateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentMethodTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        paymentDetailspnlLayout.setVerticalGroup(
            paymentDetailspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentDetailspnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymentDetailsLbl)
                .addGap(39, 39, 39)
                .addGroup(paymentDetailspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLbl)
                    .addComponent(InvoiceDateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paymentDetailspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLbl)
                    .addComponent(amountTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paymentDetailspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentLbl)
                    .addComponent(paymentMethodTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paymentDetailspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton)
                    .addComponent(payButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paymentDetailspnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paymentFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentDetailspnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        JOptionPane.showMessageDialog(paymentFormPanel, "Payment process is cancelled!");
        this.setVisible(false);
        new MainPageGUI().setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        int selectedIndex = invoiceListPanel.getSelectedIndex();
        if (selectedIndex == -1 || Invoice.getInvoiceList()[selectedIndex] == null) {
            JOptionPane.showMessageDialog(rootPane, "Please select an invoice.");
            return;
        }
        Invoice selectedInvoice = Invoice.getInvoiceList()[selectedIndex];

        String invoiceDate = InvoiceDateTxtField.getText();
        String paymentMethod = paymentMethodTxtField.getText();

        if (invoiceDate.isEmpty() || amountTxtField.getText().isEmpty() || paymentMethod.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please fill in all fields.");
            return;
        }

        double amountPayment = selectedInvoice.getPrice() * selectedInvoice.getQuantity();
        Payment payment = new Payment(invoiceDate, amountPayment, paymentMethod);
        selectedInvoice.setInvoiceDate(invoiceDate);
        selectedInvoice.setStatus("Paid");
        selectedInvoice.setPayment(payment);

        clearTextField();
        selectedInvoice.displayDetails();
        JOptionPane.showMessageDialog(rootPane, "Payment successful.");

        ViewInvoiceReportGUI viewInvoiceReportGUI = new ViewInvoiceReportGUI();
        viewInvoiceReportGUI.setVisible(true);
        viewInvoiceReportGUI.displayPaidInvoice(
            String.valueOf(selectedInvoice.getInvoiceID()), 
            selectedInvoice.getInvoiceDate(),
            String.valueOf(selectedInvoice.getQuantity()), 
            selectedInvoice.getPrice(),
            selectedInvoice.getStatus(), 
            selectedInvoice.getPayment().getPaymentMethod()
        );

        this.setVisible(false);
    }//GEN-LAST:event_payButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PaySupplierGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaySupplierGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaySupplierGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaySupplierGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaySupplierGUI().setVisible(true);
            }
        });
    }
    
    private void populateInvoiceList() {
        Invoice[] invoices = Invoice.getInvoiceList();
        if (invoices != null) {
        for (int i = 0; i < invoices.length; i++) {
            if (invoices[i] != null) {
                orderNames[i] = invoices[i].getProduct();
            }
        }
        invoiceListPanel.setListData(orderNames);
        }
    }
    
    private void setupInvoiceListSelectionListener() {
        invoiceListPanel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedIndex = invoiceListPanel.getSelectedIndex();
                    if (selectedIndex != -1) {
                        Invoice selectedInvoice = Invoice.getInvoiceList()[selectedIndex];
                        if (selectedInvoice != null) {
                            displayDetails(selectedInvoice);
                        }
                    }
                }
            }
        });
    }
    
    private void displayDetails(Invoice invoice) {
        InvoiceDateTxtField.setText(invoice.getDeliveryDate());
        amountTxtField.setText(String.valueOf(invoice.getPrice()));
        paymentMethodTxtField.setText(invoice.getPayment().getPaymentMethod()); 
    }

    private void clearTextField() {
        InvoiceDateTxtField.setText("");
        amountTxtField.setText("");
        paymentMethodTxtField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InvoiceDateTxtField;
    private javax.swing.JLabel amountLbl;
    private javax.swing.JTextField amountTxtField;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JToggleButton cancelButton;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel invoiceList;
    private javax.swing.JList<String> invoiceListPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton payButton;
    private javax.swing.JLabel paymentDetailsLbl;
    private javax.swing.JPanel paymentDetailspnl;
    private javax.swing.JLabel paymentFormLabel;
    private javax.swing.JPanel paymentFormPanel;
    private javax.swing.JLabel paymentLbl;
    private javax.swing.JTextField paymentMethodTxtField;
    // End of variables declaration//GEN-END:variables
}
