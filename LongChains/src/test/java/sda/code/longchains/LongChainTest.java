package sda.code.longchains;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongChainTest {
    LongChain sut;

    @Before
    public void setup(){ sut=new LongChain();}

    @Test
    public void nullowy(){
        assertEquals(0,sut.longest(null));
    }

    //Jeśli dla nulla miałny rzucać wyjątkiem
    /*@Test (expected=NullPointerException.class)
    public void nullowyZWyjatkiem(){
        sut.longest(null);
    }*/

    @Test public void pusty(){ assertEquals(0,sut.longest(""));}
    @Test public void jedyny(){assertEquals(5,sut.longest("aaaaa"));}
    @Test public void pierwszy(){assertEquals(5,sut.longest("aaaaabbbccc"));}
    @Test public void pierwszyPoJednymZnaku(){assertEquals(5,sut.longest("abbbbbccc"));}
    @Test public void drugi(){assertEquals(4,sut.longest("aaabbbbcccddd"));}
    @Test public void ostatni(){assertEquals(4,sut.longest("aaaabbbcccc"));}
    @Test public void przedostatni(){assertEquals(4,sut.longest("aaabbbbccc"));}
    @Test public void przedOstatnimZnakiem(){assertEquals(4,sut.longest("aaabbbbccc"));}
    @Test public void kilkaRównych(){assertEquals(3,sut.longest("aaabbbccc"));}
    @Test public void cyfry(){assertEquals(6,sut.longest("111222222333"));}
    @Test public void znakiSpecjalne(){assertEquals(5,sut.longest(",,,,!!!!!"));}
    @Test public void mix(){assertEquals(9,sut.longest("gggg         )))))))).......333333aaa"));}
    @Test public void wielkieIMale(){assertEquals(3,sut.longest("aaaAAxxXxxLlll"));}
}
