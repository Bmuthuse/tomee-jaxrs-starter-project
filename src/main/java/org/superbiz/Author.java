package org.superbiz;

//import javax.xml.bind.annotation.XmlRootElement;


import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Author {

    private String name;

    private int age;

    /**
     * Default constructor required for JAXB objects
     */
    public Author() {
    }

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
