import java.util.Scanner;

class testPass{
	
	public int n = 0;
	public String[] inputTest(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int i=0;
		String[] aryS = new String[n];
		//System.out.print(""+n);
		while(i<n){
			aryS[i] = sc.next();
			i++;
		}
		sc.close();
		return aryS;
	}
	public String judgeTest(String str){
		int i = 0;
		int count = 0;
		boolean flag = false;
		try{
		while(i<str.length()){
			if(str.charAt(i)=='A'&&!flag)
				count++;
			if(str.charAt(i)!='P'
					&&str.charAt(i)!='A'
					&&str.charAt(i)!='T'){
				return "NO";
			}
			else if(str.charAt(i)=='P'){
				flag = true;
				if(str.charAt(i+1)=='A'){
					if(str.charAt(i+2)=='T'){
						for(int j = i+3;j<count+i+3;j++){
							if(str.charAt(j)!='A') break;
							if(j == count+i+2) return "YES";
						}
						return "NO";
					}
					else if(str.charAt(i+2)=='A'&&str.charAt(i+3)=='T'){
						for(int j = i+4;j<count+i+4;j++){
							if(str.charAt(j)!='A') break;
							if(j == count+i+3) return "YES";
						}
						return "NO";
					}
					else return "NO";
				}
			}
			//else return "NO";
			i++;
		
		}
		flag = false;
		return "NO";
	}
		catch(IndexOutOfBoundsException ex){
			return "NO";
		}
		}
}

public class Main {
	public static void main(String[] args) {
		testPass tp = new testPass();
		int i = 0;
		String[] str = tp.inputTest();
		while(i<tp.n){
		System.out.println(tp.judgeTest(str[i]));
		i++;
		}
	}
}
