package mgessl.cipher;
/**
 * 
 * @author micha
 * @version12.12.2018
 */
public class ShiftChipher extends MonoAlphabeticCipher{
	private int ShiftValue;
	public ShiftChipher(int inumb) {
		setShiftValue(inumb);
		
	}
	public void setShiftValue(int inumb) {
		if (inumb>0 && inumb<30) {
			this.ShiftValue=inumb;
		} else {
			System.out.println("Die Zahl ist falsch");
		}
	}
	public static void main(String[] args) {
		ShiftChipher sC=new ShiftChipher(4);
	}
}
