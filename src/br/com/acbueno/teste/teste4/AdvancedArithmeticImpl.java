package br.com.acbueno.teste.teste4;

public class AdvancedArithmeticImpl implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		 int sum = 0;
	        for (int i = 1; i <= 1000; ++i)
	            sum += (n / i) * i;
	        return sum;
	}

}
