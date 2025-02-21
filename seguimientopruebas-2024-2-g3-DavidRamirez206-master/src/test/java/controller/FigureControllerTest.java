package controller;

import model.IFigure;
import model.Pentagon;
import model.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FigureControllerTest {

    private FigureController controller;

    //setUp1
    public void setUp1(){
        controller = new FigureController();
    }

    //setUp2
    public IFigure setUp2(){
        controller = new FigureController();

        int[] triangulo = {6, 6, 6};
        return controller.createFigure(triangulo);
    }

    //setUp3
    public IFigure setUp3(){
        controller = new FigureController();
        int[] pentagono = {4, 4, 4, 4, 4};
        return controller.createFigure(pentagono);
    }

    //Escenario 1
    @Test
    public void esc1(){
        //init
        setUp1();

        //Act
        int[] arre = {1, 4, 2};

        Triangle t = (Triangle) controller.createFigure(arre);

        //Assert
        assertEquals(Triangle.NOT_TRIANGLE, controller.getType(t));
    }

    //Escenario 2
    @Test
    public void esc2(){
        //init
        setUp1();

        //Act
        int[] arre = {6, 6, 6};

        Triangle t = (Triangle) controller.createFigure(arre);

        //Assert
        assertEquals(Triangle.EQUILATERAL, controller.getType(t));
    }

    //Escenario 3
    @Test
    public void esc3(){
        //init
        setUp1();

        //Act
        int[] arre = {8, 7, 9};

        Triangle t = (Triangle) controller.createFigure(arre);

        //Assert
        assertEquals(Triangle.SCALENE, controller.getType(t));
    }

    //Escenario 4
    @Test
    public void esc4(){
        //init
        setUp1();

        //Act
        int[] arre = {6, 7, 7};

        Triangle t = (Triangle) controller.createFigure(arre);
        //Assert
        assertEquals(Triangle.ISOSCELES, controller.getType(t));
    }

    //Escenario 5
    @Test
    public void esc5(){
        //init
        setUp1();

        //Act
        int[] arre = {4, 4, 4, 4, 4};

        Pentagon p = (Pentagon) controller.createFigure(arre);

        //Assert
        assertEquals(Pentagon.REGULAR, controller.getType(p));
    }

    //Escenario 6
    @Test
    public void esc6(){
        //init
        setUp1();

        //Act
        int[] arre = {5, 4, 5, 4, 5};

        Pentagon p = (Pentagon) controller.createFigure(arre);

        //Assert
        assertEquals(Pentagon.NOT_REGULAR, controller.getType(p));
    }

    //Escenario 7
    @Test
    public void esc7(){
        //init

        //Act

        //Assert
        assertTrue(setUp2() instanceof Triangle);
    }

    //Escenario 8
    @Test
    public void esc8(){
        //init

        //Act

        //Assert
        assertTrue(setUp3() instanceof Pentagon);
    }
}
