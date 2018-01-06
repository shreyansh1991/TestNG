package a.b;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class ReadSomeDataInPdf {
	PDDocument document = null;

	ReadSomeDataInPdf() throws InvalidPasswordException, IOException {
		document = PDDocument.load(new File(System.getProperty("user.dir") + File.separator + "sample.pdf"));
	}

	public static void main(String[] args) throws Exception {
		new ReadSomeDataInPdf().readPdfFile(5, 5);
		// new PdfValidation().openPdfFile();
		new ReadSomeDataInPdf().getNumberOfPages();
	}

	private void getNumberOfPages() {
		System.out.println("Number of Pages - " + document.getNumberOfPages());

	}

	private void readPdfFile(int start, int end) {
		// TODO Auto-generated method stub

		try {

			document.getClass();
			// PDPage doc= document.getPage(0);
			// System.out.println(doc);
			if (!document.isEncrypted()) {
				PDFTextStripperByArea stripper = new PDFTextStripperByArea();

				stripper.setSortByPosition(true);
				PDFTextStripper Tstripper = new PDFTextStripper();
				Tstripper.setStartPage(start);
				Tstripper.setEndPage(end);
				String st = Tstripper.getText(document);
				// Assert.assertTrue("text mismatch", st.contains("98988989"));
				System.out.println(st);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}