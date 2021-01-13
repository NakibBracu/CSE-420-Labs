import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Nakib_18301203_03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
             int number_of_Patterns = sc.nextInt();//2
             sc.nextLine();// string input avoid
             String re_Patterns[]=new String[number_of_Patterns];
             for(int i=0;i<number_of_Patterns;i++){
             re_Patterns[i] = sc.nextLine();   
    }    
            int inputs = sc.nextInt();// 3 inputs
            sc.nextLine(); 
         for(int i=0;i<inputs;i++){// 3 inputs iterative match
             boolean milse_Ki = false;
             String kontai_Milse = "";
              String str = sc.nextLine();
              for(int j=0;j<number_of_Patterns;j++){//iteratively matches with the patterns
              if(Pattern.matches(re_Patterns[j],str)){
               milse_Ki=true;
               kontai_Milse=kontai_Milse+(j+1)+" ";//0 er sathe mille 1 kore dilam mane 0 number toh first er tah bujai nah
              }
              } 
    String msg =  (milse_Ki) ? "Yes, "+kontai_Milse : "No, "+0;
    System.out.println(msg);
         }      
    }
}