public class GarbageEx {
    public static void main(String[] args){
        //a를 선언하고 이후에 null 입력 후 "Good"은 다시 사용되지 않음(가비지 발생), c는 똑같이 null을 입력했지만 d에서 참조
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;

        a = null;
        d = c;
        c= null;
    }
}
