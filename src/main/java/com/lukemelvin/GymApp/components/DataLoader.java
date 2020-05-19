package com.lukemelvin.GymApp.components;

import com.lukemelvin.GymApp.enums.Goal;
import com.lukemelvin.GymApp.models.Member;
import com.lukemelvin.GymApp.models.Session;
import com.lukemelvin.GymApp.repositories.MemberRepository;
import com.lukemelvin.GymApp.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    SessionRepository sessionRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        Members
        Member luke = new Member("Luke", "Melvin", Goal.STRENGTH);
//        memberRepository.save(luke);

//        Sessions
        Session sledgeHammer = new Session(Goal.STRENGTH,"Lyndsey", 101);
//        sessionRepository.save(sledgeHammer);

//        Bookings


        // Add tag references in the post
        luke.getSessions().add(sledgeHammer);

        // Add post reference in the tags
        sledgeHammer.getMembers().add(luke);

        memberRepository.save(luke);


    }


}
