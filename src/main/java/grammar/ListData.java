package grammar;

import java.util.ArrayList;

public final class ListData extends Data<ArrayList<Data<?>>> {

    public ListData(ArrayList<Data<?>> value) {
        super(value);
    }

    @Override
    public String toString() {
        String res = new String("[ ");
        for (Data<?> entry : getValue()) {
            switch (entry) {
                case StringData s -> res += "\"" + s.toString() + "\", ";
                default -> res += entry.toString() + ", ";
            }
        }
        res = res.substring(0, res.length() - 2);
        res += " ]";
        return res;
    }
}