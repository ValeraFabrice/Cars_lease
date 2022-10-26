package fabrice.raobera.carslease;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fabrice.raobera.carslease.car.Car;

import fabrice.raobera.carslease.car.CarService;
import fabrice.raobera.carslease.contract.Contract;
import fabrice.raobera.carslease.contract.ContractService;

@SpringBootApplication
public class CarsLeaseApplication implements CommandLineRunner {
	@Autowired
	CarService carService;
	
	@Autowired
	ContractService contractService;
	
	public static void main(String[] args) {
		SpringApplication.run(CarsLeaseApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Car car = new Car();
		car.setBrand("Mercedes");
		car.setColor("noir");
		car.setPower(350);
		car.setMaxSpeed(250);
		car.setKm(7500);
		car.setFirstUse(Date.valueOf("2000-02-02"));
		
		carService.save(car);
		
		car = new Car();
		car.setBrand("Renault");
		car.setColor("blanc");
		car.setPower(200);
		car.setMaxSpeed(220);
		car.setKm(10000);
		car.setFirstUse(Date.valueOf("2020-05-13"));
		
		carService.save(car);
		
		car = new Car();
		car.setBrand("Renault");
		car.setColor("Noir");
		carService.save(car);
		
		
		
		Contract contract = new Contract();
		contract.setDate(Date.valueOf("2022-03-03"));
		contract.setStartLease(Date.valueOf("2022-03-03"));
		contract.setEndLease(Date.valueOf("2022-03-03"));
		contract.setTotalPrice(5000);
		contract.setAdvance(1500);
		contract.setLeftToPay(3500);
		contract.setPlaceOfReturn("Paris");
		
		contractService.save(contract);
		
		contract = new Contract();
		contract.setPlaceOfReturn("Lille");
		
		contractService.save(contract);
		
		
	}

}
