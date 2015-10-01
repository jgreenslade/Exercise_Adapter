package elon.edu.adapter;

public class CompoundAdapter implements ChemicalCompound {
	
	private ChemicalDataBank adaptee;
	private String compound;
	
	public CompoundAdapter(String c) {
		adaptee = new ChemicalDataBank();
		compound = c;
	}
	
	@Override
	public String display() {
		System.out.println(toString());
		return null;
	}

	@Override
	public double getBoilingPoint() {
		return adaptee.getCriticalPoint(compound, "");
	}

	@Override
	public double getMeltingPoint() {
		return adaptee.getCriticalPoint(compound, "M");
	}

	@Override
	public String getMolecularFormula() {
		return adaptee.getMolecularStructure(compound);
	}

	@Override
	public double getMolecularWeight() {
		// TODO Auto-generated method stub
		return adaptee.getMolecularWeight(compound);
	}

	@Override
	public String toString() {
		return "Compound: " + compound 
				+ "\nFormula: "	+ getMolecularFormula()
				+ "\nWeight: " + String.format("%.1f", getMolecularWeight())
				+ "\nMelting Point: " + String.format("%.1f",getMeltingPoint())
				+ "\nBoiling Point: "	+ String.format("%.1f",getBoilingPoint());
	}
}
