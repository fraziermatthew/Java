package slpinterpreter;

/**
 * Table.
 *
 * @author matthewfrazier
 */
public class Table {

    String id;
    int value;
    Table tail;

    Table(String i, int v, Table t) {
        id = i;
        value = v;
        tail = t;
    }

    int lookup(String i) {
        if (id.equals(i)) {
            return value;
        }
        return tail.lookup(i);
    }

}
