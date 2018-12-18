package pe.com.joedayz.demohellworld.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/marco")
    public String hi() throws UnknownHostException {
       return "Polo!! |  Puedes encontrarme en " + InetAddress.getLocalHost().getHostAddress();
    }
	
}
