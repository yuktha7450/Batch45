package daythree;

public class switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x='l';
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println(x+ " is a letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+ " is a digit");
			break;
		case 'w':
		case 'W':
			System.out.println(x+ " is a white space");
			break;
		case 's':
		case 'S':
			System.out.println(x + " is a special letter");
			default:
				System.out.println(x + " is other than letter");
				break;
		}

	}

}
