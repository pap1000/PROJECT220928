import java.util.Scanner;

class Dictionary{
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String s){
        for(int i=0; i < kor.length; i++) {
            if (s.equals(kor[i])) {
                if(s=="아기" || s=="미래")
                    System.out.print(s + "는 ");
                else
                    System.out.print(s + "은 ");
                return eng[i];
            }
        }
        return "false";
    }
}

public class DicApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");

        while(true){
            System.out.print("한글 단어?");
            String word = scanner.next();
            String search = Dictionary.kor2Eng(word);

            if(word.equals("그만"))
                break;
            if(search.equals("false"))
                System.out.println(word + "는 저의 사전에 없습니다.");
            else
                System.out.println(search);
        }
    }
}
