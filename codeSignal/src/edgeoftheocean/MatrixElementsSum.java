package edgeoftheocean;

import java.util.ArrayList;
import java.util.List;

public class MatrixElementsSum {
    //Mô tả: ta sẽ tạo 1 cái list checkHaunt để kiểm tra xem có ma không, duyệt lần lượt từng phần tử theo hàng nếu phần tử đó có cột nằm trong list thì bỏ qua.
    public int solution(int[][] matrix) {
        int sum = 0;
        List<Integer> checkHaunt = new ArrayList();
        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[0].length; j++){
                if (checkHaunt.contains(j));
                else if ((matrix[i][j] == 0)){
                    checkHaunt.add(j);
                }
                else sum+= matrix[i][j];
            }
        }
        return sum;
    }
    //Thay vì việc tạo list để lưu cột nào có ma, ta thực hiện duyệt theo cột từ trên xuống, gặp ma thì bỏ qua hết các phòng còn lại
    public int imporveSolution(int[][] matrix){
        int sum = 0;
        for (int column = 0; column < matrix[0].length; ++column)
            for (int row = 0; row < matrix.length; ++row) {
                if (matrix[row][column] > 0)
                    sum+=matrix[row][column];
                else break;
            }
        return sum;
    }
}
