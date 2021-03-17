package it.polito.tdp.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		
		System.out.println("Test libretto");
		
		Libretto libretto= new Libretto();
		
		Voto voto1= new Voto("Analisi matematica",30,LocalDate.of(2019,1, 27));
		libretto.add(voto1);
		libretto.add(new Voto("Fisica",28,LocalDate.of(2019,1, 30)));
		libretto.add(new Voto("Informatica",24,LocalDate.of(2019,2, 12)));
		
		System.out.println(libretto);

	}

}
