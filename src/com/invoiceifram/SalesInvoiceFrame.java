/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.invoiceifram;

import com.SIG.view.InvoiceHeaderDialog;
import com.SIG.view.InvoiceLineDialog;
import com.salesinvoice.model.InvoiceHeader;
import com.salesinvoice.model.InvoiceHeaderTable;
import com.salesinvoice.model.InvoiceLine;
import com.salesinvoice.model.InvoiceLineTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author melba
 */
public class SalesInvoiceFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener{

    /**
     * Creates new form InvoiceFrame
     */
    public SalesInvoiceFrame() {
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
        salesInvoiceTable = new javax.swing.JTable();
        salesInvoiceTable.getSelectionModel().addListSelectionListener(this);
        newInvoiceBtn = new javax.swing.JButton();
        newInvoiceBtn.addActionListener(this);
        deleteInvoiceBtn = new javax.swing.JButton();
        deleteInvoiceBtn.addActionListener(this);
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceItemsTable = new javax.swing.JTable();
        createNewLineBtn = new javax.swing.JButton();
        createNewLineBtn.addActionListener(this);
        deleteLineBtn = new javax.swing.JButton();
        deleteLineBtn.addActionListener(this);
        invoiceDateLabel = new javax.swing.JTextField();
        customerNameLabel = new javax.swing.JTextField();
        invoiceNumberLabel = new javax.swing.JLabel();
        invoiceTotalLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileBtn = new javax.swing.JMenuItem();
        loadFileBtn.addActionListener(this);
        saveFileBtn = new javax.swing.JMenuItem();
        saveFileBtn.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        salesInvoiceTable.setAutoCreateRowSorter(true);
        salesInvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        salesInvoiceTable.setToolTipText("Invoices Tables");
        jScrollPane1.setViewportView(salesInvoiceTable);

        newInvoiceBtn.setText("Create New Invoice");
        newInvoiceBtn.setActionCommand("CreateNewInvoice");

        deleteInvoiceBtn.setText("Delete Invoice");
        deleteInvoiceBtn.setActionCommand("DeleteInvoice");
        deleteInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvoiceBtnActionPerformed(evt);
            }
        });

        invoiceItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(invoiceItemsTable);

        createNewLineBtn.setText("Create New Line");

        deleteLineBtn.setText("Delete Line");

        invoiceDateLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceDateLabelActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.setText("Total Invoice");
        jScrollPane3.setViewportView(jTextPane1);

        jTextPane2.setEditable(false);
        jTextPane2.setText("Invoice Date");
        jScrollPane4.setViewportView(jTextPane2);

        jTextPane3.setEditable(false);
        jTextPane3.setText("Customer Name");
        jScrollPane5.setViewportView(jTextPane3);

        jTextPane4.setEditable(false);
        jTextPane4.setText("Invoice Number");
        jScrollPane6.setViewportView(jTextPane4);

        jMenu1.setText("File");

        loadFileBtn.setText("Load File");
        loadFileBtn.setActionCommand("LoadFile");
        jMenu1.add(loadFileBtn);

        saveFileBtn.setText("Save File");
        saveFileBtn.setActionCommand("SaveFile");
        jMenu1.add(saveFileBtn);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(newInvoiceBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteInvoiceBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(invoiceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(invoiceNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(invoiceDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(536, 536, 536)
                .addComponent(createNewLineBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteLineBtn)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteInvoiceBtn)
                            .addComponent(newInvoiceBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoiceNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invoiceDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(invoiceTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNewLineBtn)
                    .addComponent(deleteLineBtn))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvoiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInvoiceBtnActionPerformed

    private void invoiceDateLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceDateLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceDateLabelActionPerformed

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
            java.util.logging.Logger.getLogger(SalesInvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesInvoiceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createNewLineBtn;
    private javax.swing.JTextField customerNameLabel;
    private javax.swing.JButton deleteInvoiceBtn;
    private javax.swing.JButton deleteLineBtn;
    private javax.swing.JTextField invoiceDateLabel;
    private javax.swing.JTable invoiceItemsTable;
    private javax.swing.JLabel invoiceNumberLabel;
    private javax.swing.JLabel invoiceTotalLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JMenuItem loadFileBtn;
    private javax.swing.JButton newInvoiceBtn;
    private javax.swing.JTable salesInvoiceTable;
    private javax.swing.JMenuItem saveFileBtn;
    // End of variables declaration//GEN-END:variables
    private final DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private final List<InvoiceHeader> invoicesArray = new ArrayList<>();
    private InvoiceHeaderTable invoiceHeaderTable;
    private InvoiceLineTable invoiceLineTable;
    private InvoiceHeaderDialog headerDialog;
    private InvoiceLineDialog lineDialog;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
                
           case "CreateNewInvoice":
               displayNewInvoiceDialog();
               break; 
               
           case  "DeleteInvoice":   
               deleteInvoice();
               break;
           
           case "LoadFile":
                getFile();
                break;
                
           case "SaveFile":
                saveFile();
                break;
                
           case "Create New Line":
               displayNewLineDialog();
               break;    
               
           case "Delete Line":
               deleteLine();
               break;
               
           case "createInvOk": 
               createInvOk();
               break;
               
           case "createInvCancel":
               createInvCancel();
               break;
               
           case "createLineOk":
               createLineOk();
               break;
               
           case "createLineCancel":
              createLineCancel();
               break;
               
     }   
    }

    private void getFile(){
       
        JOptionPane.showMessageDialog(this, "Please, Select Header File First.","Note!" , JOptionPane.WARNING_MESSAGE);
        JFileChooser openFile = new JFileChooser();
        int status = openFile.showOpenDialog(this);
        if(status == JFileChooser.APPROVE_OPTION){
          File headerFile =openFile.getSelectedFile();
          
          try {
              FileReader fileReaderHeader = new FileReader(headerFile);
              BufferedReader bufferedReaderHeader = new BufferedReader(fileReaderHeader);
              String lineHeader = null;
              while((lineHeader = bufferedReaderHeader.readLine())!= null){
                  String[] headerFileSplit = lineHeader.split(",");
                  
                  String invoiceHeaderNumberStr = headerFileSplit[0];
                  String invoiceHeaderDateStr = headerFileSplit[1];
                  String invoiceCustomerNameStr = headerFileSplit[2];
                  
                  int invoiceHeaderNumber = Integer.parseInt(invoiceHeaderNumberStr);
                  Date invoiceHeaderDate = dateFormat.parse(invoiceHeaderDateStr);
                  
                  InvoiceHeader invHeader = new InvoiceHeader(invoiceHeaderNumber,invoiceCustomerNameStr,invoiceHeaderDate);
                  invoicesArray.add(invHeader);
              }
          
              
          JOptionPane.showMessageDialog(this,"Select Lines File, Please.","Note!", JOptionPane.WARNING_MESSAGE);
          status = openFile.showOpenDialog(this);
          if(status == JFileChooser.APPROVE_OPTION){
            File linesFile = openFile.getSelectedFile();
             BufferedReader bufferedReaderLines = new BufferedReader(new FileReader(linesFile));
             String lineLines = null;
             while ((lineLines = bufferedReaderLines.readLine())!= null){
                 String[] lineFileSplit = lineLines.split(",");
                 
                  String invoiceLineNumberStr = lineFileSplit[0];
                  String invoiceLineItemName = lineFileSplit[1];
                  String invoiceLineItemPriceStr = lineFileSplit[2];
                  String invoiceLineItemCountStr = lineFileSplit[3];
                  
                  int invoiceLineNumber = Integer.parseInt(invoiceLineNumberStr);
                  double invoiceLineItemPrice  = Double.parseDouble(invoiceLineItemPriceStr);
                  int invoiceLineItemCount = Integer.parseInt(invoiceLineItemCountStr);
                 
                    InvoiceHeader header = getInvoiceByNumber(invoiceLineNumber);
                  
                  InvoiceLine invLine = new InvoiceLine(invoiceLineItemName,invoiceLineItemPrice,invoiceLineItemCount,header);
                  header.getLines().add(invLine);
             }
             invoiceHeaderTable = new InvoiceHeaderTable(invoicesArray);
             salesInvoiceTable.setModel(invoiceHeaderTable);
             salesInvoiceTable.validate();
          
          }
          
          }catch(Exception e){
              e.printStackTrace();
          }
         
        }
        
    }

    private void saveFile(){
        String headers = "";
        String lines = "";
        for(InvoiceHeader header : invoicesArray){
            headers += header.getDataAsCSV();
            headers += "\n";
            for(InvoiceLine line : header.getLines()){
                lines += line.getDataAsCSV();
                lines += "\n";
            }
        }
        
        JOptionPane.showMessageDialog(this, "Please, Select File to Upload HeaderFile Data!" ,"Note!" ,JOptionPane.WARNING_MESSAGE);
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File headerFile = fileChooser.getSelectedFile();
            try{
                FileWriter headerFileWriter = new FileWriter(headerFile);
                headerFileWriter.write(headers);
                headerFileWriter.flush();
                headerFileWriter.close();
                
                JOptionPane.showMessageDialog(this, "Please, Select File to Upload LinesFile Data!" ,"Note!" ,JOptionPane.WARNING_MESSAGE);   
                result = fileChooser.showSaveDialog(this);
                if(result == JFileChooser.APPROVE_OPTION){
                    File linesFile = fileChooser.getSelectedFile(); 
                    FileWriter lineFileWriter = new FileWriter(linesFile);
                    lineFileWriter.write(lines);
                    lineFileWriter.flush();
                    lineFileWriter.close();
                }
                
            }catch(Exception e){
              e.printStackTrace();
          }
        }

        
    }

    private InvoiceHeader getInvoiceByNumber(int invNum ){
     InvoiceHeader  invHeader = null;
     for (InvoiceHeader inv : invoicesArray){
         if(invNum == inv.getInvoiceNumber()){
             invHeader = inv;
             break;
     }
    }
     return invHeader;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
       getSelectedInvoiceInHeaderTable();
      
       
    }

    private void getSelectedInvoiceInHeaderTable() {
        int selectedRowIndex = salesInvoiceTable.getSelectedRow();
        if(selectedRowIndex >= 0){
            InvoiceHeader row = invoiceHeaderTable.getInvoicesArray().get(selectedRowIndex);
      
            customerNameLabel.setText(row.getCustomerName());
            invoiceDateLabel.setText(dateFormat.format(row.getInvoiceDate() ));
            invoiceNumberLabel.setText("" + row.getInvoiceNumber());
            invoiceTotalLabel.setText("" + row.getInvoiceTotal());
            
            ArrayList<InvoiceLine> lines =row.getLines(); 
            invoiceLineTable = new InvoiceLineTable(lines);
            invoiceItemsTable.setModel(invoiceLineTable);

        }
        
    }

    private void displayNewInvoiceDialog() {
         headerDialog = new InvoiceHeaderDialog(this); 
        headerDialog.setVisible(true);
    }
    
   private void displayNewLineDialog() {
        lineDialog = new InvoiceLineDialog(this);
        lineDialog.setVisible(true);
    }

    private void createInvOk() {
       String customerName = headerDialog.getCustomerNameField().getText();
       String invoiceDateStr = headerDialog.getInvoiceDateField().getText();
       headerDialog.setVisible(false);
       try {
           Date invDate = dateFormat.parse(invoiceDateStr);
           int invNum = getNextInvoiceNumber();
           InvoiceHeader invoiceHeader = new InvoiceHeader(invNum,customerName,invDate);
           invoicesArray.add(invoiceHeader);
           invoiceHeaderTable.fireTableDataChanged();
       }catch(ParseException ex){
           ex.printStackTrace();
       }
       
    }
    
    private int getNextInvoiceNumber(){
        int max = 0;
        for (InvoiceHeader header: invoicesArray){
            if(header.getInvoiceNumber()> max){
                max = header.getInvoiceNumber();
            }
        }
        return max + 1;
    }

    private void createInvCancel() {
        headerDialog.setVisible(false);
    }

  private void createLineOk() {
      String itemName = lineDialog.getItemNameField().getText();
      String itemCountStr = lineDialog.getItemCountField().getText();
      String itemPriceStr = lineDialog.getItemPriceField().getText();
      lineDialog.setVisible(false);
      int itemCount = Integer.parseInt(itemCountStr);
      double itemPrice = Double.parseDouble(itemPriceStr);
      int headerIndex = salesInvoiceTable.getSelectedRow();
      InvoiceHeader invoiceHeader = invoiceHeaderTable.getInvoicesArray().get(headerIndex);
      
      InvoiceLine invoiceLine = new InvoiceLine(itemName,(int) itemPrice ,itemCount, invoiceHeader);
      invoiceHeader.addInvoiceLine(invoiceLine);
      invoiceLineTable.fireTableDataChanged();
      invoiceHeaderTable.fireTableDataChanged();
      invoiceTotalLabel.setText("" + invoiceHeader.getInvoiceTotal()); 
     
    }

    private void createLineCancel() {
        lineDialog.setVisible(false);
    }

    private void deleteLine() {
        int lineIndex = salesInvoiceTable.getSelectedRow();
        InvoiceLine line = invoiceLineTable.getInvoiceLinesArray().get(lineIndex);
        invoiceLineTable.getInvoiceLinesArray().remove(lineIndex);
        invoiceLineTable.fireTableDataChanged();
        invoiceHeaderTable.fireTableDataChanged();
        invoiceTotalLabel.setText("" + line.getHeader().getInvoiceTotal()); 
        
    }

    private void deleteInvoice() {
        int invIndex =  salesInvoiceTable.getSelectedRow();
        InvoiceHeader header = invoiceHeaderTable.getInvoicesArray().get(invIndex);
        invoiceHeaderTable.getInvoicesArray().remove(invIndex);
        invoiceHeaderTable.fireTableDataChanged();
        invoiceLineTable = new InvoiceLineTable(new ArrayList<InvoiceLine>());
        invoiceItemsTable.setModel(invoiceLineTable);
        invoiceLineTable.fireTableDataChanged();
            customerNameLabel.setText("");
            invoiceDateLabel.setText("");
            invoiceNumberLabel.setText("");
            invoiceTotalLabel.setText("");   
           
    }

 
    
}
