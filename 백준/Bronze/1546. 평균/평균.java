import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        double[] scores = new double[n];
        double sum = 0.0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }

        double max = Arrays.stream(scores).max().getAsDouble();

        for(int i=0; i<n; i++){
            scores[i] = scores[i] / max * 100;
            sum += scores[i];
        }

        double average = sum / n;
        System.out.println(average);
    }
}






