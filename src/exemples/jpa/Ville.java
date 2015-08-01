package exemples.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "villes")
@NamedQueries({
		@NamedQuery(name = "Ville.getVillesByCodePostal", 
					query = "SELECT v FROM Ville v WHERE v.codePostal LIKE :cp ORDER BY v.nom") })
public class Ville {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "kp_ville")
	private long id;
	@Column(name = "ville")
	private String nom;
	private String departement;
	@Column(name = "code_postal")
	private String codePostal;
	private String region;
	@Column(name = "lng")
	private double longitude;
	@Column(name = "lat")
	private double latitude;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Ville [id=" + id + ", nom=" + nom + ", codePostal=" + codePostal + ", departement=" + departement
				+ ", region=" + region + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

}
