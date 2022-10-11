public class Book{
    String title, author;

     public Book(){
         //다른 생성자 호출
         this("", "");
         System.out.println("생성자 호출됨");
     }
     public Book(String s){
         this(s, "작자미상");
     }
     public Book(String s, String a){
         title = s;
         author = a;
     }
     //제목, 작가 출력
     void show(){
         System.out.println(title + " " + author);
     }

     public static void main(String[] args){
         //Book 'prince', 'chunhyang'을 서로 다른 생성자로 생성
         Book prince = new Book("어린왕자", "생텍쥐페리");
         Book chunhyang = new Book("춘향전");
         Book empty = new Book();
         chunhyang.show();
     }
}
