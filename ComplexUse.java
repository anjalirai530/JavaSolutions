package MyObjectOriented;

public class ComplexUse {

	public static void main(String[] args) {
		
		Complex c1 = new Complex(1,4);
		c1.print();
		
		Complex c2 = new Complex(4,5);
//		c1.add(c2);
    	c2.print();
//        
		
		Complex c3 = new Complex(5,1);
//		c1.multiply(c3);
//		c1.print();
		//Creating new object to store the result of multiplication
		Complex c4 = Complex.sum (c1 ,c2);
		c4.print();
	}
     
     
		

	
}
