package mul.cam.a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mul.cam.a.dao.PdsDao;
import mul.cam.a.dto.PdsDto;
import mul.cam.a.dto.PdsParam;
import mul.cam.a.service.PdsService;

@Service
public class PdsServiceImpl implements PdsService {

	@Autowired
	PdsDao dao;

	@Override
	public List<PdsDto> pdslist(PdsParam param) {		
		return dao.pdslist(param);
	}

	@Override
	public boolean uploadPds(PdsDto dto) {
		int count = dao.uploadPds(dto);
		return count>0?true:false;
	}

	@Override
	public void downcount(int seq) {
		dao.downcount(seq);
	}

	@Override
	public PdsDto getPds(int seq) {		
		return dao.getPds(seq);
	}

	@Override
	public boolean updatePds(PdsDto pds) {		
		int n = dao.updatePds(pds);
		return n>0?true:false;
	}	
	
	
}
