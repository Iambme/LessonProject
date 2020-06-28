package homework.iterator.ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneBook {
    private List<Contact> contactList = new ArrayList<>();

    public void add(Contact c) throws InvalidContactTypeException {
        if(c.getType() == ContactType.FRIEND ||c.getType() == ContactType.FAMILY ||c.getType() == ContactType.WORK) {
            contactList.add(c);
        }
        else {
            throw new InvalidContactTypeException("Недопустимый тип контакта");
        }
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public Iterator<Contact> createFriendsIterator() {
        return new FriendIterator(contactList);
    }


    public Iterator<Contact> createFamilyIterator() {
        return new FamilyIterator(contactList);
    }

    public Iterator<Contact> createWorkIterator(){return  new WorkIterator(contactList);}

    public class FriendIterator implements Iterator<Contact> {
        List<Contact> friendList = new ArrayList<>();
        int currentIndex=0;
        public FriendIterator(List<Contact> list){
            for(Contact c : list){
                if (c.getType() == ContactType.FRIEND) {
                    friendList.add(c);
                }
            }
        }

        @Override
        public boolean hasNext() {
            return currentIndex< friendList.size();
        }

        @Override
        public Contact next() {
            return friendList.get(currentIndex++);
        }
    }
    public class FamilyIterator implements Iterator<Contact>{
        List<Contact> familyList = new ArrayList<>();
        int currentIndex = 0;

        public FamilyIterator(List<Contact> list) {
            for (Contact c: list) {
                if(c.getType().equals("family")) {
                    familyList.add(c);
                }
            }
        }

        @Override
        public boolean hasNext() {
            return currentIndex<familyList.size();
        }

        @Override
        public Contact next() {
            return familyList.get(currentIndex++);
        }
    }
    public class WorkIterator implements Iterator<Contact>{
        List<Contact> workList = new ArrayList<>();
        int currentIndex = 0 ;

        public WorkIterator(List<Contact> list) {
            for (Contact c: list) {
                if(c.getType().equals("work")){
                    workList.add(c);
                }
            }
        }

        @Override
        public boolean hasNext() {
            return currentIndex<workList.size();
        }

        @Override
        public Contact next() {
            return workList.get(currentIndex++);
        }
    }
}
