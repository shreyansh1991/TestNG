package a.b;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
public class PDFTableExtractor {
    public static void main(String[] args) throws IOException {
        ArrayList<String[]> objTableList = readParaFromPDF(System.getProperty("user.dir") + File.separator + "sample.pdf", 1,1,6);
        //Enter Filepath, startPage, EndPage, Number of columns in Rectangular table
    }
    public static ArrayList<String[]> readParaFromPDF(String pdfPath, int pageNoStart, int pageNoEnd, int noOfColumnsInTable) {
        ArrayList<String[]> objArrayList = new ArrayList<String[]>();
        try {
            PDDocument document = PDDocument.load(new File(pdfPath));
            document.getClass();
            if (!document.isEncrypted()) {
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);
                PDFTextStripper tStripper = new PDFTextStripper();
                tStripper.setStartPage(pageNoStart);
                tStripper.setEndPage(pageNoEnd);
                String pdfFileInText = tStripper.getText(document);
                // split by whitespace
                String Documentlines[] = pdfFileInText.split("\\r?\\n");
                for (String line : Documentlines) {
                    String lineArr[] = line.split("\\s+");
                    if (lineArr.length == noOfColumnsInTable) {
                        for (String linedata : lineArr) {
                            System.out.print(linedata + "             ");
                        }
                        System.out.println("");
                        objArrayList.add(lineArr);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception " +e);
        }
            return objArrayList;
    }
}