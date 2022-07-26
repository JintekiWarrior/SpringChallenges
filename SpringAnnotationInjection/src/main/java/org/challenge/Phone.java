package org.challenge;

import org.springframework.stereotype.Component;

@Component
public class Phone
{
//    @Autowired
    private String mob;

    public Phone(String mob) {
        this.mob = mob;
    }

}
