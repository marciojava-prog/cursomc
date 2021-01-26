package br.dev.marciooliveira.cursomc.resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ToString
@Data
@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {


   @RequestMapping(method = RequestMethod.GET)
   public String listar(){
       return "REST Funcionando";
   }
}
