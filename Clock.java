package Clock;

import java.util.Scanner;

public class Clock {
    private Number hour = new Number();
    private Number minute = new Number();
    private Number second = new Number();
    public void setTime(int hour, int minute, int second) {
        this.hour.setValue(hour);
        this.minute.setValue(minute);
        this.second.setValue(second);
    }
    public void setLimit(int hourLimit, int minuteLimit, int secondLimit) {
        hour.setLimit(hourLimit);
        minute.setLimit(minuteLimit);
        second.setLimit(secondLimit);
    }
    public void tick() {
        if (second.numberIncrease()) {
            if(minute.numberIncrease()) {
                hour.numberIncrease();
            }
        }
    }
    public void screen() {
        System.out.println(hour.show() + " : " + minute.show() + " : " + second.show());
    }

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        clock.setLimit(12, 60, 60);
        clock.setTime(15, 04, 0);
        while (true) {
            Thread.sleep(1000);
            clock.screen();
            clock.tick();
        }
    }
}
