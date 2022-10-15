import javax.swing.JOptionPane;
public class Latihan02 {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		// disimpan dalam variabel
		String nama = jop.showInputDialog(null, "Masukan nama anda");

		// tidak disimpan
//		jop.showInputDialog(null, "Masukan nama anda");
		
		/*
		 * convert atau parsing
		 * 1. menggunakan tipe data primitive
		 * 2. menggunakan tipe data objek 
		 */
		
		// primitive 
		int nama2 = Integer.parseInt(nama);
		
		// object
		Integer.parseInt(jop.showInputDialog("Masukan umur anda"));
		
	}

}
