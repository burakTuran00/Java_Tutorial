public class Main
{

    public static void main(String[] args)
    {
        class Area
        {
            public void CircleArea(int radius)
            {
                System.out.println("Area of Circle:" + (radius * radius * Math.PI));
            }
        }

        Area area = new Area();
        Area area1 = new Area();

        area.CircleArea(2);
        area.CircleArea(12);
    }

    public static void Try()
    {
        // we can't use Area class because of it is special for in that class!
    }
}


/* Benefits of Local Inner Class
-need immediately to create object. don't need tp create other
-just using in that function
 */