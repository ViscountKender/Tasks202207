public class MathUtils {
    public static void arraySum(){
        int array[] = {3,6,8,7,1,0};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }


    }
    public static int arrayMean(){
        int array[] = {0,21,54,11,2};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }
    public static int numberOfElements(int a, int b){

        int[] array = {0,2,5,4,8,4,10,20,21,30};
        int count =0;
        for (int i = 0; i < array.length; i++) {
            if(a <= array[i] & b >= array[i] ){
                count++;

            }
        }
        return count;
    }
    public static int spacingBetweenElements(int[] array){
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
