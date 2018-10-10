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

    public static String fooBarBaz(int num1)
    {
        String output = "";
        for(int n = 1; n <= num1; n++)
        {
            if(n%3 ==0 && n%5 ==0)
            {
                //System.out.println("baz, ");
                output = output + "baz, ";
            }
            if(n%3 ==0 && n%5 !=0)
            {
                //System.out.println("foo, ");
                output = output + "foo, ";
            }
            if(n%3 !=0 && n%5==0)
            {
                //System.out.println("bar, ");
                output = output + "bar, ";
            }
            if(n%3 !=0 && n%5!=0)
            {
                //System.out.println(n+(", "));
                output = output + n + ", ";
            }
        }
        return output;
    }

    public static int sumUpTo(int input)
    {
        int sum = 0;
        for(int i =0; i <= input; i++) //If you don't want yo include the input you take away the = sign from the second condition
        {
            sum = sum + i;
        }
        System.out.println("Input number was "+input);
        System.out.print("Sum up to is ");
        return sum;
    }

    public static String primePrinter(int input)
    {
        //I wasn't too sure what the task was so I made a program that lists the prime factors of the input
        String output = "";
        for(int i = 0; i <= input; i++)
        {
            for(int n=2; n<i; n++) //I used two for loops because for every factor I go through I have to check if it
            {                      // is divisible by anything other than itself and 1
                if(i%n == 1)
                {
                    output = output + i + ", ";
                }
            }
        }
        return output;
    }
}
