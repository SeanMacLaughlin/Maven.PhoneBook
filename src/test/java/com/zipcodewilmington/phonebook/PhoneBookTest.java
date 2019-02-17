package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class PhoneBookTest
{

    @Test
    public void addTest()
    {
        // Given
        PhoneBook yellowPages = new PhoneBook();
        ArrayList<String> person = yellowPages.newPerson("6104446006", "6104441000", "6104446969");
        int expectedPersons = yellowPages.phoneBook.size() + 1;

        //When
        yellowPages.add("Ben", person);
        int actualPersons = yellowPages.phoneBook.size();

        // Then
        Assert.assertEquals(expectedPersons, actualPersons);
    }

    @Test
    public void removeTest()
    {
        // Given
        PhoneBook yellowPages = new PhoneBook();
        ArrayList<String> person = yellowPages.newPerson("6104446006", "6104441000", "6104446969");
        yellowPages.add("Ben", person);
        int expectedPersons = yellowPages.phoneBook.size() - 1;

        // When
        yellowPages.remove("Ben");
        int actualPersons = yellowPages.phoneBook.size();

        // Then
        Assert.assertEquals(expectedPersons, actualPersons);
    }

    @Test
    public void lookupTest()
    {
        // Given
        PhoneBook yellowPages = new PhoneBook();
        ArrayList<String> person = yellowPages.newPerson("6104446006", "6104441000", "6104446969");
        yellowPages.add("Ben", person);

        // When
        ArrayList<String> actual = yellowPages.lookup("Ben");

        // Then
        Assert.assertEquals(person, actual);
    }

    @Test
    public void reverseLookupTest()
    {
        // Given
        PhoneBook yellowPages = new PhoneBook();
        ArrayList<String> person = yellowPages.newPerson("6104446006", "6104441000", "6104446969");
        yellowPages.add("Ben", person);

        // When
        String output = yellowPages.reverseLookup("6104446006");

        // Then
        Assert.assertEquals("Ben", output);

    }

    @Test
    public void removeRecordTest()
    {
        // Given
        PhoneBook yellowPages = new PhoneBook();
        ArrayList<String> person = yellowPages.newPerson("6104446006", "6104441000", "6104446969");
        yellowPages.add("Ben", person);
        int expectedPersons = yellowPages.phoneBook.size() - 1;

        // When
        yellowPages.remove("Ben");
        int actualPersons = yellowPages.phoneBook.size();

        // Then
        Assert.assertEquals(expectedPersons, actualPersons);




    }
}
