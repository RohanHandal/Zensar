package Collection;

import java.util.ArrayList;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		System.out.println(al.size());
		al.add("Rohan");
		al.add("shubham");
		al.add("rahul");
		al.add("vaishali");
		al.add("888");
		al.add("&*^%");
		
		
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		Iterator <String> i=al.iterator();
		while(i.hasNext())
		{
			String data=i.next();
			System.out.println(data);
		}
	}

}
