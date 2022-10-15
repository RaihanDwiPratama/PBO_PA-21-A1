import javax.swing.JOptionPane;
public class Latihan03 {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		int confirm = jop.showConfirmDialog(null, "Apakah PBO sulit?");
		
		// menggunakan if else
//		if (confirm == 0) {
//			jop.showMessageDialog(null, "Anda memilih iya");
//		} else if (confirm == 1) {
//			jop.showMessageDialog(null, "Anda memilih tidak");
//		} else {
//			jop.showMessageDialog(null, "Anda tidak memilih");
//		}
		
		// menggunakan switch case
		switch(confirm) {
		case 0:
			jop.showMessageDialog(null, "Anda memilih iya");
			break;
		case 1:
			jop.showMessageDialog(null, "Anda memilih tidak");
			break;
		case 2:
			jop.showMessageDialog(null, "Anda tidak memilih");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		jop.showConfirmDialog(
//				null, 
//				"Apakah PBO sulit?", 
//				"Konfirmasi pilihan", 
//				jop.YES_NO_OPTION);
//		
//		jop.showConfirmDialog(null, 
//				"Apakah PBO sulit?", 
//				"Konfirmasi pilihan",
//				jop.YES_NO_CANCEL_OPTION);
//		
//		jop.showConfirmDialog(null, 
//				"Apakah PBO sulit?", 
//				"Konfirmasi pilihan",
//				jop.OK_CANCEL_OPTION);
//		
//		jop.showConfirmDialog(null, 
//				"Apakah PBO sulit?", 
//				"Konfirmasi pilihan",
//				jop.OK_OPTION);
	}

}
