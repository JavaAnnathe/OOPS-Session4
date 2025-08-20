
public class B extends A{
	
	
	int deptNo;
	
	public B(int k,int l){
		
		employeeNo=k;
		deptNo=l;
		
	}

	public void displayDeptDetails(){
		
		
		System.out.println("deptNo:"+deptNo);
	}
}
