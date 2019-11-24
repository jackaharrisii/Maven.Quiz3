package rocks.zipcode.io.quiz3.generics;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<E> {
    private final E[] array;

    public ArrayUtility(E[] array) {
        this.array = array;
    }

    // OLD WAY
//    public E findOddOccurringValue(){
//        for (E value : array){
//            if (getNumberOfOccurrences(value)%2 == 1) return value;
//        }
//        return null;
//    }

    // WITH STREAMS
    public E findOddOccurringValue() {
        return Arrays.stream(array).filter(thing -> getNumberOfOccurrences(thing)%2 == 1).findFirst().get();
//        return Stream.of(E).filter(E -> getNumberOfOccurrences(E)%2 == 1);
    }

    // OLD WAY
//    public E findEvenOccurringValue() {
//        for (E value : array){
//            if (getNumberOfOccurrences(value)%2 == 0) return value;
//        }
//        return null;
//    }

    // WITH STREAMS
    public E findEvenOccurringValue() {
        return Arrays.stream(array).filter(thing -> getNumberOfOccurrences(thing)%2 == 0).findFirst().get();
    }

    // OLD WAY
//    public Integer getNumberOfOccurrences(E valueToEvaluate) {
//        Integer count = 0;
//        for (int i = 0; i < array.length; i++){
//            if (array[i].equals(valueToEvaluate)) count++;
//        }
//        return count;
//    }

    // WITH STREAMS
    public Integer getNumberOfOccurrences(E valueToEvaluate) {
        return (int)Arrays.stream(array).filter(thing -> thing == valueToEvaluate).count();
    }

    // OLD WAY
//    public E[] filter(Function<E, Boolean> predicate){
//        E[] filteredList = array.clone();
//        int index = 0;
//        for (E thing : array) {
//            // if the thing in the array meets the conditions of the predicate, write it over the next available index in the new array
//            if (predicate.apply(thing)){
//                filteredList[index] = thing;
//                index++;
//            }
//        }
//        //return a copy of the original array, but with the fat trimmed to length = index (i.e., just the new stuff)
//        return Arrays.copyOf(filteredList, index);
//    }

    // WITH STREAMS
    public E[] filter(Function<E, Boolean> predicate) {
        return Arrays.stream(array).filter(predicate::apply).collect(Collectors.toList()).toArray(Arrays.copyOf(array, 0));
    }
}
