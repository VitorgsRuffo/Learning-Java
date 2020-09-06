public class Main {
    public static void main(String[] args){
        
        //printando todas as intancias constantes do enum Movie:
        for(Movie mov : Movie.values()){
            Sytem.out.printf("Nome da instancia do enum: %s\nTitulo: %s\nAno de lancamento: %d\n", mov, mov.getTitle(). mov.getDebutYear());
        }

        //As instancias do enum sao estaticas, portanto, não precisamos (nem podemos) instanciar um objeto enum Movie para acessa-los:
        Sytem.out.printf("Nome da instancia do enum: %s\nTitulo: %s\nAno de lancamento: %d\n", Movie.HP1, Movie.HP1.getTitle(), Movie.HP1.getDebutYear());

        //Apontando para um das instancias constantes do enum Movie:
        Movie toyStoryMovie = Movie.TS;
        Sytem.out.printf("Nome da instancia do enum: %s\nTitulo: %s\nAno de lancamento: %d\n", toyStoryMovie, toyStoryMovie.getTitle(), toyStoryMovie.getDebutYear());
    }
}