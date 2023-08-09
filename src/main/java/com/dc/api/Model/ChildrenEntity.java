package com.dc.api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChildrenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer childId;

    private  String childName;

    private LocalDate childDOB;

    private String childSSN;

    private Integer caseNo;
}
