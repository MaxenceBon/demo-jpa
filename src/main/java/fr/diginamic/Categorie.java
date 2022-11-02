package fr.diginamic;

public enum Categorie {
	
	PETITE("petite"),
	MOYENNE("moyenne"),
	GRANDE("grande");

	private String taille;
	
	private Categorie(String taille) {
		this.taille=taille;
	}
	
static Categorie[] categories = Categorie.values();
	
	public static Categorie affichage(String taille) {
		for (Categorie categorie : categories) {
			if (categorie.getTaille().equals(taille)) {
				return categorie;
			}
		}
		return null;
	}

	/** Getter pour taille
	 * @return the taille
	 */
	public String getTaille() {
		return taille;
	}

	/** Setter pour taille
	 * @param taille the taille to set
	 */
	public void setTaille(String taille) {
		this.taille = taille;
	}

	
	
}