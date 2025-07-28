import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class DistinctNumbers
{
    static void solve(int arr[], int n){
        Map<Integer, Integer> map =new HashMap<>();
        for(int x: arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        System.out.println(map.size());
    }
    public static void main(String[] args) throws Exception
    {
       FastScanner fs=new FastScanner();
        int t=1;
        for(int tt=0;tt<t;tt++)
        {
            int n=fs.nextInt();
            int arr[]=fs.readArray(n);
            solve(arr, n);
        }
   }

   //////////////////////////////////////////////////////////////////////////////////
   //////////////////////////////////////////////////////////////////////////////////
    
    static class FastScanner 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}