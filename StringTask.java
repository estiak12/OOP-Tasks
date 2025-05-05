// Take a string as input and output reverse
public class ProductFilter{
    public static void main(String [] args){
        String s1="ALLAHBOROSA";
        String s2="";
        int k=s1.length();
        for(int i=k-1; i>=0; i--)s2+=s1.charAt(i);
        System.out.println(s2);
    }
}
//Check weather a string is pallindrome or not 

import java.util.Scanner;
public class ProductFilter{
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       int n=s.length();
       int no=0;
       for(int i=0; i<n; i++){
        if(s.charAt(i)!=s.charAt(n-i-1))no++;
       }
       if(no>0)System.out.println("The String is not Pallindrome");
       else System.out.println("The string is pallindrome");
    }
}


// Count the occurrence of a character 
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        System.out.print("Enter a character to count: ");
        char ch = sc.next().charAt(0);  // Get the first character of input
        
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Character '" + ch + "' occurred " + count + " time(s).");
    }
}
