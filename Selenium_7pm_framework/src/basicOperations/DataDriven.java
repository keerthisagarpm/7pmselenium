package basicOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven implements Common_vari
{
  public static String getData(String sheetname,int row,int column) throws EncryptedDocumentException, IOException
  {
	  FileInputStream fis = new FileInputStream(Excell_path);
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh = wb.getSheet(sheetname);
	  Row r = sh.getRow(row);
	  Cell c = r.getCell(column);
	  String data = c.getStringCellValue();
	  return data;
	  
	  
  }
}
