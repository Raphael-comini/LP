package br.cefetmg.inf.lista02.p2163;
import java.util.Scanner;
public class Main {
	
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	int N = scanner.nextInt();
    	int M = scanner.nextInt();
    	int[][] T = new int[N][M];
    	
    	for (int i = 0; i < T.length; i++) {
    		for (int j = 0; j < T[i].length; j++) {
    			T[i][j] = scanner.nextInt();
    		}
    	}
    	
    	for (int i = 1; i < (T.length-1); i++) {
    		for (int j = 1; j < (T[i].length-1); j++) {
    			if (T[i][j] == 42 && isTheSword(T, i, j)) {
    				System.out.println((i+1) + " " + (j+1));
    				return;
    			}
    		}
    	}
    	
    	System.out.println(0 + " " + 0);
     scanner.close();
    }
    
	private static boolean isTheSword(int[][] mat, int i, int j) {
		if ((mat[i-1][j-1] == 7) && (mat[i-1][j] == 7) && 
				 (mat[i-1][j+1] == 7) && (mat[i][j-1] == 7) &&
				 (mat[i+1][j-1] == 7) && (mat[i+1][j] == 7) && 
				 (mat[i+1][j+1] == 7) && (mat[i][j+1] == 7)) {
				 return true; }
		else { return false; }
	}
}
