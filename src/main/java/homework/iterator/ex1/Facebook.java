package homework.iterator.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Facebook implements Iterable<Contact> {
    private LinkedList<Contact> list;

    public Facebook() {
        list = new LinkedList<Contact>();
    }

    public LinkedList<Contact> getList() {
        return list;
    }

    public void add(Contact contact) {
        list.add(contact);
    }

    public void remove(Contact contact) {
        list.remove(contact);
    }

    public void edit(int index, Contact contact) {
        if(list.contains(contact)) {
            Contact currentContact = list.get(index);
            currentContact.setMail(contact.getMail());
            currentContact.setName(contact.getName());
        }
    }



    @Override
    public Iterator<Contact> iterator() {

        return new MyIterator();
    }

    private class MyIterator implements Iterator<Contact> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < list.size();
        }

        @Override
        public Contact next() {
            return list.get(currentIndex++);
        }
    }
}
