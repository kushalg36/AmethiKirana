package com.amethikirana.AmethiKirana.Product.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ProductModel")
@SecondaryTable(name="productCategory", pkJoinColumns = @PrimaryKeyJoinColumn(name = "productId"))
@SecondaryTable(name="tagCategory", pkJoinColumns = @PrimaryKeyJoinColumn(name = "productId"))
@Getter
@Setter
@NoArgsConstructor
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private String productSellerId;
    private String productCostPrice;
    private String productSellPrice;
    private Integer productCount;
    @JsonFormat(pattern="MM/dd/yyyy")
    private Date productExpDate;
    private String productColor;
    private String productWeight;
    @CreationTimestamp
    private Date sysCreationDate;
    @UpdateTimestamp
    private Date sysUpdateDate;
    @Column(table = "tagCategory")
    private String tagName;
    @Column(table = "productCategory")
    private String categoryName;

}
