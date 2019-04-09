package com.stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9});
		
		stream.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		});
		
	}

}
