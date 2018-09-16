package virtualPet;

public class VirtualPet {
	// Display the state of your pet
	int tickVarible = 0;
	int wellFed = 10;
	int rest = 10;
	int happy = 10;

	public String getStatus() {
		return "food level:" + wellFed + "\nrest:" + rest + "\nhappy:" + happy;
	}

	// Behavior of the pet: includes the resposes of feeding/playing
	public void Eat(int food) {
		wellFed += food;
	}

	public void Sleep(int sleep) {
		rest += sleep;
	}

	public void Play(int play) {
		happy += play;
	}

	// Actions
	public int Feed() {
		wellFed += 5;
		happy += 1;

		return (wellFed + happy);
	}

	public int Sleep() {
		wellFed -= 2;
		happy += 1;
		rest += 20;

		return (wellFed + happy + rest);
	}

	public int ThrowBall() {
		wellFed -= 2;
		happy += 10;
		rest += 5;

		return (wellFed + happy + rest);

	}

	public int Tick() {
		wellFed -= 3;
		happy -= 3;
		rest -= 3;

		return (wellFed + happy + rest);
	}
}