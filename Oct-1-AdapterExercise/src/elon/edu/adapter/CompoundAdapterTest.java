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
		assertEquals("",water.display());
	}

	@Test
	public void testGetBoilingPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMeltingPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMolecularFormula() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMolecularWeight() {
		fail("Not yet implemented");
	}

}
