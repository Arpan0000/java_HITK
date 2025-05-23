import java.util.Arrays;


public class sortingGeneric {

    public static <T extends Comparable<T>> void sortArray(T[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j].compareTo(array[j + 1]) > 0) {
                    
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        Integer[] intArray = {5,4,8,1,8,9,4,264};
        String[] strArray = {"B","A","a","b","X","y"};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));

        sortArray(intArray);
        sortArray(strArray);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));
    }
}