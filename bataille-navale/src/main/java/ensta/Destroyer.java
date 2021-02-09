class Destroyer extends AbstractShip{
    public Destroyer(Orientation orientation){
        super('D', NameShip.DESTROYER, 2, orientation);
    }

    public Destroyer(){
        this(Orientation.EAST);
    }
}