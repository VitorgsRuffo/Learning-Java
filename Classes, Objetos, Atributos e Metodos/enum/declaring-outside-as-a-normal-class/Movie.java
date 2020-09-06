public enum Movie {

    //Declarando instancias constantes do enum Movie passando uma string e um int para o constructor
    HP1("Harry Potter", 2001),
    SHREK("Shrek", 2002),
    TS("Toy Story", 2002),
    SBLG("Shark boy and Lava Girl", 2000);

    //Atributos de instancias do enum Movie. (a keyword 'final' tornam esses atributos constantes)
    private final String title;
    private final int debutYear;

    //Construtor privado que é chamado para "instanciar" os objetos declarados no inicio da classe enum. 
    Movie(String title, int debutYear){
        this.title = title;
        this.debutYear = debutYear;
    }
    //Obs: não conseguimos instanciar objetos de classes enum fora da classe.

    
    public String getTitle(){
        return title;
    }

    public int getDebutYear(){
        return debutYear;
    }
    //Obs: não teremos setters pois os atributos das instancias de enum sao todos constantes.
}
