package fibonaci;

public class fibonacci implements fibonaci{

	@Override
	public int calculate(int n, boolean flag) {
		 if (flag) return fibonacci(n);
	        else return -1;
	}
	 private int fibonacci(int n) {
	        if (n <= 1) return n;
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
}
