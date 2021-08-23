package Aquario;

public class CalculationEquipmentPlanted extends MeasuresAndCalculations{
	
	double fertilizer;
	
	void filtering() {
		filter = realCapacity * 3;
		System.out.println("Filtragem Ideal= " + filter + " L/h");
	}
	
	void amountOfGravel() {
		gravel = length * width * 7 / 1000;
		System.out.println("Quantidade de Cascalho= " + gravel + " Kg");
	}
	
	void luminosity() {
		lighting = realCapacity * 2;
		System.out.println("Iluminação Ideal= " + lighting + " watts");
	}
	
	void fertileSubstrate() {
		fertilizer = length * width * 2 / 1000;
		System.out.println("Quantidade Substrato Fértil= " + fertilizer + " Kg");
	}

}
