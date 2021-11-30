package DAO;

import java.sql.Connection;
import java.sql.Date;

// Préparer Le Model
public class Article {
	//Connexion à la base de données
	Connection connect = GetConnection.getConnection();
	private int id;
	private String titre;
	private String auteur;
	private Date date;
	private String resume;
	private String contenu;
	//Constructeur
	public Article(String titre, String auteur) {
		super();
		this.titre = titre;
		this.auteur = auteur;
	}
	//Constructeur avec id
		public Article(int id, String titre, String auteur) {
			super();
			this.id = id;
			this.titre = titre;
			this.auteur = auteur;
		}
	//Guetter et setter
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

}
