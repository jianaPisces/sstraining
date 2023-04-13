package pdfExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadDataFromPDF2 {
	
	
	@Test
	public void verifyPDFContent() throws Exception {
		
		
		FileInputStream fis = new FileInputStream("D:\\Training\\Functional_Automation\\~IBM_Training\\Apr_Selenium\\APITesting_POSTMAN_Training_CourseOutline_3Days.pdf");
		
		
		PDDocument pdfDocument = PDDocument.load(fis);
		
		
		int pdfPageCount = pdfDocument.getPages().getCount();
		System.out.println("no of pages: " + pdfPageCount);
		
		
		PDFTextStripper pdfText = new PDFTextStripper();
		
		
		//start and end
		pdfText.setStartPage(2);
		pdfText.setEndPage(2);
		
		String docText = pdfText.getText(pdfDocument);
		
		
		System.out.println(docText);
		
		
		Assert.assertTrue(docText.contains("How to run from Jenkins CI"));
		
	}

}
