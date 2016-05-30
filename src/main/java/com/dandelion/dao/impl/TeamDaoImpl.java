package com.dandelion.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dandelion.dao.TeamDao;
import com.dandelion.model.TeamEntity;

@Repository("teamDao")
public class TeamDaoImpl implements TeamDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Logger log = Logger.getLogger(TeamDaoImpl.class);

	public Session getCurrSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public boolean addTeam(TeamEntity tEntity) {
		Session session = this.getCurrSession();
		String hql = "from TeamEntity where teamname = ?";
		Query query = session.createQuery(hql);
		query.setString(0, tEntity.getTeamname());
		if (query.list().size() > 0) {
			// 如果队名已经存在，创建失败
			return false;
		} else {
			this.getCurrSession().save(tEntity);
			return true;
		}
	}

	@Override
	public boolean deleteTeam(TeamEntity tEntity) {
		Session session = this.getCurrSession();
		TeamEntity t = new TeamEntity();
		t = (TeamEntity) session.get(TeamEntity.class, tEntity.getId());
		if (t != null) {
			session.delete(t);
			log.info("删除成功");
			return true;
		} else {
			log.error("删除失败");
			return false;
		}

	}

	@Override
	public List<TeamEntity> getAllTeam() {
		Session session = this.getCurrSession();
		String hql = "from TeamEntity";
		Query query = session.createQuery(hql);
		if (query.list().size() > 0) {
			return (List<TeamEntity>) query.list();
		} else {
			return null;
		}
	}

}
