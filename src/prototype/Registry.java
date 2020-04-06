package prototype;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie m = new Movie();
        m.setRuntime("1");
        m.setPrice("3");
        m.setTitle("title");
        m.setUrl("url");

        items.put("Movie", m);

        Book b = new Book();
        b.setNumberOfPages(100);
        b.setPrice("6");
        b.setTitle("title2");
        b.setUrl("url2");

        items.put("Book", b);
    }
}
