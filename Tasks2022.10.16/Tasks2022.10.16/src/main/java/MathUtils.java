public class MathUtils {
    int array[] = {3,6,8,7,1,0};
    public static void arraySum(int array[]){

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }


    }
    public static int arrayMean(int array[]){

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }
    public static int numberOfElements(int a, int b,int array[]){

        int count =0;
        for (int i = 0; i < array.length; i++) {
            if(a <= array[i] && b >= array[i] ){
                count++;

            }
        }
        return count;
    }
    public static int lengthBetweenElements(int[] array){
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex= 0;
        for (int i = 0; i < array.length; i++) {
            int countMax = array[i];
            if(max < countMax){
                max = countMax;
                maxIndex= i;
            }
            int countMin = array[i];
            if(min > countMin){
                min = countMin;
                minIndex = i;

            }

        }
        int spacing = maxIndex - minIndex;
        if(spacing < 0){
            spacing = spacing *-1;
        }

        return spacing;

    }


}
