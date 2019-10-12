public class WarmUp_1 {




    //**********  Warm Up 1  **********
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


}