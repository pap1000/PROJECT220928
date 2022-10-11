public class Circle1 {
    //PI값 상수 선언
    final double PI = 3.14;
    //원의 반지름, 이름
    int radius;
    String name;

    //원 생성자
    public Circle1() {
    }

    //원의 면적을 계산
    public double getArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle1 pizza = new Circle1();    //Circle 'pizza' 생성
        pizza.radius = 10;              //pizza의 radius, name 입력
        pizza.name = "자바피자";
        double area = pizza.getArea();  //getArea의 return값을 받을 변수
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle1 donut = new Circle1();    //Circle 'donut' 생성
        donut.radius = 2;               //donut의 radius, name 입력
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}