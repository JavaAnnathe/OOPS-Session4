
public class BoxDemo2 {

	public static void main(String[] args) {
		
		BoxWeight bw1=new BoxWeight(15,10,7,10.5);
		
		int v=bw1.calculateVolume();
		
		System.out.println("Volume of bw1:"+v);
		System.out.println("Weight of bw1:"+bw1.weight);
		

	}

}
