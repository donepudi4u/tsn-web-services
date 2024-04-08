package org.telugusamiti.web.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.telugusamiti.web.services.dto.MemberDTO;
import org.telugusamiti.web.services.entity.MemberEnttity;
import org.telugusamiti.web.services.repository.MembersRepository;
import org.telugusamiti.web.services.service.MemberService;

import java.util.List;

@RestController
public class TsnWebController {

    @Autowired
    private MemberService memberService;

    @GetMapping(value = "/getAllMembers")
    public List<MemberEnttity> getAllMembers(){
        return memberService.getAllMembers();

    }


}
