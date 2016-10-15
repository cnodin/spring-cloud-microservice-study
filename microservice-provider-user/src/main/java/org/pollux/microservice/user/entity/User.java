package org.pollux.microservice.user.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by spockwwang on 2016/10/12.
 */
@Entity
@Data
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String username;

  @Column
  private Integer age;

}
