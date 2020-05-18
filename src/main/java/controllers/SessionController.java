package controllers;


import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import repositories.SessionRepository;

@RestController
@RequestMapping(value = "/sessions")
public class SessionController {

    @Autowired
    SessionRepository sessionRepository;

    @GetMapping
    public ResponseEntity getAllSessions(
            @RequestParam(required = false, name = "memberId") Long memberId
    ){
        if(memberId != null) {
            return new ResponseEntity(sessionRepository.findAll(), HttpStatus.OK);
        }
    }
}
