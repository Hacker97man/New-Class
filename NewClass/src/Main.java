import java.util.Scanner;
public class Main {
	static private Scanner in;
	public static void main(String [] args)
	{
		in=new Scanner(System.in);
		System.out.println("[1] : Find Namer Class    [2] : Marge Arrays Class\n[3] : Marks Class    [4] : SqureArray");
		System.out.print("Enter Your Choice : ");
		int value=in.nextInt();
		switch(value){
		case 1:findNamer();break;
		case 2:margeArrays();break;
		case 3 : marks();break;
		case 4: squareArray();break;
		}
	}
	static void findNamer(){
		int Size=in.nextInt();
		FindNumber findNumber=new FindNumber(Size);
		findNumber.Enter();
		System.out.println("Enter The Value To Find it : ");
		int val=in.nextInt();
		findNumber.find(val);
	}
	static void margeArrays(){
		System.out.println("Enter The Size Of The First array : ");
		int FirstSize=in.nextInt();
		System.out.println("Enter The Size Of The Second array : ");
		int SecondSize=in.nextInt();
		MargeArrayes arrayes=new MargeArrayes(FirstSize, SecondSize);
		arrayes.Enter();
		arrayes.Marge();
		int array[]=arrayes.getMargeArray();
		System.out.print("[");
		for(int i=0;i<array.length;i++)
			{
			System.out.print(array[i]);
			if(i!=array.length-1)
				System.out.print(",");
			}
		System.out.print("]");
	}
	static void marks(){
		Marks marks=new Marks();
		System.out.print("Enter The Number Of The Marks : ");
		int N=in.nextInt();
		marks.Average(N);
	}
	static void squareArray(){
		System.out.print("Enter The Size Of The Array : ");
		int Size=in.nextInt();
		SquareArray array=new SquareArray(Size);
		array.Enter();
		array.Sum();
		System.out.print("The Main is : "+array.getMain());
		System.out.print("The Up is : "+array.getUp());
		System.out.print("The Down Is : "+array.getDown());
		
	}
}
