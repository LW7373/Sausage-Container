/*
Moses Dong, Nicholas Xu, and Lindsay Wang
Schenk
AP CSA - Period 7
Glizzy Goblin - Sausage Container Class
25 September 2023
*/

package dongwangxu.seven;

import dongwangxu.seven.MeatTypeEnum.MeatType;
import dongwangxu.seven.Sausage;

public class PackBox{

    // Class fields
    private String material;
    private double length;
    private double width;
    private double height;
    private int numSausageLinks;
    private boolean isShipped;
    // Moses added shippingStatus variable, added it to constructors, toString, and Main
    private String shippingStatus;
    private Sausage[] sausageArray;

    //Default Constructor - Moses
    public PackBox(){
        this.material = "Plastic";
        this.length = 10.0;
        this.width = 10.0;
        this.height = 10.0;
        this.numSausageLinks = 10;
        this.isShipped = false;
        this.shippingStatus = "In Warehouse";
        this.sausageArray = new Sausage[100];
    }

    // Partial Constructor - Moses
    public PackBox(String material, double length, double width, double height){
        this.material = material;
        this.length = length;
        this.width = width;
        this.height = height;
        this.numSausageLinks = 10;
        this.isShipped = false;
        this.shippingStatus = "In Warehouse";
        this.sausageArray = new Sausage[100];
    }

    // Full Constructor - Lindsay
    public PackBox(String material, double length, double width, double height, int numSausageLinks, boolean isShipped, String shippingStatus, Sausage[] sausageArray) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.height = height;
        this.numSausageLinks = numSausageLinks;
        this.isShipped = isShipped;
        this.shippingStatus = shippingStatus;
        this.sausageArray = sausageArray;
    }

    // GETTERS AND SETTERS - Nicholas
    public String getMaterial(){
        return this.material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public int getNumSausageLinks(){
        return this.numSausageLinks;
    }

    public void setNumSausageLinks(int numSausageLinks){
        this.numSausageLinks = numSausageLinks;
    }

    public boolean isShipped(){
        return this.isShipped;
    }

    public void setShipped(boolean isShipped){
        this.isShipped = isShipped;
    }

    public String getShippingStatus(){
        return this.shippingStatus;
    }

    public void setShippingStatus(String shippingStatus){
        this.shippingStatus = shippingStatus;
    }

    public Sausage[] getSausageArray(){
        return this.sausageArray;
    }

    public void setSausageArray(Sausage[] sausageArray){
        this.sausageArray = sausageArray;
    }

    
    // CRUD
    public void AddSausage(Sausage newSausage){        
        int arrayLen =  this.sausageArray.length;
        Sausage[] sausageArrayNew = new Sausage[arrayLen + 1];
        System.arraycopy(sausageArray, 0, sausageArrayNew, 0, arrayLen);
        sausageArrayNew[arrayLen] = newSausage; 
        this.setSausageArray(sausageArrayNew);
    }

    public void ReadAllSausages(){
        int arrayLen = this.sausageArray.length;
        for (int i = 0; i < arrayLen; i++){
            System.out.println("Sausage " + (i + 1) + ": " + sausageArray[i]);
        }
    }

    public void ReadOneSausage(int selectedSausage){
        System.out.println("Sausage " + (selectedSausage) + ": " + sausageArray[selectedSausage - 1]);
    }

    public void ChangeSausage(int selectedSausage, Sausage newSausage){
        this.sausageArray[selectedSausage - 1] = newSausage;
        this.setSausageArray(sausageArray);
        System.out.println("Updated Sausage " + selectedSausage); // change for user input
        // for (int i = 0; i < sausageArray.length; i++){
        //     System.out.println("Sausage " + (i + 1) + ": " + sausageArray[i]);
        // }
    }

    public void DeleteSausage(int selectedSausage){
        int arrayLen =  this.sausageArray.length;
        Sausage[] sausageArrayNew = new Sausage[arrayLen - 1];
        for(int i = 0, k = 0; i < arrayLen; i++){
            if(i != (selectedSausage - 1)){
                sausageArrayNew[k] = this.sausageArray[i];
                k++;
            }
        }
        this.setSausageArray(sausageArrayNew);
        System.out.println("Deleted Sausage " + selectedSausage + "\n");
        for (int i = 0; i < arrayLen - 1; i++){
            System.out.println("Sausage " + (i + 1) + ": " + sausageArray[i]);
        }
    }

    public String toString(){
        String s = "PackBox Stats\n";
        s += "============================\n";
        s += "Material: " + this.material + "\n";
        s += "Length (inches): " + this.length + "\n";
        s += "Width (inches): " + this.width + "\n";
        s += "Height (inches): " + this.height + "\n";
        s += "NumSausageLinks: " + this.numSausageLinks + "\n";
        s += "Shipped? " + this.isShipped + "\n";
        s += "Shipping Status: " + this.shippingStatus;

        return s;
    }
}
