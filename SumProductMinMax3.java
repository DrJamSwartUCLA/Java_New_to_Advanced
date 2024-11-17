package hus.oop.lab1;
import java.util.Scanner;
public class SumProductMinMax3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=Sum(a,b,c);
        System.out.println(sum);
        int product=Product(a,b,c);
        System.out.println(product);
        int min=Min(a,b,c);
        System.out.println(min);
        int max=Max(a,b,c);
        System.out.println(max);
    }
    public static int Sum(int a,int b, int c){
        return a+b+c;
    }
    public static int Product(int a,int b,int c){
        return a*b*c;
    }
    public static int Min(int a,int b,int c){
        int min=a;
        if(min>b){
            min=b;
        }
        if(min>c){
            min=c;
        }
        return min;
    }
    public static int Max(int a,int b,int c){
        int max=a;
        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }
        return max;
    }
}
