package runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import metodos.Metodos;
import page.PageFormulario;

public class ExecutaTest {

	PageFormulario page = new PageFormulario();
	Metodos metodo = new Metodos();

	@Before
	public void iniciarTeste() {
		metodo.abrirNavegador();
		
	}

	@After
	public void encerrarTest() {
		metodo.fecharNavegador();
	}

	@Test
	public void primeiroFormulario() {
		page.escolherCategoria("entervehicledata");
		page.make("Audi");
		page.model("Scooter");
		page.cylinderCapacity("1234");
		page.enginePerformance("123");
		page.dateOfManufacture("09/07/1995");
		page.numberOfSeats(2);
		page.rightHandDrive("Yes");
		page.numberOfSeats2(3);
		page.fueltype("Petrol");
		page.payload("123");
		page.totalweight("123");
		page.listprice("12300");
		page.licenseplatenumber("123");
		page.annualmileage("123");
		page.avancar("Enter Insurant Data");
		
	}

	@Test
	public void segundoFormulario() {
		page.escolherCategoria("enterinsurantdata");
		page.preencherFormulario("Joao", "Roberto", "09/07/1995", "Male", "santos", "Angola", "1234", "Luanda",
				"Employee", " Cliff Diving", "www.e2etreinamentos.com.br",
				"C:\\Users\\jsbsa\\Captura de tela 2023-04-11 155241.png" , "Enter Product Data");

	}
}
