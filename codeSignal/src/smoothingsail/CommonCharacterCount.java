package smoothingsail;

public class CommonCharacterCount {
    //Mô tả: ta duyệt từng phần tử của s2, nếu có xuất hiện trong s1 thì tăng result và xoá phần tử đó trong s1 đi.
    public int solution(String s1, String s2) {
        int result = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.indexOf(s2.charAt(i)) != -1){
                result++;
                s1 = s1.replaceFirst(String.valueOf(s2.charAt(i)), " ");
            }
        }
        return result;
    }
}
