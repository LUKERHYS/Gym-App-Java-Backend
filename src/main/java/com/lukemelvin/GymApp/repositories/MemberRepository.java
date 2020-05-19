package com.lukemelvin.GymApp.repositories;

import com.lukemelvin.GymApp.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

//    List<Member> findAllByBookingsSessionId(Long sessionId);

}
