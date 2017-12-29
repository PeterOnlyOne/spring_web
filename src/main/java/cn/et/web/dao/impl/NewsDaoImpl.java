package cn.et.web.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.et.web.dao.NewsDao;
@Repository
public class NewsDaoImpl implements NewsDao {

	@Autowired
	private JdbcTemplate jTemplate;
	
	public List<Map<String, Object>> queryAll() {
		String sql = "select * from mynews";
		return jTemplate.queryForList(sql);
	}

	public List<Map<String, Object>> queryNewsByContent(String content) {
		String sql = "select * from mynews where content like '%"+content+"%'";
		return jTemplate.queryForList(sql);
	}

	public void insert(String title, String content, String createtime) {
		String sql = "insert into mynews(title,content,createtime) values('"+title+"','"+content+"','"+createtime+"')";
		jTemplate.execute(sql);
	}

}
