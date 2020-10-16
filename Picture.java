package Shapes;

public class Picture {
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    /**
     * 创建的第二个太阳
     */

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeColor("blue");
        wall.changeSize(100);
        wall.makeVisible();
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun2 = new Circle();
        sun2.changeColor("green");
        sun2.makeVisible();

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(-20);
        sun.moveVertical(-40);
        sun.changeSize(60);
        sun.makeVisible();
        //sun.makeInvisible();
        sun.sunset(170);
        sun.makeInvisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
//        picture.setBlackAndWhite();
        picture.draw();;
    }
}
