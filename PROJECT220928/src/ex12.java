import java.util.Scanner;

class Concert{
    private Scanner scanner;
    private String S[], A[], B[];
    Concert() {
        scanner = new Scanner(System.in);
        S = new String[10];
        A = new String[10];
        B = new String[10];

        for(int i=0; i<10; i++)
            S[i] = A[i] = B[i] = "___";
    }
    public static void printLine(String s[]) {
        for(int i=0; i<10; i++) {
            System.out.print(" " + s[i] + " " );
        }
        System.out.println();
    }
    public void showSeat() {
        System.out.print("S>>");
        Concert.printLine(S);
        System.out.print("A>>");
        Concert.printLine(A);
        System.out.print("B>>");
        Concert.printLine(B);

        System.out.println("<<<조회를 완료하였습니다.>>>");
    }
    public void reserve() {
        while(true) {
            System.out.print("좌석구분 S(1), A(2), B(3)>>");
            int menu = scanner.nextInt();

            switch(menu) {
                case 1:
                    System.out.print("S>>");
                    printLine(S);
                    name(S);
                    return;
                case 2:
                    System.out.print("A>>");
                    printLine(A);
                    name(A);
                    return;
                case 3:
                    System.out.print("B>>");
                    printLine(B);
                    name(B);
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
    public void name(String seat[]) {
        System.out.print("이름>>");
        String name = scanner.next();

        while(true) {
            System.out.print("번호>>");
            int n = scanner.nextInt();
            if(1 <= n && n <= 10) {
                n--;
                if (seat[n].equals("___")) {
                    seat[n] = name;
                    break;
                } else {
                    System.out.println("이미 예약된 자리입니다.");
                }
            }
            else
                System.out.println("잘못된 입력입니다.");
        }
    }
    public void cancel() {
        while(true) {
            System.out.print("좌석 S:1, A:2, B:3>>");
            int menu = scanner.nextInt();
            switch(menu) {
                case 1:
                    System.out.print("S>>");
                    printLine(S);
                    delete(S);
                    return;
                case 2:
                    System.out.print("A>>");
                    printLine(A);
                    delete(A);
                    return;
                case 3:
                    System.out.print("B>>");
                    printLine(B);
                    delete(B);
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
    public void delete(String seat[]) {
        System.out.print("이름>>");
        String name = scanner.next();

        for(int i=0; i<10; i++) {
            if(name.equals(seat[i])) {
                seat[i] = "___";
                break;
            }
        }
        System.out.println("예약자명이 존재하지 않습니다.");
    }
}

public class ex12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Concert psy = new Concert();

        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
            int menu = scanner.nextInt();

            switch (menu){
                case 1:
                    psy.reserve();
                    break;
                case 2:
                    psy.showSeat();
                    break;
                case 3:
                    psy.cancel();
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
