package virtualPet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test

	public void shouldAssignFood() {
		// arrange
		VirtualPet underTest = new VirtualPet();
		// act
		underTest.Feed(300);
		// assert
		Assert.assertEquals(300, underTest.Feed);
	}

	@Test

	public void shouldAssignSleep() {
		// arrange
		VirtualPet underTest = new VirtualPet();
		// act
		underTest.rest(400);
		// assert
		Assert.assertEquals(400, underTest.rest);
	}

	@Test

	public void shouldAssignHappiness() {
		// arrange
		VirtualPet underTest = new VirtualPet();
		// act
		underTest.happy(300);
		// assert
		Assert.assertEquals(300, underTest.happy);

	}

}