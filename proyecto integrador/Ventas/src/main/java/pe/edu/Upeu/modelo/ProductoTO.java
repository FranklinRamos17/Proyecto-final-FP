package pe.edu.Upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoTO {    
    public String idProducto, nombre, idCate, idMarca;
    public double pu, utilidad;
    public int stock;

}
