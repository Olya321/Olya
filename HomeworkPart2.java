/**
 * Created by Home on 09.12.2020.
 */
public class HomeworkPart2 {
    public static String sumAndCount(){
        int count =0;
        int sum =0;
        for (int i=1;i<100;i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }
        String str ="Количество четных чисел равно "+count+",а сумма равна "+sum;
        return str;



        }
    public static int Factorial(int n){
        int result =1;
        for(int i=1;i<=n;i++){
            result*=i;}
            return result;
    }


    public static int sumNum(int i){
        int suma =0;
        String str=Integer.toString(i);
        int A=str.length();
        int AA = (int) Math.pow(10,(A-1));
        int B=A-1;
        for(;B>=0;B--)
        {
            suma =suma+ (i-(i%AA))/AA;
            i=i%AA;
            AA = (int)Math.pow(10,(B-1));}
        return suma;
    }

}




