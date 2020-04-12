import java.util.ArrayList;
import java.util.List;

class Canvas{
	List<Point> points;
	
	public Canvas(){
		points = new ArrayList<>();
	}
	
	public void addPoint(Point point){
        points.add(point);
    }

    public void removePoint(Point point){
        points.remove(point);
    }

    public void drawPoints(){
        for (Point point : points)
            point.draw();
    }
}