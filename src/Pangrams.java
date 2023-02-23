/*A pangram is a sentence that contains all 26 letters of the English alphabet.
One of the most well-known examples of a pangram is, “The quick brown fox jumps over the lazy dog.”
Create a pangram checker that returns a Boolean TRUE if an input string is a pangram and FALSE if it isn’t.

For an added pangram challenge, create a perfect pangram checker.
A perfect pangram is a sentence that uses each letter of the alphabet only once, such as, “Mr. Jock, TV quiz Ph.D., bags few lynx.”
* */

//Author Mohamad Juma
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pangrams {

public static  String theResult= "";

public static String  removeAllNonChar(String input){


    // input =  The quick brown fox jumps over the lazy dog.  ->  output = Thequickbrownfoxjumpsoverthelazydog
    return input.toLowerCase().replaceAll("[^\\w]", "");
}

    public static boolean isPangrams(String text){
        ArrayList<String> arryOfAlpha = new ArrayList<>(
                Arrays.asList("a","b","c","d","e","f",
                              "g","h","i","j","k","l",
                              "m","n","o","p","q","r",
                              "s","t","u","v","w","x",
                              "y","z")
        );
    boolean isPangram = false ;
    String textwithoutSpaces = removeAllNonChar(text);
    String[] arrayOfCharachters = textwithoutSpaces.split("");
        List<String> arrayListOfCharachters = new ArrayList<>();
        arrayListOfCharachters =Arrays.asList(arrayOfCharachters);
        Collections.sort(arrayListOfCharachters);
        arryOfAlpha.removeAll(arrayListOfCharachters);
        isPangram = arryOfAlpha.size() == 0;


//        theResult = isPangram ? "it is True the text is Pangrams" : "it is False the text is not Pangrams";

        List<String> finalArrayListOfCharachters = arrayListOfCharachters;
        if(isPangram && arrayListOfCharachters.stream().anyMatch(e ->
                (finalArrayListOfCharachters.subList(finalArrayListOfCharachters.indexOf(e), finalArrayListOfCharachters.lastIndexOf(e) + 1 ).size() > 1)) ){
            theResult = "it is  a pangram but  it is  not a Perfect pangram";
     }else if(!isPangram) {
            theResult = "it is False the text is not Pangrams";
        }else {
            theResult = "it is a Perfect pangram";
        }
        System.out.println(theResult);
        System.out.println("The alphabet letters in this text are :  "+arrayListOfCharachters);
        System.out.println("the following alphabet letters do not exist : " + arryOfAlpha);

        return  isPangram;





    }


    public static void main(String[] args) {
//    ArrayList<String> arryOfAlpha = new ArrayList<>(Arrays.asList("a","b", "c","d" , "e" , "f","g","h", "i","j" , "k" , "l","m","n",
//            "o","p" , "q" , "r","s","t", "u","v" , "w" , "x","y","z"));
//
    String text = "T";
        System.out.println(text.length());
    String textwithoutSpaces = removeAllNonChar(text);
//
    String[] arrayOfCharachters =  textwithoutSpaces.split("");
    List<String> arrayListOfCharachters = new ArrayList<>();
        arrayListOfCharachters = Arrays.asList(arrayOfCharachters);
        Collections.sort(arrayListOfCharachters);
        System.out.println(arrayListOfCharachters);
        System.out.println(arrayListOfCharachters.subList(arrayListOfCharachters.indexOf("t"),arrayListOfCharachters.lastIndexOf("t") + 1 ));
        System.out.println(arrayListOfCharachters);
//        System.out.println(arrayListOfCharachters);
//        System.out.println(arrayListOfCharachters.size());
//        arryOfAlpha.removeAll(arrayListOfCharachters);
//        System.out.println(arryOfAlpha);
        System.out.println("------------------------------------------------");

        System.out.println("you will  be always my love !");
        System.out.println(isPangrams("you will  be always my love !"));
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        System.out.println("Mr. Jock, TV quiz Ph.D., bags few lynx.");
        System.out.println(isPangrams("Mr. Jock, TV quiz Ph.D., bags few lynx."));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        System.out.println("The quick brown fox jumps over the lazy dog.");
        System.out.println(isPangrams("The quick brown fox jumps over the lazy dog."));




    }
}
