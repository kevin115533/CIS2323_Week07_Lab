import java.util.Scanner;

public class MakePack{
	public static void main(String[] args){
		Dog rover = new Dog("beagle");
		Dog chewy = new Dog("chiwawa");
		Wolf wolfee = new Wolf();
		
		System.out.println("is rover domesticated: " + rover.getDomesticated());
		System.out.println("is chewy domesticated: " + chewy.getDomesticated());
		System.out.println("is wolfee domesticated: " + wolfee.getDomesticated());
		
		
			
	}
	
	

}