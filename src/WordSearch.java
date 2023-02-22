/*
*For a given input string, return a Boolean TRUE if the string starts with a given input word.
*  So, for an input string of “hello world” and input word “hello,” the program should return TRUE.

For a more advanced word searcher, create a program that returns the number of times a word appears in an input string.
*  For example, given an input word “new” and an input string “I’m the new newt,”
* the program should return a value of 2.
* */

public class WordSearch {

    public static boolean isTheStringStartsWith(String input , String word){

        return input.startsWith(word);
    }

    public static int  isTheStringContainsWord(String input , String word){

        int numbersOfTime = 0;
        String[] splitedInput = input.split(" ");
        for (String token:splitedInput
             ) {
            if(token.toLowerCase().equalsIgnoreCase(word.toLowerCase()) || token.toLowerCase().contains(word.toLowerCase())){
                numbersOfTime++;
            }

        }
        System.out.println("Number of times, that the word " + word +"appears in an input string is :" + numbersOfTime);
         return numbersOfTime;
    }

    public static void main(String[] args) {
        System.out.println(isTheStringStartsWith("hello world","hello"));
        System.out.println(isTheStringStartsWith("hello world","world"));

        System.out.println("----------------------------------");

        System.out.println(isTheStringContainsWord("I’m the new newt" , "IF"));
    }
}
