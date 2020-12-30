package Level01;

public class ProblemSet01 {

    /**
     * Have the wordCount(input) take the str string parameter being passed
     * and return the number of words the string contains
     * (e.g. "Never eat shredded wheat or cake" would return 6). Words will be
     * separated by single spaces.
     */
    public String wordCount(String input) {
        // 1) split the input string at the spaces between words (" ") into a String array called splitted
        // 2) set a new int variable called length equal to the splitted array's length to count the words
        // 3) turn the int length into a string called countOfWords using the Integer.toString method
        // 4) return countOfWords

        String[] splitted = input.split(" ");
        int length = splitted.length;
        String countOfWords=Integer.toString(length);
        return countOfWords;
    }

    /**
     * Using the Java language, have the function firstReverse(String input) take the input parameter being passed and
     * return the string in reversed order. For example: if the input string is "Hello World and Coders" then your
     * program should return the string sredoC dna dlroW olleH.
     */

    public String firstReverse(String input){

        // 1) create a new StringBuilder object called reverseString using the new keyword
        // 2) pass in input as the new StringBuilder's parameter
        // 3) use the StringBuilder's reverse method to reverse the order of characters in reverseString
        // 4) return the StringBuilder reverseString object to String.

        StringBuilder reverseString = new StringBuilder(input);
        return reverseString.reverse().toString();
        }




    /**
     * Have the longestWord(String input) take the input parameter being passed and return the
     * largest word in the string. If there are two or more words that are the same length,
     * return the first word from the string with that length. Ignore punctuation and assume
     * input will not be empty.
     */
    public String longestWord(String input) {
        // 1) get rid of anything that's not a letter or number (i.e. punctuation marks) by replacing any in input with "";
        //        call the new String inputWithNoPunctuation
        // 2) create an array called words by splitting the new string at the spaces (" ")
        // 3) create an int variable called longestLength and set it to zero
        // 4) create a String variable called longestString and set it to empty ""
        // 5) create a for loop to loop through each word in words
        // 6) set the condition to test if the word's length is greater than the longest length variable
        // 7) if it is, set longestLength to the word's length
        // 8) and set the longestString to equal that word.
        // 9) return the longestString

        String inputWithNoPunctuation = input.replaceAll("[^a-zA-Z0-9\\s]","");
        String[]words = inputWithNoPunctuation.split(" ");
        int longestLength = 0;
        String longestString = "";
        for(String word : words){
            if(word.length() > longestLength) {
                longestLength = word.length();
                longestString = word;
            }
        }
        return longestString;
    }

    /**
     * Have the swapCase(String input) take the input parameter and swap the case of each
     * character. For example: if str is "Hello World" the output should be hELLO wORLD.
     * Let numbers and symbols stay the way they are.
     */
    public String swapCase(String str) {
        // 1) create a char array called chars by using the toCharArray method on the input str
        // 2) set up a for loop to go through each char called charToSwap
        // 3) set a  condition that if that char is upper case, make it lower case
        // 4) else if it's lower case, make it upper case
        // 5) return the new String with chars as its parameter

        char[] chars = str.toCharArray();
        for (int i=0; i < chars.length; i++) {
            char charToSwap = chars[i];
            if(Character.isUpperCase(charToSwap)){
                chars[i]=Character.toLowerCase(charToSwap);
            }else if(Character.isLowerCase(charToSwap))
                chars[i]=Character.toUpperCase(charToSwap);

            }
        return new String(chars);
    }
}
