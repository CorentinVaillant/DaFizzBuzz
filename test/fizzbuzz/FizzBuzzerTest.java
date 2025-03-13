package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzerTest {

	private FizzBuzzer jeu;

	@BeforeEach
	void setUp() throws Exception {
		jeu = new FizzBuzzer();
	}

	@Test
	void testDebutPartie() {
		assertEquals("1", jeu.next());
	}

	@Test
	void testSecondJoueurPartie() {
		jeu.next();
		assertEquals("2", jeu.next());
	}

	@Test
	void testPremierFizzPartie() {
		preshot(2);
		assertEquals("fizz", jeu.next());
	}

	private void preshot(int nbOfTurns) {
		for (int i = 0; i < nbOfTurns; i++) {
			jeu.next();
		}
	}

}
