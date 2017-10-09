import java.util.*;

public class Ants {
    private int max, min, maxIndex, minIndex;

    public void solve(int[] arr, int na, int l) {

        double middle = (double) l/ 2;      // get midpoint

        int[][] antArr = new int[na][2];    // antArr[][0:1] represents dist to each end of rod

        double[] midDist = new double[na];  // represents respective ants distance to middle

        int min=Integer.MAX_VALUE, max=0;
        int maxInd=-1, minInd=-1;

        for (int i = 0; i < na; i++) {

            int ant = arr[i];       // copy value from parameter array

            antArr[i][0] = ant;    // put in our own array

            antArr[i][1] = l - ant; // complement distance

            midDist[i] =  Math.abs(middle - ant);  // distance to midpoint

            if (midDist[i] < min) {     // if this ant is closest to the middle
                min = (int) midDist[i];     // set it as the  min
                minInd = i;
            } if (midDist[i] > max) {       // if this ant is furthest from middle
                max = (int) midDist[i];     // set it as max
                maxInd = i;
            }
        }

        // slow = take furthest ant from middle, get max distance from dist to each rod end
        // since slow it will go toward the further end
    int slow = antArr[maxInd][0] > antArr[maxInd][1] ? antArr[maxInd][0] : antArr[maxInd][1];

        // fast = take closest ant to middle, get min distance from dist to each end rod
        // since fast it will go toward the closer end
    int fast = antArr[minInd][0] < antArr[minInd][1] ? antArr[minInd][0] : antArr[minInd][1];

    //print answers
    System.out.println(fast + " " + slow);
    }//end solve

    // main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numCases = scan.nextInt();  // number of test cases
        scan.nextLine();

        for (int j=0; j<numCases; j++) {

            int length = scan.nextInt();        // length of rod
            int numAnts = scan.nextInt();       // # ants
            scan.nextLine();

            int[] antArr = new int[numAnts];        // ant array

            for (int i = 0; i < numAnts; i++) {

                int ant = scan.nextInt();

                antArr[i] = ant;
            }
                Ants ants = new Ants();

                    ants.solve(antArr, numAnts, length);
        }
    }
}
