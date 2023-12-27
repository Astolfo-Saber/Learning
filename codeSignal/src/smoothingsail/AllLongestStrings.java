package smoothingsail;

import java.util.ArrayList;

public class AllLongestStrings {
    //Mô tả: ta sử dụng một arrayList để kiểm soát kết quả, duyệt lần lượt mảng, nếu độ dài bằng maxLength thì thêm vào list
    // nếu kí tự đó lớn hơn maxLength thì ta cập nhật lại maxLength và xoá hết list đi để list chỉ chứa những string dài nhất
    public String[] solution(String[] inputArray) {
        ArrayList<String> list = new ArrayList<>();
        int maxLength = inputArray[0].length();
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i].length() > maxLength){
                list.removeAll(list);
                maxLength = inputArray[i].length();
                list.add(inputArray[i]);
            }
            else if (inputArray[i].length() == maxLength){
                list.add(inputArray[i]);
            }
        }
        String[] result = list.toArray(new String[0]);
        return result;
    }
    //Ta sẽ thêm - vào cuối phần tử đầu tiên của list, lúc này vị trí của - chính là độ dài của phần tử lớn nhất,
    // nếu == thì thêm vào list, nếu nhỏ hơn thì reset list rồi thêm phần tử mới vào
    public String[] improveSolution(String[] inputArray) {
        String list = "";
        for( String s: inputArray )
        {
            if( list.indexOf("-") == s.length() ) list += s + "-";
            else if ( list.indexOf("-") < s.length() ) list = s + "-";
        }

        return list.split( "-" );
    }
}
