
/*This one is a technical interview favorite.
 For a given input number, return the number in reverse.
  So, an input of 3956 should return 6593.

If you’re ready for a bigger challenge, reverse a decimal number.
The decimal point should stay in the same place.
 So, the number 193.56 should output 653.91.
 */

// Author Mohamad Juma
public class NumberReversal {

    public static int reverseNumber(int input) {


        int inputCopy = input;
        int output = 0;
        int i = 0;
        while (input >= 10) {
            input = input / 10;
            i++;
        }

        while (i >= 0) {
            output = (int) (output + ((inputCopy % 10) * Math.pow((double) 10, (double) i)));
            inputCopy = inputCopy / 10;
            i--;

        }


        return output;
    }
    public static double reverseDoubleNumber(double input){

        double inputCopy = input;
        double output = 0;
        int i = 0 ;
        while (input % 10 > 0.0001 ){
            input = input * 10 ;
            i++;
        }
        input = (input / 10);
        i--;

        if(inputCopy > 0 && inputCopy < 1){
            output = reverseNumber((int) input);
        }else{
            output = reverseNumber((int) input) / (Math.pow(10,i));
        }



        return output;
    }

    public static void main(String[] args) {
//        System.out.println(reverseNumber(1234));
//        System.out.println(22);
//        System.out.println(reverseNumber(1025));
//        System.out.println(reverseNumber(3520));
//        System.out.println(reverseNumber(0));
//        System.out.println(reverseNumber(2));
//        System.out.println(reverseNumber(10));
//        System.out.println(reverseNumber(15));
//        System.out.println(reverseNumber(20));
//        System.out.println(reverseNumber(32));
//        System.out.println(1.543 );  //


        System.out.println(reverseDoubleNumber(193.56));
        System.out.println(reverseDoubleNumber(0.56));


    }

}
