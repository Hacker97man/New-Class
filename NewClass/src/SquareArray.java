import java.util.Scanner;
public class SquareArray {
	private int Size;
	private int Array[][];
	private int SumMain,SumUp,SumDown;
	private Scanner in;
public SquareArray(int Size)
{
	this.Size=Size;
	in=new Scanner(System.in);
	SumMain=0;
	SumUp=0;
	SumDown=0;
}
	public void Enter (){
	Array=new int[Size][Size];
	for(int i=0;i<Size;i++)
		for(int j=0;j<Size;j++)
		{
			System.out.print("Enter The Value Of ["+i+"] ["+j+"] :");
			Array[i][j]=in.nextInt();
	}
}
	public void Sum(){
		for(int i=0;i<Size;i++)
			for(int j=0;j<Size;j++)
			{
				if(i==j)
					SumMain+=Array[i][j];
				else	if(i>j)
					SumDown+=Array[i][j];
				else SumUp+=Array[i][j];
			}
	}
	public int getMain(){return SumMain;}
	public int getUp(){return SumUp;}
	public int getDown(){return SumDown;}
	}
