package br.com.jp.jpesloc.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import br.com.jp.jpesloc.model.Farm;
import br.com.jp.jpesloc.model.ProdutorRural;
import br.com.jp.jpesloc.model.RacaBovino;
import br.com.jp.jpesloc.model.Role;
import br.com.jp.jpesloc.model.TecnicoResponsavel;
import br.com.jp.jpesloc.service.FarmService;
import br.com.jp.jpesloc.service.ProdutorRuralService;
import br.com.jp.jpesloc.service.RacaBovinoService;
import br.com.jp.jpesloc.service.TecnicoService;

@Configuration
public class SetupDataLoader {
	// instanciando Services
	@Autowired
	FarmService farmService;

	@Autowired
	TecnicoService tecnicoService;

	@Autowired
	ProdutorRuralService produtorRuralService;

	@Autowired
	RacaBovinoService racaBovinoService;

	private ArrayList<Farm> fazendas;
	private ArrayList<ProdutorRural> produtores;
	private ArrayList<RacaBovino> racas;
	private ArrayList<TecnicoResponsavel> tecnicos;

	public SetupDataLoader() {

	}

	private void createFarmIfNoExisits() {
		
		// criando registros para testar o sistema
		if (farmService.isContaining()) {
			fazendas = new ArrayList<Farm>();
			fazendas.add(new Farm("Sitio Bambu Preto", 48.44, tecnicoService.getTecnicos().get(0),
					produtorRuralService.getProdutores().get(0)));
			fazendas.add(new Farm("Sitio blue", 8.32, tecnicoService.getTecnicos().get(1),
					produtorRuralService.getProdutores().get(3)));
			fazendas.add(new Farm("Sitio Bambu Preto", 48.44, tecnicoService.getTecnicos().get(2),
					produtorRuralService.getProdutores().get(4)));
			fazendas.add(new Farm("Sitio Bambu Preto", 48.44, tecnicoService.getTecnicos().get(0),
					produtorRuralService.getProdutores().get(1)));

		}

	}

	private void createProdutorIfNotExists() {
		
		// criando registros para testar o sistema
		if (produtorRuralService.isContaining()) {
			produtores = new ArrayList<ProdutorRural>();
			produtores.add(new ProdutorRural("Marcos Alberto", "email.gmail.com", "xxxaaax", Role.USER));
			produtores.add(new ProdutorRural("Maria Moenda", "email.gmail.com", "xxxaaax", Role.USER));
			produtores.add(new ProdutorRural("Alexandre", "email.gmail.com", "xxxaaax", Role.USER));
			produtores.add(new ProdutorRural("Aguinaldo", "email.gmail.com", "xxxaaax", Role.USER));
			produtores.add(new ProdutorRural("Paulo Daniel", "email.gmail.com", "xxxaaax", Role.USER));
			produtores.add(new ProdutorRural("Jose Coelho", "email.gmail.com", "xxxaaax", Role.USER));
			produtores.add(new ProdutorRural("Albert", "email.gmail.com", "xxxaaax", Role.USER));
			produtores.add(new ProdutorRural("Marcos Abreu", "email.gmail.com", "xxxaaax", Role.USER));
			produtores.add(new ProdutorRural("Eumani", "email.gmail.com", "xxxaaax", Role.USER));
			produtores.add(new ProdutorRural("Renato", "email.gmail.com", "xxxaaax", Role.USER));
		}
	}

	private void createRacaIIfNotExists() {
		
		// criando registros para testar o sistema
		if (racaBovinoService.isContaining()) {
			racas = new ArrayList<RacaBovino>();
			racas.add(new RacaBovino("Gir"));
			racas.add(new RacaBovino("Guzer�"));
			racas.add(new RacaBovino("Girolando"));
			racas.add(new RacaBovino("Nelore"));
			racas.add(new RacaBovino("Tabapu�"));
			racas.add(new RacaBovino("Holand�s"));
			racas.add(new RacaBovino("Jersey"));
		}
	}

	private void createTecnicoIfNotExists() {
		
		// criando registros para testar o sistema
		if (tecnicoService.isContaining()) {
			tecnicos = new ArrayList<TecnicoResponsavel>();
			tecnicos.add(new TecnicoResponsavel("Jo�o Paulo", "email.gmail.com", "xxxaaax", Role.ADMINISTRADOR));
			tecnicos.add(new TecnicoResponsavel("Newman", "email.gmail.com", "xxxaaax", Role.TECNICO));
			tecnicos.add(new TecnicoResponsavel("Judson", "email.gmail.com", "xxxaaax", Role.TECNICO));
			tecnicos.add(new TecnicoResponsavel("Maurilio", "email.gmail.com", "xxxaaax", Role.TECNICO));
			tecnicos.add(new TecnicoResponsavel("Gilmar", "email.gmail.com", "xxxaaax", Role.TECNICO));
			tecnicos.add(new TecnicoResponsavel("Ronald Hott", "email.gmail.com", "xxxaaax", Role.COORDINATE));
		}
	}

}
