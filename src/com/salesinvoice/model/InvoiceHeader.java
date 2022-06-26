
package com.salesinvoice.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    
      private int invoiceNumber;
    private String customerName;
    private Date invoiceDate;
    private ArrayList<InvoiceLine> lines;
    

  
    public InvoiceHeader(int invoiceNumber, String customerName, Date invoiceDate) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.invoiceDate = invoiceDate;
        
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
      
        return "InvoiceLine{" + "invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", invoiceDate=" + invoiceDate + '}';
    }

    public ArrayList<InvoiceLine> getLines() {
        if(lines == null)
            lines = new ArrayList<>();
        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    
      public double getInvoiceTotal() {
          double invoiceTotal=0;
          for(InvoiceLine line : getLines()){
              invoiceTotal += line.getLineTotal();
          }
        return invoiceTotal ;
    }

    
    public void addInvoiceLine(InvoiceLine line){
        getLines().add(line);
    }
    
    public String getDataAsCSV(){
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return "" + getInvoiceNumber() + "," + dateFormat.format(getInvoiceDate()) + "," + getCustomerName();
    }
}
