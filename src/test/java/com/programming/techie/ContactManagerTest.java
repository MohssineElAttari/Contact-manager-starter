package com.programming.techie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {

    @Test
    public void showldCreateContact(){
    ContactManager contactManager = new ContactManager();
    contactManager.addContact("mohssine","elattari","0615722515");
    assertFalse(contactManager.getAllContacts().isEmpty());
    assertTrue(!contactManager.getAllContacts().isEmpty());
    assertEquals(1,contactManager.getAllContacts().size());
    }
}