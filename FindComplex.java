public class ComplexNumbers {
    int real1;

    int imaginary1;
   
    
    public ComplexNumbers(int real1,int imaginary1)
    {
        this.real1 = real1;
        this.imaginary1 = imaginary1;
     
        
    }
    
    public void plus(ComplexNumbers c2)
    {
        this.real1 = this.real1 + c2.real1;
        this.imaginary1 = this.imaginary1 + c2.imaginary1;
        
    }
    public void multiply(ComplexNumbers c2)
	{
        int a=this.real1 * c2.real1 - this.imaginary1 * c2.imaginary1;
		  
		this.imaginary1 = this.imaginary1 *  c2.real1 + this.real1 * c2.imaginary1;
		this.real1 =a;
	}
    public void print()
    {
       
       System.out.println(real1 + " + i" + imaginary1 );

    }
    
    
	// Complete this class
	
}
