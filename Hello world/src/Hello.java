
public class Hello {
	public static void main(String a[])
	{
		System.out.println("Hello world");
		//Integer data type demo
		
		int max = 217483647; //4 Bytes
		int min = -217483648;
		
		short shortmax = 32767; //2 Bytes
		short shortminn= -32768;
		
		long longmax = 9223372036854775807L; //8 Bytes --- For Lon data type L is attached in last
		long longmin = -9223372036854775808L;  
		
		byte byemax = 127; //1 Byte
		byte bytemin = -128;
		
		//Floating point data type
		int value1 = 9/2;// 4 bytes
		float value2 = 10f/6f;//4 bytes --- f is used to explicitly tell java that this is a float value varible
		double value3 = 10d/6d;//8 bytes --- d is used to explicitly tell java that this is a double value variable
 		System.out.println("Valuue 1 :  "+ value1);
		System.out.println("Valuue 2 :  "+ value2);
		System.out.println("Valuue 3 :  "+ value3);
		
		//Boolean Variable
		
		boolean vaar = true;  //can't give 0 or 1 value to boolean  variable 
		System.out.println("Var is :" + vaar);
		
		//Character variable 
		
		char var1 = 'S'; //Java suppors unicode coding mechanis and unicode mechanism is veery huge.we can print all the characers world wide and each and eveery lanuage.
		System.out.println("Var1" + var1);
	
		//unicode symbol
		char selection = '\u00A7';
		System.out.println("telephone : "+selection);
		
	}
}
