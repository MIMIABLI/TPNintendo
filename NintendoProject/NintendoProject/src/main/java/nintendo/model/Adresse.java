package nintendo.model;

public class Adresse {

	
	
	private String numero ;
	private String ville;
	private String rue;
	/**
	 * @param numero
	 * @param ville
	 * @param rue
	 */
	public Adresse(String numero, String ville, String rue) {
		super();
		this.numero = numero;
		this.ville = ville;
		this.rue = rue;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", ville=" + ville + ", rue=" + rue + "]";
	} 
	
	
}
