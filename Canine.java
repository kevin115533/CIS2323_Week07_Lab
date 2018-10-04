public class Canine{
	protected int height;
	protected boolean isDomesticated;
	
	public Canine(){
		height = 0;
		isDomesticated = true;
	}
	
	public void setHeight(int x){
		height = x;
	}
	
	public boolean getDomesticated(){
		return isDomesticated;
	}
	
}