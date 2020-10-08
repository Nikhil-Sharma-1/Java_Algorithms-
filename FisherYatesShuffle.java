/** This class implements the fisher yates method of shuffling an array */

import java.util.Arrays;
import java.util.Random;

public class FisherYatesShuffle{
    

    /** shuffles an array */
    public static <T> void shuffle(T[] toShuffle){

        Random rand = new Random();

        for(int i = 0; i <= toShuffle.length - 1; i++){
            int j = i + rand.nextInt(toShuffle.length - i);

            T temp = toShuffle[i];
            toShuffle[i] = toShuffle[j];
            toShuffle[j] = temp;

        }
    }


    /** tests the implemention of the shuffle */
    public static void test(){
        

        Integer[] test = new Integer[50];

        for(int i = 0; i < test.length; i++){
            test[i] = i;
        }
        
        shuffle(test);

        System.out.print("This should be shuffled " + Arrays.asList(test));

    }
}