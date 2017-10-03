import java.util.*;

public class Zigzag
{

    public static void main(String[] args) {

        int n;
        boolean works=true;
        Scanner scan = new Scanner(System.in);

        System.out.println("");

        n = scan.nextInt();
        String s = n + "";
        scan.nextLine();

        String perm = scan.nextLine().trim();

        if (perm.length() != n)
            works=false;

        if (works) {
            for (int i=0; i<n; i++) {
                if (!( perm.indexOf(i+1+"") > -1))
                    works=false;
            }
        }
        int num = Integer.parseInt(perm);
        if (works) {
            for (int j=0; j<n-1; j++) {
                if (j%2==0) {
                    if ( perm.charAt(j) >= perm.charAt(j+1) )
                        works=false;
                }
                else {
                    if ( perm.charAt(j) <= perm.charAt(j+1) )
                        works=false;

                }
            }
        }
        System.out.println(works);
    }
}