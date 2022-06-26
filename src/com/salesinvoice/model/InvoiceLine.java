
package com.salesinvoice.model;



public class InvoiceLine {
  
     private String itemNames;
     
     private double itemPrices;
     
     private int itemCounts;
     
     private InvoiceHeader header;

    public InvoiceLine(String itemNames, double itemPrices, int itemCounts, InvoiceHeader header) {
        this.itemNames = itemNames;
        this.itemPrices = itemPrices;
        this.itemCounts = itemCounts;
        this.header = header;
    }

 
     
     

    public String getItemNames() {
        return itemNames;
    }

    public void setItemNames(String itemNames) {
        this.itemNames = itemNames;
    }

    public double getItemPrices() {
        return itemPrices;
    }

    public void setItemPrices(double itemPrices) {
        this.itemPrices = itemPrices;
    }

    public int getItemCounts() {
        return itemCounts;
    }

    public void setItemCounts(int itemCounts) {
        this.itemCounts = itemCounts;
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "itemNames=" + itemNames + ", itemPrices=" + itemPrices + ", itemCounts=" + itemCounts + '}';
    }
    
 
    public double getLineTotal(){
        return itemCounts * itemPrices;
    }
    
    public String getDataAsCSV(){
        return "" + getHeader().getInvoiceNumber()+ "," + getItemNames() + "," + getItemPrices() + "," + getItemCounts();
    }

}
