package com.mykolyk.gofpatternsimplementation.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {
            switch (specialty) {
                case "Java":
                    System.out.println("Hiring Java Developer!");
                    developer = new JavaDeveloper();
                    developers.put(specialty, developer);
                    break;
                case "C++":
                    System.out.println("Hiring C++ Developer");
                    developer = new CppDeveloper();
                    developers.put(specialty, developer);
                    break;
                default:
                    System.out.println("We could not hire that developer!");
                    break;
            }
        }
        return developer;
    }
}
