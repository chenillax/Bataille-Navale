class Carrier extends AbstractShip{
    public Carrier(Orientation orientation){
        super('C', NameShip.CARRIER, 5, orientation);
    }

    public Carrier(){
        this(Orientation.EAST);
    }
}