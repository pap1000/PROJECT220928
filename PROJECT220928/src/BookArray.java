import java.util.Scanner;

class Book2{
    String title, author;
    public Book2(String s, String a){
        this.title = s;
        this.author = a;
    }
}

public class BookArray {
    public static void main(String[] args){
        //객체 배열 생성
        Book[] bookshelf = new Book[2];

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<bookshelf.length; i++){
            System.out.print("제목>>");
            String s = scanner.nextLine();
            System.out.print("저자>>");
            String a = scanner.nextLine();
            bookshelf[i] = new Book(s, a);  //객체 배열 입력
        }
        //객체 배열 출력
        for(int i=0; i<bookshelf.length; i++)
            System.out.print("(" + bookshelf[i].title + ", " + bookshelf[i].author + ")");

        scanner.close();
    }
}
