package dev.ds_bank_project.Repositories;

import dev.ds_bank_project.Entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

    Optional<AppUser> findAppUserById(AppUser appUser);

}
