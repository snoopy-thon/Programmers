import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int result = 0;
        for(int i=0; i<num.length()/2; i++) {
            if(num.charAt(i) == num.charAt(num.length()-i-1)) {
                result+=1;
            }
        }
        if(result == num.length()/2) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}


