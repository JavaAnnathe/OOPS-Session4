
public class BoxDemo3 {

	public static void main(String[] args) {
		//ColorBox cb = new ColorBox(20,15,10,5);
		
		ColorBox cube = new ColorBox(10,6);
		
		int v=cube.calculateVolume();
		System.out.println("Volume of cube:"+v);
		System.out.println("Color:"+cube.color);

	};

}
