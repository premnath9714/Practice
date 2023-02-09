import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Excel {

	public static void main(String[] args) throws Exception {
		
	String path	=("C:\\Users\\1\\Desktop\\Excel Data\\Testdata.xlsx");
		
		FileInputStream fis=new FileInputStream(path);
		
		//XSSFWorkBook wb=new XSSFWorkBook()
		
		String data=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data);
		

	}

}
