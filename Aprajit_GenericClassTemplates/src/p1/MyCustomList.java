package p1;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList {

	List list = new ArrayList<>();
	
	public void addElement(int element)
	{
		list.add(element);
	}
	
	public Object getElement(int index)
	{
		if(index>list.size()) return -1;
		else return list.get(index); // object
	}
	
}//end class
