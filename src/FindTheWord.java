
/*
* Starting with an input string of words, find the second-to-last word of the string.
*  For example, an input of “I love Codecademy” should return “love.”

To make your program more challenging,
*  allow for a second numerical input, n, that results in returning the nth word of a string.
*  So, for the string “I can program in Java” and n = 3, the output should be the third word, “program.”
*
* */
public class FindTheWord {

    public String findTheWord(String input , int n){

        String[] spiteredInput = input.split(" ");
        String output = spiteredInput[n-1];

        return output;

    }

    public static void main(String[] args) {
        FindTheWord obj = new FindTheWord();
        String input = "I can program in Java";
        System.out.println(obj.findTheWord(input,1));
    }
}
