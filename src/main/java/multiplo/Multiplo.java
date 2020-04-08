package multiplo;

/*
* @author: Benjamin Alonso
* @version: 08-april-2020
* @description: There are numbers 1 to 100.
* The function has to return a letter “A” if the number is a multiple of 3.
* The function has to return a letter “B” if the number is a multiple of 5.
* The Function has to return a String “Multiple of Both” if the number is a multiple of 3 and 5.
* Make sure NOT to print letters “A” and “B” if it is “Multiple of Both”
*/

public class Multiplo {


    public static void main(String[] args) {
        Multiplo multiplo = new Multiplo();
        int mult3 = 3;
        int mult5 = 5;
        for (int i = 1; i <= 100; i++)
            multiplo.validateMultiple(i, mult3, mult5);
    }

    public boolean isMultiple(int dato, int multiple) {
        boolean res = true;
        int temp = dato % multiple;
        if (temp == 0)
            res = true;
        else
            res = false;
        return res;
    }

    public void validateMultiple(int num, int mul3, int mul5) {
        boolean res3 = isMultiple(num, mul3);
        boolean res5 = isMultiple(num, mul5);
        if (res3 == true && res5 == false)
            System.out.println(num + " is a multiple of " + mul3 + " (A)");
        else if (res3 == false && res5 == true)
            System.out.println(num + " is a multiple of " + mul5+ " (B)");
        else if (res3 == true && res5 == true)
            System.out.println(num + " is multiple of Both " + "(" + mul3 + ", " + mul5 + ")");
    }
}
