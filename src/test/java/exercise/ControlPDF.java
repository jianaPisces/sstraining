package exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ControlPDF {
	
	
	@Test
	public void ReadPDFFile() throws Exception {
		
		//PDF file - local or internet
		
		
		//File file = new File("C:\\Users\\Act\\OneDrive\\Desktop\\Playwright_Course_Overview.pdf");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Act\\OneDrive\\Desktop\\Playwright_Course_Overview.pdf");
		//FileInputStream fis = new FileInputStream("D:\\Training\\Course\\APITesting_POSTMAN_Training_CourseOutline_3Days.pdf");
		
		
		PDDocument pdfDocumnet = PDDocument.load(fis);
		
		
		int pdfPageCount = pdfDocumnet.getPages().getCount();
		System.out.println("No of pages in PDF file: " + pdfPageCount);
		
		
		PDFTextStripper pdfText = new PDFTextStripper();
		
		
		String docText = pdfText.getText(pdfDocumnet);
		
		System.out.println(docText);
		
		//validation test
		
		Assert.assertTrue(docText.contains("Recommended"));
		
		
		pdfDocumnet.close();
		fis.close();
		
	}
	
	

}
