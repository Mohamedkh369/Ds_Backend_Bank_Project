package dev.ds_bank_project.Repositories;

import dev.ds_bank_project.Entities.BankAccount;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}