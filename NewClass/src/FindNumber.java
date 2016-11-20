import java.util.*;

public class FindNumber {
	private int Size;
	private int Number[];
	private Scanner in;
	public FindNumber(int Size){
		this.Size=Size;
		in=new Scanner(System.in);
	}
	public int find(int n){
		
		for(int i=0;i<Number.length;i++)
			if(Number[i]==n)
				return i;
		return -1;
	}
	public void Enter(){
		Number=new int[Size];
		for(int i=0;i<Size;i++)
		{
			System.out.print("Enter The Value Of "+(i+1)+" : ");
			Number[i]=in.nextInt();
		}
	}
}
