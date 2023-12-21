package MyWork;

public class SolarPanel extends Component {
    private int power;
    SolarPanel (int power) {
        this.power=power;
    }
    @Override
    public String getDetails() {
        return ("the details are: power is " + power);
    }
    public int generatePower () {
        return power;
    }
}
