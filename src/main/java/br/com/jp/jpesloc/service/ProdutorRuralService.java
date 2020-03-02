package br.com.jp.jpesloc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.jp.jpesloc.model.ProdutorRural;
import br.com.jp.jpesloc.repository.ProdutorRuralRepository;

public class ProdutorRuralService {
	
	@Autowired
	ProdutorRuralRepository produtorRuralRepository;
	
	void modificaLoginProdutor() {
		
	}
	void modificaSenhaProdutor() {
		
	}
	void visualizaControleReprodutivo() {
		
	}
	void visualizaControleControleDeParto() {
		
	}
	void visualizaControleLeiteiro() {
		
	}
	public List<ProdutorRural> getProdutores(){
		return this.produtorRuralRepository.findAll();
	}
	public boolean isContaining() {
		return produtorRuralRepository.count()>0?true:false;
	}
}
