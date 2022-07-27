import java.util.ArrayList;

// here we use the Cloneable
public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<Object>();

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public int getSize() {
        return this.list.size();
    }

    public Object peek() {
        return this.list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = this.list.get(getSize() - 1);
        this.list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        this.list.add(o);
    }

    @Override /** Override the protected clone method define in
     the Object class, and strengthen its accessibility */
    public Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy
        MyStack myStackClone = (MyStack)super.clone();
        // Deep copy list
        myStackClone.list = this.copyList();
        return myStackClone;
    }

    /** Returns a copy of the array list */
    private ArrayList<Object> copyList() {
        ArrayList<Object> newList = new ArrayList<>();
        for (int i = 0; i < this.list.size(); i++)
            newList.add(this.list.get(i));
        return newList;
    }

    @Override
    public String toString() {
        return "stack: " + this.list.toString();
    }
}