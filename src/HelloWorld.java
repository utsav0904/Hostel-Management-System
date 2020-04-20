
import java.lang.*;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
         System.out.println("hello");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k;
        int a[]=new int[n];
        int i=0;
        while(n!=0){
            a[i++]=sc.nextInt();
            n--;
        }
        
        Arrays.sort(a);
        boolean flag;
        for(i=0;i<a.length;i++){
            
            flag = false;
            for(k = 2; k <= a[i]/2; ++k)
            {
            // condition for nonprime number
                if(a[i] % k == 0)
                {
                    flag = true;
                    break;
                }
            }

            if (!flag){
                
                int reversed = 0;

                while(a[i]!= 0) {
                    int digit = a[i] % 10;
                    reversed = reversed * 10 + digit;
                    a[i] /= 10;
                }
                
                flag = false;
                for(k = 2; k <= a[i]/2; ++k)
                {
                
                    if(a[i] % k == 0)
                    {
                        flag = true;
                        break;
                    }
                }
    
                if (!flag){
                    System.out.println(a[i]);
                
                }
                
            }
        }
    }
}