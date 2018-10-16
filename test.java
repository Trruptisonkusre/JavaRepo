

public class test 
{
	public static void main(String[] args) 
	{
		test _test = new test();
		_test.Sum(1,6);
		System.out.println(_test.name);
	}
	
	private void Sum(int var1, int var2) 
	{
		int summation;
		summation=var1+var2;
		System.out.println("Sum:"+ summation);
	} 
	
	private String name="TRUPTI";
	
}


