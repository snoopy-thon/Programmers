import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputNum = br.readLine();
		String input = br.readLine();
		int n = Integer.parseInt(inputNum);
		String answer = "";
		for (int i=0; i<input.length(); i++){
			char a = input.charAt(i);
			if (Character.isUpperCase(a)){
				answer += Character.toLowerCase(a);
			}else{
				answer += Character.toUpperCase(a);
			}
		}
		System.out.println(answer);
	}
}