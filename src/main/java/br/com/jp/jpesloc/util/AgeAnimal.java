package br.com.jp.jpesloc.util;



import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Classe repons�vel por tratar eventos e a�oes que se referem � idade do animal
 * como convers�es em anos, meses e dias
 * @author Jo�o Paulo Santana Gusm�o
 * @Date 15/02/2020
 *
 */
public class AgeAnimal {
	/**
	 * Variaveis de controle
	 */
	private static final int SECONDS_PER_DAY = 86400; 
	private static final int DAYS_PER_YEAR = 365; 
	private static final int DAYS_PER_MONTH = 30;
	private static final int MONTHS_PER_YEARS = 12;
	
	/**
	 * Variaveis de parametros
	 * 
	 */
	public static int YEARS = 0;
	public static int MONTHS = 0;
	public static int DAYS = 0;
	public static int ONLY_YEARS = 0;
	public static int ONLY_MONTHS = 0;
	public static int ONLY_DAYS = 0;
	/**
	 * 
	 * @param dataNascimento - data de nascimento do animal
	 * @param consulta - data da consulta � idade do animal
	 * 
	 */
	public AgeAnimal(Date nascimento, Date consulta) {
		
		long timeseconds = (consulta.getTime() - nascimento.getTime())/1000;
		//Configurando as convers�es de idade em dias, meses e anos totalizados ex.: 02 anos s�o 720 dias
		ONLY_DAYS = (int)timeseconds/SECONDS_PER_DAY;
		ONLY_MONTHS = (int)timeseconds/SECONDS_PER_DAY/DAYS_PER_MONTH;
		ONLY_YEARS= (int)timeseconds/SECONDS_PER_DAY/DAYS_PER_MONTH/MONTHS_PER_YEARS;
		
		//Configurando as convers�es de idade em dias, meses e anos totalizados ex.: 02 anos s�o 720 dias
		
		YEARS = (int)((double)timeseconds/SECONDS_PER_DAY/DAYS_PER_MONTH)/MONTHS_PER_YEARS;
		double tempoRestante = ((double)timeseconds/SECONDS_PER_DAY/DAYS_PER_MONTH)%MONTHS_PER_YEARS;
		
		MONTHS = (int)tempoRestante;
		
		tempoRestante = ((double)timeseconds/SECONDS_PER_DAY)%DAYS_PER_MONTH;
		
		DAYS = (int)tempoRestante;
	}
}
