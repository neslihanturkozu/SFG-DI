package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService{

    public static final String HELLO_GURUS = "Hello Gurus!!!! - Original";
    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }

}
