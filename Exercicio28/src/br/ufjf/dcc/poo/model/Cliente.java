package br.ufjf.dcc.poo.model;

public class Cliente extends Pessoa {
	private int codigo;
	private Atendimento atendimento;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Atendimento getAtendimento() {
		return atendimento;
	}
	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}
	
}
