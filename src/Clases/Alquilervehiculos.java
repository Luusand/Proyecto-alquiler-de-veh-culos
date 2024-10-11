
package Clases;
    
    public class Alquilervehiculos {
        
    private String ContratoArrendamiento, NombreArrendador, CedulaArrendador,
    DireccionArrendatario, NombreArrendatario, CedulaArrendatario,PlacaVehiculo,TiempoContrato, FormaDePago;
    
    private int ValorContrato, PagoMensual;

    public Alquilervehiculos(String NombreArrendador, String CedulaArrendador, String DireccionArrendatario, String NombreArrendatario, String CedulaArrendatario, String PlacaVehiculo, String TiempoContrato, String FormaDePago) {
        this.NombreArrendador = NombreArrendador;
        this.CedulaArrendador = CedulaArrendador;
        this.DireccionArrendatario = DireccionArrendatario;
        this.NombreArrendatario = NombreArrendatario;
        this.CedulaArrendatario = CedulaArrendatario;
        this.PlacaVehiculo = PlacaVehiculo;
        this.TiempoContrato = TiempoContrato;
        this.FormaDePago = FormaDePago;
    }

    public String getTiempoContrato() {
        return TiempoContrato;
    }

    public String getContratoArrendamiento() {
        return ContratoArrendamiento;
    }

    public String getNombreArrendador() {
        return NombreArrendador;
    }

    public String getCedulaArrendador() {
        return CedulaArrendador;
    }

    public String getDireccionArrendatario() {
        return DireccionArrendatario;
    }

    public String getNombreArrendatario() {
        return NombreArrendatario;
    }

    public String getCedulaArrendatario() {
        return CedulaArrendatario;
    }

    public String getPlacaVehiculo() {
        return PlacaVehiculo;
    }

    public int getValorContrato() {
        return ValorContrato;
    }

    public int getPagoMensual() {
        return PagoMensual;
    }

    public String getFormaDePago() {
        return FormaDePago;
    }
    
}     