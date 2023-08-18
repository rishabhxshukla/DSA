// Use string builder class to change a string in optimized time

package CollectionFramework;
class String_Builder
{
    public static void main(String args[])
    {
        //Initializing the string
        StringBuilder sb = new StringBuilder("Rishabh Shukla");


        /* Printing the string */
        System.out.println("Created String :");
        System.out.println(sb);
        System.out.println();


        /* Length of the string */
        System.out.println("Length :");
        int len = sb.length();
        System.out.println(len);
        System.out.println();


        /* Extracting a character */
        System.out.println("Character at index 0 :");
        char ch = sb.charAt(0);
        System.out.println(ch);
        System.out.println();


        /* Appending new string */
        System.out.println("Appending new string :");
        sb.append(" Hello");
        System.out.println(sb);
        System.out.println();


        /* Getting the first index of a particular character */
        System.out.println("Index of H :");
        int i = sb.indexOf("H");
        System.out.println(i);
        System.out.println();


        /* Getting the last index of a particular character */
        System.out.println("Last index of h :");
        i = sb.lastIndexOf("h");
        System.out.println(i);
        System.out.println();


        /* Deleting character at particular index */
        System.out.println("Deleting character at index 6 :");
        sb.deleteCharAt(6);
        System.out.println(sb);
        System.out.println();


        /* Deleting characters in a range */
        System.out.println("Deleting characters from index 7 to 14 :");
        sb.delete(7, 14);
        System.out.println(sb);
        System.out.println();


        /* Replacing characters in a range */
        System.out.println("Replacing characters from 0 to 6 :");
        sb.replace(0, 6, "Shukla");
        System.out.println(sb);
        System.out.println();


        /* Changing character at a particular index */
        System.out.println("Changing character at index 7 :");
        sb.setCharAt(7, 'W');
        System.out.println(sb);
        System.out.println();


        /* Inserting a string at a particular index */
        System.out.println("Inserting a string at index 6 :");
        sb.insert(6, "Rishabh");
        System.out.println(sb);
        System.out.println();


        /* Reversing the string */
        System.out.println("Reversing the string :");
        sb.reverse();
        System.out.println(sb);
        System.out.println();


        /* Converting StringBuffer to String */
        System.out.println("Converting StringBuffer to String :");
        String str = sb.toString();
        System.out.println(str);
    }
}