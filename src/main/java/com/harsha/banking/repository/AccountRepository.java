package com.harsha.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.harsha.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
