package mgessl.cipher;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class V extends JFrame {
	private M m1;
	private C c1;
	private P p1;
	private JFrame f1;
	private ButtonGroup g1;
	private JRadioButton b1;
	private JRadioButton b2;
	public V(M m, C c) {
		this.m1=m;
		this.c1=c;
		this.p1= new P(this.m1);
		this.b1 = new JRadioButton("SubsitutionChiper", true);
		this.b2 = new JRadioButton("ShiftChiper");
		this.g1=new ButtonGroup();
		this.g1.add(this.b1);
		this.g1.add(this.b2);
		this.f1= new JFrame("Verschlüsselung2");
		this.f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.f1.add(this.b1);
		this.f1.add(this.b2);
		this.f1.setSize(350,450);
		
		this.f1.setVisible(true);
	}
	public void refresh() {
		p1.repaint();
		
	}
}
