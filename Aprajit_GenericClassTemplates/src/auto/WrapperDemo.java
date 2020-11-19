package auto;

public class WrapperDemo {

	public static void main(String[] args) {
		
		Double i = 137.36;  // Object -->> BOX
		//int x = i;
		//---------
		int x = i.intValue();  // Premitive UnBoxing
		short y = i.shortValue();
		
		
		Byte b = (byte)x;// boxing 
		
		int abc = Integer.parseInt("3");
		Integer wr_i =   Integer.valueOf(3);
	}
}
