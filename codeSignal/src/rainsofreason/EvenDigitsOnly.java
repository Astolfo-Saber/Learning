package rainsofreason;

public class EvenDigitsOnly {
    public boolean solution(int n){
        String input = String.valueOf(n);
        for (int i = 0; i <input.length(); i++) {
            if (input.charAt(i) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
