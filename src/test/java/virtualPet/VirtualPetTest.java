package virtualPet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test

	public void shouldAssignFood() {
		// arrange
		VirtualPet underTest = new VirtualPet();
		// act
		underTest.Eat(300);
		// assert
		Assert.assertEquals(300, underTest.food);
	}

	@Test

	public void shouldAssignSleep() {
		// arrange
		VirtualPet underTest = new VirtualPet();
		// act
		underTest.Sleep(400);
		// assert
		Assert.assertEquals(400, underTest.sleep);
	}

	@Test

	public void shouldAssignHappiness() {
		// arrange
		VirtualPet underTest = new VirtualPet();
		// act
		underTest.Play(300);
		// assert
		Assert.assertEquals(300, underTest.happy);

	}

}