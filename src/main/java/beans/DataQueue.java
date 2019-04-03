package beans;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DataQueue {

    private List list;

    /**
     * constructor
     */
    public DataQueue() {
        list = Collections.synchronizedList(new LinkedList());
    }

    /**
     * adding to queue
     *
     * @param object
     */
    public void add(Object object) {
        list.add(object);
    }

    /**
     * @return Object
     */
    public Object pop() {
        return list.remove(0);
    }

    /**
     * get size of queue
     *
     * @return size
     */
    public int size() {
        return list.size();
    }

    /**
     * clear the queue
     */
    public void clear() {
        list.clear();
    }
}

