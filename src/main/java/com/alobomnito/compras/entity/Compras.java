package com.alobomnito.compras.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "comprar")
public class Compras {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	private Integer idProducto;
	
	private Integer cantidadProducto;

}
