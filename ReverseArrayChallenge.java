import java.util.Arrays;
public class ReverseArrayChallenge {

	
	
	public static void main(String[] args) {
		int[] arrayUm= {1,2,3,4,5};
		ReverseArrayChallengeMethods r = new ReverseArrayChallengeMethods();
		r.reverse(arrayUm);
		System.out.println(Arrays.toString(arrayUm));
	}
	
}
