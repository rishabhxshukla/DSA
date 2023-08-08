/*
Count Items Matching a Rule
You are given an array items, where each items[i] = [typei, colori, namei] describes the
type, color, and name of the ith item.
You are also given a rule represented by two strings : ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true :
1) ruleKey == "type" and ruleValue == typei.
2) ruleKey == "color" and ruleValue == colori.
3) ruleKey == "name" and ruleValue == namei.

Return the number of items that match the given rule.

Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]],
       ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule :
             ["phone","blue","pixel"] and ["phone","gold","iphone"].
*/

package Array.Questions;
import java.io.*;
import java.util.*;

class ItemMaching
{
    static String arr[][] = {
                              {"phone","blue","pixel"},
                              {"computer","silver","phone"},
                              {"phone","gold","iphone"}
                            };
    static ArrayList<List<String>> items = new ArrayList<>();


    /* Creating the matrix */
    void create()
    {
        for (String row[] : arr)
        {
            items.add(Arrays.asList(row));
        }
    }


    /* Printing the array */
    void print()
    {
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    /* Function to count the no. of items that match the given rule */
    static int countMaches(String ruleKey, String ruleValue)
    {
        int count = 0, x = 0;

        for(int i=0; i<items.size(); i++)
        {
            //Calculating the index of rule key of each item
            switch(ruleKey)
            {
                case "type":
                    x = 0;
                    break;
                case "color":
                    x = 1;
                    break;
                case "name":
                    x = 2;
                    break;
            }

            //Extracting the value
            String value = items.get(i).get(x);;

            //Checking the count of value
            if (ruleValue.equals(value)) {
                count++;
            }
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ItemMaching obj = new ItemMaching();

        //Creating the matrix
        obj.create();

        //Printing the matrix
        System.out.println("*** Created Matrix ***");
        obj.print();

        //Printing the no. of maches
        System.out.println("No. of maches : " + countMaches("type", "phone"));
    }
}