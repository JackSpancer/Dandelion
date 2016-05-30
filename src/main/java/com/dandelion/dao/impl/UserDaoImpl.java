/**
 * 
 */
package com.dandelion.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dandelion.dao.UserDao;
import com.dandelion.model.UserEntity;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Session getCurrSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public boolean deleteUser(UserEntity user) {
		Session session = this.getCurrSession();
		UserEntity u = new UserEntity();
		u = (UserEntity) session.get(UserEntity.class, user.getId());
		if (u != null) {
			session.delete(u);
			Logger.getLogger(UserDaoImpl.class).debug("删除成功");
			return true;
		} else {
			Logger.getLogger(UserDaoImpl.class).debug("删除失败");
			return false;
		}
	}

	@Override
	public boolean isExist(UserEntity user) {
		Session session = this.getCurrSession();
		String hql = "from UserEntity where username = ? and password = ?";
		Query query = session.createQuery(hql);
		query.setString(0, user.getUsername());
		query.setString(1, user.getPassword());
		// System.err.println("查询结果" + query.list());
		if (query.list().size() >= 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean addUser(UserEntity user) {
		if (isUsernameExist(user.getUsername())) {
			return false;
		} else {
			this.getCurrSession().save(user);
			System.out.println("保存数据成功");
			return true;
		}

	}

	public boolean isUsernameExist(String name) {
		Session session = this.getCurrSession();
		String hql = "from UserEntity where username = ?";
		Query query = session.createQuery(hql);
		query.setString(0, name);
		if (query.list().size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<UserEntity> getAllUser() {

		String hql = "from UserEntity";
		Query query = this.getCurrSession().createQuery(hql);
		System.err.println("查询结果" + query.list());
		if (query.list().size() > 0) {
			System.out.println("列出所有的用户");
			return (List<UserEntity>) query.list();

		}
		return null;

	}
}
