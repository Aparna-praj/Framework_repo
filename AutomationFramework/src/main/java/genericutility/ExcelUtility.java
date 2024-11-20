package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author aparna
 */

public class ExcelUtility {
	/**
	 * This method is used to read string data from excel User must pass
	 * sheetname,rowIntex,column intex
	 * 
	 * @param sheetName
	 * @param rowIntex
	 * @param colIntex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDataFromExcel(String sheetName, int rowIntex, int colIntex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptrData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIntex).getCell(colIntex).getStringCellValue();

	}

	/**
	 * This method is used to read boolean data from excel
	 * 
	 * @param sheetName
	 * @param rowIntex
	 * @param colIntex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public boolean getBooleanDataFromExcel(String sheetName, int rowIntex, int colIntex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptrData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIntex).getCell(colIntex).getBooleanCellValue();

	}

	public double getNumericDataFromExcel(String sheetName, int rowIntex, int colIntex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptrData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIntex).getCell(colIntex).getNumericCellValue();
	}

	public LocalDateTime getDataFromExcel(String sheetName, int rowIntex, int colIntex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptrData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIntex).getCell(colIntex).getLocalDateTimeCellValue();
	}
}
