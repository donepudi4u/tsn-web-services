package org.telugusamiti.web.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telugusamiti.web.services.dto.MemberDTO;
import org.telugusamiti.web.services.entity.MemberEnttity;

@Repository
public interface MembersRepository extends JpaRepository<MemberEnttity,Long> {


}
