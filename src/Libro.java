public class Libro {
    private String autorLibro, tituloLibro;
    private float precioLibro;

    public Libro(String autorLibro, String tituloLibro, float precioLibro) {
        this.autorLibro = autorLibro;
        this.tituloLibro = tituloLibro;
        this.precioLibro = precioLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public float getPrecioLibro() {
        return precioLibro;
    }

    public void setAutorLibro(String autorLibro) {

        this.autorLibro = autorLibro;
    }

    public void setTituloLibro(String tituloLibro) {

        this.tituloLibro = tituloLibro;
    }

    public void setPrecioLibro(float precioLibro) {

        this.precioLibro = precioLibro;
    }

    @Override
    public String toString() {
        return "__________________________________________\nLibro: " +
                tituloLibro +
                "\nAutor: " + autorLibro +
                "\nPrecio €: " + precioLibro +
                "\n__________________________________________";
    }
}
