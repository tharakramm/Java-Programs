import java.util.*;

class Searching
{
    static Scanner sc=new Scanner(System.in);
    
    void Search(int[] arr,int n)
    {
        int key,pos;
        
        System.out.print("Enter Element to Search : ");
        key=sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
            if(arr[i]==key)
            {
                pos=i;
                System.out.println(key+" Is Present at "+i+"th Index.");
                return;
            }
        }
        System.out.println(key+" Is not present");
    }
        
    public static void main(String args[])
    {
        int n,i,j;
        
        System.out.print("Enter no of Elements : ");
        n=sc.nextInt();
        
        int[] arr= new int[n];
        
        Searching s=new Searching();
        
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
            
        }
        for(i=0; i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Elements Must be unique!");
                    return;
                }
            }
           
        }
        
        s.Search(arr,n);
        
        
        
    }
}
        
        
        