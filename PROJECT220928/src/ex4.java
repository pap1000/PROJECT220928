class Rectangle{
    private int x, y, width, height;

    //생성자
    Rectangle(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    //넓이
    public int square(){
        return width*height;
    }
    void show(){
        System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }
    boolean contains(Rectangle R){
        if(x < R.x && y < R.y)  //시작점이 더 작고
            if((width+x) > (R.x+R.width) && (height+y) > (R.y+R.height))    //종료점이 더 크다면
                return true;    //포함한다
        return false;
    }
}

public class ex4 {
    public static void main(String[] args){
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
