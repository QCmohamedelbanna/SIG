/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SIG.view;

import com.invoiceifram.SalesInvoiceFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author melba
 */
public class InvoiceHeaderDialog extends JDialog {
    private JTextField customerNameField ;
    private JTextField invoiceDateField;
    private JLabel customerNameLabel;
    private JLabel invoiceDateLabel;
    private JButton okBtn ;
    private JButton cancelBtn ;

    public InvoiceHeaderDialog(SalesInvoiceFrame frame) {
        customerNameField = new JTextField(20);
        customerNameLabel = new JLabel("Customer Name: ");
        invoiceDateField = new JTextField(20);
        invoiceDateLabel = new JLabel("Invoice Date: ");
        okBtn = new JButton("Ok");
        cancelBtn = new JButton("Cancel");
        okBtn.setActionCommand("createInvOk");
        cancelBtn.setActionCommand("createInvCancel");
               
        okBtn.addActionListener(frame);
        cancelBtn.addActionListener(frame);       
        setLayout(new GridLayout(3,2));
        
        add(invoiceDateLabel);
        add(invoiceDateField);
        add(customerNameLabel);
        add(customerNameField);
        add(okBtn);
        add(cancelBtn);
        
        pack();
        
    }

    public JTextField getCustomerNameField() {
        return customerNameField;
    }

    public JTextField getInvoiceDateField() {
        return invoiceDateField;
    }
    
    
    
    
    
    
    

}
