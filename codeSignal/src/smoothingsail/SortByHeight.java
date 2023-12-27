package smoothingsail;

import java.util.ArrayList;
import java.util.Collections;

public class SortByHeight {
    //Mô tả: đưa số người tham gia vào list để sắp xếp, xét hàng ban đầu, nếu không phải cây thì cho người từ list vào
    public int[] solution(int[] a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i:a) {
            if (a[i] != -1){
                list.add(a[i]);
            }
        }
        Collections.sort(list);
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1){
                a[i] = list.get(index++);
            }
        }
        return a;
    }
}
