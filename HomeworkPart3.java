/**
 * Created by Home on 09.12.2020.
 */
public class HomeworkPart3 {
    public static int minFromArray() {
        int[] array = {8, 8, 9, 9,};
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > minValue) {
                minValue = array[i];
            }
            System.out.println(minValue);
        }

        return minValue;
    }}
