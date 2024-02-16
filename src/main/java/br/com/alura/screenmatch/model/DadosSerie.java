package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias({"Title", "Titulo"}) String Titulo, @JsonAlias("totalSeasons") Integer totalTemporadas, @JsonAlias("imdRating") String avaliacao,
                         @JsonAlias("imdVotes") String votos) {

}
