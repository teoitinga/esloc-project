package br.com.jp.jpesloc.model;


import java.util.Date;

public class BirthControl {
	private long id;
	private ReproductiveControl controleReprodutivdo;
	private Date dataParto;
	private String ocorrency;
	/**
	 * 
	 * @param controleReprodutivdo
	 * @param ocorrency
	 */
	public BirthControl(ReproductiveControl controleReprodutivdo, String ocorrency, String nomeBezerro, Gender sexo) {
		this.controleReprodutivdo = controleReprodutivdo;
		this.dataParto = new Date();
		this.ocorrency = ocorrency;
		if(nomeBezerro == null) {
			this.ocorrency += "\nN�o h� registro de nascimento deste bezerro no rebanho.";
		}else {

			Bezerro bezerro = new Bezerro(nomeBezerro, sexo, controleReprodutivdo.getAnimalRegistro().getRaca(), new Date(), controleReprodutivdo.getAnimalRegistro().getRebanhoAtual());
		}

	}
	public ReproductiveControl getControleReprodutivdo() {
		return controleReprodutivdo;
	}
	public void setControleReprodutivdo(ReproductiveControl controleReprodutivdo) {
		this.controleReprodutivdo = controleReprodutivdo;
	}
	public Date getDataParto() {
		return dataParto;
	}
	public void setDataParto(Date dataParto) {
		this.dataParto = dataParto;
	}
	public String getOcorrency() {
		return ocorrency;
	}
	public void setOcorrency(String ocorrency) {
		this.ocorrency = ocorrency;
	}

}
