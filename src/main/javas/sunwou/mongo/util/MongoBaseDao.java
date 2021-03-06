package sunwou.mongo.util;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.MongoTemplate;


public interface MongoBaseDao<T extends MongoBaseEntity>{
	
	/**
	 * 添加一条记录
	 * @param t
	 * @return
	 */
	String add(T t);
	
	/**
	 * 按属性查询
	 * @param query  属性类
	 * @param skip
	 * @param limit
	 * @param className
	 * @return
	 */
	List<T> find(T query,String className) ;
	
	/**
	 * 按id查询
	 * @param id
	 * @param className
	 * @return
	 */
	T findById(String id,String className);
	/**
	 * 查询总条数
	 * @param query
	 * @param className
	 * @return
	 */
	int count(T query,String className);
	
	/**
	 * 更新记录
	 * @param query  条件
	 * @param update  更新内容
	 * @param className
	 * @return
	 */
	int update(T query,T update,String className);
	/**
	 * 更新记录
	 * @param query  条件
	 * @param update  更新内容
	 * @param className
	 * @return
	 */
	int updateById(T updateo,String className);
	/**
	 * 删除记录
	 * @param imageAndText
	 * @param className
	 * @return
	 */
	int remove(T imageAndText,String className);
	
	MongoTemplate getMongoTemplate();
}
