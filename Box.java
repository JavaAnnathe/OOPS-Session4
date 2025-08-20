
 class Box {
	
	 private int length;
	 private int breadth;
	 private int height;
	 
	 public Box(){
		 
		 
	 }
	 
	public Box(int l,int b, int h){
		
		length=l;
		breadth=b;
		height=h;
		System.out.println("inside box constructor");
	} 
	 
	 
	 public int calculateVolume(){
		 
		 int volume = length * breadth* height;
		 
		 System.out.println("I am inside Box class calculateVolume method");
		 
		 return volume;
		 
		 
	 }
	

}
