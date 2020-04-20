

java.util.*;

class Hc {
    public static void main(String args[] ) throws Exception {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                a[i][j]=i+1;
                System.out.println(a[i][j]);
            }
        }

    }
}
