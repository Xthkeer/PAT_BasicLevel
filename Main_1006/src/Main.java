import java.util.Scanner;

class outNum{
	public int num = 0;
	public void outB(int n){
		int count = 0;
		count = n/100;
		while(count != 0){
			System.out.print("B");
			count--;
		}
	}
	public void outS(int n){
		int count = 0;
		count = n%100/10;
		while(count != 0){
			System.out.print("S");
			count--;
		}
	}
	public void outG(int n){
		int count = 0;
		count = n%100%10;
		int i = 1;
		while(count != 0){
			System.out.print(""+i);
			count--;
			i++;
		}
	}
}

public class Main {
	public static void main(String[] args){
		outNum oN = new outNum();
		Scanner sc = new Scanner(System.in);
		oN.num = sc.nextInt();
		oN.outB(oN.num);
		oN.outS(oN.num);
		oN.outG(oN.num);
	}
}
