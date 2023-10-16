import org.example.Retangulo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetanguloTest {

    static Retangulo ret;
    int comp1 = 3;
    int comp2 = 5;
    int comp3 = 2;
    int larg1 = 5;
    int larg2 = 8;
    int larg3 = 4;

    @BeforeAll
    public static void setup(){
        ret = new Retangulo();
    }

    @Test
    public void areaTest1(){
        int expect = 15;
        int actual = ret.area(comp1, larg1);
        assertEquals(expect, actual, "Erro no cálculo da área");
    }

    @Test
    public void areaTest2(){
        int expect = 15;
        int actual = ret.area(comp2, larg2);
        assertEquals(expect, actual, "Erro no cálculo da área");
    }

    @Test
    public void areaTest3(){
        int expect = 8;
        int actual = ret.area(comp3, larg3);
        assertEquals(expect, actual, "Erro no cálculo da área");
    }

    @Test
    public void perimetroTest1(){
        int expect = 16;
        int actual = ret.perimetro(3, 5);
        assertEquals(expect, actual, "Erro no cálculo do perimetro");
    }

    @Test
    public void perimetroTest2(){
        int expect = 26;
        int actual = ret.perimetro(5, 8);
        assertEquals(expect, actual, "Erro no cálculo do perimetro");
    }

    @Test
    public void perimetroTest3(){
        int expect = 10;
        int actual = ret.perimetro(2, 4);
        assertEquals(expect, actual, "Erro no cálculo do perimetro");
    }

    @Test
    public void trianguloTest(){
        boolean expect = true;
        boolean actual = ret.isTriangle(4,6,8);
        assertEquals(expect, actual, "Erro no cálculo");
    }
}

