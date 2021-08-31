package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\New folder\\Sample.xlsx");

		FileInputStream fis = new FileInputStream(file);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Sheet1");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();

				if (cellType == 1) {
					String value = cell.getStringCellValue();
					if (value.equals("sdfds")) {
						cell.setCellValue("thillai");
					}
				} else {
					System.out.println(cell.getNumericCellValue());
				}
			}

		}

		FileOutputStream fos = new FileOutputStream(file);

		wb.write(fos);

	}

}
