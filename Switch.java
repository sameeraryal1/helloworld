import java.util.*;
class Switch{
	
public static void main(String [] args){
	System.out.println("Enter the number from 1 to 7");
	Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
	switch(a){
		case 1:
		System.out.println("sunday");
		break;
		case 2:
		System.out.println("monday");
		break;
		case 3:System.out.println("tuesday");
		break;
		case 4:
		System.out.println("wednesday");
		break;
		case 5:
		System.out.println("thursday");
		break;
		case 6:
		System.out.println("friday");
		break;
		case 7:
		System.out.println("saturday");
		break;
		default:
		System.out.println("wrong input");
}
}
}