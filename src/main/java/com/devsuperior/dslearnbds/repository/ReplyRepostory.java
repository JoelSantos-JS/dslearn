package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.model.Reply;

@Repository
public interface ReplyRepostory extends JpaRepository<Reply, Long> {

}
