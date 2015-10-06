package elon.edu.adapter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChemicalDataBankTest {

	private ChemicalDataBank b ;
	
	@Before
	public void setUp() throws Exception {
		b = new ChemicalDataBank();
	}

	@After
	public void tearDown() throws Exception {
		b = null;
	}

	@Test
	public void testGetCriticalPoint() {
		assertEquals(b.getCriticalPoint("water", ""), 100.0, 0.1);
	}
	
	@Test
	public void testGetCriticalPoint2() {
		assertEquals(b.getCriticalPoint("water", "M"), 0.0, 0.1);
	}

	@Test
	public void testGetMolecularStructure() {
		assertEquals(b.getMolecularStructure("water"), "H2O");
	}

	@Test
	public void testGetMolecularWeight() {
		assertEquals(b.getMolecularWeight("water"), 18.0, 0.1);
	}

}
