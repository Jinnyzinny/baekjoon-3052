import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		int input[]=new int[10];
		int Remainder[]=new int[42];
		int cnt=0;
		for(int i=0;i<10;i++)
		{
			input[i]=sc.nextInt();
			int idx=input[i]%42;
			Remainder[idx]++;
		}
		for(int i=0;i<42;i++)
		{
			if(Remainder[i]!=0)
			{
				cnt++;
			}
		}		
		System.out.println(cnt);
	}
}
