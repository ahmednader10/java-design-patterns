package composite;

public class Main {
    public static void main(String[]args) {
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem menuItem = new MenuItem("Safety", "/safety");

        mainMenu.add(menuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        Menu personalClaimsMenu = new Menu("personalClaims", "/personalClaims");
        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu);
    }
}
