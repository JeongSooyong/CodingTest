import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		// x와 y의 값 범위
		if(x>=-1000&&x<=1000&&y>=-1000&&y<=1000) {
			
			
			// x와 y가 양수일때(1사분면)
			if(x>0&&y>0) {
				
				System.out.println(1);
				
			} else if(x<0&&y>0) { // x가 음수이고 y가 양수일때(2사분면)
				
				System.out.println(2);
				
			} else if(x<0&&y<0) { // x와 y가 음수일때(3사분면)
				
				System.out.println(3);
				
			} else { // x가 양수이고 y가 음수일때(4사분면)
				
				System.out.println(4);
				
			}
			
		}
		
		scanner.close();
		
	}

}
