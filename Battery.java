package MyWork;

public class Battery extends Component {

    private int capacity;
    Battery(int capacity) {
        this.capacity= capacity;
    }
    @Override
    public String getDetails() {
        return("the details are: capacity is " +capacity);
    }
    public int getCapacity() {
        return capacity;
    }
}
