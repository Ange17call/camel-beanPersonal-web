package demo;

import org.springframework.stereotype.Component;


@Component("ejemploBean")
public class EjemploBean {

    //@Value("${variable}")
    //private String dice;

    public String ejemploMetodo() {
        return "hola mundo cruel";
    }

}
