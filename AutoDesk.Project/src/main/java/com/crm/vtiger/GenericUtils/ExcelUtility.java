package com.crm.vtiger.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class contains methods for reading a data in excel sheet
 * @author BasavaRAJ
 *
 */
public class ExcelUtility {
	/**
	 * this method used to read data from excel by specifying sheetname,row number and cell number
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @return cell String value
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public String getExcelData(String sheetName,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(IPathConstant.EXCEL_FILEPATH);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		return cell.getStringCellValue();
	}
	public String getExcelData(String sheetName,String tcId,String headerValue) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(IPathConstant.EXCEL_FILEPATH);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		int lastrow=sheet.getLastRowNum();
		int expectedRow=0;
		for(int i=0;i<=lastrow;i++)
		{
			String testcaseID=sheet.getRow(i).getCell(0).getStringCellValue();
			if(testcaseID.equalsIgnoreCase(tcId))
			{
				expectedRow=i;
				break;
			}
		}
		expectedRow--;
		int expectedColumn=0;
		int lastCell=sheet.getRow(expectedRow).getLastCellNum();
		for(int j=0;j<lastCell;j++)
		{
			String value=sheet.getRow(expectedRow).getCell(j).getStringCellValue();
				if(value.equalsIgnoreCase(headerValue))
				{
					expectedColumn=j;
					break;
				}
		}
		return sheet.getRow(expectedRow+1).getCell(expectedColumn).getStringCellValue();
	}

}
