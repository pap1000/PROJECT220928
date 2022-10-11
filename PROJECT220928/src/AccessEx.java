class Sample{
    public int a;
    private int b;
    int c;
}

public class AccessEx {
    public static void main(String[] args){
        Sample s = new Sample();
        s.a = 10;
        //s.b = 10;   //private으로 선언되어 현재 클래스에서 접근불가
        s.c =10;
    }
}
