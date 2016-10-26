package kr.ac.hansung.spring.di;

public class Dog implements AnimalType {

	// Dependency Injection으로 값을 넣음
	private String myName;

	public void setMyName(String myName) {
		this.myName = myName;
	}

	@Override
	public void sound() {
		System.out.println("Dog name=" + myName + ": " + "Bow Wow");
	}
}