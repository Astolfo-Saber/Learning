package islandofknowlegde;

public class ArrayMaximalAdjacentDifference {
    public int solution(int[] inputArray) {
        int abs = 0;
        for (int i = 0; i < inputArray.length - 1; i++){
            if (Math.abs(inputArray[i] - inputArray[i+1]) >= abs){
                abs = Math.abs(inputArray[i] - inputArray[i+1]);
            }
        }
        return abs;
    }
}
