 package ensta.ship;

 class AbstractShip {

    protected char label ;
    protected NameShip name ;
    protected int size ;
    protected Orientation orientation;

    /***
     * Mutateur
     */
    public void setLabel(char label){
        this.label = label ;
    }
    public void setName(NameShip name){
        this.name = name ;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setOrientation(Orientation orientation){
        this.orientation = orientation;
    }
    /***
     * Accesseur
     */
    public char getLabel(){
        return this.label ;
    }
    public NameShip getName(){
        return this.name  ;
    }
    public int getSize(){
        return this.size ;
    }
    public Orientation getOrientation(){
        return this.orientation;
    }
    /***
     * Constructeur
     */
    public AbstractShip(char label, NameShip name, int size, Orientation orientation){
        this.label = label ;
        this.name = name ;
        this.size = size ;
        this.orientation = orientation;
    }
}

/***
 * Un label qui permettra de représenter le type de navire sur la grille.
 * Un nom qui correspond au nom entier du type navire.
 * Une taille.
 * Une orientation.
 * Les accesseurs nécessaires pour faire de l’encapsulation.
 * Un mutateur pour l’orientation.
 * Un constructeur valué, prenant en argument un nom, un label, une taille et une orientation
 */