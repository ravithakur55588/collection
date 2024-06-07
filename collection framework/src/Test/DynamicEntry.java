package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> l1 = new ArrayList();
		boolean m = true;
		
		while(m) {
			System.out.println("press 1 to add list item.");
			System.out.println("press 2 to show item.");
			System.out.println("press 3 to remove item.");
			System.out.println("press 4 to exit.");
			int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("***********************************");
			System.out.println("Enter item = ");
			String s = sc.next();
			l1.add(s);
			System.out.println("Item added sucessfully  ");
			System.out.println("***********************************");
			break;
		case 2:
			System.out.println("***********************************");
			System.out.println("List items are = "+l1);
			System.out.println("Item shown  ");
			System.out.println("***********************************");
			break;
		case 3:
			System.out.println("***********************************");
			System.out.println("Enter item to be deleted = ");
			String s1 = sc.next();
			l1.remove(s1);
			System.out.println("Item removed sucessfully ");
			System.out.println("***********************************");
			break;
		case 4:
			m = false;
			System.out.println("thank you");
			break;

		default:
			System.out.println("***********************************");
			System.out.println("Invalid Selection");
			System.out.println("***********************************");
			break;
		}
		}

	}
}
