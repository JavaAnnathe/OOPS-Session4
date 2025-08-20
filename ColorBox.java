
public class ColorBox extends Box{
	
	int color;
	
	public ColorBox(int l, int b, int h, int c){
		super(l,b,h);
		
		color=c;
		System.out.println("inside constructor1");
	}

	public ColorBox(int l,int c){
		super(l,l,l);
		color=c;
		System.out.println("inside constructor2");
	}
}
