package haksa.member;

import java.util.List;

import haksa.dto.Member;

public interface Dao {

	void insert(Member m);
	Member select(int num);
	List<Member> selectALL();
	void update(Member m);
	void delete(int num);
	
	
}
