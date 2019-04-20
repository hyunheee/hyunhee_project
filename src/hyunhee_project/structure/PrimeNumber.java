package hyunhee_project.structure;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int	range = scan.nextInt();
		eratosthenesSieve(range);
	}
	
	public static void eratosthenesSieve(int range) {
		
		ArrayList<Boolean> arrList = new ArrayList<>();
	
		//0,1은 소수아님
		arrList.add(false);
		arrList.add(false);
		
		//범위 만큼 추가
		for(int i=0;i<range-1;i++) {
			arrList.add(true);
		}
		
		//2,3,5,7,11,13
		for(int i=0;i<arrList.size();i++) {
			if(arrList.get(i)) {
				for(int j=i*i;j<arrList.size();j+=i) {
					arrList.set(j, false);
				}
			}
		}
		
		for(int i=0;i<arrList.size();i++) {
			if(arrList.get(i)) {
				System.out.print(i+" ");
			}
			
		}
		
		
	}
}
