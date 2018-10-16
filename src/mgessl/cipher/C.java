package mgessl.cipher;
import java.awt.event.*;

public class C implements ActionListener{
	private M m1;
	private V v1;
	public C() {
		this.m1= new M();
		this.v1=new V(this.m1, this);
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args) {
		C c1= new C();
	}
}
