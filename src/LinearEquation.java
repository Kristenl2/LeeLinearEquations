public class LinearEquation {
    //instance variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    //Creates an object
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //Calculates and returns distance
    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    //calculates and returns the slope
    public double slope() {
        double slope = ((double)y2 - y1) / (x2 - x1);
        return roundedToHundredth(slope);
    }

    //Calculates and returns the y-intercept
    public double yIntercept() {
        double intercept = y1 - (slope() * x1);
        return roundedToHundredth(intercept);
    }

    //Creates the equation
    public String equation() {
        String equation = "y = ";
        if (slope() < 0) {
            equation += "-";
        }
        if (Math.abs(slope())==1 || slope()==0){
            equation += "";
        } else if ((slope() % 1.0) == 0) {
            equation += Math.abs((int)slope());
        } else {
            equation += Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1);
        }
        if (slope() == 0){
            equation += "";
        } else {
            equation += "x ";
        }
        if (yIntercept() < 0) {
            equation += "- ";
        } else if (yIntercept() == 0 || slope() ==0) {
            equation += "";
        } else {
            equation += "+ ";
        }
        if (yIntercept() != 0){
            equation += Math.abs(yIntercept());
        }
        return equation;
    }

    //Calculates and returns coordinate
    public String coordinateForX(double xValue){
        double ycoord = roundedToHundredth(xValue*slope() + yIntercept());
        return "(" + xValue + ", " + ycoord + ")";
    }

    //returns all the info
    public String lineInfo(){
        String info = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + " , " + y2 + ")" + "\n";
        info += "The equation of the line between these points is: " + equation() + "\n";
        info += "The slope of this line is: " + slope() + "\n";
        info += "The y-intercept of the line is: " + yIntercept() + "\n";
        info += "The distance between the two points is: " + distance() + "\n";
        return info ;
    }

    //Rounds to the hundredths
    public double roundedToHundredth(double toRound){
        return Math.round(100*toRound)/100.0;
    }
}
