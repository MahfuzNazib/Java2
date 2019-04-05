import java.lang.*;
import java.util.ArrayList;

public class ArrayListDemo
{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();  
		System.out.println("Array List Show    : "+al);
		System.out.println("Size of Array List : "+al.size());

		al.add(10); //insert 10 in ArrayList
		al.add("Hello"); //insert "Hello" String in ArrayList
		al.add(2.78); //insert a double data type valu in Array List

		System.out.println("-------------------------------");
		System.out.println("Array List Show    : "+al);
		System.out.println("Size of Array List : "+al.size());

		al.add(10); //again insert 10 in Array List

		System.out.println("-------------------------------");
		System.out.println("Array List Show    : "+al);
		System.out.println("Size of Array List : "+al.size());

		al.add("Nazib");

		System.out.println("-------------------------------");
		System.out.println("Array List Show    : "+al);
		System.out.println("Size of Array List : "+al.size());

		System.out.println("Check 2.78 is List : "+al.contains(2.78));
		System.out.println("Check Nazib is List : "+al.contains("Nazib"));

		System.out.println("Index Number Nazib : "+al.indexOf("Nazib"));
		System.out.println("Index Number 10    : "+al.indexOf(10));
		System.out.println("Last index of 10   : "+al.lastIndexOf(10));

		al.add("Hello"); //insert Hello String type data in Array List Agian
		System.out.println("Array List Show    : "+al);
		System.out.println("Last Index Hello   : "+al.lastIndexOf("Hello")); 

		

		System.out.println("---------------REMOVING----------------");

		al.remove(2.78);
		System.out.println("After Removing 2.78  : "+al);

		al.remove("Hello");
		System.out.println("After Removing Hello  : "+al);		

	}
}