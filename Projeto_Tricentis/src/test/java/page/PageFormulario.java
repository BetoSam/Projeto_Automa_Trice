package page;

import org.openqa.selenium.By;

import metodos.Metodos;

public class PageFormulario {
	Metodos metodo = new Metodos();

	public void escolherCategoria(String categoria) {
		By menuPrinc = By.xpath("//a[@id='" + categoria + "']");
		metodo.clicar(menuPrinc);

	}

	public void formularioEnterInsurantData(String nome, String sobrenome, String dataNascimento, String genero,
			String end, String condado, String postalCode, String cidade, String ocupacao, String passatempo,
			String wSite, String caminhoFoto)

	{

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

	public void listprice(String preco) {
		By listP = By.id("listprice");
		metodo.escrever(listP, preco);
	}

	public void licenseplatenumber(String placa) {
		By licenseP = By.id("licenseplatenumber");
		metodo.escrever(licenseP, placa);
	}

	public void annualmileage(String km) {
		By annuMila = By.id("annualmileage");
		metodo.escrever(annuMila, km);
	}

	public void formularioProduct(String data, String valorInsurance, String meritRati, String damage,
			String OptionProduct, String courtseyOpc) {

		By courtsyCarOpcao = By.xpath("//*[text()='" + courtseyOpc + "']");
		By courtesyCarOpenMunu = By.id("courtesycar");
		By optionalProducts = By.xpath("//*[text()='" + OptionProduct + "']");
		By opcaoDmage = By.xpath("//*[text()='" + damage + "']");
		By damageinsurance = By.id("damageinsurance");
		By startDate = By.id("startdate");
		By insurancesumOpenMenu = By.id("insurancesum");
		By valorInsu = By.xpath("//*[text()='" + valorInsurance + "']");
		By MeritR = By.xpath("//*[text()='" + meritRati + "']");
		By meritRatingMenu = By.id("meritrating");
		metodo.clicar(meritRatingMenu);
		metodo.clicar(MeritR);
		metodo.clicar(insurancesumOpenMenu);
		metodo.clicar(valorInsu);
		metodo.escrever(startDate, data);
		metodo.clicar(damageinsurance);
		metodo.clicar(opcaoDmage);
		metodo.clicar(optionalProducts);
		metodo.clicar(courtesyCarOpenMunu);
		metodo.clicar(courtsyCarOpcao);

	}

	public void next(String id, String titulo) {
		By next = By.id(id);
		metodo.aguardarElemento(next);
		metodo.validarTitle(titulo);
	}

	public void selectPriceOption(int posicao) {
		By selectPrice = By.xpath("//label[@class='choosePrice ideal-radiocheck-label'][" + posicao + "]");
		metodo.clicar(selectPrice);

	}

	public void formularioSendQuot(String email, String telefone, String usuario, String senha, String confimarSenha,
			String comentario) {
		By comments = By.id("Comments");
		By usurName = By.id("username");
		By confirmpassword = By.id("confirmpassword");
		By eaM = By.id("email");
		By phone = By.id("phone");
		By password = By.id("password");
		metodo.escrever(eaM, email);
		metodo.escrever(phone, telefone);
		metodo.escrever(usurName, usuario);
		metodo.escrever(password, senha);
		metodo.escrever(confirmpassword, confimarSenha);
		metodo.escrever(comments, comentario);
	}

	public void formularioEnterVehicleData(String veiculo, String modelo, String cylinder, String engene, String data,
			int posiNumber, String destro, int posicao, String fuel, String carga, String pesoTotal, String preco,
			String placa, String km) {
		By marcas = By.xpath("//*[text()='" + veiculo + "']");
		By Menumake = By.id("make");
		By modelos = By.xpath("//*[text()='" + modelo + "']");
		By menuModel = By.id("model");
		By cylindradas = By.id("cylindercapacity");

		By engenhariaP = By.id("engineperformance");

		By date = By.id("dateofmanufacture");
		By rightHanD = By.xpath("//*[text()='" + destro + "']");
		By numberMenu2 = By.id("numberofseatsmotorcycle");
		By numerOfS2 = By.xpath("(//option[@value='" + posicao + "'])[2]");
		By fuelTypeMenu = By.id("fuel");
		By tipoFuel = By.xpath("//*[text()='" + fuel + "']");
		By licenseP = By.id("licenseplatenumber");
		By pay = By.id("payload");
		By TotalW = By.id("totalweight");
		By listP = By.id("listprice");
		By annuMila = By.id("annualmileage");
		By numberMenu = By.id("numberofseats");
		By numerOfS = By.xpath("(//option[@value='" + posiNumber + "'])[1]");
		metodo.clicar(numberMenu);
		metodo.clicar(numerOfS);
		metodo.escrever(annuMila, km);
		metodo.escrever(licenseP, placa);
		metodo.escrever(listP, preco);
		metodo.escrever(TotalW, pesoTotal);
		metodo.escrever(pay, carga);
		metodo.clicar(rightHanD);
		metodo.escrever(cylindradas, cylinder);
		metodo.clicar(menuModel);
		metodo.clicar(modelos);
		metodo.escrever(date, data);
		metodo.escrever(engenhariaP, engene);

		metodo.clicar(numberMenu2);
		metodo.clicar(numerOfS2);

		metodo.clicar(fuelTypeMenu);
		metodo.clicar(tipoFuel);

		metodo.clicar(Menumake);
		metodo.clicar(marcas);

	}
	public void finalizarCadastro () {
		By finalizar = By.id("sendemail");
		metodo.clicar(finalizar);
		metodo.pausa(11000);
	}
	public void validarMsgCadastro(String msgAlert) {
		By msgCadastro = By.xpath("//div[@class='sweet-alert showSweetAlert visible']//h2[text()='Sending e-mail success!']");
		metodo.validarMensagem(msgCadastro, msgAlert);
	}
}