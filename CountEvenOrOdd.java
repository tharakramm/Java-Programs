import java.util.Scanner;

class CountEvenOrOdd
{
    public static void main(String args[])
    {
        int n,i,e=0,o=0;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter no of Elements : ");
        n=sc.nextInt();
        
        int[] arr=new int[n];
        
        for(i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" Value : ");
            arr[i]=sc.nextInt();
            
        }
        
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                e=e+1;
            }
            
            else
            {
                o=o+1;
            }
        }
        
        System.out.println("Even : "+e+"\n"+"Odd : "+o);
        
    }
}                                        
        
        