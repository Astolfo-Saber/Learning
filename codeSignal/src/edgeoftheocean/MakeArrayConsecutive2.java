package edgeoftheocean;

import java.util.Arrays;

public class MakeArrayConsecutive2 {
    //Mô tả: khá đơn giản, ta tìm số tượng nằm giữa max và min sau đó trừ đi số tượng ở giữa ban đầu
    public int solution(int[] statues) {
        Arrays.sort(statues);
        return statues[statues.length - 1] - statues[0] + 1 - statues.length;
    }
}
