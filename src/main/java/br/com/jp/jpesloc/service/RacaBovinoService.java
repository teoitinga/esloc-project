package br.com.jp.jpesloc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jp.jpesloc.model.RacaBovino;
import br.com.jp.jpesloc.repository.RacaBovinoRepository;

@Service
public class RacaBovinoService {
	@Autowired
	private RacaBovinoRepository racaBovinoRepository;
	
	public List<RacaBovino> findAll(){
		return this.racaBovinoRepository.findAll();
	}
	public boolean isContaining() {
		return racaBovinoRepository.count()>0?true:false;
	}
}
