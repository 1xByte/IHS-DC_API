package com.dc.api.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
public class ChildrenDTO {

    private  String childName;

    private LocalDate childDOB;

    private String childSSN;

}
