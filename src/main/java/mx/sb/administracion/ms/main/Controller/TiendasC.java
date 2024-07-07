package mx.sb.administracion.ms.main.Controller;


import mx.sb.administracion.ms.main.Entity.Tiendas;
import mx.sb.administracion.ms.main.Models.Service.ITiendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/beta/administracion/tiendas")
public class TiendasC {
    @Autowired
    private ITiendasService TiendasService;

    @PostMapping(value="/save")
    public ResponseEntity<?> save(@RequestBody Tiendas tienda){
        Map<String,Object> response =new HashMap<>();
        try {
        Tiendas obj=TiendasService.save(tienda);
        return new ResponseEntity<Tiendas>(obj, HttpStatus.OK);
        }catch(DataAccessException e) {
            response.put("mensaje", "Error al intentar dar el Alta la tienda");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    }


}