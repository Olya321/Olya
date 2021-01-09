package Pack1;
import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.*;

/**
 * Created by Home on 26.12.2020.
 */
public class StringPart3 {




public static int minWorld(String s){
    String[] Ss=s.split(" ");
    int min =100;
    for (String i :Ss){
        if (i.length()>0&&i.length()<min)
            min =i.length();
    };return min;}



public static int Howmanywords(){
    System.out.println("Enter your sentence!");
    Scanner scanner=new Scanner(System.in);
    String s=scanner.nextLine();
    int count =(s.split("[\\w-]+").length);////w любой azAZ09 +один или несколько символов предшест.элемента
    System.out.println(count);
    return count;
    }

public static String DeleteWord(String start){
    String []startArray=start.split("[\\s\\. ,!?]");
    int lenght =startArray.length;
    startArray[lenght-1]="";
    StringBuilder stringBuilder=new StringBuilder();
    for (int i=0;i<lenght;i++){
        stringBuilder.append((startArray[i]+" "));}
    return stringBuilder.toString();

    }
    public static String reverse(String start) {
        char[]charArray=start.toCharArray();
        int begin=0;
        int end=charArray.length-1;
        char a;
        while (end>begin){
            a=charArray[begin];
            charArray[begin]=charArray[end];
            charArray[end]=a;
            end--;
            begin++;
        }return new String(charArray);

        }
    }











