
public class hourglass {

	public static void main(String[] args) {
		
		//execution
		base();
		tophalf();
		middle();
		bottomhalf();
		base();
//printChars * 10
	}

	private static void base() {
		System.out.print("|");
		for (int loopCount = 0; loopCount < 10; loopCount++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	private static void tophalf() {
		int colonCount = 8;
		for (int cc = 1; cc < 5; cc++) {
			for (int spacing = 0; spacing < cc; spacing++) {
				System.out.print(" ");
			}
			
			System.out.print("\\");
/*nested for*/for (int i = colonCount; i > 0; i--) {
					System.out.print(":");
}
			System.out.println("/");
			colonCount -= 2;
		}
	} // end of tophalf
	
	private static void middle() {
		for (int i = 0; i < 5; i++) {
			System.out.print(" ");
		}
		System.out.println("||");
	}
	
	private static void bottomhalf() {
		int colonCount = 2;
		for (int cc = 5; cc > 1; cc--) {
			for (int spacing = 1; spacing < cc; spacing++) {
				System.out.print(" ");
			}
			
			System.out.print("/");
/*nested for*/for (int i = colonCount; i > 0; i--) {
					System.out.print(":");
}
			System.out.println("\\");
			colonCount += 2;
		}
	} // end of bottomhalf

}
