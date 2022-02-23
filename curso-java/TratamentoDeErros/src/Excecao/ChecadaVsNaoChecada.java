package Excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) throws Exception {

		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//geraErro2();
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim");

	}

	// Exceção Não checada ou não verifica
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}

	// Exceção checada ou verificada
	static void geraErro2() throws Exception {
		try {
			throw new Exception("Ocorreu um erro bem legal #02!");
		} catch (Exception e) {
			System.out.println("que legal");
		}
	}

}
