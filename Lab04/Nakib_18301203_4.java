import java.io.*; //input er jonno
import java.util.*;//scanner er jonno 
public class Nakib_18301203_4{
    //comments are for one line of method finding "public int add(int a, int b) "
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("input.txt")); //file input
        System.out.println("Methods : ");  
        while(sc.hasNextLine()){
            String line = sc.nextLine();//public int add(int a, int b)
            String _SecondBracket = sc.next();//{    
            if(line.contains("(") && _SecondBracket.contains("{") ){//( and { then go
                String [] _FirstbracketdiyaVangbo = line.split("\\(");// find a special character ( for splitting it does public int add in 0 index and int a, int b) in 1 index 
                String [] _FirstbracketeragerString= _FirstbracketdiyaVangbo[0].split("\\ ");//public[0],int[1],add[2] ,_FirstbracketeragerString[]
                int _SecondArraylength = _FirstbracketeragerString.length;//length = 3
                System.out.println(_FirstbracketeragerString[_SecondArraylength-1]/*add*/ + "(" + _FirstbracketdiyaVangbo[1]/*int a, int b)*/ + ", return type :  " + _FirstbracketeragerString[_SecondArraylength-2]/*int*/);
            }
        }
    }
}