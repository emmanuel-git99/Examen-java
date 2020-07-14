class Embauche extends Employe{

    private double salaire;
    private String dateEmb = "";

    public Embauche(String nomComplet, double salaire, String dateEmb){

        super(nomComplet);
        this.salaire = salaire;
        this.dateEmb = dateEmb;
    }

    public boolean isEmbauche(){

        return true;
    }

    public boolean isJournalier(){
        
        return false;
    }

    public void affiche(){
	System.out.println("....");
    }

}