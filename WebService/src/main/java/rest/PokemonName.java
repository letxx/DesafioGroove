package rest;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import org.junit.Test;

public class PokemonName {

	@Test
	public void verificarNome() {
		ArrayList<String> nomes = given().when().get("https://pokeapi.co/api/v2/pokemon/").then().statusCode(200)
				.extract().path("results.name.findAll{it.startsWith('char')}");

		System.out.println(nomes);

	}

}
