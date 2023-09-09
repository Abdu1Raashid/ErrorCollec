package data;

import utilities.Xls_Reader;

public class DataFile {

	
	Xls_Reader read = new Xls_Reader("/Users/raashidshaikh/Desktop/QA/SeleniumWorkSpace/ErrorCollector/GeoStore.xlsx");
	
	
	public String SearchValueOne = read.getCellData("Sheet1","SearchValus",2);
	public String SearchValueTwo = read.getCellData("Sheet1","SearchValus",3);
	public String SearchValueThree = read.getCellData("Sheet1","SearchValus",4);
	public String SearchValueFour = read.getCellData("Sheet1","SearchValus",5);
	public String SearchValueFive = read.getCellData("Sheet1","SearchValus",6);
	
	
	public String EnterEmailOne = read.getCellData("Sheet1", "LoginDetail", 2);
	public String EnterEmailTwo = read.getCellData("Sheet1", "LoginDetail", 3);
	public String EnterEmailThree = read.getCellData("Sheet1", "LoginDetail", 4);
	
	public String EmailError = read.getCellData("Sheet1", "EmailError",2);
	public String FNameError = read.getCellData("Sheet1", "EmailError",3);
	public String LNameError = read.getCellData("Sheet1", "EmailError",4);
	public String NoPassError = read.getCellData("Sheet1", "EmailError",5);
	public String ShortPassError = read.getCellData("Sheet1", "EmailError",6);
	public String PredPassError = read.getCellData("Sheet1", "EmailError",7);
}
