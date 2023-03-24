public class Min_in_array {
    public static void main(String[] args) {
     int[] array = {1,2,3,4,5};
     int index = minValue(array);
        System.out.println("Min = " + array[index]);
    }
    public static int minValue (int[] arr){
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (min> arr[i]){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
