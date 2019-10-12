public class WarmUp_1 {

    public static void main(String[] args) {




}
    //**********  Warm Up 1 - sleepIn  **********
    public boolean sleepIn(boolean weekday, boolean vacation) {

        if (weekday == false && vacation == false) {
            return true;
        } else if (weekday == true && vacation == false) {
            return false;
        } else if (weekday == false && vacation == true) {
            return true;
        }
        return true;
    }


    //**********  Warm Up 2  - monkeyTrouble **********
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true){
            return true;
        }else if(aSmile == false && bSmile == false){
            return true;
        }else if((aSmile == true && bSmile == false)|| (aSmile == false && bSmile == true)){
            return false;
        }
        return true;
    }


    //**********  Warm Up 3  - sumDouble **********
    public int sumDouble(int a, int b) {

        int sum = a + b;

        if (a != b){
            return sum;

        }else if(a == b){
            return 2*sum;
        }

        return sum;
    }



}