import java.util.*;
import java.math.*;
public class Billiards {
    private final double EPSILON = 0.001;   // distance to hole considered a hit
    private int numCases;       // number of test cases
    private double width;          //  width(height) of table
    private double angle;          // angle of departure of ball (0-180) (deg)
    private double vInitial;      // initial velocity
    private double dRate;          // deacceleration rate
    private double hole;           // x coord of hole

    /**     Billiards Constructor   */
    public Billiards(double w, double a, double v, double d, double x ) {
        width = w;
        angle = a;
        vInitial = v;
        dRate = d;
        hole = x;
    }

    public String toString() {
        String str = "angle = " + angle + "\nadj = " + adj + "\nr = " + r + "\nk = " + k + "\ntotalDist = " + totalDist ;
        str += "\nmaxRolltime = " + maxRolltime + "\nmaxDist = " + maxDist + "\nxDist = " + xDist;
        return str;
    }

    ///////////////////////////

    double r;       // hypotenuse length
    double adj;     // adjacent length
    double k;       // distance to hole / adj (const)
    double totalDist;   // total distance needed to travel by ball to get to hole
    double maxDist;
    double maxRolltime;     //
    double xDist;

    /**     SOLVEIT METHOD  */
    public void solveIt() {
    //System.out.println("width: " + width + ",\n angle: " + angle + ",\n v: " + vInitial);

        angle = Math.toRadians(angle);

        // divby0 watch
        if (Math.tan(angle) != 0)
            adj = width / (Math.tan(angle));
        else adj = 0;

        // divby0 watch
        if (Math.sin(angle) != 0)
            r = width / (Math.sin(angle));
        else r = 0;

        // k = hole/adj
        if (adj != 0)
            k = hole / adj;
        else k= 0;
        // totalDist length of hypot * const to get to hole
        totalDist = r * k;

        xDist = totalDist * Math.cos(angle);

        /**     bla bla     */
        if (dRate != 0) {
            maxRolltime = vInitial/dRate;
            maxDist = maxRolltime * (vInitial - ((dRate * maxRolltime) / 2));

            if (maxDist < totalDist) {
                System.out.println("MISS");
                return;
            }
        }


        if (Math.abs( hole - xDist) >= EPSILON) {
            System.out.println("MISS");
            return;
        }

        System.out.println("HIT");
    }////   end of solveIt  ////

    /////**     MAIN METHOD     */////
    public static void main(String[] args) {
        Billiards b;
        double n, w, a, v, d, x;

        //System.out.println("enter input:");

        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        for (int i=0; i<n; i++) {

            w = scan.nextDouble();
            a = scan.nextDouble();
            v = scan.nextDouble();
            d = scan.nextDouble();
            x = scan.nextDouble();

            b = new Billiards(w, a, v, d, x);
            b.solveIt();
            //System.out.println(b.toString());
        }

    }////   end main method  ////
}//end class billiards
