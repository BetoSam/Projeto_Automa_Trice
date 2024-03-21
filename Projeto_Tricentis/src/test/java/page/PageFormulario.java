package page;

import org.openqa.selenium.By;

import metodos.Metodos;

public class PageFormulario {
	Metodos metodo = new Metodos();

	public void escolherCategoria(String categoria) {
		By menuPrinc = By.xpath("//a[@id='" + categoria + "']");
		metodo.clicar(menuPrinc);

	}

	public void preencherFormulario(String nome, String sobrenome, String dataNascimento, String genero, String end,
			String condado, String postalCode, String cidade, String ocupacao, String passatempo, String wSite,
			String caminhoFoto,String url)

	{
		By next = By.id("nextenterproductdata");
		By picture = By.id("open");
		By website = By.id("website");
		By hobbies = By.xpath("//*[text()='" + passatempo + "']");
		By occupation = By.xpath("//option[@value='" + ocupacao + "']");
		By menuOccupation = By.id("occupation");
		By city = By.id("city");
		By zipCode = By.id("zipcode");
		By country = By.xpath("//*[text()='" + condado + "']");
		By menuCountry = By.id("country");
		By streetAddress = By.id("streetaddress");
		By Gender = By.xpath("//*[text()='" + genero + "']");
		By firstName = By.id("firstname");
		By lastName = By.id("lastname");
		By dateOfBirth = By.id("birthdate");
		metodo.escrever(firstName, nome);
		metodo.escrever(lastName, sobrenome);
		metodo.escrever(dateOfBirth, dataNascimento);
		metodo.clicar(Gender);
		metodo.escrever(streetAddress, end);
		metodo.clicar(menuCountry);
		metodo.clicar(country);
		metodo.escrever(zipCode, postalCode);
		metodo.escrever(city, cidade);
		metodo.clicar(menuOccupation);
		metodo.clicar(occupation);
		metodo.clicar(hobbies);
		metodo.escrever(website, wSite);
		metodo.clicar(picture);
		metodo.uploadArquivo(caminhoFoto);
		metodo.clicar(next);
		metodo.validarTitle(url);

	}

	public void make(String veiculo) {
		By marcas = By.xpath("//*[text()='" + veiculo + "']");
		By Menumake = By.id("make");
		metodo.clicar(Menumake);
		metodo.clicar(marcas);

	}

	public void model(String modelo) {
		By modelos = By.xpath("//*[text()='" + modelo + "']");
		By menuModel = By.id("model");
		metodo.clicar(menuModel);
		metodo.clicar(modelos);
	}

	public void cylinderCapacity(String cylinder) {
		By cylindradas = By.id("cylindercapacity");
		metodo.escrever(cylindradas, cylinder);
	}

	public void enginePerformance(String engene) {
		By engenhariaP = By.id("engineperformance");
		metodo.escrever(engenhariaP, engene);
	}

	public void dateOfManufacture(String data) {
		By date = By.id("dateofmanufacture");
		metodo.escrever(date, data);

	}

	public void numberOfSeats(int posicao) {
		By numberMenu = By.id("numberofseats");
		By numerOfS = By.xpath("(//option[@value='" + posicao + "'])[1]");
		metodo.clicar(numberMenu);
		metodo.clicar(numerOfS);

	}

	public void rightHandDrive(String destro) {
		By rightHanD = By.xpath("//*[text()='" + destro + "']");
		metodo.clicar(rightHanD);

	}

	public void numberOfSeats2(int posicao) {
		By numberMenu2 = By.id("numberofseatsmotorcycle");
		By numerOfS2 = By.xpath("(//option[@value='" + posicao + "'])[2]");
		metodo.clicar(numberMenu2);
		metodo.clicar(numerOfS2);
	}

	public void fueltype(String fuel) {
		By fuelTypeMenu = By.id("fuel");
		By tipoFuel = By.xpath("//*[text()='" + fuel + "']");
		metodo.clicar(fuelTypeMenu);
		metodo.clicar(tipoFuel);

	}

	public void payload(String carga) {
		By pay = By.id("payload");
		metodo.escrever(pay, carga);
	}

	public void totalweight(String pesoTotal) {
		By TotalW = By.id("totalweight");
		metodo.escrever(TotalW, pesoTotal);

	}

	public void listprice(String preço) {
		By listP = By.id("listprice");
		metodo.escrever(listP, preço);
	}

	public void licenseplatenumber(String placa) {
		By licenseP = By.id("licenseplatenumber");
		metodo.escrever(licenseP, placa);
	}

	public void annualmileage(String km) {
		By annuMila = By.id("annualmileage");
		metodo.escrever(annuMila, km);
	}

	public void avancar(String url) {
		By next = By.id("nextenterinsurantdata");
		metodo.clicar(next);
		metodo.validarTitle(url);
	}
}
