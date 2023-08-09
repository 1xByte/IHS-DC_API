package com.dc.api.Repo;

import com.dc.api.Model.IncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepo extends JpaRepository<IncomeEntity,Integer> {
}
