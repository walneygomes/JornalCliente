package oBSERVERR;

public class Teste {
	public static void main(String[] args) {

		Jornal[] jornal = { new JornalParaiba(), new JaJornal() };
		Cliente marcelo = new Cliente();
		marcelo.setNome("Marcelo");
		Cliente junior = new Cliente();
		junior.setNome("Junior");
		Cliente brasCuba = new Cliente();
		brasCuba.setNome("BrasCuba");

		jornal[1].assinante(marcelo);
		jornal[1].assinante(brasCuba);

		jornal[0].assinante(marcelo);
		jornal[0].assinante(brasCuba);

		jornal[1].assinante(junior);
		jornal[0].assinante(junior);

		for (int i = 0; i < jornal.length; i++) {
			jornal[i].notifica("Noticia urgente: Et's em algum lugar do espaço. ");

		}

	}

}
