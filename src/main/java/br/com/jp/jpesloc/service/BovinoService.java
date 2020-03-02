package br.com.jp.jpesloc.service;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.jp.jpesloc.model.Animal;
import br.com.jp.jpesloc.model.Bezerro;
import br.com.jp.jpesloc.model.Bovino;
import br.com.jp.jpesloc.model.Farm;
import br.com.jp.jpesloc.model.Gender;
import br.com.jp.jpesloc.model.Herd;
import br.com.jp.jpesloc.model.ProdutorRural;
import br.com.jp.jpesloc.model.RacaBovino;
import br.com.jp.jpesloc.model.Role;
import br.com.jp.jpesloc.model.TecnicoResponsavel;

public class BovinoService {
	static Bovino animal;
	static TecnicoResponsavel tecnico;
	static ProdutorRural proprietario;
	static Farm fazenda;
	static Herd rebanho;
	
	protected static void info() throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		/* ========== Montagem do cen�rio ========== */
		
		//registrando o t�cnico
		System.out.println("/*============ MegaFarm============*/");
		System.out.println("- ============ Registro do T�cnico");
		System.out.println("Enter with Tecnico name: ");
		String tr = sc.nextLine();
		tecnico = new TecnicoResponsavel(tr, "teo.itinga", "xx", Role.TECNICO);
		
		//Registrando o produtor rural
		System.out.println("- ============ Registro do Produtor */");
		System.out.println("Enter with Produtor name: ");
		String af = sc.nextLine();
		proprietario = new ProdutorRural(af, "", "", Role.USER);
		
		//Registtrando a Fazenda
		System.out.println("- ============ Registro da Fazenda */");
		System.out.println("Enter with Fazenda: ");
		String fz = sc.nextLine();
		fazenda = new Farm(fz, 4.84, tecnico, proprietario);
		
		//Registrando o rebanho
		System.out.println("- ============ Registro do Rebanho */");
		System.out.println("Enter with lote/rebanho: ");
		String rb = sc.nextLine();
		rebanho = new Herd(rb);
		
		//registrando os animais do rebanho
		String opcao = "1";
		while(!opcao.equals("0")) {
			System.out.println("- ============ Registro de animais */");
			System.out.println("Enter with dados dos animais: ");
			System.out.println("Nome: ");
			String nm = sc.nextLine();	
			System.out.println("Sexo(m/f): ");
			String sx = sc.nextLine();
			Gender gd;
			if(sx == "m") {
				gd = Gender.MACHO;
			}else {
				gd = Gender.FEMEA;
			}
			System.out.println("Ra�a: ");
			String rc = sc.nextLine();	
			System.out.println("Data nascimento(dd/mm/yyyy): ");
			Date nsc = sdf.parse(sc.nextLine());
			System.out.println("- Digite 0 para finalizar */");
			opcao = sc.nextLine();				
			animal = new Bezerro(nm, gd, new RacaBovino(rc), new Date(), rebanho);
			
			//adicionando animais ao rebanho
			rebanho.getAnimais().add((Bovino)animal);

		}

		
		//adicionando rebanho � Fazenda
		fazenda.getRebanhos().add(rebanho);
		
		//mostrando registros
		viewInfo();
	}
	public static void viewInfo() {
		//registrando o t�cnico
		System.out.println("/*============ MegaFarm============*/");
		System.out.println("- ============ Registro do T�cnico");
		System.out.println("- T�cnico: " + tecnico.getName());
		System.out.println("- ============ Registro do Produtor");
		System.out.println("- Produtor: " + proprietario.getName());
		System.out.println("- ============ Registro da Fazenda acompanhada");
		System.out.println("- Fazenda: " + fazenda.getName());
		System.out.println("- ============ Registro do rebanho acompanhado");
		System.out.println("- Rebanho: " + rebanho.getLote());
		System.out.println("- ============ Lista de animais do rebanho");
		rebanho.getAnimais().forEach(gado -> System.out.println("Nome: "+ gado.getName() + "\n"));
		
	}
	
}
