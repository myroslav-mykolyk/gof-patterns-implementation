package com.mykolyk.gofpatternsimplementation.factorymethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory javaDeveloperFactory = createDeveloperBySpecialty("Java");
        Developer javaDeveloper = javaDeveloperFactory.createDeveloper();
        javaDeveloper.writeCode();

        DeveloperFactory cppDeveloperFactory = createDeveloperBySpecialty("C++");
        Developer cppDeveloper = cppDeveloperFactory.createDeveloper();
        cppDeveloper.writeCode();

        DeveloperFactory phpDeveloperFactory = createDeveloperBySpecialty("PHP");
        Developer phpDeveloper = phpDeveloperFactory.createDeveloper();
        phpDeveloper.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if(specialty.equalsIgnoreCase("Java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("C++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException("Unknown specialty: " + specialty);
        }
    }
}
