import java.util.*;
/** Determines whether a pxq grid can be tiled with knights */
public class Knights
{
    private String code="";

    public Knights()
    {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.println("");
        n = scan.nextInt();
        scan.nextLine();

        //each case
        for (int q=0; q<n; q++)
        {
            int rows, cols;

            rows = scan.nextInt();
            cols = scan.nextInt();
            scan.nextLine();

            solveit(rows, cols, q+1);
        }
    }

    public void solveit(int rn, int cn, int cs) {
        boolean possible = false;
        String onboards = "";

        int i=1;
        while ((i<=rn) && ( possible==false )) {
            int j=1;
            while ((j<=cn) && (possible==false)) {
                onboards = getCode(i,j);
                if (placeKnight(i,j,rn,cn, onboards)) {
                    possible=true;
                }
                j++;
            }
            i++;
        }
        System.out.println("Case " + cs + ":");
        System.out.println( possible ? code : "impossible" );
    }

    public boolean placeKnight(int r, int c, int rn, int cn, String kstr)
    {
        if (kstr.length()==(2*rn*cn)) {
            code=kstr;
            return true;
        }

        int[] rarr = {2,2,-2,-2,1,1,-1,-1};
        int[] carr = {1,-1,1,-1,2,-2,2,-2};

        for (int i=0;i<rarr.length; i++) {
            int x = r + rarr[i];
            int y = c + carr[i];

            if ( !( x<1 || x>rn || y<1 || y>cn) && (kstr.indexOf(getCode(x,y))<0)){

                kstr += getCode(x,y);

                if (placeKnight(x,y,rn,cn,kstr)){
                    return true;
                }else {
                    kstr = kstr.substring(0,kstr.length()-2);
                }
            }
        }
        return false;
    }

    public String getCode(int r, int c) {
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sub = alph.substring( c-1, c );

        return sub + r;
    }

    public static void main(String[] args)
    {

        Knights k = new Knights();

    }
}