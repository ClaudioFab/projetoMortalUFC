package projeto_ufc;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Criar o método construtor.
    public Lutador(String nome00, String nacionalidade00, int idade00, double altura00, double peso00, String categoria00, int vitorias00, int derrotas00, int empates00) {
        this.nome = nome00;
        this.nacionalidade = nacionalidade00;
        this.idade = idade00;
        this.altura = altura00;
        setPeso(peso00);
        //this.categoria = categoria00;
        this.vitorias = vitorias00;
        this.derrotas = derrotas00;
        this.empates = empates00;
    }
 
    //Deve demostrar as informações(atributos) do lutador.
    public void apresentar(){
        System.out.println("Nome: "+nome+"\nNação: "+nacionalidade+"\nIdade: "+idade+" anos\nAltura: "+altura+" m\nPeso: "+peso+" Kg\nCategoria: "+categoria+"\n");  
    }
 
    //Deve demostrar as informações de vitorias,derrotas e empates do lutador.
    public void status(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~\nPlacar de "+nome+":\nVitórias: "+vitorias+"\nDerrotas: "+derrotas+"\nEmpates: "+empates+"\n\n");
    }
    
    //Deve computar/calcular sempre a pontuação de cada lutador.
    public void ganharLuta(){
        this.vitorias++;
    }
    public void perderLuta(){
        this.derrotas++;
    }
    public void empatarLuta(){
        this.empates++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if(peso < 52 || peso > 110){
            setCategoria("Peso Inválido");
        }else if(peso >= 52 && peso <= 70){
            setCategoria("Leve");
        }else if(peso >= 71 && peso <= 83){
            setCategoria("Médio");
        }else if(peso >= 84 && peso <= 110){
            setCategoria("Pesado");
        }
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
