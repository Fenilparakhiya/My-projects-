package org.fenil.photo.Gallery.album.api.repository;

import java.util.Optional;

import org.fenil.photo.Gallery.album.api.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{

    Optional<Account> findByEmail(String email);
    
}
