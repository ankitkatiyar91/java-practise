/**
 * 
 */
package com.observerTest;

import java.util.Observable;
import java.util.Observer;

/**
 * @author ipg
 * 
 */
public class MyObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Updated->" + o + "  " + arg);

	}

}
