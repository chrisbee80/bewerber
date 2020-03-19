package de.interhyp.bewerber;

public class MyListElement implements IListElement {

    private final int id;
    private IListElement next;

    public MyListElement(int id) {
        this.id = id;
    }

    public void setNext(IListElement next) {
        this.next = next;
    }

    @Override
    public IListElement getNext() {
        return next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyListElement that = (MyListElement) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public String toString() {
        return "MyListElement{" +
                "id=" + id +
                ", next=" + next +
                '}';
    }
}
