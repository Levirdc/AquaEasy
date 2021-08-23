package Aquario;

import java.text.DecimalFormat;
import java.util.Scanner;

public abstract class MeasuresAndCalculations {
	
	 double length, height, width, totalCapacity, realCapacity;
	 
	 Scanner dataEntry = new Scanner(System.in);
	 DecimalFormat formatting = new DecimalFormat("#0.00");
     
	 public MeasuresAndCalculations() {
		
		
		
		System.out.println("Insira as Medidas do Aquário");
		System.out.print("Comprimento= ");
		length = dataEntry.nextDouble();
		
		System.out.print("Largura= ");
		width = dataEntry.nextDouble();
		
		System.out.print("Altura= ");
		height = dataEntry.nextDouble();
		System.out.println("");
		
		totalCapacity = length * width * height / 1000;
		System.out.println("Capacidade Total= " + formatting.format(
				totalCapacity) + " Litros ");
		
		realCapacity = totalCapacity * 0.85;
		System.out.println("Capacidade Real= " + formatting.format(
				realCapacity) + " Litros");
		dataEntry.close();
		
		
	}

    double gravel, filter, thermostat, lighting;
	
	
	void amountOfGravel() {
		gravel = length * width * 5 / 1000;
		System.out.println("Quantidade Aproximada de Cascalho = " + 
		formatting.format(gravel) + " Kg");
	}
	
	void filtering() {
		filter = realCapacity * 5;
		System.out.println("Filtragem Ideal Aproximada= " + 
		formatting.format(filter) + " L/h");
	}
	
	void heating() {
		thermostat = realCapacity * 1.3;
		System.out.println("Potência Aproximada do Termostato = " +
		formatting.format(thermostat) + " watts");
	}
	
	void luminosity() {
		lighting = realCapacity * 0.9;
		System.out.println("Iluminação Ideal Aproximada= " + 
		formatting.format(lighting) + " watts");
	}
}
