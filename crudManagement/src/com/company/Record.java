package com.company;

public class Record {
    private String name;
    private int idNum;
    private int cellNum;

    public Record(){
    }

    public Record(String name, int idNum, int cellNum) {

        this.name = name;
        this.idNum = idNum;
        this.cellNum = cellNum;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getCellNum() {
        return cellNum;
    }

    public void setCellNum(int cellNum) {
        this.cellNum = cellNum;
    }
    @Override public String toString()
    {

        // Returning the record
        return "Records{"
                + "name=" + name + ", idNumber=" + idNum
                + ", contactNumber=" + cellNum + '}';
    }
}

