package team.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.domain.Member;
import team.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;
	
	public List<Member> findAll() {
		return memberRepository.findAll();
	}
	
	public Member findOne(Integer id) {
		Optional<Member> member = memberRepository.findById(id);
		if(member.isPresent()) {
			return member.get();
		}else {
			return null;
		}
	}
	
	public Member save(Member member) {
		return memberRepository.save(member);
	}
	
	public void delete(Integer id) {
		memberRepository.deleteById(id);
	}
}
