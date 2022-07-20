package pe.edu.Upeu.dao;

import pe.edu.Upeu.crud.AppCrud;
import pe.edu.Upeu.modelo.MarcaTO;
import pe.edu.Upeu.util.LeerArchivo;
import pe.edu.Upeu.util.LeerTeclado;
import pe.edu.Upeu.util.UtilsX;

public class MarcaDao extends AppCrud{
    LeerArchivo leerA;
    LeerTeclado leerT=new LeerTeclado();
    UtilsX util=new UtilsX();
    MarcaTO mTo;
    final static String TABLA_MARCA="Marca.txt";

    public void crearMarca() {
      mTo=new MarcaTO();
      leerA=new LeerArchivo(TABLA_MARCA);
      String idM=generarId(leerA, 0, "M", 1);
      mTo.setIdMarca(idM);
      mTo.setNombre(leerT.leer("", "Ingrese nombre Marca"));
      leerA=new LeerArchivo(TABLA_MARCA);
      agregarContenido(leerA, mTo);
    }    
}
