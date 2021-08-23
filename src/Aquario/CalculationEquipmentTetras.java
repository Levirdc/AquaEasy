package Aquario;

public class CalculationEquipmentTetras extends MeasuresAndCalculations {
	
	void filtering() {
		filter = realCapacity * 3;
		System.out.println("Filtragem Ideal= " + 
		formatting.format(filter) + " L/h");
	}

}
