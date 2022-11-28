package io.zipcoder.polymorphism;

public class Pet {
    private String _name;

    public Pet(String name) {
        this._name=name;
    }


    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }
    public String speak(){
        return "";
    }
}
