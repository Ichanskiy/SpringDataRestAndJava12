package com.ichanskiy.luxoft.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import static javax.persistence.GenerationType.AUTO;

@MappedSuperclass
@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class BaseObject {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
}
