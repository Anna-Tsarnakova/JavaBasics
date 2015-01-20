
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Pr9_GeneratePDF {
	public static void main(String[] args) {
		try {
			
			Document pdfDocument = new Document();
			String pdfFile = "Deck-of-Cards.pdf";
			PdfWriter.getInstance(pdfDocument, new FileOutputStream(pdfFile));
			pdfDocument.open();
			
			BaseFont baseFont = BaseFont.createFont("lib/font/FreeSerif.ttf", BaseFont.IDENTITY_H, true);
			Font fontBlack = new Font(baseFont, 30F, 0, BaseColor.BLACK);
			Font fontRed = new Font(baseFont, 30F, 0, BaseColor.RED);
						
			PdfPTable table = new PdfPTable(4);

			String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
			char[] suits = {'\u2660', '\u2666', '\u2665', '\u2663'};
			
			PdfPCell cell = null;
		
			for (int face = 0; face < faces.length; face++) {
				for (int suit = 0; suit < suits.length; suit++) {
					String card = faces[face] + suits[suit];
					if (suit == 0 || suit == 3) {
						cell = new PdfPCell(new Paragraph(card, fontBlack));			
					} 
					else {
						cell = new PdfPCell(new Paragraph(card, fontRed));	
					}
					cell.setHorizontalAlignment(Element.ALIGN_CENTER);		
			        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			        cell.setFixedHeight(150F);
					table.addCell(cell);
				}
			}

			pdfDocument.add(table);
			pdfDocument.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
