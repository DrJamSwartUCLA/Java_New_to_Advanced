package hus.oop.lab1;
public class ReverseInt{
    public static void main(String args[]){
        int n=123;
        reverseInt(n);
    }
    public static void reverseInt(int n){
        int chuSo=0;
        int soDaoNguoc=0;
        while(n>0){
            chuSo=n%10;
            soDaoNguoc=soDaoNguoc*10+chuSo;
            n=n/10;
        }
        System.out.println(soDaoNguoc);
    }
}
