package exploringthewater;

public class AlternatingSums {
    //Mô tả: Duyệt mảng phần tử chẵn vào team 1, lẻ vào team 2
    int[] solution(int[] a){
        int teamOne = 0;
        int teamTwo = 0;
        for (int i = 0; i < a.length; i++){
            if (i % 2 == 0){
                teamOne+= a[i];
            }else{
                teamTwo+= a[i];
            }
        }
        int [] result = {teamOne, teamTwo};
    return result;
    }
}
