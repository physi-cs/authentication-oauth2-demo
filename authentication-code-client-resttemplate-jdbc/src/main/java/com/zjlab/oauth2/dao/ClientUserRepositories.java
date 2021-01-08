package com.zjlab.oauth2.dao;

import com.zjlab.oauth2.entity.domain.ClientUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientUserRepositories extends JpaRepository<ClientUser, Long> {
    ClientUser findOneByUsername(String username);
}
