package beginner1.firstcode;
import java.util.Scanner;
public class Dummynotes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String[] str1 = str.split(":");
      
            System.out.printf(str1[0],str1[1] );
            System.out.println(str);
    }  
}


