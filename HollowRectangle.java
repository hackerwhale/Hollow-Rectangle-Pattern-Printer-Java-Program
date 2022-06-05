import java.util.*;
 
public class HollowRectangle {
   public static void main(String args[]) {
      System.out.println();
      System.out.println("/===Print--Hollow--Rectangle--Pattern====/");
      System.out.println();
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter row:  ");
       int n = sc.nextInt();
       System.out.println("Enter column:  ");
       int m = sc.nextInt();
       for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               if(i == 0 || i == n-1 || j == 0 || j == m-1) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
}
