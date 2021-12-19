import java.awt.*;
public class Circle
{
    Point center;
    double radius;

      Circle ()
    {
    }

    Circle (Point center, double radius)
    {
      this.center = center;
      this.radius = radius;
    }

    double getPerimeter ()
    {
      return 2 * Math.PI * this.radius;
    }
    double getArea ()
    {
      return Math.PI * this.radius * this.radius;
    }
    void Setcenter (Point center)
    {
      this.center = center;
    }
    void Setradius (double radius)
    {
      this.radius = radius;
    }

  public static void main (String[]args)
  {
    Circle c1 = new Circle (new Point (1, 2), 3);
    System.out.println (c1.getPerimeter ());
  }
}
