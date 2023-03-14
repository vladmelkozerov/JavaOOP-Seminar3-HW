import java.util.Iterator;
import java.util.List;

public class ListOfCats implements Iterable {
    private List<Cat> catList;

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    @Override
    public Iterator iterator() {
        return new ListOfCatsIterator(catList);
    }



}
