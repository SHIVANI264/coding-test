package com.monsanto.mbt;

import java.util.Date;


public class Widget implments Comparable<Widget>{
    private int serialNumber;
    private String color;
    private Date productionDate;

    public Widget(int serialNumber, String color, Date productionDate) {
        this.serialNumber = serialNumber;
        this.color = color;
        this.productionDate = productionDate;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }
    
    public int compareTo(Widget w)
    { 
        result =  this.getColor.compareTo(w.getColor) ;
    }
     if (result = 0)
     {
       result = this.getProductionDate.compareTo(w.getProductionDate) ;
     }
