package utils;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExcelUtilsDemo {
	@Test
	public static void TestRun() throws IOException {
		String ProjectPath=System.getProperty("user.dir");
		ExcelUtils obj=new ExcelUtils(ProjectPath+"\\src\\testData\\DataProviderSheet.xlsx","Data");
		obj.getRowCount();
		obj.getColumnCount();
		obj.getCellDataString(0, 1);
	}
}
