import java.util.Scanner;

public class testRectangle {
	public static void main(String args[]) {
		 
		
		Rectangle rec1=new Rectangle();
		System.out.print("length is "+ rec1.getLength()+" & width is "+ rec1.getWidth());
		System.out.println();
		
		Rectangle rec2 = new Rectangle(15,16);
		System.out.print("length is "+ rec2.getLength()+" & width is "+ rec2.getWidth());
		System.out.println();
		
		rec2.setLength(13);
		rec2.setWidth(14);
		System.out.print("length is "+ rec2.getLength()+" & width is "+ rec2.getWidth());
		System.out.println();
		
		System.out.println(rec1);
		System.out.println();
		
		Rectangle[] rec3=new Rectangle[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter lenght and width: ");
		double l=sc.nextDouble();
		double w=sc.nextDouble();
		for(int i=0; i<rec3.length;i++) {
			Rectangle r1=new Rectangle (l,w);
			r1=rec3[i];
			System.out.println(rec3[i]);
		}
		
		for(int i=0; i<rec3.length;i++) {
			
			System.out.println(rec3[i]);
		}
	}

}
