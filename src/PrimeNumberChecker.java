import java.util.ArrayList;

public class PrimeNumberChecker {

    public static boolean isPrimeNumber(int num){
        boolean isPrimeNumber = false;
        if(num == 1){
            isPrimeNumber = true;
        }else{


            int  i = 2;
            while( num % i  != 0 ){
                i++;
            }
            isPrimeNumber = i ==num;
        }

        return isPrimeNumber ;
    }

    public static boolean isPrimeNumberUsingFactors(int num){

        boolean isPrimeNumber = giveTheFactors(num).size() > 2 ? false : true;
        return  isPrimeNumber;

    }

    public static ArrayList<Integer> giveThePrimeNums(int firstNumber , int secondNumber){
        ArrayList<Integer> result = new ArrayList<>();
        while( firstNumber <= secondNumber){
            if(isPrimeNumber(firstNumber)){
                result.add(firstNumber);

             }
            firstNumber++;
        }
        return result;

    }

    public static ArrayList<Integer> giveTheFactors(int number){

        ArrayList<Integer> result = new ArrayList<>();
        int  i = 1;
        while( i <= number){
            if(number % i == 0){
                result.add(i);
            }
            i++;
        }
        return result;

    }

    public static ArrayList<Integer> giveThePrimeFactorization(int number){

        ArrayList<Integer> result = new ArrayList<>();
        int  i = 1;
        while( i <= number){
            if(number % i == 0 && isPrimeNumber(i)){
                result.add(i);
            }
            i++;
        }
        return result;

    }


    public static void main(String[] args) {
        System.out.println(isPrimeNumberUsingFactors(9));
        System.out.println(isPrimeNumberUsingFactors(8));
        System.out.println(isPrimeNumber(6));
        System.out.println(isPrimeNumber(10));
        System.out.println(isPrimeNumber(4));
        System.out.println(isPrimeNumber(2));
        System.out.println(isPrimeNumberUsingFactors(3));
        System.out.println(isPrimeNumber(5));
        System.out.println(isPrimeNumber(7));
        System.out.println(isPrimeNumber(11));
        System.out.println(isPrimeNumberUsingFactors(13));
        System.out.println(isPrimeNumber(17));
        System.out.println(isPrimeNumber(23));
        System.out.println("1001 :" + isPrimeNumber(1001));

        System.out.println("----------------------------------------------------------------------");

        System.out.println(giveThePrimeNums(2,1000));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(giveTheFactors(1001));
        System.out.println("----------------------------------------------------------------------");

        System.out.println(giveThePrimeFactorization(1001));

    }
}
