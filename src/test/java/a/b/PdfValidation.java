package a.b;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PdfValidation {
	PDDocument document = null;

	PdfValidation() throws InvalidPasswordException, IOException {
		document = PDDocument.load(new File(System.getProperty("user.dir") + File.separator + "sample.pdf"));
	}

	public static void main(String[] args) throws Exception {
		new PdfValidation().readPdfFile();
		// new PdfValidation().openPdfFile();
		new PdfValidation().getNumberOfPages();
	}

	private void getNumberOfPages() {
		System.out.println("Number of Pages - " + document.getNumberOfPages());

	}

	private static void openPdfFile() {
		try {

			File pdfFile = new File(System.getProperty("user.dir") + File.separator + "sample.pdf");
			if (pdfFile.exists()) {

				if (Desktop.isDesktopSupported()) {
					Desktop.getDesktop().open(pdfFile);
				} else {
					System.out.println("Awt Desktop is not supported!");
				}

			} else {
				System.out.println("File is not exists!");
			}

			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private void readPdfFile() {
		// TODO Auto-generated method stub

		try {

			document.getClass();
			// PDPage doc= document.getPage(0);
			// System.out.println(doc);
			if (!document.isEncrypted()) {
				PDFTextStripperByArea stripper = new PDFTextStripperByArea();

				stripper.setSortByPosition(true);
				PDFTextStripper Tstripper = new PDFTextStripper();
				
				String st = Tstripper.getText(document);
				// Assert.assertTrue("text mismatch", st.contains("98988989"));
				System.out.println(st);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}