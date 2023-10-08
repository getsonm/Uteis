package com.getson.uteis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ExemploSimpleDateFormat {

	public static void main(String[] args) {

		Date data = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("E");
		SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss a");
		SimpleDateFormat sdf4 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf5 = new SimpleDateFormat("MMMM");
		SimpleDateFormat sdf6 = new SimpleDateFormat("M");
		SimpleDateFormat sdf7 = new SimpleDateFormat("EEE d MMM yyyy - hh:mm:ss a z");
		SimpleDateFormat sdf8 = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdf9 = new SimpleDateFormat("HH:mm:SS a");
		
		System.out.println("Data...........: " + sdf1.format(data));
		System.out.println("Dia............: " + sdf2.format(data));
		System.out.println("Hora...........: " + sdf3.format(data));
		System.out.println("Mês............: " + sdf4.format(data));	// número
		System.out.println("Mês............: " + sdf5.format(data));	// nome do mês
		System.out.println("Mês............: " + sdf6.format(data));	// número
		System.out.println("Mês............: " + sdf7.format(data));	// dia da semana dia/mes/ano - hora formato AM/PM Local
		sdf7.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println("UTC Data.......: " + sdf7.format(data));	// dia da semana dia/mes/ano - hora formato UTC AM/PM
		System.out.println("Hora...........: " + sdf8.format(data)); 	// Hora 24h
		System.out.println("Hora...........: " + sdf9.format(data)); 	// Hora 24h + AM / PM
	}

}
