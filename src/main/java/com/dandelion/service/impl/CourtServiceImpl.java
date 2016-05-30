package com.dandelion.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dandelion.dao.CourtDao;
import com.dandelion.model.CourtEntity;
import com.dandelion.service.CourtServce;

@Transactional
@Service("courtService")
public class CourtServiceImpl implements CourtServce {

	@Resource
	private CourtDao courtDao;

	@Override
	public boolean addCourt(CourtEntity courtEntity) {
		return courtDao.addCourt(courtEntity);
	}

	@Override
	public boolean deleteCourt(CourtEntity courtEntity) {
		return courtDao.deleteCourt(courtEntity);
	}

	@Override
	public List<CourtEntity> getAllCourt() {
		return courtDao.getAllCourt();
	}

	@Override
	public List<CourtEntity> findCourt(CourtEntity courtEntity) {
		return courtDao.findCourt(courtEntity);
	}

}
