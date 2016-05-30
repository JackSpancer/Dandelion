package com.dandelion.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dandelion.dao.TeamMemberDao;
import com.dandelion.model.TeamMemberEntity;

@Repository("TeamMemberDao")
public class TeamMemberDaoImpl implements TeamMemberDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Logger log = Logger.getLogger(TeamDaoImpl.class);

	public Session getCurrSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public boolean addMember(TeamMemberEntity teamMemberEntity) {

		if (isExistMember(teamMemberEntity)) {// 队员已在球队中
			log.info("队员已存在，添加失败");
			return false;
		} else {
			this.getCurrSession().save(teamMemberEntity);
			log.info("添加队员成功");
			return true;
		}
	}

	public boolean isExistMember(TeamMemberEntity t) {
		int teamid = t.getTeamid();
		int userid = t.getUserid();

		Session session = this.getCurrSession();
		String hql = "from TeamMemberEntity where teamid = ? and userid = ?";
		Query query = session.createQuery(hql);
		query.setInteger(0, teamid);
		query.setInteger(1, userid);
		if (query.list().size() > 0) {
			log.info("队员以在球队中，加入失败");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteMember(TeamMemberEntity teamMemberEntity) {
		Session session = this.getCurrSession();
		String hql = "from TeamMemberEntity where teamid = ? and userid = ?";
		Query query = session.createQuery(hql);
		query.setInteger(0, teamMemberEntity.getTeamid());
		query.setInteger(1, teamMemberEntity.getUserid());
		if (query.list().size() > 0) {
			TeamMemberEntity t = (TeamMemberEntity) query.list().get(0);
			TeamMemberEntity tt = (TeamMemberEntity) session.get(
					TeamMemberEntity.class, t.getId());
			session.delete(tt);
			log.info("删除队员成功");
			return true;
		} else {
			log.info("删除队员失败");
			return false;
		}
		// Session session = this.getCurrSession();
		// String hql =
		// "delete from TeamMemberEntity where teamid = ? and userid = ?";
		// Query query = session.createQuery(hql);
		// query.setInteger(0, teamMemberEntity.getTeamid());
		// query.setInteger(1, teamMemberEntity.getUserid());
		// return true;
	}

}
