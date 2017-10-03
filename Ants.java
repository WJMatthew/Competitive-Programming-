import java.util.*;
import java.math.*;

public class Ants {
    private int[] antArr;
    private int[] compArr;
    private int[] absArr;
    private int length;
    private int numAnts;

    public Ants(int numA, int l) {
    length = l;
    numAnts = numA;
    }

    public void solveIt(int[] arr) {
        int min=length;
        int minIndex=0;
        int midMin=length;
        int midMinIndex=0;
        double mid = (double) length / 2 ;
        double temp=length;

        antArr = new int[numAnts];
        compArr = new int[numAnts];
        absArr = new int[numAnts];

        for (int i=0; i<numAnts; i++) {

            antArr[i] = arr[i];

            compArr[i] = length - arr[i];

            temp = Math.abs(mid - arr[i]);

            absArr[i] = (int) temp;

            if (absArr[i] < midMin) {
                midMin = absArr[i];
                midMinIndex = i;
            }

            if (compArr[i] < min) {
                min = compArr[i];
                minIndex = i;
            }
            if (antArr[i] < min) {
                min = antArr[i];
                minIndex = i;
            }

            //System.out.println(antArr[i] + " - " + compArr[i] + " - " + arr[i]);

        }
        int slow = length - min;

        int a,b;

        a = antArr[midMinIndex];
        b = compArr[midMinIndex];


        int fast = a<b ? a : b;



        System.out.println(fast + " " + slow);



    }

    public static void main(String[] args) {
        int n, num, l;
        Scanner scan;

        scan = new Scanner(System.in);

        //System.out.println("input:");
        n = scan.nextInt();

        for (int i=0; i<n; i++) {


            l = scan.nextInt();
            num = scan.nextInt();

            Ants a = new Ants(num,l);

            int[] arry = new int[num];

            for (int j=0; j<num; j++){
                arry[j] = scan.nextInt();
            }

            a.solveIt(arry);
        }

    }

}
