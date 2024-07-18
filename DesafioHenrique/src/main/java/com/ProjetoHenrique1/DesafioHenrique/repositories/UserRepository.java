package com.ProjetoHenrique1.DesafioHenrique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ProjetoHenrique1.DesafioHenrique.entities.User;

public interface UserRepository extends JpaRepository <User,Long> {

}
