import java.util.Scanner;

class CurrencyConverter {
    private static double rate;     //원화 환율
    //원화를 달러로 환산
    public static double toDollar(double won){
        return won/rate;
    }
    //달러를 원화로 환산
    public static double toKWR(double dollar){
        return dollar*rate;
    }
    //환율 설정
    public static void setRate(double r){
        rate = r;
    }
}

public class StaticMember{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("환율(1달러)>>");

        //환율 입력
        double rate = scanner.nextDouble();
        CurrencyConverter.setRate(rate);
        //100만원을 달러로, 100달러를 원으로 환산 후 출력
        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
        System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");

        scanner.close();
    }
}
