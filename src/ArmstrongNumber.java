import java.util.ArrayList;

//Author Mohamad Juma
public class ArmstrongNumber {


    public static  boolean isArmstrongNumber(int inputNumber){
        int inputNumberCopy = inputNumber;
        String numString = Integer.toString(inputNumberCopy);
        int power = numString.length();
        int outputNum = 0;

        while(inputNumberCopy !=0){
            outputNum = (int) (outputNum +  Math.pow(inputNumberCopy % 10 , power));


            inputNumberCopy = inputNumberCopy / 10 ; // 0
        }




        return outputNum == inputNumber;
    }

    public static ArrayList<Integer> allArmstrongNumbers(int theFirst , int theSecond){
        ArrayList<Integer> armstringNums=new ArrayList<>();

        while (theFirst <= theSecond){
            if(isArmstrongNumber(theFirst)){
                armstringNums.add(theFirst);
            }
            theFirst++;

        }

        return armstringNums;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(8208));
        System.out.println("--------------------------------------------");
        System.out.println(allArmstrongNumbers(0,21640496));
    }
}
