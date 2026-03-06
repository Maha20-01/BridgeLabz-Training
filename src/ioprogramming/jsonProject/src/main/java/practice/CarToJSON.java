package practice;

import model.Car;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJSON {

    public static void main(String[] args) throws Exception {

        Car car = new Car();

        car.brand = "Toyota";
        car.model = "Fortuner";
        car.year = 2022;

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(car);

        System.out.println(json);
    }
}