// Change the format of date from "1st January 2023" to "2023/01/01".

package String.Questions;
import java.io.*;

class ChangeDateFormat
{
    /* Function to change the date format */
    void changeFormat(String str)
    {
        //Array containing day, month, year
        String arr[] = str.split(" ");

        //Month comparison array
        String months[] = {"January", "February", "March", "April", "May",
                           "June", "July", "August", "September", "October",
                           "November", "December"};

        String day = "", month = "", year = "";

        /* Day */
        //Single digit
        if (arr[0].length() == 3) {
            day = "0" + arr[0].charAt(0);
        }
        //Double digit
        else if (arr[0].length() == 4) {
            day = "" + arr[0].charAt(0) + arr[0].charAt(1);
        }

        /* Month */
        for (int i=0; i<months.length; i++)
        {
            if (months[i].equalsIgnoreCase(arr[1]))
            {
                //Single digit
                if (i + 1 < 10) {
                    month = "0" + (i + 1);
                    break;
                }
                //Double digit
                else {
                    month = Integer.toString(i + 1);
                    break;
                }
            }
        }

        /* Year */
        year = arr[2];

        //Printing the changed date
        System.out.println(year +"/"+ month +"/"+ day);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ChangeDateFormat obj = new ChangeDateFormat();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the date : ");
        String str = b.readLine();

        //Changing date format
        System.out.print("Changed date : ");
        obj.changeFormat(str);
    }
}