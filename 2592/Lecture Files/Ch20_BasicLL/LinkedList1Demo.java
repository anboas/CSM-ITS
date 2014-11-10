package Ch20_BasicLL;

public class LinkedList1Demo
{
	// QUIZ
	// YOUR NAME
	public static void main(String[] args)
	{
		LinkedList1 LL = new LinkedList1();
		LL.add("Amy");
		LL.add("Bob");
		LL.add(0, "Al");
		LL.add(2, "Beth");
		LL.add(4, "Carol");
		System.out.println("The members of the list are:");
		System.out.print(LL);

		System.out.println("\nRemove Beth\n");
		LL.remove("Beth");
		System.out.print(LL);
	}

}
