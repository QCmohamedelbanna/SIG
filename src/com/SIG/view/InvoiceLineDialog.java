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
public class InvoiceLineDialog extends JDialog{
    
     private JTextField itemNameField ;
     private JTextField itemCountField ;
     private JTextField itemPriceField ;
     
     private JLabel itemNameLabel ;
     private JLabel itemCountLabel ;
     private JLabel itemPriceLabel ;
     
     private JButton okBtn ;
     private JButton cancelBtn ;
     
     public InvoiceLineDialog(SalesInvoiceFrame frame){
         itemNameField = new JTextField(20);
         itemNameLabel = new JLabel("Item Name");
         
         itemCountField = new JTextField(20);
         itemCountLabel = new JLabel("Item Count");
         
         itemPriceField = new JTextField(20);
         itemPriceLabel = new JLabel("Item Price");
         
         okBtn = new JButton("Ok");
         cancelBtn = new JButton("Cancel");
         
         okBtn.setActionCommand("createLineOk");
         cancelBtn.setActionCommand("createLineCancel");
         
         okBtn.addActionListener(frame);
         cancelBtn.addActionListener(frame);
         
         setLayout(new GridLayout(4,2));
         
         add(itemNameLabel);
         add(itemNameField);
         add(itemCountLabel);
         add(itemCountField);
         add(itemPriceLabel);
         add(itemPriceField);
         add(okBtn);
         add(cancelBtn);
                 
         pack();

     }

    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getItemCountField() {
        return itemCountField;
    }

    public JTextField getItemPriceField() {
        return itemPriceField;
    }
    
}
