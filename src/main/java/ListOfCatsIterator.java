import java.io.LineNumberInputStream;
import java.util.Iterator;
import java.util.List;

public class ListOfCatsIterator implements Iterator<Cat> {
    private List<Cat> catListIterator;
    private int counter;
    public ListOfCatsIterator (List<Cat> catList){
        catListIterator = catList;
        counter  = 0;
    }
    @Override
    public boolean hasNext() {
        return counter<catListIterator.size();
    }

    @Override
    public Cat next() {
        if (!hasNext()) {
            return null;
        }
        counter += 1;
        return catListIterator.get(counter-1);

    }
}
