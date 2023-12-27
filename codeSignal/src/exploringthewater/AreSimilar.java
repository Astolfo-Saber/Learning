package exploringthewater;

import java.util.Arrays;

public class AreSimilar {
    //Mô tả: vì chỉ được hoán vị 1 lần, thế nên số phần tử khác nhau ở 2 dãy tối đa là 2 ( 1 cặp hoán vị)
    //Sau đó ta kiểm tra xem 2 dãy có phần tử gống nhau không phòng trường hợp 2 phần tử khác nhau ở 2 dãy là 4 số 3 4 số khác nhau
    public boolean solution(int[] a, int[] b) {
        int result = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] != b[i])
                result++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return result <= 2 && Arrays.equals(a, b);
    }
    public boolean improveSolution(int[] a, int[] b){
        int result = 0;
        int multiplierOne = 1;
        int multiplierTwo = 1;
        for (int i = 0; i < a.length; i++){
            if (a[i] != b[i]) {
                result++;
                multiplierOne *= a[i];
                multiplierTwo *= b[i];
            }
        }
        return result < 3 && multiplierOne == multiplierTwo;
    }
}
