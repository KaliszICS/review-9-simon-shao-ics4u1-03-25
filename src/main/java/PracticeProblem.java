public class PracticeProblem {

	public static void main(String args[]) {
	}

public static int lettersToFive(String word, char letter){
int count = 0;
int num =0;
while (count <5){

	if (word.charAt(num) == letter){
		count ++;
	}
	num++;
}return num;
}

public static int countLetter(String word, char letter){
	int count = 0;
		for (int num = 0; num < word.length();num++){
		if (word.charAt(num) == letter){
			count ++;
		}
	}
	return count;
}

public static int oddSum(int num, int num2){
	int max = Math.max(num, num2);
	int sum = 0;
	for (int count = Math.min(num, num2); count <= max; count++){
if (count%2 != 0){
sum +=count;
}

	}
	return sum;
}
}
