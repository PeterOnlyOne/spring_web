package cn.et.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.web.dao.NewsDao;
import cn.et.web.service.NewsService;
@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsDao dao;

	public List<Map<String, Object>> queryNewsByContent(String content) {
		if (content == null) {
			content="";
		}
		return dao.queryNewsByContent(content);
	}

	public void insert(String title, String content, String createtime) {
		dao.insert(title, content, createtime);

	}

}
