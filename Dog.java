public class Dog extends Canine{
	private String breed;
	
	public Dog(String x){
		setBreed(x);
		isDomesticated = true;
	}

	public void setBreed(String x){
		breed = x;
	}

}