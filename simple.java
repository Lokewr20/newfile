import java.util.*;

public class simple
{
	public static void main (String[] args)
	{
		System.out.print(" welcome to my program ");
		Scanner sc = new Scanner(System.in);
		System.out.print("first prg value: ");
		int fp = sc.nextInt();
		System.out.print("second prg value :");
		int sp = sc.nextInt();
		System.out.print("third prg value :");
		int tp = sc.nextInt();
		int frp = fp+sp+tp;
		System.out.print("fourth prg value :"+frp);
	}
}
