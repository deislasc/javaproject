package mx.sb.administracion.ms.main.Mutation;

import mx.sb.administracion.ms.main.Data.ReporteEmpleados;
import mx.sb.administracion.ms.main.Entity.Empleados;
import mx.sb.administracion.ms.main.Entity.EmpleadosInfoAdicional;
import mx.sb.administracion.ms.main.Models.Service.IEmpleadosInfoAdicionalService;
import mx.sb.administracion.ms.main.Models.Service.IEmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadosM {
    @Autowired
    private IEmpleadosService EmpleadosService;
    @Autowired
    private IEmpleadosInfoAdicionalService EmpleadosInfoAdicionalService;

    public List<ReporteEmpleados> reporteEmpleados(){
        try{
            List<ReporteEmpleados> reports = new ArrayList<>() ;
            List<Empleados> emp=EmpleadosService.findAll();
            List<EmpleadosInfoAdicional> empInf=EmpleadosInfoAdicionalService.findAll();
            if(emp.size() > 0 && empInf.size() > 0){
                for(Empleados empResp: emp ){
                    for(EmpleadosInfoAdicional empInfResp: empInf ){
                       if(empResp.getEmpId() !=null && empInfResp.getEmpId() != null){
                           if(empResp.getEmpId().equals(empInfResp.getEmpId())){
                               ReporteEmpleados report=new ReporteEmpleados();
                               report.setEmpId(empResp.getEmpId());
                               report.setNombre(empResp.getNombre());
                               report.setCurp(empInfResp.getEmpCurp());
                               report.setEstatus(empResp.getStatus());
                               if(empResp.getTiendas().size()> 0){
                                   report.setTiendaId(empResp.getTiendas().get(0).getId());
                                   report.setFormato(empResp.getTiendas().get(0).getFormato());
                                   report.setSucursal(empResp.getTiendas().get(0).getSucursal());
                               }
                               report.setArea(empInfResp.getArea());
                               report.setDepartamento(empInfResp.getDepartamento());
                               report.setDocIne(empInfResp.getDocIne());
                               report.setCodigoPostal(empInfResp.getEmpCP());
                               report.setDireccion(empInfResp.getEmpDireccion());
                               report.setColonia(empInfResp.getEmpColonia());
                               report.setCorreo(empInfResp.getEmpCorreo());
                               report.setEstadoMunicipio(empInfResp.getEmpEstadoMunicipio());
                               report.setDocMigratorio(empInfResp.getEmpDocMigratorio());
                               report.setEdad(empInfResp.getEmpEdad());
                               report.setFechaIngreso(empInfResp.getEmpFechaIngreso());
                               report.setFechaNacimiento(empInfResp.getEmpFechaNacimiento());
                               report.setIdJefe(empInfResp.getEmpIdJefe());
                               report.setIne(empInfResp.getEmpIne());
                               report.setLicencia(empInfResp.getDocLicencia());
                               report.setLugarNacimeinto(empInfResp.getEmpLugarNacimiento());
                               report.setNacionalidad(empInfResp.getEmpNacionalidad());
                               report.setNss(empInfResp.getEmpNss());
                               report.setNumeroExterior(empInfResp.getEmpNumeroExterior());
                               report.setNumueroInterior(empInfResp.getEmpNumeroInterior());
                               report.setPais(empInfResp.getEmpPais());
                               report.setRfc(empInfResp.getEmpRFC());
                               report.setSexo(empInfResp.getEmpSexo());
                               report.setTelefonoCel(empInfResp.getEmpTelCel());
                               report.setTelefonoFijo(empInfResp.getEmpTelFijo());
                               report.setEmpresa(empInfResp.getEmpresa());
                               report.setEsquema(empInfResp.getEsquema());
                               report.setNumNom(empInfResp.getNumNom());
                               report.setPlacaAsignada(empInfResp.getPlacaAsiganda());
                               report.setPuesto(empInfResp.getPuesto());
                               report.setPuesto(empInfResp.getPuesto());
                               reports.add(report);

                           }
                       }



                    }
                }


            }

            return reports;
        }catch(DataAccessException e) {
            System.out.println("mensaje"+ "Error al generar el reporte");
            System.out.println("error"+e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return null;
        }


    }

}
