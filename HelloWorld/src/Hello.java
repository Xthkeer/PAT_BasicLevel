import java.util.*;
import javax.swing.*;

class Num{
	public int cont = 0;
	//private int testNum = 0;
	public int process(int num){
		if(num==1){
			return 0;
		}
		else if(num%2==0){
			this.cont++;
			return process(num/2);
		}
		else {
			this.cont++;
			return process((3*num+1)/2);
		}
	}
	
}

public class Hello {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num numTest = new Num();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		numTest.process(num);
		System.out.println(numTest.cont);
	}
}