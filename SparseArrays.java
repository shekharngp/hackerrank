package hackerRankIntreviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//submission for https://www.hackerrank.com/challenges/sparse-arrays/submissions
public class SparseArrays {

	public static void main(String[] args) {
		List<String> input = new ArrayList<>();
		Collections.addAll(input, "ab", "ab", "abc");
		List<String> queries = new ArrayList<>();
		Collections.addAll(queries, "ab", "abc", "bc");

		System.out.println(matchingStrings(input, queries));
	}

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

		List<Integer> result = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();

		// key: string : value : number of occurrence
		for (String s : strings)
			map.put(s, map.getOrDefault(s, 0) + 1);

		// add count to result based on comparison. else 0
		for (String q : queries)
			result.add(map.containsKey(q) ? map.get(q) : 0);

		return result;

	}

}
