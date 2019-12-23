package Observer2;

class Gates implements AlarmListener {
    public void alarm() {
        System.out.println("gates close");
    }
}