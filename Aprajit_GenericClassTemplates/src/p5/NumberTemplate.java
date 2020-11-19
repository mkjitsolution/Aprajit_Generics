package p5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p3.Employee;

public class NumberTemplate<K extends Number,V extends Employee> {

	//Map<K, V> map = new HashMap<>();
	
	public void addSalart(K k,V v)
	{
		v.setSalary((int)k);
	}
	
}//end class
