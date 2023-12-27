package edgeoftheocean;

public class AlmostIncreasingSequence {
    //Mô tả: ta dùng biến bad để thể hiện số lần phần tử sau nhỏ hơn phần tử trước, nếu trường hợp đó xảy ra,
    // cần kiểm tra thêm phần tử đó có lớn hơn phần tử i+2 không, và phần tử i -1 có lớn hơn i+1 không vì ta có thể bỏ đi 1 phần tử đê dãy vẫn là dãy tăng dần
    public boolean solution(int[] sequence) {
        int bad = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] - sequence[i+1] >= 0) {
                bad += 1;
                if (i - 1 >= 0 && i + 2 <= sequence.length - 1
                        && sequence[i] - sequence[i+2] >= 0
                        && sequence[i-1] - sequence[i+1] >= 0) {
                    return false;
                }
            }
        }
        return bad <= 1;
    }
}
