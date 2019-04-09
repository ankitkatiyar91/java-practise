package forkjoin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Random;

public class ForkJoinTest {
	
	
	public static void main(String[] args) {
		System.out.println("Test in normal mode "+new Date());
		BigInteger b=new BigInteger(50, new Random());
		normalTest(b);
		
		System.out.println("Normal Mode end "+new Date());
	}

	public static void normalTest(final BigInteger till){
		BigInteger start=BigInteger.ZERO;
			while (start.compareTo(till)!=0) {
				start=start.add(BigInteger.ONE);
				//System.out.println(start.intValue());
			}
	}
}
