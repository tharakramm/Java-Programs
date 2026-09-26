import java.util.*;

class StringMethods
{
    public static void main(String args[])
    {
        String s,s2;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 1st String : ");
        s=sc.nextLine();

        System.out.print("Enter 2nd String : ");
        s2=sc.nextLine();

        System.out.println("\nString 1 : "+s);
        System.out.println("String 2 : "+s2);

        System.out.println("\nString 1 Uppercase : "+s.toUpperCase());
        System.out.println("String 2 Uppercase : "+s2.toUpperCase());

        System.out.println("String 1 Lowercase : "+s.toLowerCase());
        System.out.println("String 2 Lowercase : "+s2.toLowerCase());

        System.out.println("\nString Concatenation : "+s.concat(s2));

        System.out.println("\nString 1 Length : "+s.length());
        System.out.println("String 2 Length : "+s2.length());

        if(s.length() > 0)
            System.out.println("\nFirst Character of String 1 : "+s.charAt(0));

        System.out.println("\nStrings Equal : "+s.equals(s2));
        System.out.println("Equal Ignoring Case : "+s.equalsIgnoreCase(s2));

        System.out.println("\nString 1 Contains String 2 : "+s.contains(s2));

        System.out.println("String 1 Starts With String 2 : "+s.startsWith(s2));

        System.out.println("String 1 Ends With String 2 : "+s.endsWith(s2));

        if(s.length() > 0)
        {
            System.out.println("\nIndex of First Character : "+s.indexOf(s.charAt(0)));
            System.out.println("Last Index of First Character : "+s.lastIndexOf(s.charAt(0)));
        }

        if(s.length() >= 2)
        {
            System.out.println("\nSubstring from Index 2 : "+s.substring(2));
            System.out.println("Substring from Index 0 to 2 : "+s.substring(0,2));
        }

        System.out.println("\nReplace 'a' with 'A' : "+s.replace('a','A'));

        System.out.println("\nString 1 is Empty : "+s.isEmpty());
    }
}