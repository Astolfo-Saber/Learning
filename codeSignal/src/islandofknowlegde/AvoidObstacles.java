package islandofknowlegde;

public class AvoidObstacles {
    //Mô tả: tạo bước nhảy, lần lượt check xem mảng có chia hết cho bước nhảy không,
    // đến khi không còn phần tử chia hết là qua.
    public int solution(int[] inputArray) {
        int jump = 1;
        boolean fail = true;
        while(fail) {
            jump++;
            fail = false;
            for(int i=0; i<inputArray.length; i++)
                if(inputArray[i]%jump==0) {
                    fail = true;
                    break;
                }
        }
        return jump;
    }

}
