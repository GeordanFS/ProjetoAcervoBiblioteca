package bibliotecaMenu;

public class Memoir extends Biografia{
	
	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "Eu Sei Por Que o P�ssaro Canta na Gaiola";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Astral Cultural";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Maya Angelou";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "\n RACISMO. ABUSO. LIBERTA��O. "
				+ "\n\t A vida de Marguerite Ann Johnson foi marcada por essas tr�s palavras. "
				+ "\n\t A garota negra, criada no sul por sua av� paterna, carregou consigo um enorme fardo "
				+ "\n\t que foi aliviado apenas pela literatura e por tudo aquilo que ela p�de lhe trazer: "
				+ "\n\t conforto atrav�s das palavras. Dessa forma, Maya escreve para exibir sua voz e "
				+ "\n\t libertar-se das grades que foram colocadas em sua vida. "
				+ "\n\t As lembran�as dolorosas e suas descobertas est�o contidas e eternizadas nas p�ginas "
				+ "\n\t desta obra densa e necess�ria, dando voz aos jovens que um dia foram, assim como ela, "
				+ "\n\t fadados a uma vida dura e cheia de preconceitos.";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publica��o: ");
		this.anoPubli = 1969;
		System.out.println(anoPubli);
	}
	
	public void mostrarClasseInd() {
		System.out.print("Classe indicativa: ");
		this.classeInd = "12 anos";
		System.out.println(classeInd);
	}
	
	public void mostrarTW() {
		System.out.print("TW: ");
		this.tw = "Viol�ncia sexual infantil (verbalizado), Viol�ncia sexual (verbalizado), cenas violentas";
		System.out.println(tw);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de p�ginas: ");
		this.qtdPag = 336;
		System.out.println(qtdPag);
	}
	
	
	
	
}
