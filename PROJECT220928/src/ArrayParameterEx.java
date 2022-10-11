public class ArrayParameterEx {
    //공백을 ','으로 변환
    static void replaceSpace(char arr[]){
        for(int i=0; i<arr.length; i++)
            if(arr[i] == ' ')
                arr[i] = ',';
    }
    //배열 출력
    static void printCharArray(char arr[]){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]);
        System.out.println();
    }

    public static void main(String[] args){
        char s[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
        printCharArray(s);
        replaceSpace(s);
        printCharArray(s);
    }
}
