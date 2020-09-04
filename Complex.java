package MyObjectOriented;

public class Complex {
     
	
	private int real;
	private int imaginary;
	
	public Complex(int real ,int imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
    public void print()
    {
    	if(this.imaginary>0)
    	    System.out.println(real + "+" + imaginary + "i");
    	else
    		System.out.println(real + "" + imaginary +"i");
    }
	
	public void add(Complex c2)
	{
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
		
			
	}

	public void multiply(Complex c2)
	{
		this.real =  this.real * c2.real - this.imaginary * c2.imaginary;
		this.imaginary = this.imaginary *  c2.real + this.real * c2.imaginary;
		
	}
	
	public static Complex sum(Complex c1,Complex c2)
	{
		int newReal = c1.real  + c2.real;
		int newImag = c1.imaginary + c2.imaginary;
		 Complex c4 = new Complex(newReal ,newImag);
		return c4;
	}
	
}
