package com.ms.email.repositorie;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID>{
    
}
