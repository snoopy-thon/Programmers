import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int STUDENT = 30;
        int[] arr = new int[STUDENT];
        int[] absent = new int[2];

        for (int i = 0; i < STUDENT-2; i++) {
            int index = Integer.parseInt(br.readLine());
            arr[index - 1] = 1;
        }

        for (int j = 0; j < STUDENT; j++) {
            if (arr[j] == 0) {
                sb.append(j + 1).append("\n");
            }

        }
            System.out.println(sb);
        }
    }
