package Pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Home on 26.12.2020.
 */
public class StringPart1 {
    public static void showAZ() {
        for (char A = 65; A < 91; A++) {
            System.out.print(A);}
    }
    public static void showza(){
        for (char z=122;z>96;z--){
            System.out.print(z);
        }
    }
    public static void showRus(){
        for (char rus =1072;rus<1103;rus++) {
            System.out.print(rus);
        }
    }
    public static void showNumb(){
        for (char Numb=49;Numb<58;Numb++){
            System.out.print(Numb);}
    }
    public static void All(){
        for (char AllSymb=32;AllSymb<256;AllSymb++){
            System.out.print(AllSymb);}
    }
    }

