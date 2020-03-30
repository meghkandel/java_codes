/*

This is the main class, and this class uses the another class (ToString) where dates are converted into string format.
*/

public class ToStringTest  {
    public static void main(String[] args) {
        ToString ToStringObj = new ToString(5,13,30);
        System.out.println(ToStringObj.timeInString());
        System.out.println(ToStringObj.timeInString());
    }

}

