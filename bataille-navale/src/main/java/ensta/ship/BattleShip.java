package ensta.ship;

class BattleShip extends AbstractShip{
    public BattleShip(Orientation orientation){
        super('B', NameShip.BATTLESHIP, 4, orientation);
    }

    public BattleShip(){
        this(Orientation.EAST);
    }
}