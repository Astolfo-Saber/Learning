package throughthefog;

public class StringRearrangement {
    public boolean solution(String[] inputArray) {

        boolean[] used = new boolean[inputArray.length];
        findSequence(inputArray, null, used, 0);
        return success;
    }

    private boolean success = false; // modified by findSequence

    // recursive backtracking procedure to find admissible
// sequence of strings in the array. String prev is the
// previous string in the sequence, used[] keeps track
// of which strings have been used so far, and n is the
// current length of the sequence.
    private void findSequence(String[] a, String prev, boolean[] used, int n) {
        if (n == a.length) {
            success = true;
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (!used[i] && (prev == null || differByOne(prev, a[i]))) {
                used[i] = true;
                findSequence(a, a[i], used, n+1);
                used[i] = false;
            }
        }
    }

    private boolean differByOne(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }

}
