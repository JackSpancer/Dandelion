package com.dandelion.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dandelion.dao.CourtDao;
import com.dandelion.model.CourtEntity;
import com.dandelion.model.UserEntity;

@Repository("courtDao")
public class CourtDaoImpl implements CourtDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Logger log = Logger.getLogger(CourtDaoImpl.class);

	public Session getCurrSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public boolean addCourt(CourtEntity courtEntity) {
		Session session = this.getCurrSession();
		session.save(courtEntity);
		return true;
	}

	@Override
	public boolean deleteCourt(CourtEntity courtEntity) {
		Session session = this.getCurrSession();
		CourtEntity court = new CourtEntity();
		court = (CourtEntity) session.get(CourtEntity.class,
				courtEntity.getId());

		if (court != null) {
			session.delete(court);
			log.info("删除场地成功");
			// Logger.getLogger(CourtDaoImpl.class).debug("删除场地成功");
			return true;
		} else {
			log.info("删除场地失败");
			// Logger.getLogger(CourtDaoImpl.class).debug("删除场地失败");
			return false;
		}
	}

	@Override
	public List<CourtEntity> getAllCourt(CourtEntity courtEntity) {
		Session session = this.getCurrSession();
		String hql = "from CourtEntity";
		Query query = session.createQuery(hql);
		if (query.list().size() > 0) {
			// System.out.println("列出所有的场地");
			log.info("列出所有的场地");
			return (List<CourtEntity>) query.list();
		}
		return null;
	}

	@Override
	public List<CourtEntity> findCourt(CourtEntity courtEntity) {
		// TODO dfdjfkdfakdfkadf
		Session session = this.getCurrSession();
		String name = courtEntity.getCourtName();
		String hql = "from CourtEntity where courtName like ?";
		Query query = session.createQuery(hql);
		query.setString(0, courtEntity.getCourtName());
		if (query.list().size() > 0) {
			log.info("列出所有相关场地的结果");
			System.out.println(query.list());
			return (List<CourtEntity>) query.list();
		}
		else {
			log.info("未查找到相关的场地");
			return null;
		}
	}

}
