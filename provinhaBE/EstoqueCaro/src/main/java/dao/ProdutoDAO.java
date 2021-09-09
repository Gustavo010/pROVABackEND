package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import vo.Produto;

public class ProdutoDAO {

	private Produto produto;
	private ArrayList<Produto> produtos;
	private BufferedReader br;
	private BufferedWriter bw;
	private String arquivo = "C:\\dbs\\produtos.csv";

	public ArrayList<Produto> abrir() {
		produtos = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(arquivo));
			String linha = "";
			while ((linha = br.readLine()) != null) {
				String[] campos = linha.split(";");
				produto = new Produto(campos[0], campos[1], campos[2]);
				produtos.add(produto);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("DEU UM ERRINHO NO ARQUIVINHO " + e);
		}
		return produtos;
	}

	public boolean salvar(ArrayList<Produto> vs) {
		try {
			bw = new BufferedWriter(new FileWriter(arquivo, false));
			for (Produto p : vs) {
				bw.write(p.toCSV());
			}
			bw.close();
			return true;
		} catch (IOException e) {
			System.out.println("DEU ERROOOOO " + e);
			return false;
		}
	}
}