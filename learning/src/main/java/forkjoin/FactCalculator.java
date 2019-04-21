package forkjoin;

import java.math.BigInteger;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class FactCalculator extends RecursiveAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigInteger total = BigInteger.ONE;
	private BigInteger val;
	private BigInteger end;

	public FactCalculator(BigInteger integer, BigInteger end, BigInteger total) {
		this.val = integer;
		this.end = end;
		this.total = total;
	}
 
	public FactCalculator() {
	}

	@Override
	protected void compute() {
		this.total = this.total.multiply(val);
		if (val.longValue() > end.longValue()) {
			invokeAll(new FactCalculator(val.divide(BigInteger.ONE.add(BigInteger.ONE)), end, this.total),
					new FactCalculator(val.subtract(BigInteger.ONE), val.divide(BigInteger.ONE.add(BigInteger.ONE)),
							this.total));
		}
	}

	/*
	 * public BigInteger fact(final BigInteger b, final BigInteger endb) {
	 * BigInteger val = b; BigInteger t = BigInteger.ONE; while (val.longValue() >=
	 * endb.longValue()) { t
	 * =t.multiply(val.multiply(val.subtract(BigInteger.ONE))); } return t; }
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Started at-" + startTime);
		BigInteger integer = new BigInteger("5");
		BigInteger out = BigInteger.ONE;
		ForkJoinPool joinPool = new ForkJoinPool(4);
		joinPool.invoke(new FactCalculator(integer, BigInteger.ONE, out));

		System.out.println("Normal Calculation-" + (System.currentTimeMillis() - startTime));
		System.out.println(integer + " ---  " + out);
	}
}
