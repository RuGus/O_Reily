public class BeerSong{
	public static void main(String[] args){
		int beerNum = 20;
		String word = "botles";
		
		while (beerNum > 0){
			if (beerNum == 1){
				word = "botle";
			}
			System.out.println(beerNum + " " + word + " of beer on the table.");
			System.out.println("Take the one.");
			System.out.println("And turn around.");
			beerNum = beerNum - 1;
			if (beerNum<=0){
				System.out.println("Beer the end!");
			}

		}
	}
}