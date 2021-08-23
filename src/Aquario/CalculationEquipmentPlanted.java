package Aquario;

public class CalculationEquipmentPlanted extends MeasuresAndCalculations{
	
	double fertilizer;
	
	void filtering() {
		filter = realCapacity * 3;
		System.out.println("Filtragem Ideal Aproximada= " + 
		formatting.format(filter) + " L/h");
	}
	
	void amountOfGravel() {
		gravel = length * width * 7 / 1000;
		System.out.println("Quantidade Aproximada de Cascalho= " +
		formatting.format(gravel) + " Kg");
	}
	
	void luminosity() {
		lighting = realCapacity * 2;
		System.out.println("Iluminação Ideal Aproximada= " +
		formatting.format(lighting) + " watts");
	}
	
	void fertileSubstrate() {
		fertilizer = length * width * 2 / 1000;
		System.out.println("Quantidade Aproximada de Substrato Fértil= " +
		formatting.format(fertilizer) + " Kg");
	}

}
