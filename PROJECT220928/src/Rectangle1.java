import java.util.Scanner;

public class Rectangle1 {
    int width, height;

    public int getArea(){
        return width*height;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Rectangle 'nemo' 생성
        Rectangle1 nemo  = new Rectangle1();
        System.out.print(">>");

        //nemo의 너비와 높이 입력
        nemo.width = scanner.nextInt();
        nemo.height = scanner.nextInt();

        System.out.println("사각형의 면적은 " + nemo.getArea());
        scanner.close();
    }
}
