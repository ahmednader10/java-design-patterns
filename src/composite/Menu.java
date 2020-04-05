package composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public MenuComponent add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
        return menuComponent;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));

        Iterator<MenuComponent> iterator = menuComponentList.iterator();

        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            builder.append(menuComponent.toString());
        }
        return builder.toString();
    }
}
