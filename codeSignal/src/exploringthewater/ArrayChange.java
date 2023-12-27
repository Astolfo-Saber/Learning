package exploringthewater;

public class ArrayChange {
    public int solution(int[] inputArray) {
        //Mô tả: vì cần chi phí bé nhất để tạo dãy tăng dần nên số sau chỉ cần lớn hơn số trước
        // 1. Vậy nên chi phí sẽ bằng số trước + 1 - số sau. Còn số sau thành số trước +1
        int result = 0;
        for (int i = 0; i < inputArray.length - 1; i++){
            if (inputArray[i]>= inputArray[i+1]){
                result += inputArray[i]+ 1 - inputArray[i+1];
                inputArray[i+1] = inputArray[i] + 1;
            }
        }
        return result;
    }

}
