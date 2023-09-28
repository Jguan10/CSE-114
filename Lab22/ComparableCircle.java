class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    public int compareTo(ComparableCircle o) {
        if(this.getArea() > o.getArea()) {
            return 1;
        }
        else if(this.getArea() < o.getArea()) {
            return -1;
        }
        else
            return 0;
    }

}
