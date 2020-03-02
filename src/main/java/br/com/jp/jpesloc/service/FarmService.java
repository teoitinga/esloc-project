package br.com.jp.jpesloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jp.jpesloc.repository.FarmRepository;

@Service
public class FarmService {
	
	@Autowired
	private FarmRepository farmRepository;
	
	public boolean isContaining() {
		return farmRepository.count()>0?true:false;
	}
	
}
