import java.util.*;
/** Determine the number of ways to fit a given tetris piece into a given situation. */
public class TetrisGame
{
    boolean check;
    public TetrisGame()
    {
        int C, P;
        int[] columns;

        // 4x1 long block
        int[][] B1 = { {0,0,0,0}, {0} };
        // 2x2 square block
        int[][] B2 = { {0,0} };
        // 3x2 zag right high
        int[][] B3 = { {0,0,1}, {1,0} };
        // 3x2 zag left high
        int[][] B4 = { {1,0,0}, {0,1} };
        // 3x2 3 pts block
        int[][] B5 = { {0,0,0}, {0,1}, {1,0,1}, {1,0} };
        // 3x2 L block
        int[][] B6 = { {0,0,0}, {0,0}, {0,1,1}, {2,0} };
        // 3x2 backwards L block
        int[][] B7 = { {0,0,0}, {0,2}, {1,1,0}, {0,0}} ;

        //add block pieces into list
        List < int[][] > list = new ArrayList < int[][] >(); 
        list.add(B1);
        list.add(B2);
        list.add(B3);
        list.add(B4);
        list.add(B5);
        list.add(B6);
        list.add(B7);

        Scanner scan = new Scanner(System.in);

        //System.out.println("");

        C = scan.nextInt();
        P = scan.nextInt();

        //barr block array
        columns = new int[C];

        int[][] block = list.get(P-1);

        // collect bottom heights put into array.
        for (int i=0; i<C; i++) {
            int a = scan.nextInt();
            columns[i]=a;
        }

        solve(columns, C, block, block.length);

    }

    public void solve(int[] arr, int n, int[][] block, int bn) {
        int count=0;
        
        //loop through unique block faces
        for (int j=0; j<bn; j++) {
            int[] block_side = block[j];
            int z = block_side.length;

            int[] b = new int[z];
            int[] c = new int[z];

            //loop through different subsets matching block face in size
            for (int m=0; m<(n-z+1); m++) {
                
                //get difference between each bottom and its resp block face counterpart
                for (int k=0; k<z; k++) {
                    
                    int w = arr[k+m];
                    int v = block_side[k];
                    int x = w-v;
                    c[k] = x;
                }

                int testint = c[0];
                boolean match = true;
                //if its a match all differences should be equal >> no gaps
                for (int p=0; p<z; p++) {
                    if ( c[p] != testint) {
                        match=false;
                    }
                }

                if (match) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        TetrisGame tg = new TetrisGame();   
    }
}