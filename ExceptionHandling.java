public class ExceptionHandling{
public static void main(String[] args){
	int a=10;
	int b=0;
	int c=0;
	try{
		
	 c=a/b;
	}catch(Exception e){
		System.out.println("exception occured!"+e.getMessage());
	}
	System.out.println(a+"divide by"+b+"is"+c);
	b=5;
	c=a/b;
	System.out.println(a+"divide by"+b+"is"+c);
}
}
