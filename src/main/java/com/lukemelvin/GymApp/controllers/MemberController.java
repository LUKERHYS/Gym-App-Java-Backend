package com.lukemelvin.GymApp.controllers;

import com.lukemelvin.GymApp.models.Member;
import com.lukemelvin.GymApp.models.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.lukemelvin.GymApp.repositories.MemberRepository;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/members")
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping
    public ResponseEntity getAllMembers(@RequestParam(required = false, name = "sessionId") Long memberId) {
        return new ResponseEntity(memberRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public Member newMember(@RequestBody Member newMember) {
        return memberRepository.save(newMember);
    }

}