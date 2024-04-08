package org.telugusamiti.web.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telugusamiti.web.services.entity.MemberEnttity;
import org.telugusamiti.web.services.repository.MembersRepository;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MembersRepository membersRepository;

    public List<MemberEnttity> getAllMembers() {
        return membersRepository.findAll();
    }

}
