import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class provides an implementation of the Selection Sort algorithm for
 * lists and arrays of any comparable type class
 * 
 * https://de.wikipedia.org/wiki/Selectionsort
 */

public class SelectionSort {
    
    /**Tests the algorithm with an array with Integers ranging from 0 to 99 */
    public static void test(){
        
        ArrayList<Integer> testList = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            testList.add(i);
        }

        Collections.shuffle(testList);

        Integer[] testArray = testList.toArray(new Integer[0]);

        sort(testList);
        sort(testArray);

        System.out.println(testList);
        for(int i = 0; i < testArray.length; i++){
            System.out.printf("%d ", testArray[i]);
        }

    }

    public static <T extends Comparable<T>> void sort(List<T> toSort){
        int highestIndex = toSort.size() - 1;
        int insertIndex = 0;
        int minPosition;

        do{
            minPosition = insertIndex;

            for(int i = insertIndex + 1; i <= highestIndex; i++){
                if(toSort.get(i).compareTo(toSort.get(minPosition)) < 0){
                    minPosition = i;
                }
            }

            Collections.swap(toSort, minPosition, insertIndex);
            insertIndex++;

        }while(insertIndex < highestIndex);

    }

    public static <T extends Comparable<T>> void sort(T[] toSort){
        sort(Arrays.asList(toSort));
    }

}
