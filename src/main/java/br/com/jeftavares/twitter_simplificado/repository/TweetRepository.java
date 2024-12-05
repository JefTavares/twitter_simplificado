package br.com.jeftavares.twitter_simplificado.repository;

import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jeftavares.twitter_simplificado.entities.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {

}