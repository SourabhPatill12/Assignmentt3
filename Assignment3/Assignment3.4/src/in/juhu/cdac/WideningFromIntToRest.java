package in.juhu.cdac;

public abstract class WideningFromIntToRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue=10;

		float floatValue=intValue;

		double doubleValue=intValue;
		boolean boolValue;

		System.out.println("Widening to float : "+floatValue);
		System.out.println("Widening to double : " +doubleValue);

		if(intValue>=10) {
			boolValue= true;
		}
		else {
			boolValue = false;
		}
		System.out.println("Widening to boolean : "+boolValue);

	}

}
