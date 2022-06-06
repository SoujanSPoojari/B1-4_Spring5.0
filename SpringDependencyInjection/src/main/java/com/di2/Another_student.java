package com.di2;

public class Another_student {
	//Dependency in objects
			Cheat c;
			public void setC(Cheat c) {
				this.c = c;
			}
			public void cheating() {
				// TODO Auto-generated method stub
				c.mathCheat2();
			}
			public Another_student() {
				super();
				// TODO Auto-generated constructor stub
			}
			
}
