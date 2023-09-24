/*
Moses Dong, Nicholas Xu, and Lindsay Wang
Schenk
AP CSA - Period 7
Glizzy Goblin
19 September 2023
*/

package wangxu.seven;
import wangxu.seven.MeatTypeEnum.MeatType;

public class Sausage {

    // class fields
    private String productName;  
    private MeatType MeatType;
    private double productionCost;
    private double sellingPrice;
    private int packageWeight;
    private int numSausages;
    private double sausageLength;
    private int leanMeatPercentage;
    private int fatPercentage;
    private boolean isCooked;

    // default constructor - lindsay
    public Sausage(){
        this.productName = "Classic Beef Sausage";
        this.MeatType = MeatType.beef;
        this.productionCost = 2.00;
        this.sellingPrice = 4.99;
        this.packageWeight = 800;
        this.numSausages = 8;
        this.sausageLength = 4.0;
        this.leanMeatPercentage = 30;
        this.fatPercentage = 70;
        this.isCooked = false;
    }

    // partial constructor 1 - nicholas
    public Sausage(String productName, MeatType meatType, int packageWeight, double sausageLength){
        this.productName = "Mythical Mystery Meat Medley";
        this.MeatType = MeatType.mystery;
        this.productionCost = 2.40;
        this.sellingPrice = 6.49;
        this.packageWeight = 960;
        this.numSausages = 12;
        this.sausageLength = 6.0;
        this.leanMeatPercentage = 50;
        this.fatPercentage = 50;
        this.isCooked = false;
    }


    // partial constructor 2 - nicholas
    public Sausage(String productName, MeatType meatType, double productionCost, int leanMeatPercentage, int fatPercentage){
        this.productName = "Mini Glizzies for Weight Loss";
        this.MeatType = MeatType.chicken;
        this.productionCost = 4.00;
        this.packageWeight = 640;
        this.numSausages = 16;
        this.sausageLength = 3.0;
        this.leanMeatPercentage = 90;
        this.fatPercentage = 10;
        this.isCooked = false;
    }

    // full constructor - lindsay
    public Sausage(String productName, MeatType meatType, double productionCost, double sellingPrice, int packageWeight, int numSausages, double sausageLength, int leanMeatPercentage, int fatPercentage, boolean isCooked){
        this.productName = productName;
        this.MeatType = meatType;
        this.productionCost = productionCost;
        this.sellingPrice = sellingPrice;
        this.packageWeight = packageWeight;
        this.numSausages = numSausages;
        this.sausageLength = sausageLength;
        this.leanMeatPercentage = leanMeatPercentage;
        this.fatPercentage = fatPercentage;
        this.isCooked = isCooked;
    }

    // getters and setters - lindsay
    public String getProductName(){
        // User validation goes here
        return this.getProductName();
    }

    public void setProductName(String productName){
        // User validation goes here
        this.productName = productName;
    }

    public MeatType getMeatType(){
        // User validation goes here
        return this.getMeatType();
    }

    public void setMeatType(MeatType meatType){
        // User validation goes here
        this.MeatType = meatType;
    }

    public double getProductionCost(){
        // User validation goes here
        return this.getProductionCost();
    }

    public void setProductionCost(double productionCost){
        // User validation goes here
        this.productionCost = productionCost;
    }

    public double getSellingPrice(){
        // User validation goes here
        return this.getSellingPrice();
    }

    public void setSellingPrice(double sellingPrice){
        // User validation goes here
        this.sellingPrice = sellingPrice;
    }

    public int getPackageWeight(){
        // User validation goes here
        return this.getPackageWeight();
    }

    public void setPackageWeight(int packageWeight){
        // User validation goes here
        this.packageWeight = packageWeight;
    }

    public int getNumSausages(){
        // User validation goes here
        return this.getNumSausages();
    }

    public void setNumSausages(int numSausages){
        // User validation goes here
        this.numSausages = numSausages;
    }

    public double getSausageLength(){
        // User validation goes here
        return this.getSausageLength();
    }

    public void setSausageLength(double sausageLength){
        // User validation goes here
        this.sausageLength = sausageLength;
    }

    public int getLeanMeatPercentage(){
        // User validation goes here
        return this.getLeanMeatPercentage();
    }

    public void setLeanMeatPercentage(int leanMeatPercentage){
        // User validation goes here
        this.leanMeatPercentage = leanMeatPercentage;
    }

    public int getFatPercentage(){
        // User validation goes here
        return this.getFatPercentage();
    }

    public void setFatPercentage(int fatPercentage){
        // User validation goes here
        this.fatPercentage = fatPercentage;
    }

    public boolean isCooked(){
        // User validation goes here
        return this.isCooked();
    }

    public void setIsCooked(boolean isCooked){
        // User validation goes here
        this.isCooked = isCooked;
    }

    // toString display - lindsay
    public String toString(){
        String s = "Sausage Stats\n";
        s += "============================\n";
        s += "Sausage Name: " + this.productName + "\n";
        s += "Meat Filling: " + this.MeatType + "\n";
        s += "Production Cost: " + this.productionCost + "\n";
        s += "Selling Price: " + this.sellingPrice + "\n";
        s += "Packaging Weight (grams): " + this.packageWeight + "\n";
        s += "Number of Sausages (per pack): " + this.numSausages + "\n";
        s += "Sausage Length (inches): " + this.sausageLength + "\n";
        s += "Lean Meat Percentage: " + this.leanMeatPercentage + "\n";
        s += "Fat Percentage: " + this.fatPercentage + "\n";
        s += "Cooked? " + this.isCooked + "\n";

        return s;
    }
}
