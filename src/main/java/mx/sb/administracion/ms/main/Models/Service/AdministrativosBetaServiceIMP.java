package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.AdministrativosBeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.sb.administracion.ms.main.Models.Dao.IAdministrativosBetaDao;
@Service
public class AdministrativosBetaServiceIMP implements IAdministrativosBetaService{
	@Autowired
	private IAdministrativosBetaDao AdministrativosBetaDao;
	@Override
	public AdministrativosBeta FindEmpLog(String empId, String password) {
		
		return AdministrativosBetaDao.FindEmpLog(empId, password);
	}
	@Override
	public AdministrativosBeta FindEmpAd(String empId) {
		
		return AdministrativosBetaDao.FindEmpAd(empId) ;
	}

}
