package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class test
{
    static void solve(int arr[], int n)
    {
        
    }
    public static void main(String[] args) throws Exception
    {
       FastScanner fs=new FastScanner();
        int t=fs.nextInt();
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