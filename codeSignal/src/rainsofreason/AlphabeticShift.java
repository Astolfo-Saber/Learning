package rainsofreason;

import java.util.ArrayList;
import java.util.List;

public class AlphabeticShift {
    public String solution(String inputString) {
        char[] result = inputString.toCharArray();
        for (int i = 0; i < result.length; i++){
            result[i]++;
            if (result[i] > 'z'){
                result[i] = 'a';
            }
        }
        return new String(result);
    }
    public String improveSolution(String inputString){
        return new String(inputString.chars().map(x -> (x - 'a' + 1) % 26 + 'a').toArray(), 0, inputString.length());
    }
}
