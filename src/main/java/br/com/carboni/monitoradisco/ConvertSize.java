package br.com.carboni.monitoradisco;

import java.text.DecimalFormat;

public class ConvertSize {

	public static String formatFileSize(long size) {

		String hrSize = null;

		double b = size;
		double k = size / 1024.0;
		double m = ((size / 1024.0) / 1024.0);
		double g = (((size / 1024.0) / 1024.0) / 1024.0);
		double t = ((((size / 1024.0) / 1024.0) / 1024.0) / 1024.0);

		DecimalFormat dec = new DecimalFormat("0.00");

/*		if (t > 1) {
			hrSize = dec.format(t).concat("TB");
		} else if (g > 1) {
			hrSize = dec.format(g).concat("GB");
		} else if (m > 1) {
			hrSize = dec.format(m).concat("MB");
		} else if (k > 1) {
			hrSize = dec.format(k).concat("KB");
		} else {
			hrSize = dec.format(b).concat("Bytes");
		}
*/
		
		if (t > 1) {
			hrSize = dec.format(t);
		} else if (g > 1) {
			hrSize = dec.format(g);
		} else if (m > 1) {
			hrSize = dec.format(m);
		} else if (k > 1) {
			hrSize = dec.format(k);
		} else {
			hrSize = dec.format(b);
		}
		
		
	
		return hrSize;

	}	

}
