public class P2p11_1s21{
	public static void main(String[] args) {
		for (String cadena : args){
			char parametro = cadena.charAt(1);
			switch(parametro){
			case 'a': System.out.println("mensaje de analisis de datos"); break;
			case 'b': System.out.println("mensaje para instalacion avanzada"); break;
			case 'h': System.out.println("mostrara toda esta lista deparametros"); break;
			case 'e': System.out.println("ejecutara el programa sin ningun elemento"); break;
			}
		}
	}
}
