package br.com.jeftavares.twitter_simplificado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TweetRepository extends JpaRepository<TweetRepository, Long> {
}