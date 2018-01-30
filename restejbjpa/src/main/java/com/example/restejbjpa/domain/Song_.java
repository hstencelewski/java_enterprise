package com.example.restejbjpa.domain;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Song.class)
public class Song_ {
    public static volatile SingularAttribute<Song, String> songname;
    public static volatile SingularAttribute<Song, String> bandname;
    public static volatile SingularAttribute<Song, Integer> yor;
    public static volatile SingularAttribute<Song, Serial> serial;
    public static volatile SingularAttribute<Song, Factory> factory;
    public static volatile SingularAttribute<Song, Genre> genre;
    public static volatile SingularAttribute<Song, Integer> price;
} 