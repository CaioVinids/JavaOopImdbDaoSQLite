class Filme {
  private int id;
  private String titulo;
  private int ano;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public Filme(int id, String titulo, int ano) {
    this.id = id;
    this.titulo = titulo;
    this.ano = ano;
  }

  public String toString() {
    return ("\n" + this.id + " - " + this.titulo + " (" + this.ano + ") ");
  }

}