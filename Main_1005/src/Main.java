import java.util.Scanner;

class Num{
	public int[] num;
	public boolean[] pull;
	public int n = 0;
	public void inputNum(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = new int[n];
		pull = new boolean[n];
		int i = 0;
		while(i<n&&sc.hasNextInt()){
			
			num[i] = sc.nextInt();
			pull[i] = true;
			i++;
		}
	}
	public int process(int numx){
	    if(numx==1){
	      return 0;
	    }
	    else if(numx%2==0){
	      for(int i=0;i<num.length;i++){
	    	  if(numx/2 == num[i]) pull[i] = false; 
	      }
	      return process(numx/2);
	    }
	    else {
	      for(int i=0;i<num.length;i++){
	    	if((3*numx+1)/2 == num[i]) pull[i] = false;
	      }
	      return process((3*numx+1)/2);
	    }
	}
	public void outNum(){
		int[] tempN;
		int count = 0;
		for(int i=0;i<num.length;i++){
			if(pull[i]){
			count++;
			}
		}
		tempN = new int[count];
		count = 0;
		for(int i=0;i<num.length;i++){
			if(pull[i]){
				tempN[count]=num[i];
				count++;
			}
		}
		this.sort(tempN);
		for(int i=0;i<tempN.length;i++){
			System.out.print(tempN[i]);
			if(i != tempN.length-1)
				System.out.print(" ");
		}
	}
	 public void sort(int[] a)
	    {
	        int temp = 0;
	        for (int i = a.length - 1; i > 0; --i)
	        {
	            for (int j = 0; j < i; ++j)
	            {
	                if (a[j + 1] > a[j])
	                {
	                    temp = a[j];
	                    a[j] = a[j + 1];
	                    a[j + 1] = temp;
	                }
	            }
	        }
	    }
}
public class Main {
	public static void main(String[] args){
		Num nx = new Num();
		nx.inputNum();
		for(int i = 0;i<nx.num.length;i++){
			nx.process(nx.num[i]);
		}
		nx.outNum();
		
	}
}
