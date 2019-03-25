package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType someType : array) {
            if (getNumberOfOccurrences(someType) % 2 != 0) {
                return someType;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType someType : array) {
            if (getNumberOfOccurrences(someType) % 2 == 0) {
                return someType;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return Collections.frequency(Arrays.asList(array), valueToEvaluate);
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return Arrays.stream(array).filter(predicate::apply)
                .toArray(size -> (SomeType[]) Array.newInstance(array.getClass().getComponentType(), size));
    }
}
