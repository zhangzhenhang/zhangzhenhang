import java.util.Scanner;


public class Addstu {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int operat=scanner.nextInt();
		String String="";
		switch(operat)
		{
		case 1:String="����һ��ѧ��";break;
		case 2:String="��ʾ����ѧ��";break;
		case 3:String="�˳�����";break;
		
		default:String="error";
		}
		System.out.println(String);
	}
}
