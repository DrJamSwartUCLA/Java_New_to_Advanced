package hus.oop.lab1;

public class Factorial {
    public static void main(String args[]){
        factorial();
        int n=10;
        int s=1;
        for(int i=1;i<=n;i++){
            s=s*i;
        }
    }
    public static void factorial(){
        int n=10;
        int s=1;
        for(int i=1;i<=n;i++){
            s=s*i;
        }
        System.out.println(s);
    }
}
