package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


public class Emprunt {

	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="DATE_DEBUT")
	private Date dateDebut;
	
	@Column(name="DATE_FIN")
	private Date dateFin;
	
	@Column(name="DELAI_MAX")
	private Integer delaiMax;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	
	@ManyToMany(mappedBy = "emprunts")
	private List<Livre> livres = new ArrayList<Livre>();

	public Emprunt() {
	
	}

	/** Getter pour id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter pour id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter pour dateDebut
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/** Setter pour dateDebut
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter pour dateFin
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter pour dateFin
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/** Getter pour delaiMax
	 * @return the delaiMax
	 */
	public Integer getDelaiMax() {
		return delaiMax;
	}

	/** Setter pour delaiMax
	 * @param delaiMax the delaiMax to set
	 */
	public void setDelaiMax(Integer delaiMax) {
		this.delaiMax = delaiMax;
	}
	
	
	
}
