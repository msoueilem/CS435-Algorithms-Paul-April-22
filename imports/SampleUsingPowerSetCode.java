package usingpowerset;

import java.util.*;

import external.*;

public class SampleUsingPowerSetCode {

	public static void main(String[] args) {
		//WARNING:
		//If you make a list like this:
		//    List<Integer> list = Arrays.asList(1,2,3);
		//the code sample will not work because
		//"asList" produces a list whose iterator does not
		//support the remove operation (and this operation
		//is needed in the powerSet method).List<Integer> list = Arrays.asList(1,2,3);
		//
		//This sample code shows what goes wrong with "asList"
		// List<Integer> l = Arrays.asList(1,2,3);
//		   for(int i = 0; i < 3; ++i) {
//			  l.remove(i);
//		   }
		List<Integer> list = new ArrayList() {
			{
				add(1);
				add(2);
				add(3);
			}
		};
		
		List<Set<Integer>> powerset = PowerSet.powerSet(list);
		System.out.println(powerset);
	
		
		

	}

}
