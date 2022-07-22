public class FactorialNumberCheck {
    public int sendValue(int number) {

        if(number<1){
            return -1;

        }
        if(number==1){
            return 1;
        }

        return number*sendValue(number-1);
    }
}
