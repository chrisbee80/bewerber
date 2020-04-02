package de.interhyp.bewerber;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ZyklusPrueferTest {
    ZyklusPruefer pruefer = new ZyklusPruefer();

    @Test
    public void einAndNullElement() {
        try {
            MyListElement nurEinElement = new MyListElement(1);
            pruefer.pruefe(nurEinElement);
            pruefer.pruefe(null);
        } catch (Exception e) {
            // do nothing
        }
    }

    @Test
    public void mehrereElementeOhneZyklus() {
        MyListElement elemEins = new MyListElement(1);
        MyListElement elemZwei = new MyListElement(2);
        MyListElement elemDrei = new MyListElement(3);
        elemEins.setNext(elemZwei);
        elemZwei.setNext(elemDrei);

        assertTrue(pruefer.pruefe(elemEins));
    }

    @Test
    public void einfacherZyklus() {
        MyListElement elemEins = new MyListElement(1);
        MyListElement elemZwei = new MyListElement(2);
        elemEins.setNext(elemZwei);
        elemZwei.setNext(elemEins);

        assertFalse(pruefer.pruefe(elemEins));
    }

}
