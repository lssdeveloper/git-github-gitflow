import static org.junit.Assert.*;

import org.junit.Test;


import Embaralhador.EmbaralharShuffle;

public class TestesEmbaralharShuffle {

	@Test
	public void Embaralhar() {
		assertNotEquals("Bernardo", new EmbaralharShuffle().EmbaralharPalavra("Bernardo"));
	}

}
