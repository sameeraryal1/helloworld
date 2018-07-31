public class LoginDemo{
public static void main(String[] args){
	Login l = new Login();
	System.out.println("Output:" +l.getUsername());
	l.setUsername("Rudeep Aape");
	System.out.println("Output:"+l.getUsername());
}
}