import java.util.StringTokenizer;

public class Constructor {

	public boolean hayZetas(CharSequence cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.toLowerCase(cadena.charAt(i)) == 'z')
				System.out.println("pene");
				return true;
		}
		return false;
	}

	
}
	
//	public static void main(String[] args) {
//
//		StringBuffer uno = new StringBuffer();
//		StringBuffer dos = new StringBuffer(80);
//		StringBuffer tres = new StringBuffer("Godofredo");
//		Constructor instancia = new Constructor();
//
//		System.out.println("longitudes " + uno.length() + " " + dos.length() + " " + tres.length());
//		System.out.println("capacidades " + uno.capacity() + " " + dos.capacity() + " " + tres.capacity());
//
//		String cosa = "si hay z";
//		StringBuilder cosaBuilder = new StringBuilder("hay zeta");
//		StringBuffer cosaBuffer = new StringBuffer("no hay zeta");
//		System.out.println("hay zetas " + instancia.hayZetas(cosaBuilder));
//		// Tokenizer
//		String nombre = "Angel;Franco;Garcia";
//		StringTokenizer tokens = new StringTokenizer(nombre, ";");
//		while (tokens.hasMoreTokens()) {
//			System.out.println(tokens.nextElement());
//		}
//
//		String[] lsitaNombres = nombre.split(";");
//		for (int i = 0; i < lsitaNombres.length; i++) {
//			System.out.println(lsitaNombres[i]);
//		}
//
//	}
//}
