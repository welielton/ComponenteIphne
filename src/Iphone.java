
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	public void tocar() {
		System.out.println("TOCANDO A MÚSICA");
		System.out.println("==========================");

	}

	public void pausar() {
		System.out.println("MÚSICA PAUSADA");

	}

	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO A MÚSICA: " + musica);

	}

	public void ligar(String numero) {
		System.out.println("LIGANDO PARA O NUMERO: " + numero);

	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO");

	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
		System.out.println("==========================");

	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO O BLOG: " + url);

	}

	@Override
	public void adicionarAba() {
		System.out.println("ABA ADICIONADA");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("PÁGINA ATUALIZADA");

	}

}
