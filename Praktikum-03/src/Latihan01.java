import javax.swing.JOptionPane;

public class Latihan01 {

	public static void main(String[] args) {
		
		/*
		 * 1. message dialog
		 * 2. input dialog
		 * 3. confirmation dialog
		 */
		
		// bikin objek
		JOptionPane jop = new JOptionPane();
		
		/*
		 * show message dialog dengan 2 parameter
		 * 1. frame
		 * 2. message 
		 */
		jop.showMessageDialog(null, "Contoh pesan dialog");
		
		/*
		 * 1. information
		 * 2. error
		 * 3. warning
		 */
		jop.showMessageDialog(null, "Pesan dialog 4 parameter", "Pesan", jop.INFORMATION_MESSAGE);
		
		jop.showMessageDialog(null, "Pesan Error", "Error", jop.ERROR_MESSAGE);
		
		jop.showMessageDialog(null, "Pesan bahaya", "Warning", jop.WARNING_MESSAGE);
	}

}
