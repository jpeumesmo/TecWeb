package champions.linux.services.entities;

import java.util.ArrayList;

public class Sumula {
	
	//ATRIBUTOS
	private ArrayList<Gol> gols;
	private ArrayList<Falta> faltas;
	private ArrayList<CartaoAmarelo> cartoesAmarelo;
	private ArrayList<CartaoVermelho> cartoesVermelho;
	
	//METODOS
	public ArrayList<Gol> getGols() {
		return gols;
	}
	public void setGols(ArrayList<Gol> gols) {
		this.gols = gols;
	}
	public ArrayList<Falta> getFaltas() {
		return faltas;
	}
	public void setFaltas(ArrayList<Falta> faltas) {
		this.faltas = faltas;
	}
	public ArrayList<CartaoAmarelo> getCartoesAmarelo() {
		return cartoesAmarelo;
	}
	public void setCartoesAmarelo(ArrayList<CartaoAmarelo> cartoesAmarelo) {
		this.cartoesAmarelo = cartoesAmarelo;
	}
	public ArrayList<CartaoVermelho> getCartoesVermelho() {
		return cartoesVermelho;
	}
	public void setCartoesVermelho(ArrayList<CartaoVermelho> cartoesVermelho) {
		this.cartoesVermelho = cartoesVermelho;
	}
	
	
}
