package io.zipcoder;


import org.codehaus.plexus.util.StringUtils;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        String newString = input + " "; //add space to last char so i can easily detect end of ALL words
        String findY = "y "; //substring to detect words ending with y
        String findZ = "z "; //substring to detect words ending with z
        int totalFound = 0; //store total number of words found
        totalFound = StringUtils.countMatches(newString, findY) + StringUtils.countMatches(newString, findZ); //sums results from findY and findZ to totalFound
        return totalFound; //returns total positive matches
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String newString = base.replace(remove, ""); //create a new string, assign value of base - remove
        return newString;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int totalFoundIs = 0; //store total times "is" is found in string
        int totalFoundNot = 0; //store total times "not" is found in string
        totalFoundIs = StringUtils.countMatches(input, "is");
        totalFoundNot = StringUtils.countMatches(input, "not");
        return totalFoundIs == totalFoundNot;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        int sL = input.length();
        int yes = 0;
        int no = 0;
        for(int i = 0; i < sL; i++){
            if(input.charAt(i) == 'g'){
                if((input.charAt(i - 1) == 'g') || (input.charAt(i + 1) == 'g')){
                    yes++;
                }
                else {
                    return false;
                }
            }
        } //for loop
        return true;
    } //gIsHappyMethod


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int sL = input.length();
        int matches = 0;

        for(int i = 0; i <sL; i++){
            if(input.charAt(i) == input.charAt(i -1) && input.charAt(i) == input.charAt(i +1)){
                matches++;
            }

        }



        return null;
    } //countTriple method
}
