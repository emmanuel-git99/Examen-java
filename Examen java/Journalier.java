class Journalier extends Employe{

    private double duree;
    private String forfait = "";

    public Embauche(String nomComplet, double salaire, String dateEmb){

        super(nomComplet);
        this.duree = duree;
        this.forfait = forfait;
    }

    public boolean isEmbauche(){

        return false;
    }

    public boolean isJournalier(){
        
        return true;
    }

    public void affiche(){
	System.out.println("....");
    }

}