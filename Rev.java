import java.util.Scanner;

class Rev
{
    void Ra(int[] arr,int n)
    {
        System.out.print("Reversed Array : ");
        
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }    
        
    }
    public static void main(String args[])
    {
        int n,i;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter n : ");
        n=sc.nextInt();
        
        Rev r=new Rev();
        
        int[] arr=new int[n];
        
        for(i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" Value : ");
            arr[i]=sc.nextInt();
            
        }
        
        r.Ra(arr,n);
        
    }
}                