package Java_Interview_Programs;

public class Swapping_Two_numbers {
	
	public static void swappingtwonumbers(int a,int b)
	{
		// a=10 ,b=20
		a=a+b ; //a=30
		b=a-b; //b=10
		a=a-b;
		
		System.out.println("Modified a value is " +a);
		System.out.println("Modified b value is " +b);
	}

	public static void main(String[] args) {
		
		Swapping_Two_numbers stn=new Swapping_Two_numbers();
		stn.swappingtwonumbers(10, 20);
	}

}
