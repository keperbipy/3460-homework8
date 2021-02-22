
import java.util.Scanner;

public class Jugs {
	public static int aSize;
	public static int bSize;
	public static int cSize;
	public static int n= 4194303;
	public  static boolean[] visited;
	public static int start = 0;
	public static int end;
	
	public static boolean solution;
	
	public static int getVal(int state, char c) {
		if (c == 'a'){
			return (state >> 11);
		}
		else if (c == 'b'){
			return (state & 2047);
		}
		return -1;
	}
	

	public static boolean dfs(int state) {
		if(state < 0 || state >= n) {
			return false;
		}
		else if (state == end) {
			return true;
		}
		visited[state] = true;
		
		return true;
	}
	

	
	public static void print() {
	
		
		
		
	}

	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter A: ");
		aSize = 3;
		//aSize = kb.nextInt();
		System.out.print("Enter B: ");
		bSize = 4;
		//b = kb.nextInt();
		System.out.print("Enter C: ");
		//cSize = kb.nextInt();
		cSize = 5;
		end =  (aSize << 11) + bSize;
		
		
		visited = new boolean[n];
		
        if (dfs(start)) {
			System.out.println("Yay! Found a solution.");
			print();
		}
		else {
			System.out.println("Impossible!");
			System.out.println("A: " + aSize + " B: " +bSize );
			System.out.println("END: " + end + " n: " +n );
		}
		
		
    }

}






