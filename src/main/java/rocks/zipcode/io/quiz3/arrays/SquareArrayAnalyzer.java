package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        for (Integer integer : inputArray) {
            if(!isSqaure(integer, squaredValues)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSqaure(Integer integer, Integer[] squaredValues) {
        for (Integer squaredValue : squaredValues) {
            if(integer.equals(squaredValue) || integer*integer == squaredValue) {
                return true;
            }
        }
        return false;
    }
}
