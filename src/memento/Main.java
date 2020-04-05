package memento;

public class Main {
    public static void main(String[]args) {
        Caretaker caretaker = new Caretaker();
        Employee emp = new Employee();

        emp.setName("John Wick");
        emp.setAddress("cairo");
        emp.setPhone("1234");

        System.out.println("employee before save: "+emp);

        caretaker.save(emp);

        emp.setPhone("4343");

        caretaker.save(emp);

        System.out.println("employee after changing phone number and saving: "+emp);

        emp.setPhone("98898");

        System.out.println("employee after changing phone number again and not saving: "+emp);

        caretaker.revert(emp);

        System.out.println("employee after reverting to last saved point: "+emp);

    }
}

