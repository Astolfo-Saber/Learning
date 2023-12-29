package rainsofreason;

public class ChessBoardCellColor {
    public boolean solution(String cell1, String cell2) {
        char[] check1 = cell1.toCharArray();
        char[] check2 = cell2.toCharArray();
        if (Math.abs((check1[0]) - (check2[0])) % 2 == Math.abs((check1[1]) - (check2[1])) % 2){
            return true;
        }
        return false;
    }
    public boolean improveSolution(String cell1, String cell2){
        return Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2;
    }
}
