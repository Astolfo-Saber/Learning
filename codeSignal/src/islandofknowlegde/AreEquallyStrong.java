package islandofknowlegde;

public class AreEquallyStrong {
    //Mô tả: kiểm tra xem 2 người có khoẻ như nhau không, và tay của họ có khoẻ như nhau không
    public boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return yourLeft+yourRight == friendsLeft+friendsRight && (yourLeft == friendsLeft || yourLeft == friendsRight);
    }
}
