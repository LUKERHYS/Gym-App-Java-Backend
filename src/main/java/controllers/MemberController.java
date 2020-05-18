package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import repositories.MemberRepository;

@RestController
@RequestMapping(value = "/members")
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping
    public ResponseEntity getAllMembers(
            @RequestParam(required = false, name = "sessionId") Long memberId
    ) {
        if (memberId != null) {
            return new ResponseEntity(memberRepository.findAll(), HttpStatus.OK);
        }
    }
}