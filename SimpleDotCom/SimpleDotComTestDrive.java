class SimpleDotComTestDrive{
	public static void main(String[] args){
		SimpleDotCom dot = new SimpleDotCom();
		
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);

		String userGuess = "2";
		String result = dot.checkYourSelf(userGuess);
		//String testResult = "Fault!";

		//if (result.equals("Hit!")){
			//testResult="Sucsess";

		//}
		//System.out.println(testResult);

	}
}