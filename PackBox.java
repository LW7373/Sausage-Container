/*lengthInches
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

    // Moses Work Zone Starts
    // Class fields
    private String material;
    private String shippingStatus;//New
    private double lengthInches;//Replaced with "lengthInches"
    private double widthInches;//Replaced with "widthInches"
    private double heightInches;//Replaced with "heightInches"
    private int numSausageLinks;
    private boolean isFull;//New, replaces other boolean

    private Sausage[] sausageArray;
    
    //Default Constructor
    public PackBox(){
        this.material = "Plastic";
        this.lengthInches = 10.0;
        this.widthInches = 10.0;
        this.heightInches = 10.0;
        this.numSausageLinks = 10;
        this.isFull = false;
        this.shippingStatus = "In Warehouse";
        this.sausageArray = new Sausage[100];
    }

    //Box Partial Constructor
    public PackBox(String material, double lengthInches, double widthInches, double heightInches){
        this.material = material;
        this.lengthInches = lengthInches;
        this.widthInches = widthInches;
        this.heightInches = heightInches;
        this.numSausageLinks = 10;
        this.isFull = false;
        this.shippingStatus = "In Warehouse";
        this.sausageArray = new Sausage[100];
    }

    // Full Constructor
    public PackBox(String material, double lengthInches, double widthInches, double heightInches, int numSausageLinks, boolean isFull, String shippingStatus, Sausage[] sausageArray) {
        this.material = material;
        this.lengthInches = lengthInches;
        this.widthInches = widthInches;
        this.heightInches = heightInches;
        this.numSausageLinks = numSausageLinks;
        this.isFull = isFull;
        this.shippingStatus = shippingStatus;
        this.sausageArray = sausageArray;
    }
    // Moses Work Zone Ends

    // GETTERS AND SETTERS
    public String getMaterial(){
        return this.material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public double getlengthInches(){
        return this.lengthInches;
    }

    public void setlengthInches(double lengthInches){
        this.lengthInches = lengthInches;
    }

    public double getwidthInches(){
        return this.widthInches;
    }

    public void setwidthInches(double widthInches){
        this.widthInches = widthInches;
    }

    public double getheightInches(){
        return this.heightInches;
    }

    public void setheightInches(double heightInches){
        this.heightInches = heightInches;
    }

    public int getNumSausageLinks(){
        return this.numSausageLinks;
    }

    public void setNumSausageLinks(int numSausageLinks){
        this.numSausageLinks = numSausageLinks;
    }

    //Claimed
    public boolean isFull(){
        return this.isFull;
    }

    public void setShipped(boolean isFull){
        this.isFull = isFull;
    }

    // Do not use?, Use CRUD instead - Moses
    // public Sausage[] getSausageArray(){//Redirect?
    //     return this.sausageArray;
    // }

    // public void setSausageArray(Sausage[] sausageArray){
    //     this.sausageArray = sausageArray;
    // }
    //Claimed


    // verify input for arrayIndex and data type of sausageArray

    
    // CRUD
    public void AddSausage(Sausage newSausage){        
        int arrayLen =  this.sausageArray.lengthInches;
        Sausage[] sausageArrayNew = new Sausage[arrayLen + 1];
        System.arraycopy(sausageArray, 0, sausageArrayNew, 0, arrayLen);
        sausageArrayNew[arrayLen] = newSausage; 
        this.setSausageArray(sausageArrayNew);
    }

    public void ReadAllSausages(){
        int arrayLen = this.sausageArray.lengthInches;
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
        // for (int i = 0; i < sausageArray.lengthInches; i++){
        //     System.out.println("Sausage " + (i + 1) + ": " + sausageArray[i]);
        // }
    }

    public void DeleteSausage(int selectedSausage){
        int arrayLen =  this.sausageArray.lengthInches;
        Sausage[] sausageArrayNew = new Sausage[arrayLen - 1];
        for(int i = 0, k = 0; i < arrayLen; i++){
            if(i != (selectedSausage - 1)){
                sausageArrayNew[k] = this.sausageArray[i];
                k++;
            }
        }
        this.setSausageArray(sausageArrayNew);
        System.out.println("Deleted Sausage " + selectedSausage);
        for (int i = 0; i < arrayLen - 1; i++){
            System.out.println("Sausage " + (i + 1) + ": " + sausageArray[i]);
        }
    }

    // Modified by Moses
    public String toString(){
        String s = "Box Stats\n";
        s += "============================\n";
        s += "Material: " + this.material + "\n";
        s += "lengthInches: " + this.lengthInches + "\n";
        s += "widthInches: " + this.widthInches + "\n";
        s += "heightInches: " + this.heightInches + "\n";
        s += "NumSausageLinks: " + this.numSausageLinks + "\n";
        s += "Shipping Status: " + this.shippingStatus + "\n";
        s += "Full? " + this.isFull;

        return s;
    }
}
