package com.theironyard.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by cameronoakley on 11/17/15.
 */
@Entity
@Table(name="photos")
public class Photo {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    public int id;

    @ManyToOne
    public User sender;

    @ManyToOne
    public User receiver;

    @Column(nullable = false)
    public String filename;

    public LocalDateTime accesstime;

    @Column(nullable = false)
    public int deleteSeconds;

    @Column(nullable = false)
    public boolean isPublic;
}
