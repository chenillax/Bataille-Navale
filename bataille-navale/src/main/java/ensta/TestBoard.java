class TestBoard {
    
    public static void main(String[] args) {
        Board grille = new Board("Joueur 1");
        Board grille2  = new Board ("Cam", 7);
        grille2.print();
        grille.print();
    }
}
