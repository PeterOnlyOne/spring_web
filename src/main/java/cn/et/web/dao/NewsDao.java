package cn.et.web.dao;

import java.util.List;
import java.util.Map;

public interface NewsDao {

	/**
	 * 查询所有新闻
	 * @return 返回新闻对象
	 */
	public List<Map<String, Object>> queryAll();
	/**
	 * 根据新闻内容模糊查询
	 * @param content 新闻内容
	 * @return 返回新闻对象
	 */
	public List<Map<String, Object>> queryNewsByContent(String content);
	/**
	 * 添加新闻
	 * @param title 新闻标题
	 * @param content 新闻内容
	 * @param createtime 新闻创作时间
	 * @return 
	 */
	public void insert(String title,String content,String createtime);
}
