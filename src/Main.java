import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int solution(int[][] matrix) {
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
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        List<Integer> listInt = new LinkedList<>();
//        listInt.add(1);
//        listInt.add(2);
//        listInt.add(0);
//        listInt.add(0);
//        listInt.add(4);
//        listInt.add(1);
//        Iterator<Integer> iterator = listInt.iterator();
//        //listInt.remove(1);
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println(listInt.indexOf(1));
//        Set<Integer> hashsetInteger = new HashSet<>();
//        hashsetInteger.add(41);
//        hashsetInteger.add(1);
//        hashsetInteger.add(0);
//        hashsetInteger.add(8);
//        hashsetInteger.add(1);
//        hashsetInteger.add(2);
//        hashsetInteger.add(10);
//        hashsetInteger.add(899);
//        hashsetInteger.add(23);
//        hashsetInteger.add(234);
//        hashsetInteger.add(12);
//        hashsetInteger.add(64);
//        hashsetInteger.add(50);
//        hashsetInteger.add(242);
//        hashsetInteger.add(1201);
//        hashsetInteger.add(3);
//        hashsetInteger.add(129);
//        hashsetInteger.add(393);
//
//        // khai báo Set Interface tên treesetInteger
//        // và sử dụng Class là TreeSet để triển khai
//        // TreeSet là 1 Class Collection
//        // các phần tử trong treesetInteger cũng có kiểu là Integer
//        Set<Integer> treesetInteger = new TreeSet<>();
//        treesetInteger.add(41);
//        treesetInteger.add(1);
//        treesetInteger.add(0);
//        treesetInteger.add(8);
//        treesetInteger.add(1);
//        treesetInteger.add(2);
//        treesetInteger.add(10);
//
//        System.out.println("Các phần tử có trong hashsetInteger: ");
//        System.out.println(hashsetInteger);
//        System.out.println("Các phần tử có trong treesetInteger: ");
//        System.out.println(treesetInteger);
        int[][] matrix = {{1,1,1,0},
                        {0,5,0,1},
                        {2,1,3,10}};
        System.out.println(solution(matrix));
    }
}