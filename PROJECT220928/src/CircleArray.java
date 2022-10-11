class Circle3 {
    final double PI = 3.14;
    int radius;

    public Circle3(int radius){
        this.radius = radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }

    public void show1() {
    }
}

public class CircleArray{
    public static void main(String[] args){
        Circle3[] arr = new Circle3[5];

        //객체 배열 입력
        for(int i=0; i<arr.length; i++)
            arr[i] = new Circle3(i);
        //객체 배열 출력
        for(int i=0;i<arr.length;i++)
            System.out.print((int)arr[i].getArea() + " ");
    }
}
