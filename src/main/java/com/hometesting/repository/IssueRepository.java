package com.hometesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hometesting.entity.Issues;
@Repository
public interface IssueRepository extends JpaRepository<Issues, Long>{

}
