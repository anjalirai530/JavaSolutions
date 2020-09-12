
public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
        double a = 0.0;
        if(k == 0)
            return 1;
       
            a = findGeometricSum(k-1);
    
            return 1/Math.pow(2,k) + a;

	}
}
