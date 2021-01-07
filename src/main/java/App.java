import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import sequenceOperations.SequenceOperator;

public class App {

	public static void main(String[] args) throws IOException {
	
		// 1, 2, 3, 4, 5
		List<Integer> sequenceOne = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 1, 2));
		/// 1, 2, 3, 4, 5
		List<Integer> sequenceTwo = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 2, 3, 4, 5));
		// 1, 2, 3, 4
		List<Integer> sequenceThree = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 2, 3, 4, 1, 2));
		// 1, 2, 3, 4 (11, 12, 13, 14 also of equal length) -> should return FIRST largest subsequence
		List<Integer> sequenceFour = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 1, 100, 11, 12, 13, 14));
		// 1, 2, 3, 4, 5
		List<Integer> sequenceFive = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 5, 4, 3, 2, 1));
		
		SequenceOperator.findLongestSubsequence(sequenceOne);
		SequenceOperator.findLongestSubsequence(sequenceTwo);
		SequenceOperator.findLongestSubsequence(sequenceThree);
		SequenceOperator.findLongestSubsequence(sequenceFour);
		SequenceOperator.findLongestSubsequence(sequenceFive);
		
		List<Integer> randomSequenceOne = new ArrayList<Integer>();
		randomSequenceOne = createRandomList(10, 10);
		SequenceOperator.findLongestSubsequence(randomSequenceOne);
		
		List<Integer> randomSequenceTwo = new ArrayList<Integer>();
		randomSequenceTwo = createRandomList(100, 20);
		SequenceOperator.findLongestSubsequence(randomSequenceTwo);
		
		List<Integer> randomSequenceThree = new ArrayList<Integer>();
		randomSequenceThree = createRandomList(1000, 20);
		SequenceOperator.findLongestSubsequence(randomSequenceThree);
		
		List<Integer> randomSequenceFour = new ArrayList<Integer>();
		randomSequenceFour = createRandomList(10000, 40);
		SequenceOperator.findLongestSubsequence(randomSequenceFour);
	}
	
	public static List<Integer> createRandomList(int listSize, int range){
		List<Integer> generatedList = new ArrayList<Integer>();
		Random random = new Random();
		
		for(int i = 0; i < listSize; i++) {
			Integer randomNumber = random.nextInt(range);
			generatedList.add(randomNumber);
		}
		
		return generatedList;
	}
	
}
