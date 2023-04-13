package pdfExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadDataFromPDF {
	
	
	@Test
	public void verifyPDFContent() throws Exception {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Act\\OneDrive\\Desktop\\Playwright_Course_Overview.pdf");
		
		
		PDDocument pdfDocument = PDDocument.load(fis);
		
		
		int pdfPageCount = pdfDocument.getPages().getCount();
		System.out.println("no of pages: " + pdfPageCount);
		
		
		PDFTextStripper pdfText = new PDFTextStripper();
		
		String docText = pdfText.getText(pdfDocument);
		
		
		System.out.println(docText);
		
		
		Assert.assertTrue(docText.contains("Page Object Model"));
		
	}

}
