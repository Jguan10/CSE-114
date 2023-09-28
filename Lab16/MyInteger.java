public class MyInteger {
    private int value;

    public MyInteger(int newValue) {
        value = newValue;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // isEven method with no parameter
    public Boolean isEven(){
        if(value % 2 == 0) {
            return true;
        }
        return false;
    }

    // isEven static method
    public static Boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        }
        return false;
    }

    // isOdd method with no parameter
     public static Boolean isOdd(int num) {
        if(num % 2 != 0) {
            return true;
        }
        return false;
    }

    // isOdd static method
    public Boolean isOdd() {
        if(value % 2 != 0) {
            return true;
        }
        return false;
    }

    // isPrime method with no parameter
    public Boolean isPrime() {
        int counter = 0;
        for(int i = 1; i < value + 1; i++){
            if(value % i == 0) {
                counter++;
            }
        }
        if(counter == 2) {
            return true;
        }
        return false;
    }

    // isPrime static method
    public static Boolean isPrime(int num) {
        int counter = 0;
        for(int i = 1; i < num + 1; i++){
            if(num % i == 0) {
                counter++;
            }
        }
        if(counter == 2) {
            return true;
        }
        return false;
    }
}
