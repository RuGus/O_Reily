class Dog2{
	String name;
	public static void main (String[] args){
		Dog2 dog1=new Dog2();
		dog1.bark();
		dog1.name = "BART";

		Dog2[] myDogs = new Dog2[3];

		myDogs[0]= new Dog2();
		myDogs[1]= new Dog2();
		myDogs[2]= dog1;

		myDogs[0].name="Fred";
		myDogs[1].name="Jons";

		System.out.print("Name of last dog is -");
		System.out.println(myDogs[2].name);

		int x=0;
		while(x<myDogs.length){
			myDogs[x].bark();
			x=x+1;
		}

	}

	public void bark(){
		System.out.println(name+" say BARK");
	}

}