package kr.ac.hansung.spring.di;

// import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {

	@Autowired // wiring by type <-> xml : <qualifier value>
	@Qualifier(value="qf_cat")
	// @Resource(name="cat") // wiring by name <->  xml : <bean id>
	private AnimalType animal;

	public void play() {
		animal.sound();
	}
}