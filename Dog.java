public class Dog extends Canine{
	private int height;
	private String breed;
	boolean isDomesticated;
	
	public Dog(){
		breed = null;
		isDomesticated = true;
	}
	
	public Dog(String x){
		setBreed(x);
		isDomesticated = true;
	}
	
	public void setHeight(int x){
		height = x;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void setBreed(String x){
		breed = x;
	}
	
	public String getBreed(){
		return breed;
	}
	
	
}