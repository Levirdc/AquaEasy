package Aquario;

public class CalculationEquipmentCommunity extends MeasuresAndCalculations{
	
	void filtering() {
		filter = realCapacity * 4;
		System.out.println("Filtragem Ideal= " + 
		formatting.format(filter) + " L/h");
	}

}
