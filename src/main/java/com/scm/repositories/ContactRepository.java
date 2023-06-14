package com.scm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
