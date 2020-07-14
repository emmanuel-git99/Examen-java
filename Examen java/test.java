import java.util.Scanner;
classe employe {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String args[]) {
        Employe[]  employe = new Employe[2];
        Service[]  service = new Service[2];
        Embauche[]  embauche = new Embauche[2];
        Journalier[]  journalier = new Journalier[2];
 
        employe[0] = new Employe("Malfichu",0.0);
        employe[1] = new Employe("Palichon",0.0);
 
        service[0] = new Service("Aspiron");
        service[1] = new Service("Rhinoplexil");
        int choix;
 
        do {
            choix = menu();
 
            switch (choix) {
            case 1 :
                Ajout Service(employe, service);
                break;
            case 2 :
                Lister les Services(service);
                break;
            case 3 :
                Ajouter un employer(employe);
                break;
            case 4:
                Lister les Journaliers(employe);
                break;
            case 5:
                Lister les Embauches service (employe,service);
                break;
            case 6:
                quitter();
            }
        }
        while (choix < 6);
// Les méthodes utilitaires
 
    static int menu() {
        int choix = 0;
        System.out.println();
        System.out.println();
        System.out.println("1 : Ajout Service");
        System.out.println("2 : Lister les Services");
        System.out.println("3 : Ajouter un employer");
        System.out.println("4 : Lister les Journaliers");
        System.out.println("5 : Lister les Embauches d'un service");
        System.out.println("6 : Quitter");
        while ((choix != 1) && (choix != 2) && (choix != 3) && (choix != 4)) {
            choix = scanner.nextInt();
        }
        return choix;
    }
    //  Méthodes auxiliaires à compléter