package com.tomatoa.service.repository;

import com.tomatoa.service.models.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactsRepository {
    public void removeContact(Contact contact) {
    }

    public void updateContact(Contact oldContact, Contact newContact) {
    }

    public void addContact(Contact contact) {
    }

    public List<Contact> getContacts(Long userId) {
        return null;
    }

    public Contact getContact(Long userId) {
        return null;
    }
}
