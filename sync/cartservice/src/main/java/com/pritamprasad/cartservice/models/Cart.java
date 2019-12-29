package com.pritamprasad.cartservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "carts")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties
public class Cart implements Serializable {
    @Id
    private UUID userId;

    private ArrayList<UUID> productsInCart;

    private Double cartTotal = 0.0;

    private Long lastUpdated;
}
