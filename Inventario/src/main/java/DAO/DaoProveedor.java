/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.DtoProveedor;
import INTERFACES.IntProveedor;
import SYSTEM.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class DaoProveedor implements IntProveedor {

    private final conexion conx;
    private Connection conn;
    private String querysql;

    conexion conect = new conexion();

    public DaoProveedor() {

        conx = new conexion();
        conx.iniciarconect();
    }

    @Override
    public void crear(DtoProveedor proveedor) throws Exception {
        try {
            querysql = "insert into proveedores (nombre_proveedor,nit,direccion_proveedor,correo_proveedor,ciudad_proveedor,telefono,id_marca) "
                    + "values('" + proveedor.getNombre_proveedor() + "'," + proveedor.getNit()+ ",'" + proveedor.getDireccion_proveedor()+ "','" + proveedor.getCorreo_proveedor() + "','" + proveedor.getCiudad_proveedor()+ "','" + proveedor.getTelefono()+ "'," + proveedor.getId_marca() + ")";
            conn = conx.obtenerconexion();
            PreparedStatement st = conn.prepareStatement(querysql);
            st.executeUpdate(querysql);
        
        } catch (Exception error) {
            System.out.println("Error al insertar"+error);
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(DtoProveedor proveedor) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(DtoProveedor proveedor) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DtoProveedor> listarProveedores() throws Exception {

        List<DtoProveedor> listProv = null;
        try {
            querysql = "select * from proveedores";
            conn = conx.obtenerconexion();
            PreparedStatement st = conn.prepareStatement(querysql);
            ResultSet rs = st.executeQuery();
            listProv = new ArrayList();
            while (rs.next()) {
                DtoProveedor proveedor = new DtoProveedor();
                proveedor.setId_proveedor(rs.getInt("id_proveedor"));
                proveedor.setNombre_proveedor(rs.getString("nombre_proveedor"));
                proveedor.setNit(rs.getInt("nit"));
                proveedor.setDireccion_proveedor(rs.getString("direccion_proveedor"));
                proveedor.setCorreo_proveedor(rs.getString("correo_proveedor"));
                proveedor.setCiudad_proveedor(rs.getString("ciudad_proveedor"));
                listProv.add(proveedor);

            }
            rs.close();
            st.close();

        } catch (Exception error) {
            throw error;

        }

        return listProv;

    }
}
