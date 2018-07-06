package exam.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MembersDAOImpl implements MembersDAO {

	@Override
	public int addMember(MembersDTO member) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO members value (?,?,?)";
		int result = 0;		
		
		try {
			conn = DBUtil.getConnect();
			ps = conn.prepareStatement(sql);
			// id, name, email
			ps.setString(1, member.getId());
			ps.setString(2, member.getName());
			ps.setString(3, member.getEmail());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("failed!!");
		} finally {
			DBUtil.close(conn, ps);
		}
		return result;
	}

	@Override
	public MembersDTO getMember(String id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// id, name, email
		String sql = "SELECT id, name, email FROM members where id =?";
		MembersDTO member = new MembersDTO();
		
		try {
			conn = DBUtil.getConnect();
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {    // to prevent "before start of result set error"
				member.setId(rs.getString(1)); 
				member.setName(rs.getString(2));
				member.setEmail(rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, ps);
		}
		return member;
	}

	@Override
	public List<MembersDTO> getMemberList() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MembersDTO member = null;
		List<MembersDTO> memberList = new ArrayList<>();
		String sql = "SELECT id, name, email FROM members";
		try {
			conn = DBUtil.getConnect();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				member = new MembersDTO(rs.getString(1), rs.getString(2), rs.getString(3));
				memberList.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, ps, rs);
		}
		return memberList;
	}
}