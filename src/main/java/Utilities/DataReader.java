package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataReader {

	public String getPropertyData(String property) throws IOException
	{
		File f=new File(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		String data=prop.getProperty(property);
		return data;
	}
	//Resusable method to fetch excel data
	public String readExcelData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		File f=new File(Constants.excelPath);
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	
	
	
}
