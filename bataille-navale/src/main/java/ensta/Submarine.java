class Submarine extends AbstractShip{
    public Submarine(Orientation orientation){
        super('S', NameShip.SUBMARINE, 3, orientation);
    }

    public Submarine(){
        this(Orientation.EAST);
    }
}
