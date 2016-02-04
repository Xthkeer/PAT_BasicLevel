import java.util.Scanner;

class Student{
	public int n = 0;
	public String[] gard;
	public String[] name;
	public String[] num;	
	public void inputStudent(){
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String[] str = new String[n];
		this.gard = new String[n];
		this.name = new String[n];
		this.num = new String[n];
		while(i<n){
			this.name[i] = sc.next();
			this.num[i] = sc.next();
			this.gard[i] = sc.next();
			i++;
		}
	}
	public void sortGard(String[] str){
		int[] num = new int[str.length];
		int max = 0;
		int min = 0;
		for(int i=0;i<str.length;i++){
			num[i] = Integer.parseInt(str[i]);
		}
		for(int i=0;i<num.length;i++){
			if(num[i]>num[max]) max = i;
			if(num[i]<num[min]) min = i;
		}
		System.out.println(this.name[max]+" "+this.num[max]);
		System.out.println(this.name[min]+" "+this.num[min]);
	}
}

public class Main {
	 public static void main(String[] args){
		 Student st = new Student();
		 st.inputStudent();
		 st.sortGard(st.gard);
	 }
}
