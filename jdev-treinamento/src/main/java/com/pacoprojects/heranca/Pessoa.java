package com.pacoprojects.heranca;

 /* CLASSE ABSTRATA IMPEDE QUE ELA POSSA SER INSTANCIADA(Pessoa p = new Pessoa()) PELO PROGRAMADOR EM OUTRO LUGAR,
  *  ELE OBRIGATORIAMENTE TEM QUE TRABALHAR USANDO CLASSES FILHOS PARA ACESSAR OS DADOS DA SUPER CLASSE */
 /* CLASSE PAI OU CLASSE MASTER OU SUPERCLASSE - (TEM ATRIBUTOS COMUNS A TODOS OBJETOS(Classes) FILHOS) */
public abstract class Pessoa {

	/* SE USA PROTECTED PARA PODER USAR A VARIAVEL DO PAI NA CLASSE FILHA(EXTENDIDA) nome POR EXEMPLO, 
	 * SE NAO DEVE SE USAR NA CLASSE FILHA super.get(nome) PEGAR O NOME DA CLASSE PAI POR EXEMPLO */
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String cpf;
	protected String rg;
	protected String nomeMae;
	protected String nomePai;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	 /* METODO ABSTRATO QUE FICA NA CLASSE PAI(QUE TAMBEM DEVE SER ABSTRACT) EH OBRIGATORIO DE SER IMPLEMENTADO(@Override)
	  * DENTRO DE CADA CLASSE FILHA - EH UMA REGRA!*/
	 public abstract double salario();

	 /* RETORNA TRUE SE FOR +18 */
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeMae == null) ? 0 : nomeMae.hashCode());
		result = prime * result + ((nomePai == null) ? 0 : nomePai.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idade != other.idade)
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeMae == null) {
			if (other.nomeMae != null)
				return false;
		} else if (!nomeMae.equals(other.nomeMae))
			return false;
		if (nomePai == null) {
			if (other.nomePai != null)
				return false;
		} else if (!nomePai.equals(other.nomePai))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", Idade=" + idade + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf
				+ ", rg=" + rg + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
}
