package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI consumo = new ConsumoAPI();
		var Json = consumo.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(Json);
//		Json = consumo.obterDados("https://coffee.alexflipnote.dev/random.json");
//		System.out.println(Json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(Json, DadosSerie.class);
		System.out.println(dados);


	}
}
