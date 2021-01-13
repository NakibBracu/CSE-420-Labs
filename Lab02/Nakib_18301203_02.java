import java.util.*;
import java.io.*;
public class Nakib_18301203_02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan_kori;
        String s = null;
        scan_kori = new Scanner(new File("input.txt"));
        int in_total_Line = Integer.parseInt(scan_kori.nextLine());
        System.out.println(in_total_Line);
        for (int i = 0; i < in_total_Line; i++) {
            s = scan_kori.nextLine();
            boolean result_at_the_end = false;
            String identity_type = null; 
            if (s.contains("@")) {
                identity_type = "email";
            } else if (!(s.contains("@")) && (s.contains("."))) {
                identity_type = "web";
            }
            if (identity_type == "web") {
                String[] category_web = s.split("\\.");
                int total_category_web = 0;
                for (int j = 0; j < category_web.length; j++) {
                    char[] charArrayforWeb = category_web[j].toCharArray();
                    boolean charArrayResult = false;
                    for (int k = 0; k < charArrayforWeb.length; k++) {
                        if (charArrayforWeb[k] >= 'A' && charArrayforWeb[k] <= 'Z' || charArrayforWeb[k] >= 'a' && charArrayforWeb[k] <= 'z' || charArrayforWeb[k] >= '0' && charArrayforWeb[k] <= '9') {
                            charArrayResult = true;
                        } else {
                            charArrayResult = false;
                        }
                    }
                    if (charArrayResult == true) {
                        total_category_web++;
                    }
                }
                if (total_category_web == category_web.length) {
                    result_at_the_end = true;
                } else {
                    result_at_the_end = false;
                }
            } else if (identity_type == "email") {
                String[] Mail_arr = s.split("\\@");
                // System.out.println("Mail_arr_length"+Mail_arr.length);
                String[] Mail_arrAgain = null;
                int Mail_arrAgainLength = 0;
                int countMail = 0;
                int countMail2 = 0;
                for (int j = 0; j < Mail_arr.length; j++) {   
                    if (!(Mail_arr[j].contains("."))) { 
                        char[] chArr_Mail = Mail_arr[j].toCharArray();
                        boolean charArrayResult = false;
                        for (int k = 0; k < chArr_Mail.length; k++) {
                            if (chArr_Mail[k] >= 'A' && chArr_Mail[k] <= 'Z' || chArr_Mail[k] >= 'a' && chArr_Mail[k] <= 'z' || chArr_Mail[k] >= '0' && chArr_Mail[k] <= '9') {
                                charArrayResult = true;
                            } else {
                                charArrayResult = false;
                            }
                        }
                        if (charArrayResult == true) {
                            countMail++;
                        }   
                    } else if (Mail_arr[j].contains(".")) {
                        Mail_arrAgain = Mail_arr[j].split("\\."); 
                       // System.out.println("Mail_arrAgainlength"+Mail_arrAgain.length);
                        Mail_arrAgainLength = Mail_arrAgain.length;
                        for (int l = 0; l < Mail_arrAgain.length; l++) {
                            char[] chArr_MailAgain = Mail_arrAgain[l].toCharArray();
                            boolean charArrayResultAgain = false;
                            for (int m = 0; m < chArr_MailAgain.length; m++) {
                                if (chArr_MailAgain[m] >= 'A' && chArr_MailAgain[m] <= 'Z' || chArr_MailAgain[m] >= 'a' && chArr_MailAgain[m] <= 'z' || chArr_MailAgain[m] >= '0' && chArr_MailAgain[m] <= '9') {
                                    charArrayResultAgain = true;
                                } else {
                                    charArrayResultAgain = false;
                                }
                                if (charArrayResultAgain == true) {
                                    countMail2++;
                                }
                            }
                        }  
                    }
                    if ((countMail+countMail2) == (Mail_arr.length + Mail_arrAgainLength - 1)) {
                        result_at_the_end = true;
                    } else {
                        result_at_the_end = false;
                    } 
                }
            }
             String msg =  (result_at_the_end) ? (identity_type + ", " + (i + 1)) : ("email" + ", " + (i + 1));
             System.out.println(msg); 
             
            
        }
    } 
}