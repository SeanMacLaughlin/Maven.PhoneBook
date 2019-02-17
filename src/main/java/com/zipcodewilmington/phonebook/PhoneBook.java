package com.zipcodewilmington.phonebook;

import java.util.*;


public class PhoneBook
{
    private String name;
    private String number;
    private String work;
    private String cell;

    private ArrayList<String> personInfo;
    public TreeMap<String, ArrayList<String>> phoneBook;


    public PhoneBook()
    {
        phoneBook = new TreeMap<String, ArrayList<String>>();
    }

    public ArrayList<String> newPerson(String number, String work, String cell)
    {
        ArrayList<String> entries = new ArrayList<String>();
        entries.add(number);
        entries.add(work);
        entries.add(cell);

        return entries;
    }

    public void add(String name, ArrayList<String> personInfo)
    {
        phoneBook.put(name, personInfo);
    }

    public void remove(String name)
    {
        phoneBook.remove(name);
    }

    public ArrayList<String> lookup(String name)
    {
        return phoneBook.get(name);
    }

    public String reverseLookup(String number)
    {
        for(Map.Entry<String, ArrayList<String>> person : phoneBook.entrySet())
        {
            if(person.getValue().contains(number))
            {
                return person.getKey();
            }
        }
        return "Does not exist";
    }

    public String display(String name)
    {
        for(Map.Entry person : phoneBook.entrySet())
        {
            System.out.println(person.getKey() + "  " + person.getValue());
        }
        return name;
    }

    public void removeRecord (String name)
    {
    phoneBook.remove(name);
    }


}
