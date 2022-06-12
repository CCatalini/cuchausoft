package com.example.cuchausoft.repository;

import com.example.cuchausoft.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUser extends JpaRepository <User, Integer> {

}
