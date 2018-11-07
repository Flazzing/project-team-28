package cs361.battleships.models;

public class Destroyer extends Ship {

    private Square captainsQuarters;

    public Destroyer()
    {
        super();
        this.captainsQuarters = new Square();
        this.captainsQuarters.setColumn(super.getOccupiedSquares().get(1).getColumn());
        this.captainsQuarters.setRow(super.getOccupiedSquares().get(1).getRow());
    }
    Square getCaptainsQuarters()
    {
        return this.captainsQuarters;
    }
}
