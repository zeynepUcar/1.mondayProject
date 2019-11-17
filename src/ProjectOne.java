import javax.swing.*;
import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProjectOne {

    /**
     * You have string "number", get each character from the string and return the char array
     * Hint: use toCharArray method
     */
    public char[] getChars(String number) {
        char[] eachWord = {};
        // write your code here

        eachWord = number.toCharArray();
        // end of code
        return eachWord;
    }

    /**
     * You have string "sentence", get each word from the string and return string array
     * Hint: use split method
     */
    public String[] getWords(String sentence) {
        String[] eachWord = {};
        // write your code here
        eachWord = sentence.split(" ");

        // end of code
        return eachWord;
    }

    /**
     * Calculate sum of numbers
     * ex: arrayList is: 1, 2 ,3 ,4
     * 1+2+3+4 = 10
     * total should be 10;
     */
    public int total(ArrayList<Integer> myList) {
        int total = 0;
        // write your code here
       for(int i : myList)
           total +=i;


        // end of code
        return total;
    }

    /**
     * Calculate sum of even numbers
     * <p>
     * ex: arrayList is: 1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9
     * 2+4+6+8 = 20
     * total should be 20;
     */
    public int evenTotal(ArrayList<Integer> myList) {
        int total = 0;
        // write your code here
        for(int i : myList)
            if (i % 2 == 0)
                total += i;


        // end of code
        return total;
    }

    /**
     * Calculate sum of odd numbers
     * <p>
     * ex: arrayList is: 1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9
     * 1+3+5+7+9 = 25
     * total should be 25;
     */
    public int oddTotal(ArrayList<Integer> myList) {
        int total = 0;
        // write your code here
        for(int i : myList)
            if (i % 2 != 0)
                total += i;


        // end of code
        return total;
    }

    /**
     * Make the name upper case
     */
    public String getUpperCase(String name) {
        String upperCaseName = null;
        // write your code here

       upperCaseName = name.toUpperCase();
        // end of code
        return upperCaseName;
    }

    /**
     * Make the name lower case
     */
    public String getLowerCase(String name) {
        String lowerCaseName = null;
        // write your code here

       lowerCaseName = name.toLowerCase();

        // end of code
        return lowerCaseName;
    }

    /**
     * Convert int to string
     * 1 => "1"
     */
    public String convertToString(int number) {
        String result = "";
        // write your code here
        result = Integer.toString(number);

        // end of code
        return result;
    }

    /**
     * Return first 3 letters of the string
     * "abcdef" => "abc"
     */
    public String getFirst3Letters(String word) {
        String result = null;
        // write your code here
        result = word.substring(0,3);

        // end of code
        return result;
    }

    /**
     * Return last 2 letters of the string
     * ex: "abcde" => "de"
     */
    public String getLast2Letters(String word) {
        String result = "";
        // write your code here
        int a = word.length();
      result = word.substring(a-2, a-1);
        // end of code//
        return result;
    }

    /**
     * Check if integer and string representation of number are equal
     * ex: (1, "1") => true
     */
    public boolean compareIntAndString(int a, String b) {
        boolean result = false;
        // write your code here
        int c = Integer.valueOf(b);
        if(a == c){
            result = true;
        }

        // end of code
        return result;
    }

    /**
     * Remove white spaces around string
     */
    public String removeWhiteSpacesAround(String str) {
        String result = null;
        // write your code here
        result = str.trim();

        // end of code
        return result;
    }

    /**
     * return a list where each integer is multiplied by 2
     * ex: {1,2} => {2,4}
     */
    public List<Integer> multipliedBy2(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        // write your code here
//        for (int i = 0; i < numbers.size(); i++) {
//            int a = numbers.get(i);
//            result.add(a*2);
//        }

        for(int n : numbers){
            result.add(n*2);
        }
        // end of code
        return result;
    }

    /**
     * return a list where each string is doubled
     * ex: "Apple" => "AppleApple"
     */
    public List<String> doubledWord(List<String> words) {
        List<String> result = new ArrayList<>();
        // write your code here
        for(String n : words){
            result.add(n+n);
        }

        // end of code
        return result;
    }

    /**
     * Check if array has duplicates
     */
    public boolean hasDuplicates(Character[] characters) {
        boolean result = false;
        // write your code here

        for(int j = 0; j < characters.length; j++) {
            for (int k = 0; k < characters.length; k++) {
                if (characters[k] == characters[j]) {
                    result = true;
                }
            }
        }



        // end of code
        return result;
    }

}
