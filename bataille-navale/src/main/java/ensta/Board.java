

public class Board {
    /* **
     * Attribut
     */
    private String boardName;
    private String[][] navire; 
    private boolean[][] frappe ;

    /* **
     * Constructeur
     */
    public Board(String nom, int taille){
        this.boardName = nom ;
        this.navire = new String[taille][taille];
        this.frappe = new boolean[taille][taille];
    }
    public Board(String nom){
        this(nom, 10);
    }

    /***
     * Méthode
     */
    private void print_first_line(int taille){
        System.out.print("Navires:");
        if (taille-8+1 + taille > 0){
            for (int i = 0; i<(taille-8+1+taille); i++){
                System.out.print(" ");
            }
        }
        if (taille >= 10){
            System.out.print(" ");
        }
        System.out.print(" |Frappes:\n");
    }
    private void print_second_line(int taille){
        String[] alphabet = {"A ","B ","C ","D ","E ","F ","G ","H ","I ","J ","K ","L ","M ","N ","O ","P ","Q ","R ","S ","T ","U ","V ","W ","X ","Y ","Z "};
        System.out.print("  ");
        if (taille >= 10){
            System.out.print(" ");
        }
        for (int i =0; i<taille; i++){
            System.out.print(alphabet[i]);
        }
        System.out.print("|  ");
        if (taille >= 10){
            System.out.print(" ");
        }
        for (int i =0; i<taille; i++){
            System.out.print(alphabet[i]);
        }
        System.out.print("\n");
    }
    private void print_other_line(int taille, int i){

        System.out.print(i);
        System.out.print(" ");
        if (taille >= 10 && i < 10){
            System.out.print(" ");
        }
        for (int j =0; j<taille; j++){
            System.out.print(". ");
        }
        System.out.print("|");
        System.out.print(i);
        System.out.print(" ");
        if (taille >= 10 && i < 10){
            System.out.print(" ");
        }
        for (int j =0; j<taille; j++){
            System.out.print(". ");
        }
        System.out.print("\n");
    }

    public void print(){
        this.print_first_line(this.navire[0].length);
        //Deuxième ligne 
        this.print_second_line(this.navire[0].length);
        // Autre lignes
        for (int i = 1; i<(this.navire[0].length+1); i++){
            this.print_other_line(this.navire[0].length, i);
        }    
    }
}


