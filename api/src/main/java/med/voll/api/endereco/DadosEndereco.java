package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(

		@NotBlank String logradouro,

		@NotBlank String bairro,

		@NotBlank @Pattern(regexp = "\\d{8}") String cep,

		String numero,

		String complemento,

		@NotBlank String cidade,

		@NotBlank String uf) {
	

    public static DadosEndereco criarEndereco(String logradouro, String bairro, String cep, String numero, String complemento, String cidade, String uf) {
        return new DadosEndereco(logradouro, bairro, cep, numero, complemento, cidade, uf);
    }	
}
