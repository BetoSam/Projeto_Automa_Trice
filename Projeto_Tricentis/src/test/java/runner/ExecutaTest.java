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

	// @After
	public void encerrarTest() {
		metodo.fecharNavegador();
	}

	// @Test
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
		page.next("nextenterinsurantdata", "Enter Insurant Data");

	}

	// @Test
	public void formularioEnterInsurantData() {
		page.escolherCategoria("enterinsurantdata");
		page.formularioEnterInsurantData("Joao", "Roberto", "09/07/1995", "Male", "santos", "Angola", "1234", "Luanda",
				"Employee", " Cliff Diving", "www.e2etreinamentos.com.br",
				"C:\\Users\\jsbsa\\Captura de tela 2023-04-11 155241.png");
		page.next("nextenterinsurantdata", "Enter Insurant Data");
	}

	// @Test
	public void ProductFormulario() {
		page.escolherCategoria("enterproductdata");
		page.formularioProduct("09/07/2025", " 7.000.000,00", "Bonus 5", "No Coverage", "Euro Protection", " Yes");
		page.next("nextselectpriceoptionS", "Select Price Option");

	}

	@Test
	public void tdFormularios() {
		page.escolherCategoria("entervehicledata");
		page.formularioEnterVehicleData("Audi","Scooter","123", "123", "09/07/1995", 1, "Yes", 1, "Petrol", "123",
				"123", "12300", "123", "123");
		page.next("nextenterinsurantdata", "Enter Insurant Data");
		page.escolherCategoria("enterinsurantdata");
		page.formularioEnterInsurantData("Joao", "Roberto", "09/07/1995", "Male", "santos", "Angola", "1234", "Luanda",
				"Employee", " Cliff Diving", "www.e2etreinamentos.com.br",
				"C:\\Users\\jsbsa\\Captura de tela 2023-04-11 155241.png");
		page.next("nextenterproductdata", "Enter Product Data");
		page.escolherCategoria("enterproductdata");
		page.formularioProduct("09/07/2025", " 7.000.000,00", "Bonus 5", "No Coverage", "Euro Protection", " Yes");
		page.next("nextselectpriceoption", "Select Price Option");
		page.selectPriceOption(3);
		page.next("nextsendquote", "Send Quote");
		page.formularioSendQuot("jsbsam_lb@hotmail.com", "123454666", "Beto", "Beto123", "Beto123",
				"*******************E2E***********");
		metodo.evidencias("cadastro Finalizado");

	}
}
