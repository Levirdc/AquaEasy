package Aqua;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Peixes {

	public static void main(String[] args) {
		//variáveis
		double c, l, a, cap, capr, cas, ter, fil;
		
		//objetos
		Scanner ent = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("#0.00");
		
		System.out.println("MEDIDAS DO AQUÁRIO");
		System.out.print("Insira o Comprimento= ");
		c = ent.nextDouble();
		System.out.print("Insira a Largura= ");
		l = ent.nextDouble();
		System.out.print("Insira a Altura= ");
		a = ent.nextDouble();
		
		//processamento 1 - volume do aquário
		cap = c * l * a / 1000;
		capr = cap * 0.85;
		
		//processamento 2 - quant. de cascalho e potência dos equipamentos
		cas = c * l *5 / 1000;
		ter = capr * 1.3;
		fil = capr * 5;
		
		//saída
		System.out.println("RESULTADOS");
		System.out.println("Capacidade Total= " + casas.format(cap));
		System.out.println("Capacidade Real= " + casas.format(capr));
		System.out.println("Cascalho = " + casas.format(cas) + " Kg");
		System.out.println("Termostato = " + casas.format(ter) + " watts");
		System.out.println("Filtro = " + casas.format(fil) + " L/h");
		
		
		ent.close();

	}

}
