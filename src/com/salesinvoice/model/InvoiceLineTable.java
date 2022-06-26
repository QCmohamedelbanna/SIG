/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salesinvoice.model;


import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author melba
 */
public class InvoiceLineTable  extends     AbstractTableModel{

    private final List<InvoiceLine> invoiceLinesArray;
    
    
    public InvoiceLineTable(List<InvoiceLine> invoiceLinesArray) {
        this.invoiceLinesArray = invoiceLinesArray;
    }


    public List<InvoiceLine> getInvoiceLinesArray() {
        return invoiceLinesArray;
    }

    @Override
    public int getRowCount() {
        return invoiceLinesArray.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0:
                return "Item Name";
            case 1:
                return "Item Price";
            case 2:
                return "Count";
            case 3:
                return "Item Total";
            default:
                return "";
        } 
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
             switch(columnIndex){
            case 0:
                return String.class;
            case 1:
                return Double.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            default:
                return Object.class;
        } 

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine row = invoiceLinesArray.get(rowIndex);
             switch(columnIndex){
            case 0:
                return row.getItemNames();
            case 1:
                return row.getItemPrices();
            case 2:
                return row.getItemCounts() ;
            case 3:
                return row.getLineTotal();
            default:
                return "";
        } 
    }

   
    
}
