package hus.oop.lab1;
public class SumAverageRunningInt {
    public static void main(String args[]){
        sumAverageRunningInt();
    }
    public static void sumAverageRunningInt(){
        int s=0;
        int lowerBound=10;
        int upperBound=50;
        for(int i=lowerBound;i<=upperBound;i++){
            s+=i;
        }
        System.out.println(s);
    }
}
