package IbrahimaDiallo;

public class IDialloLib
{
    public static boolean isPalindrome(String input)
    {
        String sub1 = "";
        String sub2 = "";

        if((input.length()%2) == 0)  //Even number or char
        {
            sub1 = input.substring(0, (input.length()/2));
            sub2 = input.substring((input.length()/2), input.length());
        }
        else
        {
            sub1 = input.substring(0, (input.length()/2)); //That 0.5 will round down
            sub2 = input.substring((input.length()/2), (input.length()+1));
        }

        for(int i = 0; i < sub2.length(); i++)
        {
            sub2 = sub2.substring(sub2.length()) + sub2.substring(0, (sub2.length()+1));
            //This loop will reverse the order of char in sub2
        }

        System.out.println(sub1);
        System.out.println(sub2);
        return(sub1.equals(sub2));
    }
}
