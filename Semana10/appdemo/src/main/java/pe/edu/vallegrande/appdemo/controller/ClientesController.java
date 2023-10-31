package pe.edu.vallegrande.appdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.vallegrande.appdemo.model.ClienteModel;
import pe.edu.vallegrande.appdemo.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:5050")
public class ClientesController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping()
	@ResponseStatus(HttpStatus.OK)
	public List<ClienteModel> listado1() {
		return clienteService.listado();
	}

	@GetMapping("/")
	public ResponseEntity<List<ClienteModel>> listado2() {
		return new ResponseEntity<>(clienteService.listado(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ClienteModel> listadoById(@PathVariable(name = "id") int codigo) {
		System.out.println("id = " + codigo);
		ClienteModel bean = clienteService.findById(codigo);
		if (bean == null) {
			return ResponseEntity.notFound().build();
		}
		return new ResponseEntity<ClienteModel>(bean, HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<ClienteModel> crear(@RequestBody ClienteModel model) {
		model = clienteService.create(model);
		return new ResponseEntity<ClienteModel>(model, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ClienteModel> actualizar(@PathVariable int id, @RequestBody ClienteModel model) {
		// Verificacion de id
		ClienteModel bean = clienteService.findById(id);
		if (bean == null) {
			return ResponseEntity.notFound().build();
		}
		// Proceso
		model.setId(id);
		model = clienteService.update(model);
		return new ResponseEntity<ClienteModel>(model, HttpStatus.OK);
	}

	@PatchMapping("/{id}")
	public ResponseEntity<ClienteModel> actualizarCampos(@PathVariable int id, @RequestBody ClienteModel model) {
		// Verificacion de id
		ClienteModel bean = clienteService.findById(id);
		if (bean == null) {
			return ResponseEntity.notFound().build();
		}
		// Proceso
		model.setId(id);
		model = clienteService.updatePartial(model);
		return new ResponseEntity<ClienteModel>(model, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar(@PathVariable int id) {
		// Verificacion de id
		ClienteModel bean = clienteService.findById(id);
		if (bean == null) {
			return ResponseEntity.notFound().build();
		}
		// Proceso
		clienteService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
