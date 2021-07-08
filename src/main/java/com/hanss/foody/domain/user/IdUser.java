package com.hanss.foody.domain.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(
        name = "idUser",
        types = { User.class })
public interface IdUser {
    @Value("#{target.id}")
    long getId();

    String getName();
}