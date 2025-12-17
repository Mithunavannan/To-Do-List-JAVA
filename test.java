package student;

import java.util.*;

public class test{
	

	public static void main(String[] args) {
		
		int n = 5;
		for(int row = n; row >= 1; row--) {
			for(int col = row; col <= n; col++) {
				System.out.print(col);
		}
		
		System.out.println();
		}
	}
}