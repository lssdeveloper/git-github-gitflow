import static org.junit.Assert.*;

import org.junit.Test;

import Embaralhador.EmbaralharReverse;

public class TestesEmbaralharReverse {

	@Test
	public void Embaralhar() {
		assertEquals("odranreB", new EmbaralharReverse().EmbaralharPalavra("Bernardo"));
	}

}
