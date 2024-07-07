package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.AdministrativosBeta;

public interface IAdministrativosBetaService {
	public AdministrativosBeta FindEmpLog(String empId, String password);
	public AdministrativosBeta FindEmpAd(String empId);
}
