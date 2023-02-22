/*Two words are anagrams if they contain the same letters but in a different order. Here are a few examples of anagram pairs:

“l i s t e n” and “s i l e n t”
“binary” and “brainy”
“Paris” and “pairs”
For a given input of two strings, return a Boolean TRUE if the two strings are anagrams.

As an added challenge, for a given array of strings, return separate lists that group anagrams together.
 For example, the input {“tar,” “rat,” “art,” “meats,” “steam”},
 the output should look something like {[“tar,” “rat,” “art”], [“meats,” “steam”]}.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {

    public static boolean areTheWordsAnagrams(String word1, String word2) {
        boolean result = false;
        String[] charWord1 = word1.split("");
        String[] charWord2 = word2.split("");
        List<String> wordArray1 = new ArrayList<>();
        List<String> wordArray2 = new ArrayList<>();
        Arrays.asList(charWord1).forEach(   l -> { wordArray1.add(l.toUpperCase()); }  );
        Arrays.asList(charWord2).forEach(   k -> { wordArray2.add(k.toUpperCase()); }  );

        if (word1.length() != word2.length()) {
            result = false;
        } else if (word1.equalsIgnoreCase(word2) ||
                wordArray1.stream().allMatch( e -> wordArray2.contains(e)) ) {
            result = true;
        }
        return result;
    }

    public static ArrayList<ArrayList<String>> groupTheSameWords(ArrayList<String> input){
        ArrayList<ArrayList<String>> output = new ArrayList<>();
            for (String word: input ) {
                ArrayList<String> firstWord = new ArrayList<>();



                for(int i = input.indexOf(word) + 1 ; i <= input.size() -1;i++){
                    if(areTheWordsAnagrams(word, input.get(i))){
                        firstWord.add(word);
                        firstWord.add(input.get(i));

                    }else{
//                        firstWord.add();
                    }
                }

                output.add(firstWord);
            }

            return output;

    }


    public static void main(String[] args) {
        String word1 = "ilokv5eyou";
        String word2 = "y5iolouvKe";


        System.out.println(areTheWordsAnagrams(word1, word2));
        System.out.println(areTheWordsAnagrams("word1", "word2"));
        System.out.println(areTheWordsAnagrams("jlistEn", "SilenJt"));
        System.out.println(areTheWordsAnagrams("Paris", "pairs"));

        System.out.println("-------------------------------");

        ArrayList<String> hd = new ArrayList<>();
        hd.add("tar");
        hd.add("meats");
//        hd.add("steam");
        hd.add("art");
        hd.add("rat");
        System.out.println(groupTheSameWords(hd));



    }
}
