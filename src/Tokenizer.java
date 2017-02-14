import java.util.StringTokenizer;

public class Tokenizer {

	
	public static void main(String[] args) {
		
		Tokenizer instancia  = new Tokenizer();

	}
	
	
	public Tokenizer() {
		
		
		String nombres = Texto.dameTexto();
		StringTokenizer tokenizer = new StringTokenizer(nombres,",");
		while (tokenizer.hasMoreElements()) {
			
			if (((String) tokenizer.nextElement()).charAt(0) != ' ')
					System.out.println("Coma Encotrada");
			
		}
	}
	
}
