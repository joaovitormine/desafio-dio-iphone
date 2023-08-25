import system.Iphone;

public class Main {
	public static void main(String[] args) {
		Iphone iPhone = new Iphone();
		
		System.out.println("Executando o aplicativo Browser");
		iPhone.exibirPagina();
		iPhone.adicionarNovaAba();
		iPhone.atualizarPagina();
		
		System.out.println("Executando o aplicativo Phone");
		iPhone.fazerLigacao();
		iPhone.atenderLigacao();
		iPhone.iniciarCorreioVoz();
		
		System.out.println("Executando o aplicativo MusicPlayer");
		iPhone.tocarMusica();
		iPhone.pausarMusica();
		iPhone.selecionarMusica();
	}
}
