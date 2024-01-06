// Program to get the query parameters present in a url.

package String.Questions;
import java.util.*;

class QueryParameters
{
    /* Function to get the query parameters */
    void getParameters(String str)
    {
        HashMap<String, String> hm = new HashMap<>();
        String key = "", value = "";

        for (int i=0; i<str.length(); i++)
        {
            //Parameter :
            while (str.charAt(i) != '=') {
                key = key + str.charAt(i);
                i++;
            }

            //Value :
            while (str.charAt(i) != '&') {
                value = value + str.charAt(i);
                i++;
            }

            //Storing them in HashMap :
            hm.put(key, value);
            key = "";
            value = "";
        }

        System.out.println(hm);
    }


    public static void main(String args[])
    {
        //Creating object of the class
        QueryParameters obj = new QueryParameters();

        //Query String
        String str = "name=Rishabh&age=21&city=Lucknow&";

        //Printing the parameters
        System.out.println("Query Parameters : ");
        obj.getParameters(str);
    }
}