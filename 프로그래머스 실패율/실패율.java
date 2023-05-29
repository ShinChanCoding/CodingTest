import java.util.Arrays;
 
class Solution {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
 
		double rank[][] = new double[N][2];
		for (int i = 0; i < N; i++){
            rank[i][0] = i + 1;
        }

		for (int i = 0; i < stages.length; i++) {
			if (stages[i] <= N)
				rank[stages[i] - 1][1]++;
		}
 
		int beforePeople = 0;
		for (int i = 0; i < N; i++) {
			double result = rank[i][1];
			rank[i][1] = rank[i][1] / (stages.length - beforePeople);
			beforePeople += result;
			if (beforePeople == stages.length)
				break;
		}
 
		Arrays.sort(rank, (com1, com2) -> {
			if (com1[1] == com2[1])
				return Double.compare(com1[0], com2[0]);
			return -Double.compare(com1[1], com2[1]);
		});
 
		for (int i = 0; i < N; i++)
			answer[i] = (int) rank[i][0];
 
		return answer;
	}
}
