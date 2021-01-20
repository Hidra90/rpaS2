package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;

public class DogService {

    Dog dog;

    public DogService(Dog dog) {
        this.dog = dog;
    }

    public String bark () {
        return dog.getName() + " BARK!";
    }
}
