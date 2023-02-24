
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
            output = (int) (output + ((inputCopy % 10) * Math.pow( 10,  i)));
            inputCopy = inputCopy / 10;
            i--;

        }


        return output;
    }

    /* public double reverseDoubleNumber(double input  ){
//        scale = 1 / Math.pow(10,scale);

        double inputCopy = input;
        double output = 0;
        int i = 0 ;
        ArrayList<String> smallThanOne = new ArrayList<>();

        // to know how many nummbers after the dot '.'

        while (input % 10 > 0.0001 ){
            input = input * 10 ;
            i++;
        }
        // here i have used  --i because for example if I had an input = 0.5601
        i--;

        if(inputCopy < 1){

            String stringNum = String.valueOf(inputCopy);

            stringNum = stringNum.replaceAll("[^\\w]", "");
//

            for (int k =0; k < stringNum.length() ; k++){
                smallThanOne.add((String.valueOf(stringNum.charAt(k))));
            }

            Collections.reverse(smallThanOne);
            StringBuilder builder = new StringBuilder();
            for (String str: smallThanOne
                 ) {
                builder.append(str);

            }

            input =  Double.valueOf(builder.toString()) / Math.pow(10,i);
            // 650
                    output = input;
        }


        else{

//          output = reverseNumber((int) input) / (Math.pow(10,i));
            input = (input / 10);
            output = reverseNumber((int) input) / (Math.pow(10,i));
        }






        return output;
    }

  */


    public static double reverseDouble(double num) {                                      // 1234.56789
        String numStr = Double.toString(num);                                            // "1234.56789"
        String[] parts = numStr.split("\\.");                                      // ["1234", "56789"]
        int scale = parts[1].length();                                                   // "56789".length() = 5

        StringBuilder sb = new StringBuilder();
        sb.append(parts[0]);                                                          // ""+"1234" = "1234"

        sb.append(parts[1]);                                                         // "1234" +"56789" = "123456789"

        sb.reverse();                                                               // "987654321"

        double output = Double.parseDouble(sb.toString()) / Math.pow(10, scale); // "987654321" ->   987654321 / (10 ^ 5) = 9876.54321


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


//        System.out.println(numberReversal.reverseDoubleNumber(193.89));
//        System.out.println(numberReversal.reverseDoubleNumber(0.56));
//
//        System.out.println(numberReversal.reverseDoubleNumber(1.56));
        System.out.println(reverseDouble(1234.56789));
    }

}
