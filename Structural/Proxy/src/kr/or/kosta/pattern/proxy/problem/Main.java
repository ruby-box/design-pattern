package kr.or.kosta.pattern.proxy.problem;

public class Main {
	
	
	public static void main(String[] args) {
		PrinterManager manager = new PrinterManager();
		manager.setDefaultPrinter("개발부");
		
		System.out.println("* Printer 검색");
		Printable[] printers = manager.getPrinters();
		for(int i = 0; i < printers.length; i++) {
			if (printers[i].isDefaultPrinter()) {
				System.out.print("[기본프린터] ");
			} else {
				System.out.print("[선택프린터] ");
			}
			System.out.println(printers[i].getPrinterName());
		}
		
		System.out.println("* 출력");
		Printable printer = manager.getDefaultPrinter();
		printer.print("Hello, Design Pattern");
	}

}
