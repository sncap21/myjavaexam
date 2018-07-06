package exam.jdbc;

import java.util.List;

public interface MembersDAO {
	public int addMember(MembersDTO member);
	public MembersDTO getMember(String id);
	public List<MembersDTO> getMemberList();

}
