import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Collect {

	public static void main(String[] args) {
		
		String books="h";
		
		ArrayList<String> favBook = new ArrayList<String>();
		
		Scanner sc= new Scanner(System.in);
		
		
		
		while (!books.equals("")==true)
		{
			System.out.println("Please enter your fav book");
			
			books=sc.nextLine();
			favBook.add(books);
		}
		
	
		Collections.sort(favBook);		
		
		for (String number: favBook )
		{
			System.out.println(number);
		}

	}

}
