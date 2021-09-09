
package vo;

import java.util.Objects;

public class Produto{
	
	private String perola;
	private String numero;
	private String tab;
	
	
	public Produto(String perola, String numero, String tab) {
		
		this.perola = perola;
		this.numero = numero;
		this.tab = tab;
	}
	public Produto(String[]csv) {
		this.perola = csv[0];
		this.numero = csv[1];
		this.tab = csv[2];
		
	}
	
	public String getPerola() {
		return perola;
	}
	public void setPerola(String perola) {
		this.perola = perola;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTab() {
		return tab;
	}
	public void setTelefone(String tab) {
		this.tab = tab;
	}

	@Override
	public int hashCode() {
		return Objects.hash(perola);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(perola, other.perola);
	}
	
	
	@Override
	public String toString() {
		return perola + "\t" + numero + "\t" +  tab + "\n";
	}

	public String toCSV() {
		return perola + ";" + numero + ";" + tab + "\r\n";
	}
	
	public String toHTML() {
		return "<tr><td>" + perola + "</td><td>" + numero + "</td><td>" + tab + "</td></tr>";
	}
	
}


