package com.lukemelvin.GymApp.repositories;

import com.lukemelvin.GymApp.enums.Goal;
import com.lukemelvin.GymApp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

    List<Session> findByType(Goal goal);

}
