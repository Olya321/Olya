/**
 * Created by Home on 09.12.2020.
 */
public class Homework {
    public static  int task1(int a,int b){
        int result;
        if (a%2==0){result =a*b;} else {result =a+b;}
        return result;
    }



    public static String task2(int x,int y){
        String str= new String();

        if (x>0){
            if (y>0){str ="Точка принадлежит первой четверти ";}
            else {str ="Точка принадлежит второй четверти ";
        }
    }
        if(x<0) {if (y>0){str="Точка принадлежит четвертой четверти";}
            else {str="Точка принадлежит третьей четверти";}}
if (x==0){if (y==0){ str="Точка лежит в начале координат";}
    else {str="Точка лежит на оси 0x";}}
        if (y==0){str="Точка лежит на оси 0y";}


    return str;
    };
    public static int task3(int a,int b,int c){
        int result =0;
        if (a>0){result+=a;}
        if (b>0){result+=b;}
        if (c>0){result+=c;}
    return  result;}


    public static char task4(int a){
        char mark='F';
        if (a<=100){mark ='A';}
        if (a<=89){mark ='B';}
        if (a<=74){mark= 'C';}
        if (a<=59){mark='D';}
        if (a <=39){mark ='E';}
        if (a<=19){mark ='F';}
        else {System.out.println("Необходимо число от 1 до 100");
        }
        return mark;
}
}







