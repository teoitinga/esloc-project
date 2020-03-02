package br.com.jp.jpesloc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jp.jpesloc.model.TecnicoResponsavel;
import br.com.jp.jpesloc.repository.TecnicoResponsavelRepository;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoResponsavelRepository tecnicoResponsavelRepository;
	
	public List<TecnicoResponsavel> getTecnicos(){
		return tecnicoResponsavelRepository.findAll();
	}
	public boolean isContaining() {
		return tecnicoResponsavelRepository.count()>0?true:false;
	}
}
