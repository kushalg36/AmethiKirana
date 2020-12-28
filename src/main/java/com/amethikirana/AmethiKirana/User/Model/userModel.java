package com.amethikirana.AmethiKirana.User.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SecondaryTable(name="userAuthorities", pkJoinColumns = @PrimaryKeyJoinColumn(name = "userId"))
public class userModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String userEmail;
    private String Password;
    private String userContact;
    private String userAddress;
    @CreationTimestamp
    private Date sysCreationDate;
    @UpdateTimestamp
    private Date sysUpdationDate;
    private String aadharCard;
    @Column(table = "userAuthorities")
    private String userAuthority;
}
