package homework.iterator.ex2;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        try {
            phoneBook.add(new Contact("Ivan", ContactType.FRIEND));
            phoneBook.add(new Contact("Pavel", ContactType.WORK));
//            phoneBook.add(new Contact("Jora", "work"));
//            phoneBook.add(new Contact("Solo", "friend"));
//            phoneBook.add(new Contact("Petr", "family"));
//            phoneBook.add(new Contact("Sanya", "family"));
//            phoneBook.add(new Contact("Platon", "school"));
//            phoneBook.add(new Contact("Semen", "band"));
        }
        catch (InvalidContactTypeException e){
            e.printStackTrace();
        }

        for (Contact c:phoneBook.getContactList()) {
            System.out.println(c);
        }
        System.out.println("*****************");

        Iterator<Contact> friendIterator = phoneBook.createFriendsIterator();
        while (friendIterator.hasNext()){
            System.out.println(friendIterator.next());
        }
        System.out.println();
        Iterator<Contact> workIterator = phoneBook.createWorkIterator();
        while (workIterator.hasNext()){
            System.out.println(workIterator.next());
        }
        System.out.println();
        Iterator<Contact> familyIterator = phoneBook.createFamilyIterator();
        while (familyIterator.hasNext()){
            System.out.println(familyIterator.next());
        }
    }
}
