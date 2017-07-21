package demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class EjemploRutaCamel extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	//from("timer:hola?period={{timer.period}}")
        from("timer:hola?period=2000")
                .transform(method("ejemploBean", "ejemploMetodo"))
                .to("stream:out");
    }

}
