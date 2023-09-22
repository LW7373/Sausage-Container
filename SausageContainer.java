/*
Moses Dong, Nicholas Xu, and Lindsay Wang
Schenk
AP CSA - Period 7
Glizzy Goblin - Sausage Container Class
25 September 2023
*/

package dongwangxu.seven;
// import dongwangxu.seven.MeatTypeEnum.MeatType;
// import dongwangxu.seven.Sausage;

public class SausageContainer {

    // Class fields
    private Sausage[] sausageArray;


    // Default constructor - 
    public SausageContainer(){

    }

    // Partial Constructor
    public SausageContainer(int a){
        //Must have attributes if its oiwn
        //Sausage array

    }

    // Full Constructor
    public SausageContainer(int a, int b){

    }

    //Default fill method
    private void fillArray(){
        for (int a = 0; a < 100; a++){//Whatever this is may not work
            sausageArray[a] = new Sausage();
        }
    }


    //CRUD
    private void allSausages(){
        
    }

    private Sausage returnSausage (int a, int b){
        //return sausageArray[a][b];
        return new Sausage();
    }

    private void changeSausage(int a, int b, Sausage newSausage){

    }

    private void addSausage(int endingIndex, Sausage newSausage){

    }

    private void clearSausage(int a, int b){ //Delete Sausage
        //sausageArray[a][b] = new Sausage(); 
    }

}
