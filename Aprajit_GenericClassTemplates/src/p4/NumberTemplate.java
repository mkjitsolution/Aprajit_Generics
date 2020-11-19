package p4;

import java.util.ArrayList;
import java.util.List;

public class NumberTemplate<T extends Number> {

	List<T> list = new ArrayList<>();
	
	public void addElement(T element)
	{
		list.add(element);
	}
	
	public T getElement(int index)
	{
		if(index>list.size()) return null;
		else return list.get(index); // object
	}
	
}//end class
