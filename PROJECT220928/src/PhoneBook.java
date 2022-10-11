import java.util.Scanner;

class Phone{
    private String name, tel;

    Phone(String n, String t){
        this.name = n;
        this.tel = t;
    }
    public String getName(){
        return name;
    }
    public String getTel(){
        return tel;
    }
}

public class PhoneBook {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("인원수 >>");
        int n = scanner.nextInt();
        Phone pbook[] = new Phone[n];

        for(int i=0; i < n; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();
            pbook[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        while(true){
            System.out.print("검색할 이름>>");
            String name = scanner.next();
            int noResult = 0;

            for(int i=0; i<n; i++){
                if(name.equals(pbook[i].getName())){
                    System.out.println(name + "의 번호는 " + pbook[i].getTel()+ "입니다.");
                    i--;
                    break;
                }
                noResult++;
            }
            if(name.equals("그만"))
                break;
            if(noResult==n)
                System.out.println(name + "이 없습니다.");
        }
        scanner.close();
    }
}
