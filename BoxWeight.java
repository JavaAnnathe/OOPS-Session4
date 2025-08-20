
public class BoxWeight extends Box{
	
	double weight;
	
	public BoxWeight(int l,int b,int h,double w){
		
		//length=l;
		//breadth=b;
		//height=h;
		
		super(l,b,h);
		System.out.println("w:"+w);
		weight=w;
		System.out.println("Inside BoxWeight constructor");
	}
	
	

}
