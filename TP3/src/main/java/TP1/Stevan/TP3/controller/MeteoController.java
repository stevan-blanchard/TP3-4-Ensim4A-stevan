package TP1.Stevan.TP3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import TP1.Stevan.TP3.model.Codetemps;
import TP1.Stevan.TP3.model.EtalabAPIAddress;
import TP1.Stevan.TP3.model.Forecast;
import TP1.Stevan.TP3.model.MeteoConceptReponse;



@Controller
public class MeteoController {
	@Autowired
	private RestTemplate rt;
	HttpEntity<MeteoConceptReponse> he;
	
	
	@PostMapping("/meteo") // étape 13 1) partie du code qui apelle /greeting
	public String meteo(@RequestBody String address, Model model) {
		System.out.println(address);
		String url = "https://api-adresse.data.gouv.fr/search/?q="+address.replace(" ", "+")+"&limit=1";
		EtalabAPIAddress addrinfo =rt.getForObject(url, EtalabAPIAddress.class);
		System.out.println(url);
		float lat= addrinfo.getFeatures().getGeometry().getlatitude();
		float lon= addrinfo.getFeatures().getGeometry().getlongitude();
		String token = "fbe76940e32b4d8600cb7bfc3b9c06be1ad9ceea4abd31cd22599190b9be15e6";
		
		
		
		String querry = "https://api.meteo-concept.com/api/forecast/daily?token="+ token + "&latlng="+lat + ","+ lon +"&start=0&end=0"; 
		System.out.println(querry);
		ResponseEntity<MeteoConceptReponse> mcr = rt.exchange(querry,HttpMethod.GET,he, MeteoConceptReponse.class);
		//MeteoConceptReponse mcr =rt.getForObject(querry, MeteoConceptReponse.class);
		System.out.println(mcr.getBody().getForecast().getCp());
		Forecast f = mcr.getBody().getForecast();
		
		model.addAttribute("tempmin", f.getTmin());
		model.addAttribute("tempmax", f.getTmax());
		model.addAttribute("probgel", f.getProbafrost());
		model.addAttribute("probpluie", f.getProbarain());
		model.addAttribute("ville", mcr.getBody().getCity().getName());
		model.addAttribute("temps", Codetemps.getDescriptionByCode(f.getWeather()));//on fait appel a un enum afin de récupérer le temps quil fait ou va faire
		
		return "meteo";
	}
}