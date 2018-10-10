package IbrahimaDiallo;

public class IDialloLib
{
    public static boolean isPalindrome(String input)
    {
        String sub1 = "";
        String sub2 = "";
        int i = 0;
        while(i < (input.length()/2)) //racecar
        {
            sub1 = input.substring(i, i+1);
            sub2 = input.substring((input.length() - i)-1, (input.length() - i));
            if(!sub1.equals(sub2))
            {
                return false;
            }
            i = i + 1;
        }
        System.out.println("i is " + i);
        System.out.println("input.length()/2 is " + (input.length()/2));
        return true;
    }

    public static String dateStr(String input)
    {
        //Make mm/dd/yyyy into dd-mm-yyyy
        String months = input.substring(0,2);
        String days = input.substring(3,5);
        String years = input.substring(6);

        return(days+"-"+months+"-"+years);
        //Because the input will always be 9 char long I do not need to use loops for scalability
    }
}
