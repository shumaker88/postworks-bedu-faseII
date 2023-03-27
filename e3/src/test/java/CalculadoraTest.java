import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;


class CalculadoraTest {

  @TestFactory
  Stream<DynamicTest> dynamicTestsFromStreamInJava8() {

      Calculadora calculadora = new Calculadora();
      List<Integer> entradas = IntStream.range(0, 1000).boxed().collect(Collectors.toList());
      List<Integer> resultados = IntStream.range(0, 1000).map(n -> n * 2).boxed().collect(Collectors.toList());
      
      return entradas.stream()
              .map(numero -> DynamicTest.dynamicTest("multiplicando: " + numero,
                      () -> {
                          assertEquals(calculadora.multiplica(numero, 2), resultados.get(numero));
                      }));
  }
}