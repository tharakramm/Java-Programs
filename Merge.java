import java.util.Scanner;

class Merge
{
    public static void main(String args[])
    {
        int n,n2,i,res;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter n for array 1 : ");
        n=sc.nextInt();
        
        System.out.print("Enter n for array 2 : ");
        n2=sc.nextInt();
        
        res=n+n2;
        int[] arr=new int[n];
        int[] arr2=new int[n2];
        int[] resa=new int[res];
        
        System.out.println("Array 1");
        
        for(i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+"no : ");
            arr[i]=sc.nextInt();
            
        }
        
        
        System.out.println("Array 2");
        for(i=0;i<n2;i++)
        {
            System.out.print("Enter "+(i+1)+"no : ");
            arr2[i]=sc.nextInt();
            
        }
        
        for(i=0;i<n;i++)
        {
            resa[i]=arr[i];
            
        }
        
        for(i=0;i<n2;i++)
        {
            resa[n+i]=arr2[i];
            
        }
        
        System.out.println("Resultant Array : ");
        
        for(i=0;i<res;i++)
        {
            System.out.print(resa[i]+" ");
            
        }
        
    }
    
}        