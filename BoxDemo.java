
public class BoxDemo {

	public static void main(String[] args) {
		
		Box b1=new Box();
		//b1.length=15;
		//b1.breadth=10;
		//b1.height=8;
		
		Box b2 = new Box();
		//b2.length=20;
		//b2.breadth=14;
		//b2.height=7;
		
		//Variable declaration
		Box b3;
		
		b3 = b2;
		
		b3=b1;
		
		b3=null;
		
		/*System.out.println("Length of box b1:"+b1.length);
		System.out.println("Breadth of box b1:"+b1.breadth);
		System.out.println("Height of box b1:"+b1.height);
		
		System.out.println("Length of box b2:"+b2.length);
		System.out.println("Breadth of box b2:"+b2.breadth);
		System.out.println("Height of box b2:"+b2.height);
		
		System.out.println("Length of box b3:"+b3.length);
		System.out.println("Breadth of box b3:"+b3.breadth);
		System.out.println("Height of box b3:"+b3.height);*/
	}

}
