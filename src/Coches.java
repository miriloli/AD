

public class Coches {

    private String marca;
    private String modelo;
    private Integer ano;
    private String matricula;

    public static Integer contadorDeCoches = 0;

    

    public Coches(){

    }

    public Coches(String marca, String modelo, Integer ano, String matricula) {

    }

    public String getMarca() {

        return this.marca;
    }

    public void setMarca(String nuevaMarca) {
        this.marca = nuevaMarca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String nuevoModelo) {
        this.modelo = nuevoModelo;
    }

    public Integer getAno() {
        return this.ano;
    }

    public void setAno(Integer nuevoAno) {
        this.ano = nuevoAno;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String nuevaMatricula) {
        this.matricula = nuevaMatricula;
    }

    public String imprimeDatos(){

        return "La marca es:  "+this.marca+"El modelo es:  "+this.modelo+"El año de fabricación es:   "+this.ano+"La matrícula es:  "+this.matricula;

    }
   
}
