import java.util.Scanner;

class rightM{
	public int[] aryN;
	public void inputMove(){
		int n = 0; 
		int step = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		aryN = new int[n];
		step = sc.nextInt();
		for(int i=step;i<n;i++){
			aryN[i] = sc.nextInt();
		}
		for(int i=0;i<step;i++){
			aryN[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(""+aryN[i]);
			if(i!=n-1) 
				System.out.print(" ");
		}
	}
}

public class Main {
	public static void main(String[] args){
		rightM rm = new rightM();
		rm.inputMove();
	}
}
