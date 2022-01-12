package com.ms.msemail.repository;

import com.ms.msemail.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
