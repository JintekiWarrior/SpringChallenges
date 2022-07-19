package org.challenge;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address
{
    @Value("Detroit")
    private String city;
    @Value("Mi")
    private String state;
    @Value("United States")
    private String country;
    @Value("48282")
    private String zipcode;
}
