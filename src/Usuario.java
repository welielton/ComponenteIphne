
public class Usuario {

	public static void main(String[] args) {

		AparelhoTelefonico vaptelefonico = new Iphone();
		vaptelefonico.ligar("99900000000");
		vaptelefonico.atender();
		vaptelefonico.iniciarCorreioVoz();

		ReprodutorMusical vrpmusical = new Iphone();
		vrpmusical.selecionarMusica("Ludovico Einaudi - Experience (Live At Fabric, London/2013)");
		vrpmusical.pausar();
		vrpmusical.tocar();

		NavegadorInternet vnavegador = new Iphone();
		vnavegador.adicionarAba();
		vnavegador.exibirPagina("ESPAÇO DA SOBREVIVÊNCIA");
		vnavegador.atualizarPagina();
	}

}
