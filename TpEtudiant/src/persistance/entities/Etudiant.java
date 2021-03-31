package persistance.entities;
// Generated 31 mars 2021 � 14:40:09 by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Etudiant generated by hbm2java
 */
@Entity
@Table(name = "ETUDIANT", schema = "TPETUDIANT")
public class Etudiant implements java.io.Serializable {

	private BigDecimal code;
	private String nom;
	private Double moyenne;

	public Etudiant() {
	}

	public Etudiant(BigDecimal code) {
		this.code = code;
	}

	public Etudiant(BigDecimal code, String nom, Double moyenne) {
		this.code = code;
		this.nom = nom;
		this.moyenne = moyenne;
	}

	@Id

	@Column(name = "CODE", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getCode() {
		return this.code;
	}

	public void setCode(BigDecimal code) {
		this.code = code;
	}

	@Column(name = "NOM", length = 20)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "MOYENNE", precision = 126, scale = 0)
	public Double getMoyenne() {
		return this.moyenne;
	}

	public void setMoyenne(Double moyenne) {
		this.moyenne = moyenne;
	}

}
