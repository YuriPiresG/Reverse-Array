import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallengeMethods {

	public Scanner sc = new Scanner(System.in);
	private int temp;
	
	public void reverse(int[] array) {
		int test = array.length-1;
		temp = array[test];
		array[0]=array[test];
		for(int i=0;i<array.length;i++) {
			if(temp<array[i]) {
				array[i]=temp;
			}
			else {
				temp=array[i];
			}
		}
		
	}
	
}
