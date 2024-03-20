package in.juhu.cdac;

public class WideningWithDiffDt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue=10;

		float floatValue=2.5f;
		double doubleValue=1.5d;

		double Addition= intValue + floatValue + doubleValue;
		System.out.println(" Result : " +Addition);

		double Subtraction=intValue - floatValue - doubleValue;
		System.out.println(" Result :" +Subtraction);

		double Multiplication=intValue *  floatValue * doubleValue; 
		System.out.println(" Result : "+Multiplication);

		double Division=intValue / floatValue / doubleValue;
		System.out.println(" Result : "+Division);

	}

}
