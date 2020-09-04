package MyObjectOriented;

public class Fraction {

	
  private int numerator;
  private int denominator;
	
	public Fraction(int numerator,int denominator )
	{
		if(denominator == 0) {
			denominator = 1;
		}
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	public void setNumerator(int num)
	{
		this.numerator  = num;
		simplify();
	}
	public void setDenominator(int num)
	{ 
		if(num==0)
			return;
		this.denominator  = num;
		simplify();
	}
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	
	public void simplify() {
		int gcd =1;
		int min = Math.min(numerator,denominator);
		for(int i = 2;i <= min ;i++)
		{
			if(numerator % i ==0 &&  denominator %i ==0)
			{
				gcd = i;
			}
		}
		 numerator = numerator/ gcd;
	     denominator = denominator/gcd;
	}
	
	public void print() {
		System.out.println(numerator + "/" + denominator);

	}
	
	public void add(Fraction f2)
	{
		//first fraction is one the fraction on which the function is called
		//second fraction is passed as arguments
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator  = this.denominator * f2.denominator;
		simplify();
	}
	public void subtract(Fraction f2)
	{
		this.numerator = this.numerator * f2.denominator - this.denominator * f2.numerator;
		this.denominator = this.denominator *  f2.denominator;
		simplify();
	}
	public void Multiply(Fraction f1)
	{
		this.numerator = this.numerator * f1.numerator;
		this.denominator = this.denominator *  f1.denominator;
		simplify();
	}
	public void increment() {
		
		this.numerator = numerator + denominator;
		
	    simplify();
	}
	public static Fraction add(Fraction f1 , Fraction f2)
	{
		int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDeno  = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNum,newDeno);
		return f3;
	}
	

}
