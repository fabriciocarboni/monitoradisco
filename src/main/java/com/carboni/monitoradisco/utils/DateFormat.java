package com.carboni.monitoradisco.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

	public static String FormatDate () {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = (Date) Calendar.getInstance().getTime();

		String dataFormatada = sdf.format(date);
					
		return dataFormatada;
}
		
		
	public static String FormatHour() {

		SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");
		Date hora = (Date) Calendar.getInstance().getTime();
		
		String horaFormatada = sdfHora.format(hora);

		return horaFormatada;

	}

}
