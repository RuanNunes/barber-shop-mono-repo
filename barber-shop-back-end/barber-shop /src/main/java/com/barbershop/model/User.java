package com.barbershop.model;

import javax.persistence.Entity;

@Entity
public class User extends UserBase{
    private Integer carimbo; // toda vez que completar 10 carimbos altera xCarimbo +1
    private Integer xCarimbo;
    private boolean vip;
    private String telefone;
    private String description;
    
	public Integer getCarimbo() {
		return carimbo;
	}
	public void setCarimbo(Integer carimbo) {
		this.carimbo = carimbo;
	}
	public Integer getxCarimbo() {
		return xCarimbo;
	}
	public void setxCarimbo(Integer xCarimbo) {
		this.xCarimbo = xCarimbo;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


}