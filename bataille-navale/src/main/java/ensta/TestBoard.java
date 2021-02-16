package ensta;
import ensta.ship.*;
class TestBoard {

    
    public static void main(String[] args) {
        Board grille = new Board("Joueur 1");
        Board grille2  = new Board ("Cam", 7);
        Destroyer dest = new Destroyer(Orientation.NORTH);
        Carrier carr = new Carrier();
        grille2.putShip(dest, 2, 3);
        grille2.putShip(carr, 5, 2);
        grille.putShip(dest, 3, 2);
        grille.putShip(carr, 3, 3);
        grille2.print();
        grille.print();
    }
}
