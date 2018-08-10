class SimpleDotCom{
	private int [] locationCells;
	private int numOfHits;

	public String checkYourSelf(String stringGuess){
		int guess = Integer.parseInt(stringGuess);	// преобразуем строку в число
		String result="Fault!";

		for (int cell:locationCells){
			if(guess==cell){
				result="Hit!";
				numOfHits++;
				break;
			}
		}
		if (numOfHits==locationCells.length){
			result="The end!!!";

		}
		System.out.println(result);
		return result;
	}
	public void setLocationCells(int[] locs){
		locationCells=locs;
	}
}