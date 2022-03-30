package utils;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String ProjectPath;
	static XSSFWorkbook WorkBook;
	static XSSFSheet Sheet;
	public ExcelUtils(String ExcelPath, String SheetName) throws IOException {
		WorkBook=new XSSFWorkbook(ExcelPath);
		Sheet=WorkBook.getSheet(SheetName);
	}
public int getRowCount() throws IOException {
		int RowCount= Sheet.getPhysicalNumberOfRows();
//		System.out.println("Row Count :"+RowCount);
		return RowCount;
	}
public int getColumnCount() throws IOException {
	int ColCount= Sheet.getRow(0).getPhysicalNumberOfCells();
//	System.out.println("Column Count :"+ColCount);
	return ColCount;
}
	public String getCellDataString(int RowNum, int ColNum) throws IOException {
		String CellDataString=Sheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
//		System.out.println("Cell Data :"+CellDataString);
		return CellDataString;
	}
	public static Object[][] TestData(String ExcelPath, String SheetName) throws IOException {
		ExcelUtils obj=new ExcelUtils(ExcelPath, SheetName);
		int RowCount=obj.getRowCount();
		int ColCount=obj.getColumnCount();
		Object data[][]= new Object[RowCount][ColCount];
		for(int i=0;i<RowCount;i++) {
			for(int j=0;j<ColCount;j++) {
				String CellData=obj.getCellDataString(i, j);
				System.out.print(CellData+" ");
				data[i][j]=CellData;
			}
			System.out.println();
		}
		return data;
	}
}
