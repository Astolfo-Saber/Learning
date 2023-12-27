package edgeoftheocean;

public class ShapeArea {
    //Mô tả: Ta nhận thấy hình to hơn bao gồm 1 hình bé cộng thêm số lượng ô vuông tạo cạnh mới, vì vậy ta suy ra công thức tính cạnh mới, cộng thêm với hình cũ bằng cách đệ qui
    public int solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 5;
        return n*n - (n-2)*(n-2) + solution(n-1);
    }
    //Đơn giản hơn, ta tìm công thức tính diện tích hình
    public int improveSolution(int n) {
        return (n*n)+( (n-1)*(n-1) );
    }
}
