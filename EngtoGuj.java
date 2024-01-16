import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

public class EngtoGuj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            FileInputStream file = new FileInputStream("C:\\Users\\reshma.pillai\\Downloads\\English.xlsx");
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through cells to retrieve English text
            for (Row row : sheet) {
                for (Cell cell : row) {
                    String englishText = cell.getStringCellValue();

                    // Use Google Translate API or any translation method to convert English to Gujarati
               //     String gujaratiText = translateToGujarati(englishText);

                    // Set Gujarati text in the cell
                 //   cell.setCellValue(gujaratiText);
                }
            }

            file.close();

            // Write the modified content to a new file
            FileOutputStream outFile = new FileOutputStream("output.xlsx");
            workbook.write(outFile);
            outFile.close();

            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	/*
	 * private static String translateToGujarati(String text) { //Translate
	 * translate = TranslateOptions.getDefaultInstance().getService(); //Translation
	 * translation = translate.translate(text,
	 * Translate.TranslateOptions.targetLanguage("gu")); // return
	 * translation.getTranslatedText(); }
	 */

}
