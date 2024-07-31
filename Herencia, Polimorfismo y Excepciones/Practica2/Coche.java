public class Coche {

    String matricula;
    int precio;

    public Coche(String m, int p) {
	matricula = m;
        precio = p;
    }

    public String getMatricula() {
	return matricula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
