
public class BoxDemo1 {

	public static void main(String[] args) {
		
		Box b1=new Box(15,10,8);
		
		//b1.length=15;
		//b1.breadth=10;
		//b1.height=8;
		
		int volume = b1.calculateVolume();
		//int volume = b1.length*b1.breadth*b1.height;
		
		System.out.println("Volume of the box:"+volume);
		
	}

}
