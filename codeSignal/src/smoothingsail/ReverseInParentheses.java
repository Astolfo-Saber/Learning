package smoothingsail;

import java.util.ArrayList;
import java.util.List;

public class ReverseInParentheses {
//    public String solution(String inputString){
//        List<String> list = new ArrayList<String>();
//        StringBuilder output = new StringBuilder();
//        String oldInput = "";
//        int count = 0;
//        for (int i = 0; i < inputString.length(); i++){
//            if (inputString.charAt(i) == '('){
//                count ++;
//            }
//            if (count > 0){
//                if (inputString.charAt(i) != '(' && inputString.charAt(i) != ')'){
//                    oldInput += inputString.charAt(i);
//                }
//            }
//            if (inputString.charAt(i) == ')'){
//                count --;
//            }
//            if (count == 0 && oldInput != ""){
//                list.add(oldInput);
//                oldInput = "";
//            }
//        }
//        for (int i = 0; i < list.size();i++) {
//            output.append(list.get(i));
//            inputString = inputString.replace(list.get(i),output.reverse());
//            output.setLength(0);
//        }
//        for (int i = 0; i < inputString.length(); i++) {
//            if (inputString.charAt(i) != '(' && inputString.charAt(i) != ')'){
//                oldInput += inputString.charAt(i);
//            }
//        }
//        return oldInput;
//    }
    //Mô tả: Cho lặp đến khi không tìm thấy ( nữa thì dừng. Xử lí cái ngoặc trong nhất bằng cách lấy ( cuối cùng và đóng ngoặc đầu tiên kể từ nó.
//          Replace từ vị trí ( đến ) tạo một chuỗi con trong khoảng đó nhưng không lấy dấu (), reverse lại là xong;
    public String improveSolution(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while(str.indexOf("(") != -1){
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
        }
        return str.toString();
    }
}
