import java.util.*;

public class WordReversal {

    private final List<Character> nonLetterOrDigits = new ArrayList<>();
    private final List<Integer> indesiesOfPunctuation = new ArrayList<>();

    public static void main(String[] args) {


        WordReversal wordReversal = new WordReversal();
        String input = "Codecademy, is the best.";
        System.out.println(wordReversal.finalMethod(input));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><");



    }

    public String textReversal(String text) {
        ArrayList<String> resultArray = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(text, " ");


        while (st.hasMoreElements()) {
            resultArray.add(st.nextElement().toString());
        }

        String firstElement = resultArray.get(resultArray.size() - 1);
        char c = firstElement.toUpperCase().charAt(0);
        String newFirstElement = firstElement.replace(firstElement.charAt(0), c);
        resultArray.remove(resultArray.size() - 1);
        resultArray.add(newFirstElement);
        Collections.reverse(resultArray);
        StringBuilder resultText = new StringBuilder();
        resultArray.forEach((e) -> {
            resultText.append(e);
            resultText.append(" ");
        });


        return resultText.toString();
    }

    public List<Integer> getIndesiesOfPunctuation(String input) {
        String[] tokensVal = input.split(" ");

        Map<Integer, Character> myMap = new Hashtable<>();
        for (Character c : this.filterForNonLetters(input)) {
            for (int j = 0; j < tokensVal.length; j++) {
                if (tokensVal[j].contains(c.toString())) {
                    this.indesiesOfPunctuation.add(j);
                    myMap.put(j, c);
                }
            }


        }
        return indesiesOfPunctuation;
    }

    public List<Character> filterForNonLetters(String input) {
        int inde = 0;
        while (inde < input.length()) {
            if(Character.isLetterOrDigit(input.charAt(inde))) {

                inde++;
            } else {
                if (input.charAt(inde) != ' ') {
                    this.nonLetterOrDigits.add(input.charAt(inde));

                }

                inde++;
            }
        }
        return this.nonLetterOrDigits;

    }

    public String finalMethod(String input) {                                        // Codecademy is the best!
        this.getIndesiesOfPunctuation(input);                                       // => indesiesOfPunctuation =[3]
        String pureInput = input.replaceAll("[^\\w|\\s]", "");   // Codecademy is the best
        String reversePureInput = this.textReversal(pureInput);                  // best the is Codecademy
        String[] tokens = reversePureInput.split(" ");                    // [best,the,is,Codecademy]
        int tokenAnzahl = tokens.length;
        StringBuilder output = new StringBuilder();

        int i = 0;
        int j = 0;
        while (i <= tokenAnzahl - 1) {
            if (indesiesOfPunctuation.get(j) == i) {
                if (i == tokenAnzahl - 1) {
                    output.append(tokens[i] + nonLetterOrDigits.get(j));
                    i++;
                } else {
                    output.append(tokens[i] + nonLetterOrDigits.get(j) + " ");
                    j++;
                    i++;
                }

            } else {
                output.append(tokens[i] + " ");
                i++;
            }


        }
        return output.toString();
    }

}


