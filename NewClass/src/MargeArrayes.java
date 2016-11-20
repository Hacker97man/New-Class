import java.util.Scanner;
public class MargeArrayes {
	private int FirstSize, SecondSize;
	private int FirstArray[],SecondArray[], AllArray[];;
	private Scanner in;
	public MargeArrayes(int FirstSize,int SecondSize)
	{
		this.FirstSize=FirstSize;
		this.SecondSize=SecondSize;
		in=new Scanner(System.in);
	}
	public void Enter (){
		 FirstArray=new int [FirstSize];
		 SecondArray=new int [SecondSize];
		for(int i=0;i<FirstSize;i++)
		{
			System.out.print("Enter The Value Of "+(i+1)+" : ");
			FirstArray[i]=in.nextInt();
		}
		for(int i=0;i<SecondSize;i++)
		{
			System.out.print("Enter The Value Of "+(i+1)+" : ");
			SecondArray[i]=in.nextInt();
		}	
	}
	public void Marge(){
		int i=0;
			AllArray=new int[FirstSize+SecondSize];
			for(;i<FirstSize;i++)
			AllArray[i]=FirstArray[i];
		for(;i<AllArray.length;i++)
			AllArray[i]=SecondArray[i-FirstSize];
		
	}
	public int[]getMargeArray(){return AllArray;}
}
