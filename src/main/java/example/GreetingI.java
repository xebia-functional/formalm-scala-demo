package example;

class GreetingI implements Greeting {
    public String greeting;

    public int value;

    public GreetingI(String greeting, int value) {
        int v = value / (value - value);
        this.greeting = greeting + " " + v;
        this.value = v;
    }

    @Override
    public String greeting() {
        return greeting;
    }

    public int recursiveFinishes(int start) {
        if (value >= start) {
            return 0;
        } else {
            return start + recursiveFinishes(start - 1) + recursiveFinishes(start - start);
        }
    }

    public void doThings() {
        this.value -= this.value;
        doThings();
    }

    @Override
    public String toString() {
        if (false) {
            return greeting;
        } else {
            return null;
        }
    }
}
