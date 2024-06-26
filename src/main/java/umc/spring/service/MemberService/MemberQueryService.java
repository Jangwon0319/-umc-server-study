package umc.spring.service.MemberService;

import org.springframework.data.domain.Page;
import umc.spring.domain.Member;
import umc.spring.domain.Mission;
import umc.spring.domain.Review;

import java.util.Optional;

public interface MemberQueryService{

    Optional<Member> findMember(Long id);

    Page<Review> getReviewList(Long MemberId, Integer page);

    Page<Mission> getMissionList(Long MemberId, Integer page);
}
