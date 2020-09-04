package MyObjectOriented;

public class FractionUse {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(4,6);
		f1.print();
		//f1.increment();
		Fraction f2 = new Fraction(4,8);
		f2.print();
		//Doing f1 = f1+f2;    (Storing the result in f1 itself)
		//f1.add(f2);
		//f1.print();
		//Creating object to store the returned fraction value
		//f3 = f1 + f2
//		Fraction f3 = Fraction.add(f1, f2);
//		f3.print();
		//Doing f1 = f1 -f2 (Storing the result in f1 itself)
//		f1.subtract(f2);
//		f1.print();
		//Doing f2 = f2 * f1(Storing the result in f12 itself)
		f2.Multiply(f1);
		f2.print();
		
	}

}
