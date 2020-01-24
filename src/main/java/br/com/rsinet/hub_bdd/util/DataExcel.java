package br.com.rsinet.hub_bdd.util;

import com.cucumber.listener.Reporter;


/*
 * Classe que transforma em metodo os dados do excel 
 */

public class DataExcel {

	public static String nomeValidLaptop() throws Exception {
		return ExcelUtils.getCellData(1, 0);
	}
	public static String nomeInvalidLaptop() throws Exception {
		return ExcelUtils.getCellData(2, 0);
	}

}

