package houseprojector;

public class IlluminanceTooMuchException extends Exception{
	public IlluminanceTooMuchException(){
		System.out.print("Exceeded maximum illumination of 4000 Lux ");
	}
}
