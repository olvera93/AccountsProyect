package com.olvera.accounts.repository;

import com.olvera.accounts.entity.Accounts;
import com.olvera.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

}
