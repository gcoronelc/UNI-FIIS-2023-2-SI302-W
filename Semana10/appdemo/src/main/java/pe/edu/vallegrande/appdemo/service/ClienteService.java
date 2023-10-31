package pe.edu.vallegrande.appdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.edu.vallegrande.appdemo.model.ClienteModel;

@Service
public class ClienteService {
	
	private static List<ClienteModel> listado;
	private static int contId;
	
	static {
		// Crea la lista
		listado = new ArrayList<>();
		listado.add(new ClienteModel(1,"Gustavo Coronel","55431234871","gustavo@gmail.com"));
		listado.add(new ClienteModel(2,"Valery Chumpitaz","54124389547","valery@gmail.com"));
		listado.add(new ClienteModel(3,"Gabriel Gutierrez","65631248965","gabriel@gmail.com"));
		listado.add(new ClienteModel(4,"Jose Cama","63259848147","jose@gmail.com"));
		listado.add(new ClienteModel(5,"Evelyn Palomino","63158975259","evelyn@gmail.com"));
		listado.add(new ClienteModel(6,"Carlos Torres","96254897361","carlos@gmail.com"));
		// Actualiza contador
		contId = listado.size();
	}
	
	public List<ClienteModel> listado(){
		return listado;
	}
	
	public ClienteModel findById(int id){
		// Variables
		ClienteModel bean = null;
		// Proceso
		for (ClienteModel o : listado) {
			if(o.getId() == id) {
				bean = o;
				break;
			}
		}
		// Reporte
		return bean;
	}
	
	public ClienteModel create(ClienteModel model) {
		model.setId(++contId);
		listado.add(model);
		return model;
	}
	
	public ClienteModel update(ClienteModel model) {
		int index = -1;
		for (int i = 0; i < listado.size(); i++) {
			if(listado.get(i).getId() == model.getId()) {
				index = i;
				break;
			}
		}
		if(index!=-1) {
			listado.set(index, model);
		}
		return model;
	}
	
	public ClienteModel updatePartial(ClienteModel model) {
		int index = -1;
		for (int i = 0; i < listado.size(); i++) {
			if(listado.get(i).getId() == model.getId()) {
				index = i;
				break;
			}
		}
		if(index==-1) {
			throw new RuntimeException("No existe el id.");
		}
		ClienteModel rec = listado().get(index);
		if(model.getNombre()!=null && !model.getNombre().isBlank()) {
			rec.setNombre(model.getNombre());
		}
		if(model.getCorreo()!=null && !model.getCorreo().isBlank()) {
			rec.setCorreo(model.getCorreo());
		}
		if(model.getRuc()!=null && !model.getRuc().isBlank()) {
			rec.setCorreo(model.getRuc());
		}
		return rec;
	}
	
	public void delete(int id) {
		for (ClienteModel model : listado) {
			if(model.getId() == id) {
				listado.remove(model);
				break;
			}
		}
	}

}
