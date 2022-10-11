import java.util.Scanner;

class Circle {
    private double x, y;
    public int radius;
    public Circle(double x, double y, int radius) {
        this.x = x; //x, y, radius 초기화
        this.y =y;
        this.radius = radius;
    }
    public void show() {
        System.out.println("(" + x + "," + y + ")"+ radius);
    }
}

public class CircleManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언

        for(int i=0; i < c.length; i ++) {
            System.out.print("x, y, radius >>");
            double x = sc.nextDouble(); // x값 읽기.
            double y = sc.nextDouble(); // y값 읽기.
            int radius = sc.nextInt(); // radius값 읽기.
            c[i] = new Circle(x, y, radius); // Circle 객체 생성
        }

        int max = 0;
        int maxIndex = 0;
        for(int i=0; i<c.length; i++) {
            if(max < c[i].radius) {
                max = c[i].radius;
                maxIndex = i;
            }
            c[i].show();
        }
        System.out.print("가장 면적인 큰 원은 ");
        c[maxIndex].show();
        sc.close();
    }

}