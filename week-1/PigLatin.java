public class PigLatin {
    public static void main(String[] args) {
        System.out.println(convertToPigLatin("Revature"));
        
    }


    public static String convertToPigLatin(String word){

        /*  
         * Strings are immutable.... What is this mean?
         *      meaning it cannot be changed
         * 
         * 
         * If we know we need to manipulate a string alot, we want to use either StringBuilder
         * or StringBuffer to manipulate the string
         * 
         * String is immutable
         * 
         * StringBuffer is mutable and thread safe. 
         * 
         * StringBuilder is mutable and NOT thread safe.
         * 
        */

        //add the first character to the end of the string

        //remove the first character from the string completely

        // add ay

        StringBuilder sb = new StringBuilder(word);

        sb.deleteCharAt(0).append(word.charAt(0) + "ay");
        /* sb.append(word.charAt(0));
        sb.append("ay"); */
        


        return sb.toString();
    }
}