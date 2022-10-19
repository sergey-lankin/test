public class LimitingRectangle {
    int points[][];

    public LimitingRectangle(int points[][]) {
        this.points = points;
    }

    public int getWidth() {
        int width = Math.max(points[0][0], points[1][0]) - Math.min(points[0][0], points[1][0]);
        return width;
    }

    public int getHeight() {
        int heigth = Math.max(points[0][1], points[1][1]) - Math.min(points[0][1], points[1][1]);
        return heigth;
    }

    public String getBorders() {
        String borders =  Math.min(points[0][1], points[1][1]) + " ," + Math.max(points[1][0], points[1][1]) + " ," + Math.min(points[0][0], points[1][0]) + " ," + Math.max(points[0][0], points[1][0]);
        return borders;
    }

    public static void main(String[] args) {
        LimitingRectangle r = new LimitingRectangle(new int[][] {{-1, -2}, {3, 4}});
        System.out.println(r.getWidth() + " " + r.getHeight());
        System.out.println(r.getBorders());
    }
}
