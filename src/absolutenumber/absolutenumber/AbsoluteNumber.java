package absolutenumber;
public class AbsoluteNumber {

    public static int findAbsoluteNumber(int number){
//        throw new UnsupportedOperationException();
        if (number < 0){
            return -number;
        } else {
            return number;
        }
    }
}
