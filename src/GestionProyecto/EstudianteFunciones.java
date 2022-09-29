package GestionProyecto;

/**
 *
 * @author kalfe
 */
public class EstudianteFunciones {
    private String Nombre;
    private String appP;
    private String appM;
    private String Codigo;
    private String parcial1;
    private String parcial2;
    private String parcial3;

    public EstudianteFunciones(String Codigo, String appP, String appM, String Nombre, 
            String parcial1, String parcial2, String parcial3){
        this.Nombre = Nombre;
        this.appP = appP;
        this.appM = appM;
        this.Codigo = Codigo;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAppP() {
        return appP;
    }

    public void setAppP(String appP) {
        this.appP = appP;
    }

    public String getAppM() {
        return appM;
    }

    public void setAppM(String appM) {
        this.appM = appM;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getParcial1() {
        return parcial1;
    }

    public void setParcial1(String parcial1) {
        this.parcial1 = parcial1;
    }

    public String getParcial2() {
        return parcial2;
    }

    public void setParcial2(String parcial2) {
        this.parcial2 = parcial2;
    }

    public String getParcial3() {
        return parcial3;
    }

    public void setParcial3(String parcial3) {
        this.parcial3 = parcial3;
    }
   
}
