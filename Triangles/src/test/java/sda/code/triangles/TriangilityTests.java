package sda.code.triangles;

import org.junit.*;

import static java.lang.Integer.MAX_VALUE;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TriangilityTests {
    Triangility sut;

    @Before
    public void setup(){
        sut=new Triangility();
    }

//    @After
//    @BeforeClass
//    @AfterClass

    @Test
    public void poprawnyTrójkąt() {
//        Triangility tri=new Triangility();
        assertTrue(sut.check(4,5,6));
    }

    @Test
    public void nieTrojkat(){
//        Triangility tri=new Triangility();
        assertFalse(sut.check(3,3,9));
    }

    @Test public void trójkątRównobocznyJestOk() {
        assertTrue(sut.check(5,5,5));
    }
    @Test public void trójkątRównoramiennyJestOk1() {assertTrue(sut.check(5,5,5));}
    @Test public void trójkątRównoramiennyJestOk2() {assertTrue(sut.check(3,3,5));}
    @Test public void trójkątRównoramiennyJestOk3() {assertTrue(sut.check(3,5,3));}
    @Test public void trójkątRównobocznyMaxIntJestOk() {assertTrue(sut.check(MAX_VALUE, MAX_VALUE, MAX_VALUE));}

    @Test public void zerowyRównobocznyJestNiepoprawny() {
        assertFalse(sut.check(0,0,0));
    }
    @Test public void wartościNiedodatnieSąNiepoprawne1() {assertFalse(sut.check(2,0,8));}
    @Test public void wartościNiedodatnieSąNiepoprawne2() {assertFalse(sut.check(2,0,2));}
    @Test public void wartościNiedodatnieSąNiepoprawne3() {assertFalse(sut.check(8,0,2));}
    @Test public void wartościNiedodatnieSąNiepoprawne4() {assertFalse(sut.check(7,-1,3));}
    @Test public void wartościNiedodatnieSąNiepoprawne5() {assertFalse(sut.check(6,-1,2));}
    @Test public void wartościNiedodatnieSąNiepoprawne6() {assertFalse(sut.check(4,2,-1));}



}
