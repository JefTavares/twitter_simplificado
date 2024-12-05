package br.com.jeftavares.twitter_simplificado.repository;

import br.com.jeftavares.twitter_simplificado.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}