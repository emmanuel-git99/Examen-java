package Administration;

public class Employe{
	private int id;
	private String nomComplet;


	public Employe(int id,String nomComplet){
		super();
		this.id=id;
		this.nomComplet=nomComplet;
	}



	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getNomcomplet(){
		return nomComplet;
	}
	public void setNomcomplet(String nomComplet){
		this.nomComplet;
	}

	//Methode Afficher

	public void Affiche(){
		System.out.println(id + nomComplet);
	}
	//methode isEmbauche
	public void isEmbauche(){

	}

	//methode isJournalier
	public void isJournalier(){

	}
	public void AjouterEmploye(){
		
	}

}