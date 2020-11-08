package Clock;

public class Number {
    private int limit = 0;
    private int value = 0;
    public void setLimit(int limit) {
        this.limit = limit;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public boolean numberIncrease() {
        value = ++value%limit;
        if(value == 0) {
            return true;
        }
        else return false;
    }
    public String show() {
        if(value < 10) {
            return "0" + value;
        }
        else return "" + value;
    }
}
