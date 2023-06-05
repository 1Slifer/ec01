package com.idat.dsw1L11;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country lunes = new Country();
		lunes.setName("Lunes");
		lunes.setIngles("Monday");
		

		countries.put(lunes.getName(), lunes);

		Country martes = new Country();
		martes.setName("Martes");
		martes.setIngles("Tuesday");

		countries.put(martes.getName(), martes);

		Country miercoles = new Country();
		miercoles.setName("Miercoles");
		miercoles.setIngles("Wednesday");

		countries.put(miercoles.getName(), miercoles);

		Country jueves = new Country();
		jueves.setName("Jueves");
		jueves.setIngles("Thursday");

		countries.put(jueves.getName(), jueves);

		Country viernes = new Country();
		viernes.setName("Viernes");
		viernes.setIngles("Friday");

		countries.put(viernes.getName(), viernes);

		Country sabado = new Country();
		sabado.setName("Sabado");
		sabado.setIngles("Saturday");

		countries.put(sabado.getName(), sabado);

		Country domingo = new Country();
		domingo.setName("Domingo");
		domingo.setIngles("Sunday");

		countries.put(domingo.getName(), domingo);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}
