package smoothingsail;

public class IsLucky {
    public boolean solution(int n){
        //Mô tả: chia đôi số đó ra rồi cộng tổng 2 bên để so sánh
        int median = 0;
        int left = 0, right = 0;
        String input = String.valueOf(n);
        if (input.length() % 2 == 0) {
            median = input.length() / 2;
            for (int i = 0; i < median; i++){
                left += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
            for (int i = median; i < input.length(); i++){
                right += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        else {
            median = (input.length() + 1) / 2;
            for (int i = 0; i < median; i++){
                left += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
            for (int i = median - 1; i < input.length(); i++){
                right += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        return left == right;
    }
    //chuyển dãy số thành chuỗi, duyệt 1 nửa chuỗi đó, lấy phần tử đầu trừ phần tử cuối, duyệt xong kết quả bằng 0 là đúng
    boolean imporveSolution(int n) {
        String s = n+"";
        int sum = 0;

        for(int i=0; i<s.length()/2; i++)
            sum+=(s.charAt(i)-s.charAt(s.length()-1-i));

        return sum==0;
    }
}
