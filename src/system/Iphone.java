package system;
import apps.Browser;
import apps.MusicPlayer;
import apps.Phone;

public class Iphone implements Browser, MusicPlayer, Phone{
	public void tocarMusica() {
		System.out.println("TOCANDO MUSICA");
	}
	
	public void pausarMusica() {
		System.out.println("MÚSICA PAUSADA");
	}
	
	public void selecionarMusica() {
		System.out.println("MUSICA SELECIONADA");
	}
	
	
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA");
	}
	
	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ADICIONADA");
	}
	
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}
	
	
	public void fazerLigacao() {
		System.out.println("REALIZANDO LIGAÇÃO");
	}
	
	public void atenderLigacao() {
		System.out.println("ATENDENDO LIGAÇÃO");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}
}
