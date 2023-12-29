package rainsofreason;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayReplace {
    public int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        int[] result = new int[inputArray.length];
        for (int i = 0; i< inputArray.length; i++){
            if(inputArray[i] == elemToReplace){
                result[i] = substitutionElem;
            }else{
                result[i] = inputArray[i];
            }
        }
        return result;
    }
}
