package com.example.covid19tracking;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Patient {
    @Id @GeneratedValue
    Long id;
    String name, phone, address;
    Timestamp lastUpdateTime;
    Status status;
    enum Status {
        SUSPECT, CONFIRMED, CURED
    }


}
