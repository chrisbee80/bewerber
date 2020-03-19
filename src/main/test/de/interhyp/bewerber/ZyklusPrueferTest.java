package main.test.de.interhyp.bewerber;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

@Test
public class ZyklusPrueferTest {
    ZyklusPruefer pruefer = new ZyklusPruefer();

    public void einElement() {
        MyListElement nurEinElement = new MyListElement(1);
        pruefer.pruefe(nurEinElement);
    }

    public void mehrereElementeOhneZyklus() {
        MyListElement elemEins = new MyListElement(1);
        MyListElement elemZwei = new MyListElement(2);
        MyListElement elemDrei = new MyListElement(3);
        elemEins.setNext(elemZwei);
        elemZwei.setNext(elemDrei);

        assertTrue(pruefer.pruefe(elemEins));
    }

    public void einfacherZyklus() {
        MyListElement elemEins = new MyListElement(1);
        MyListElement elemZwei = new MyListElement(2);
        elemEins.setNext(elemZwei);
        elemZwei.setNext(elemEins);

        assertFalse(pruefer.pruefe(elemEins));
    }

}
