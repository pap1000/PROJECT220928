class Calc {
    //삼항연산자 결과에 따라 다른 값을 return
    public static int abs(int a){return a>0?a:-a;}
    public static int max(int a, int b){return (a>b?a:b);}
    public static int min(int a, int b){return (a>b)?b:a;}
}

public class CalcEx{
    public static void main(String[] args){
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.min(-3, -8));
    }
}
