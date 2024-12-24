package com.alphadiet.app.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;    //'Arroz, integral, cozido'
	private Double umidade;      //70.1
	private Integer kcal;        //124
	private Integer kj;          //517
	private Double proteina;     //2.6
	private Double lipideos;     //1.0
	private Integer colesterol;  //0
	private Double idrato;       //25.8
	private Double alimentar;    //2.7
	private Double cinzas;       //0.5
	private Integer calcio;      //5
	private Integer magnesio;    //59
	private Double manganes;     //0.63
	private Integer fosforo;     //106 
	private Double ferro;        //0.3
	private Integer sodio;       //1
	private Integer potassio;    //75
	private Double cobre;        //0.02
	private Double zinco;        //0.7
	private Integer retinol;     //0
	private Integer re;          //0
	private Integer rae;         //0
	private Double tiamina;      //0.08
	private Double riboflavina;  //0
	private Double piridoxina;   //0.08
	private Double niacina;      //0
	private Double vitaminac;    //0
	private Double valorUnitario; //8.44
	
	public Produto() {
		
	}
	
	public Produto(Long id, String descricao, Double umidade, Integer kcal, Integer kj, Double proteina,
			Double lipideos, Integer colesterol, Double idrato, Double alimentar, Double cinzas, Integer calcio,
			Integer magnesio, Double manganes, Integer fosforo, Double ferro, Integer sodio, Integer potassio,
			Double cobre, Double zinco, Integer retinol, Integer re, Integer rae, Double tiamina, Double riboflavina,
			Double piridoxina, Double niacina, Double vitaminac, Double valorUnitario) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.umidade = umidade;
		this.kcal = kcal;
		this.kj = kj;
		this.proteina = proteina;
		this.lipideos = lipideos;
		this.colesterol = colesterol;
		this.idrato = idrato;
		this.alimentar = alimentar;
		this.cinzas = cinzas;
		this.calcio = calcio;
		this.magnesio = magnesio;
		this.manganes = manganes;
		this.fosforo = fosforo;
		this.ferro = ferro;
		this.sodio = sodio;
		this.potassio = potassio;
		this.cobre = cobre;
		this.zinco = zinco;
		this.retinol = retinol;
		this.re = re;
		this.rae = rae;
		this.tiamina = tiamina;
		this.riboflavina = riboflavina;
		this.piridoxina = piridoxina;
		this.niacina = niacina;
		this.vitaminac = vitaminac;
		this.valorUnitario = valorUnitario;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getUmidade() {
		return umidade;
	}

	public void setUmidade(Double umidade) {
		this.umidade = umidade;
	}

	public Integer getKcal() {
		return kcal;
	}

	public void setKcal(Integer kcal) {
		this.kcal = kcal;
	}

	public Integer getKj() {
		return kj;
	}

	public void setKj(Integer kj) {
		this.kj = kj;
	}

	public Double getProteina() {
		return proteina;
	}

	public void setProteina(Double proteina) {
		this.proteina = proteina;
	}

	public Double getLipideos() {
		return lipideos;
	}

	public void setLipideos(Double lipideos) {
		this.lipideos = lipideos;
	}

	public Integer getColesterol() {
		return colesterol;
	}

	public void setColesterol(Integer colesterol) {
		this.colesterol = colesterol;
	}

	public Double getIdrato() {
		return idrato;
	}

	public void setIdrato(Double idrato) {
		this.idrato = idrato;
	}

	public Double getAlimentar() {
		return alimentar;
	}

	public void setAlimentar(Double alimentar) {
		this.alimentar = alimentar;
	}

	public Double getCinzas() {
		return cinzas;
	}

	public void setCinzas(Double cinzas) {
		this.cinzas = cinzas;
	}

	public Integer getCalcio() {
		return calcio;
	}

	public void setCalcio(Integer calcio) {
		this.calcio = calcio;
	}

	public Integer getMagnesio() {
		return magnesio;
	}

	public void setMagnesio(Integer magnesio) {
		this.magnesio = magnesio;
	}

	public Double getManganes() {
		return manganes;
	}

	public void setManganes(Double manganes) {
		this.manganes = manganes;
	}

	public Integer getFosforo() {
		return fosforo;
	}

	public void setFosforo(Integer fosforo) {
		this.fosforo = fosforo;
	}

	public Double getFerro() {
		return ferro;
	}

	public void setFerro(Double ferro) {
		this.ferro = ferro;
	}

	public Integer getSodio() {
		return sodio;
	}

	public void setSodio(Integer sodio) {
		this.sodio = sodio;
	}

	public Integer getPotassio() {
		return potassio;
	}

	public void setPotassio(Integer potassio) {
		this.potassio = potassio;
	}

	public Double getCobre() {
		return cobre;
	}

	public void setCobre(Double cobre) {
		this.cobre = cobre;
	}

	public Double getZinco() {
		return zinco;
	}

	public void setZinco(Double zinco) {
		this.zinco = zinco;
	}

	public Integer getRetinol() {
		return retinol;
	}

	public void setRetinol(Integer retinol) {
		this.retinol = retinol;
	}

	public Integer getRe() {
		return re;
	}

	public void setRe(Integer re) {
		this.re = re;
	}

	public Integer getRae() {
		return rae;
	}

	public void setRae(Integer rae) {
		this.rae = rae;
	}

	public Double getTiamina() {
		return tiamina;
	}

	public void setTiamina(Double tiamina) {
		this.tiamina = tiamina;
	}

	public Double getRiboflavina() {
		return riboflavina;
	}

	public void setRiboflavina(Double riboflavina) {
		this.riboflavina = riboflavina;
	}

	public Double getPiridoxina() {
		return piridoxina;
	}

	public void setPiridoxina(Double piridoxina) {
		this.piridoxina = piridoxina;
	}

	public Double getNiacina() {
		return niacina;
	}

	public void setNiacina(Double niacina) {
		this.niacina = niacina;
	}

	public Double getVitaminaC() {
		return vitaminac;
	}

	public void setVitaminaC(Double vitaminac) {
		this.vitaminac = vitaminac;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", umidade=" + umidade + ", kcal=" + kcal + ", kj="
				+ kj + ", proteina=" + proteina + ", lipideos=" + lipideos + ", colesterol=" + colesterol + ", idrato="
				+ idrato + ", alimentar=" + alimentar + ", cinzas=" + cinzas + ", calcio=" + calcio + ", magnesio="
				+ magnesio + ", manganes=" + manganes + ", fosforo=" + fosforo + ", ferro=" + ferro + ", sodio=" + sodio
				+ ", potassio=" + potassio + ", cobre=" + cobre + ", zinco=" + zinco + ", retinol=" + retinol + ", re="
				+ re + ", rae=" + rae + ", tiamina=" + tiamina + ", riboflavina=" + riboflavina + ", piridoxina="
				+ piridoxina + ", niacina=" + niacina + ", vitaminaC=" + vitaminac + ", valorUnitario=" + valorUnitario
				+ "]";
	}
	
	
	
}
