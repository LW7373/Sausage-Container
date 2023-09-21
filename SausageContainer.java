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

    // Default constructor - Lindsay
    public SausageContainer(){
        for (int a = 0; a < 100; a++){
            sausageArray[a] = new Sausage();
        }
    }

    private Sausage ReturnSausage (int a, int b){
        //return sausageArray[a][b];
        return new Sausage();
    }

    private void ChangeSausage(int a, int b, Sausage newSausage){

    }

    private void AddSausage(int endingIndex, Sausage newSausage){

    }

    private void clearSausage(int a, int b){
        //sausageArray[a][b] = new Sausage(); 
    }

}
