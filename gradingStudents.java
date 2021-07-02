/* add same as input when
		divisible by 5 : i%5==0 
		 OR less than 38 i<38
		OR if next divisible by 5 difference is less than 3 i.e current difference is less than 2 : i%5 < 2
	else 
	add difference of 5 and i%5 to i i.e i+=(5-i%5)		

**/	
public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> result = new ArrayList<>();
		for (int i : grades) {
			result.add((i % 5 == 0 || i < 38 || i % 5 <= 2) ? i : i + (5 - i % 5));
		}
		return result;
	}
