package exploringthewater;

import java.util.*;

public class PalindromeRearranging {
    //Mô tả: vì ta có thể hoán vị tự do nên ta sẽ chỉ cần kiểm tra tần suất của các phần tử trong dãy
    // Duyệt lần lượt các phần tử của dãy, nếu chưa có add vào list, có rồi thì remove lấy kết quả là độ dài list
    public boolean solution(String inputString) {
        Set<Character> palindrome = new HashSet<Character>();
        for (int i = 0; i < inputString.length();  ++i) {
            if (palindrome.contains(inputString.charAt(i))) {
                palindrome.remove(inputString.charAt(i));
            }
            else {
                palindrome.add(inputString.charAt(i));
            }
        }
        return palindrome.size() <= 1;
    }
}
