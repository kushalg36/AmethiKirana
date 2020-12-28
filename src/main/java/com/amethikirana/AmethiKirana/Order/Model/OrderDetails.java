package com.amethikirana.AmethiKirana.Order.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class OrderDetails {
    @OneToOne
    private Integer userId;
    @OneToOne
    private Integer productId;
    @CreationTimestamp
    private Date transactionDate;
    private BigDecimal amount;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private String status;
}
