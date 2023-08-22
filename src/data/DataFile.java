package data;

import utilities.Xls_Reader;

public class DataFile {

	
	Xls_Reader read = new Xls_Reader("/Users/raashidshaikh/Desktop/QA/SeleniumWorkSpace/ErrorCollector/ValueKeeper.xlsx");
	
	
	public String ScrollValueA = read.getCellData("Data1","GetLocation",2);
	public String ScrollValueB = read.getCellData("Data1","GetLocation",3);
	
}
