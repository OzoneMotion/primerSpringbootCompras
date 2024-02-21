package com.alobomnito.compras.repository;

import com.alobomnito.compras.entity.Compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasRepository extends JpaRepository <Compras, Integer>{
}
