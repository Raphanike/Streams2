import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.Collectors;

class StreamsTest {

    @Test
    void testFiltrarHomens() {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Carlos", 28, "Brasileiro", "Masculino"),
                new Pessoa("Ana", 24, "Brasileira", "Feminino"),
                new Pessoa("João", 30, "Brasileiro", "Masculino"),
                new Pessoa("Maria", 27, "Brasileira", "Feminino"),
                new Pessoa("Lucas", 25, "Brasileiro", "Masculino"),
                new Pessoa("Fernanda", 22, "Brasileira", "Feminino"),
                new Pessoa("Pedro", 29, "Brasileiro", "Masculino"),
                new Pessoa("Juliana", 31, "Brasileira", "Feminino")
        );


        List<Pessoa> homens = pessoas.stream()
                .filter(p -> p.sexo.equals("Masculino"))
                .collect(Collectors.toList());


        assertEquals(4, homens.size());


        for (Pessoa pessoa : homens) {
            assertEquals("Masculino", pessoa.sexo);
        }
    }

    @Test
    void testFiltrarMulheres() {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Carlos", 28, "Brasileiro", "Masculino"),
                new Pessoa("Ana", 24, "Brasileira", "Feminino"),
                new Pessoa("João", 30, "Brasileiro", "Masculino"),
                new Pessoa("Maria", 27, "Brasileira", "Feminino"),
                new Pessoa("Lucas", 25, "Brasileiro", "Masculino"),
                new Pessoa("Fernanda", 22, "Brasileira", "Feminino"),
                new Pessoa("Pedro", 29, "Brasileiro", "Masculino"),
                new Pessoa("Juliana", 31, "Brasileira", "Feminino")
        );


        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.sexo.equals("Feminino"))
                .collect(Collectors.toList());


        assertEquals(4, mulheres.size());


        for (Pessoa pessoa : mulheres) {
            assertEquals("Feminino", pessoa.sexo);
        }
    }
}
