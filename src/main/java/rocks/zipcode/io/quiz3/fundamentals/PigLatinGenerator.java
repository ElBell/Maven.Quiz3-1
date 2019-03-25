package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    private String pigLatinSentence(String word) {
        Integer index = VowelUtils.getIndexOfFirstVowel(word);
        boolean startsWithVowel = VowelUtils.startsWithVowel(word);
        if (index == -1)
            return word + "ay";
        if(startsWithVowel) {
            return word.substring(index) + word.substring(0, index) + "way";
        } else  {
            return word.substring(index) + word.substring(0, index) + "ay";
        }
    }

    // Driver code
    public String translate(String str) {
        String[] words = str.split(" ");
        StringBuilder finalString = new StringBuilder();
        for (String word : words) {
            finalString.append(pigLatinSentence(word)).append(" ");
        }
        return finalString.toString().substring(0, finalString.toString().length() -1);
    }
}
