package Java_Interview_Programs;

//Method to print 1 to 10 numbers without using loop.

public class PrintingOneToTenNumbersWIthOutUsingLoop {

	public void printingOneToTenNumbers(int n) {
		if(n<=100)
		{
			System.out.println("numbers are   "+n);
			printingOneToTenNumbers(n+1);
		}
	}
	
	
	public static void main(String[] args) {
		
		PrintingOneToTenNumbersWIthOutUsingLoop pottn=new PrintingOneToTenNumbersWIthOutUsingLoop();
		
		pottn.printingOneToTenNumbers(1);
	}

}
