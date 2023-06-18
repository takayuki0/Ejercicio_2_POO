public class Pelicula {
    private String tituloPelicula, protagonistaPelicula, directorPelicula;
    private float precioPelicula;

    public Pelicula(String tituloPelicula, String protagonistaPelicula, String directorPelicula, float precioPelicula) {
        this.tituloPelicula = tituloPelicula;
        this.protagonistaPelicula = protagonistaPelicula;
        this.directorPelicula = directorPelicula;
        this.precioPelicula = precioPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public String getProtagonistaPelicula() {
        return protagonistaPelicula;
    }

    public String getDirectorPelicula() {
        return directorPelicula;
    }

    public float getPrecioPelicula() {
        return precioPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public void setProtagonistaPelicula(String protagonistaPelicula) {
        this.protagonistaPelicula = protagonistaPelicula;
    }

    public void setDirectorPelicula(String directorPelicula) {
        this.directorPelicula = directorPelicula;
    }

    public void setPrecioPelicula(float precioPelicula) {
        this.precioPelicula = precioPelicula;
    }

    @Override
    public String toString() {
        return "__________________________________________\nPelícula: " + tituloPelicula +
                "\nProtagonista: " + protagonistaPelicula +
                "\nDirector: " + directorPelicula +
                "\nPrecio €: " + precioPelicula +
                "\n__________________________________________";
    }
}
