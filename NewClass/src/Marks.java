import java.util.Scanner;

public class Marks {
	private int Mark[];
	private Scanner in;
	public Marks() {
	in=new Scanner(System.in);
	}
	public void Average(int N){
		Mark=new int[N];
		int sum=0;
		for(int i=0;i<N;i++)
		{
			System.out.print("Enter The Mark["+(i+1)+"] :");
			Mark[i]=in.nextInt();
			sum+=Mark[i];
		}
		double Avr=sum/N;
		if((int)Avr>=60)
			System.out.print("successful");
		else System.out.print("failure");
	}
}
