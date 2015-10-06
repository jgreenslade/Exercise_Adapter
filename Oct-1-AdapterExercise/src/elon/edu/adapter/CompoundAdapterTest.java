package elon.edu.adapter;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompoundAdapterTest {

	private ChemicalCompound water;

	@Before
	public void setUp() throws Exception {
		water = new CompoundAdapter("Water");
	}

	@After
	public void tearDown() throws Exception {
		water = null;
	}

	@Test
	public void testDisplay() {
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		System.setOut(new PrintStream(b));
		water.display();
		assertEquals(b.toString().trim(),
				"Compound: Water\n" 
						+ "Formula: H2O\n" 
						+ "Weight: 18.0\n" 
						+ "Melting Point: 0.0\n" 
						+ "Boiling Point: 100.0");
	}

	@Test
	public void testGetBoilingPoint() {
		assertEquals(water.getBoilingPoint(), 100.0, 0.1);
	}

	@Test
	public void testGetMeltingPoint() {
		assertEquals(water.getMeltingPoint(), 0.0, 0.1);
	}

	@Test
	public void testGetMolecularFormula() {
		assertEquals(water.getMolecularFormula(), "H2O");
	}

	@Test
	public void testGetMolecularWeight() {
		assertEquals(water.getMolecularWeight(), 18.0, 0.1);
	}

}
