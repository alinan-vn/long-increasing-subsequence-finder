package sequenceOperations;

import java.util.ArrayList;
import java.util.List;

public class SequenceOperator {

	public static void findLongestSubsequence(List<Integer> numList) {
		
		System.out.println("==================================");
		System.out.println("Full List: " + numList);
		System.out.println("Size: " + numList.size());
		System.out.println("=============");
		
		List<Integer> largestSubsequence = new ArrayList<Integer>();
		List<Integer> currentSubsequence = new ArrayList<Integer>();
		Integer lastNum = 0;
			
		int ind = 0;
		
		for(Integer num : numList) {
			
			ind++;
			
			if(num > lastNum) {
				
				currentSubsequence.add(num);
				
				if(largestSubsequence.size() == (currentSubsequence.size() - 1)){
					
					List<Integer> fakeList = new ArrayList<Integer>();
						
					for(int i = 0; i < (currentSubsequence.size() - 1); i++) {
						
						fakeList.add(currentSubsequence.get(i));
						
					}
					
					if(twoListsEqual(largestSubsequence, fakeList)) {

						largestSubsequence.add(num);
						
					} else if (largestSubsequence.size() < currentSubsequence.size()){
												
						largestSubsequence.clear();
						largestSubsequence = addCurrentToLargest(currentSubsequence);
						
					}			
				}
			} else if (num <= lastNum) {
				
				currentSubsequence.clear();
				
				if(numList.size() > ind && num < numList.get(ind)) {
					
					currentSubsequence.add(num);
					
				}
			}	
			
			lastNum = num;
			
		}
		
		System.out.println("Submitted Sequence (Original): " + numList);
		System.out.println("Largest Subsequence: " + largestSubsequence);
		System.out.println("Size of Largest: " + largestSubsequence.size());
		System.out.println("==================================");
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		
	}
	
	private static boolean twoListsEqual(List<Integer> listOne, List<Integer> listTwo) {
		// this method is only called if both Lists are of equal size
		if (listOne.size() == 0) {
			return true;
		} else {
			int i = 0;
			for(int num : listOne) {
				if(num != listTwo.get(i)) {
					return false;
				}				
				i++;
			}
		}
		
		return true;
	}


	private static List<Integer> addCurrentToLargest(List<Integer> currentList) {
		// this gets called so that the two Lists aren't mutually mutative
		List<Integer> newList = new ArrayList<Integer>();
		
		for (Integer number : currentList) {
			newList.add(number);
		}
		
		return newList;
	}
	
}
