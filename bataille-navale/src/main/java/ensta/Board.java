package ensta ;
import ensta.ship.*;

public class Board implements IBoard{
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
     * Méthodes
     */
    public int getSize(){
        return navire.length;
    }
    /*public void putShip(AbstractShip ship, int x, int y){
        switch(ship.getOrientation()){
                case Orientation.NORTH:
                    if (y + ship.getSize() < navire.length && hasShip(x, y) ){
                        for (int i = 0 ; i < ship.getSize() ; i++){
                            navire[x][y+i] = ship.getLabel();
                        }
                    }
                    else {
                        System.out.println("Impossible de le placer ici");
                    }
                case Orientation.SOUTH:
                if (y - ship.getSize() > 0){
                    boolean  ok =true ;
                    for (int i = 0 ; i < ship.getSize() ; i++){
                        if (hasShip(x, y-i)){
                            ok = false;
                        }
                    }
                    if (ok) {
                    for (int i = 0 ; i < ship.getSize() ; i++){
                        navire[x][y-i] = ship.getLabel();
                    }}
                }
                else {
                    System.out.println("Impossible de le placer ici");
                }
                case Orientation.EAST:
                    if (x + ship.getSize() < navire.length ){
                        for (int i = 0 ; i < ship.getSize() ; i++){
                            navire[x+1][y] = ship.getLabel();
                        }
                    }
                    else {
                        System.out.println("Impossible de le placer ici");
                    }
                case Orientation.WEST:
                if (x - ship.getSize() > 0 ){
                    for (int i = 0 ; i < ship.getSize() ; i++){
                        navire[x-i][y] = ship.getLabel();
                    }
                }
                else {
                    System.out.println("Impossible de le placer ici");
                }
                default : 
                    System.out.println("Ceci est étrange.");
        }
    }*/
    public void putShip(AbstractShip ship, int x, int y){
        boolean ok = true;
        switch(ship.getOrientation()){
                case Orientation.NORTH:
                        
                        for (int i = 0 ; i < ship.getSize() ; i++){
                            if (!hasShip(x, y+i)){
                                ok = false;
                            }
                        }
                        if (ok){
                            for (int i = 0 ; i < ship.getSize() ; i++){
                            navire[x][y+i] = ship.getLabel();
                        }  
                        }
                    else {
                        System.out.println("Impossible de le placer ici");
                    }
                case Orientation.SOUTH:
                for (int i = 0 ; i < ship.getSize() ; i++){
                    if (!hasShip(x, y-i)){
                        ok = false;
                    }
                }
                if (ok){
                    for (int i = 0 ; i < ship.getSize() ; i++){
                    navire[x][y-i] = ship.getLabel();
                }  
                }
            else {
                System.out.println("Impossible de le placer ici");
            }
                case Orientation.EAST:
                for (int i = 0 ; i < ship.getSize() ; i++){
                    if (!hasShip(x+i, y)){
                        ok = false;
                    }
                }
                if (ok){
                    for (int i = 0 ; i < ship.getSize() ; i++){
                    navire[x+i][y] = ship.getLabel();
                }  
                }
            else {
                System.out.println("Impossible de le placer ici");
            }
                case Orientation.WEST:
                for (int i = 0 ; i < ship.getSize() ; i++){
                    if (!hasShip(x-i, y)){
                        ok = false;
                    }
                }
                if (ok){
                    for (int i = 0 ; i < ship.getSize() ; i++){
                    navire[x-i][y] = ship.getLabel();
                }  
                }
            else {
                System.out.println("Impossible de le placer ici");
            }
                default : 
                    System.out.println("Ceci est étrange.");
        }
    }
   
    public boolean hasShip(int x, int y){
        return x >= 0 && x < navire.length && y >= 0 && y < navire.length && navire[x][y] != "0";
    }
    public void setHit(boolean hit, int x, int y){
        frappe[x][y] = hit ;
    }
    public Boolean getHit(int x, int y){
        return frappe[x][y];
    }


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
        System.out.print(" | Frappes:\n");
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
        System.out.print("|   ");
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
            if (navire[i][j] == "0"){ 
            System.out.print(". ");
            }
            else {
                System.out.print(navire[i][j]);
                System.out.print(" ");
            }
        }
        System.out.print("| ");
        System.out.print(i);
        System.out.print(" ");
        if (taille >= 10 && i < 10){
            System.out.print(" ");
        }
        for (int j =0; j<taille; j++){
            if (frappe[i][j]){
                System.out.print("X ");
            }
            else {      
                System.out.print(". ");
            }
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


