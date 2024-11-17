package hus.oop.lab1;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAXDENOMINATOR = 5000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double assDiff;
        sumL2R = sumL2R(MAXDENOMINATOR);
        sumR2L = sumR2L(MAXDENOMINATOR);
        assDiff = assDiff(sumR2L, sumL2R);
        System.out.println("Sum left-to-right: " + sumL2R);
        System.out.println("Sum right-to-left: " + sumR2L);
        System.out.println("The absolute difference: " + assDiff);

    }

    public static double sumL2R(int MAXDENOMINATOR){
        double sumL2R = 0.0;
        for (int denominator = 1; denominator <= MAXDENOMINATOR; denominator++){
            sumL2R += 1.0/denominator;
        }
        return sumL2R;
    }

    public static double sumR2L(int MAXDENOMINATOR){
        double sumR2L = 0.0;
        for (int denominator = 1; denominator <= MAXDENOMINATOR; denominator++){
            sumR2L += 1.0 / (MAXDENOMINATOR - denominator + 1);
        }
        return sumR2L;
    }

    public static double assDiff(double sumR2L, double sumL2R){
        return Math.abs(sumR2L - sumL2R);
    }
}
