package com.api.glendatasubmission.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "event")
@ToString
@EqualsAndHashCode
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "website_name")
    private String websiteName;

    @Column(name = "title")
    private String title;

    @Column(name = "event_date")
    private String eventDate;


    @Column(name = "location")
    private String location;




}
