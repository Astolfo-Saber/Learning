package throughthefog;

public class DepositProfit {
    public int solution(int deposit, int rate, int threshold) {
        int year = 0;
        double result = deposit;
        while (result < threshold){
            year++;
            result += result * rate /100;
        }
        return year;
    }
    public int improveSolution(int deposit, int rate, int threshold) {
        return (int)Math.ceil(Math.log((double)threshold / deposit) / Math.log(1 + (rate / 100.0)));
    }

}
