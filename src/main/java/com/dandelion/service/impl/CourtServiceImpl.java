package com.dandelion.service.impl;

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

}
