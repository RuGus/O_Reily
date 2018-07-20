public class PhraseOMatic{
	public static void main (String[] args){
		//Words List #1
		String[] wordListOne = {"круглосуточный","взаимный", "крутой", "космический", "народный"};
		//Words List #2
		String[] wordListTwo = {"уполномоченный","трудный", "внедорожный", "экспериментальный", "экзотический"};
		//Words List #3
		String[] wordListThree = {"процесс","пункт разгрузки", "транспорт", "руководитель", "исполнитель"};
		//Lenght
		int oneLenght = wordListOne.lenght;
		int twoLenght = wordListTwo.lenght;
		int threeLenght = wordListThree.lenght;
		// Random nums
		int rand1=(int)(Math.random()*oneLenght);
		int rand2=(int)(Math.random()*twoLenght);
		int rand3=(int)(Math.random()*threeLenght);
		// Phrase build
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		// Print phrase
		System.out.println("All what we need - it " + phrase); 
	}
}