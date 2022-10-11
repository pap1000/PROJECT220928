import java.util.Scanner;

class Player{
    String name;
    String getWordFromUser(){
        Scanner scanner2 = new Scanner(System.in);
        String word = scanner2.next();
        return word;
    }
}

public class WordGameApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        String word = "아버지";

        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        n = scanner.nextInt();
        Player players[] = new Player[n];
        for(int i=0; i<n; i++)
            players[i] = new Player();
        for(int i=0; i<n; i++){
            System.out.print("참가자의 이름을 입력하세요>>");
            players[i].name = scanner.next();
        }

        System.out.println("시작하는 단어는 아버지입니다");

        int last = word.length()-1;
        char lastC;
        char firstC;

        int i = 0;
        do{
            if(i==n)
                i = 0;
            System.out.print(players[i].name + ">>");
            lastC = word.charAt(last);
            word = players[i].getWordFromUser();
            firstC = word.charAt(0);
            last = word.length()-1;
            i++;
        }while(lastC==firstC);
        if(i==0)
            i = n-1;
        System.out.println(players[i-1].name + "이 졌습니다.");
    }
}
