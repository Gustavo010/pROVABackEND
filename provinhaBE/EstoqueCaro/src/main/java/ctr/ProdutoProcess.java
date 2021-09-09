
package ctr;

import java.util.ArrayList;

import vo.Produto;
import dao.ProdutoDAO;

public class ProdutoProcess {
	
	public static ArrayList<Produto> produtos = new ArrayList<>();
	public static ProdutoDAO cd = new ProdutoDAO ();
	

	public static void testes() {
		produtos = new ArrayList<>();	
		
		produtos.add(new Produto("Diamante","250g","15.000.000,00"));
		produtos.add(new Produto("Ouro","180g","10.000.000,00"));
		produtos.add(new Produto("Adamantiu","200g","12.000.000,00"));
		produtos.add(new Produto("Granito","190g","8.000.000,00"));
	}
	
	public static void abrir() {
		produtos = cd.abrir();
	}
	public static String salvar() {
		if(cd.salvar(produtos)) {
			return "<p> Salvou cria</p>";
		}else {
			return "<p>Deu erro ao salvar irmão(olhe seu .JSP)</p>";
		}
	}
}


