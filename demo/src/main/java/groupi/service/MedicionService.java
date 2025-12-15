package GroupI.service;


import GroupI.model.Medicion;
import GroupI.repository.MedicionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicionService {

private final MedicionRepository repository;


public MedicionService(MedicionRepository repository) {
this.repository = repository;
}


public List<Medicion> findAll() {
return repository.findAll();
}


public Medicion findById(Long id) {
return repository.findById(id).orElse(null);
}


public Medicion save(Medicion medicion) {
return repository.save(medicion);
}


public Medicion update(Long id, Medicion nueva) {
return repository.findById(id).map(m -> {
m.setNivelAlcohol(nueva.getNivelAlcohol());
m.setPeso(nueva.getPeso());
m.setSexo(nueva.getSexo());
return repository.save(m);
}).orElse(null);
}


public void delete(Long id) {
repository.deleteById(id);
}
}