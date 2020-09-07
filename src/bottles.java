public class bottles {
	public bottles(int bottleCount) {
		for (int i = bottleCount; i != 1 ; i--) {
			System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n", i, i);
			System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.\n\n", i-1);
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.printf("Go to the store and buy some more, %d bottles of beer on the wall.", bottleCount);
	}	
}
