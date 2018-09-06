package kr.or.kosta.pattern.proxy.problem;

/**
 * 프린터 관리자<br>
 * 미리 등록된 여러 대의 프린터를 가지고 있으며 각 프린터를 찾거나 관리한다.
 */
public class PrinterManager {
	private Printable[] printers = new Printable[] {
			new Printer("회의실"),
			new Printer("영업부"),
			new Printer("개발부"),
			new Printer("관리부")
	};
	
	/**
	 * 등록된 모든 프린터를 반환한다.
	 * @return 등록된 모든 프린터
	 */
	public Printable[] getPrinters() {
		return printers;
	}

	/**
	 * printerName의 이름을 가진 프린터를 기본프린터로 설정한다.
	 * @param printerName 기본프린터 이름
	 */
	public void setDefaultPrinter(String printerName) {
		for(int i = 0; i < printers.length; i++) {
			if (printers[i].getPrinterName().equals(printerName)) {
				printers[i].setDefaultPrinter(true);
			} else {
				printers[i].setDefaultPrinter(false);
			}
		}
	}
	
	/**
	 * 기본프린터를 반환한다.
	 * @return 기본프린터 이
	 */
	public Printable getDefaultPrinter() {
		for(int i = 0; i < printers.length; i++) {
			if (printers[i].isDefaultPrinter()) {
				return printers[i];
			}
		}
		return null;
	}
	
}
