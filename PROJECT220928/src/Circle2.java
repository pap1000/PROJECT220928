public class Circle2 {
    //상수 PI와 변수 radius, name 선언
    final double PI = 3.14;
    int radius;
    String name;

    public Circle2(){    //1번째 생성자
        radius = 1;
        name = "";
    }

    public Circle2(int a, String b){     //2번째 생성자
        radius = a; name = b;
    }

    public double getArea(){
        return PI*radius*radius;
    }

    public static void main(String[] args){
        Circle2 pizza = new Circle2(10 , "자바피자");         //Circle 'pizza' 생성(2번째 생성자 이용)

        double area = pizza.getArea();                          //pizza의 면적 입력
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle2 donut = new Circle2();    //Circle 'donut' 생성(1번째 생성자 이용)
        donut.name = "도넛피자";         //donut의 이름 입력
        area = donut.getArea();        //donut의 면적 입력
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
