package com.tomatoa.service.service;

import com.tomatoa.service.models.Contact;
import com.tomatoa.service.repository.ContactsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactsService {
    final private ContactsRepository repository;

    public void removeContact(Long userId, Contact contact) {
        repository.removeContact(contact);
    }

    public void updateContact(Long userId, Contact oldContact, Contact newContact) {
        repository.updateContact(oldContact, newContact);
    }

    public void addContact(Long userId, Contact contact) {
        repository.addContact(contact);
    }

    public List<Contact> getContacts(Long userId) {
        return repository.getContacts(userId);
    }

    public Contact getContact(Long userId) {
        return repository.getContact(userId);
    }
}
