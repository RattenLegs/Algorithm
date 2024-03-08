package upgradeFunction01;

public class MultiTableUpgrade {

	public static void main(String[] args) {
	
		//가능은 한데 의미가 없네
		
		for(int i=1; i<=9; i++) {
//			System.out.println(i);
			for(int j=1; j<=9; j++){
				System.out.printf("%3d", i*j);
				//System.out.printf(i*j);
				//The method printf(String, Object...) in the type PrintStream is not applicable for the arguments (int)
			}
			System.out.println();
		}

	}

}
