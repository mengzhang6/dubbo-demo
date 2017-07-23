package meng.study.dubbo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import meng.study.dubbo.entity.User;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {

	@Resource
	private NamedParameterJdbcTemplate npJdbcTemplate;
	private static final String FIND_SQL = "SELECT id,name,address FROM user";

	public User getUserById(int id) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		String sql = FIND_SQL + " WHERE id =:id";
		paramMap.put("id", id);
		List<User> list = npJdbcTemplate.query(sql, paramMap,
				new BeanPropertyRowMapper<User>(User.class));
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}

}
