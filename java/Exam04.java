package dy250311;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one[] = new int[3];
		for(int i = 0; i < one.length; i++) {
			one[i] = 10* i;
		}
		
		String two[] = {"ÇÏ³ª", "µÑ" , "¼Â" };
		for(String str : two) {
			System.out.println(str);
		}
		
		int j = 0;
		while(j < one.length) {
			System.out.println(one[j]);
			j++;
		}
	}

}
