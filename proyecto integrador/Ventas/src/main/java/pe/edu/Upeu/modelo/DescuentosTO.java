package pe.edu.Upeu.modelo;

import lombok.Data;

@Data
public class DescuentosTO {    
    public String idDesc, idProd, vigente;
    public double cantidad, descPorcentaje;
}
