package com.tn.isamm.linkedin.entity;
// Generated Oct 21, 2018 10:21:03 AM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.*;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;


/**
 * OffreEmploi generated by hbm2java
 */
@Entity
@Table(name="offre_emploi"
    ,catalog="linkedin2"
)
public class OffreEmploi  implements java.io.Serializable {

     private Integer id;
     private Utilisateur utilisateur;
     private String nomOffre;
     private String descOffre;
     private String place;
     private String price;
     private Date date;
     private String hashtag1;
     private String hashtag2;
     private String hashtag3;

    private Set<OffreUtilisateur> offreUtilisateurs = new HashSet<OffreUtilisateur>(0);

    public OffreEmploi() {
    }


    public OffreEmploi(Utilisateur utilisateur, String nomOffre, String descOffre, String hashtag1, String hashtag2, String hashtag3,String place , String price ,Date date) {
        this.utilisateur = utilisateur;
        this.nomOffre = nomOffre;
        this.descOffre = descOffre;
        this.hashtag1 = hashtag1;
        this.hashtag2 = hashtag2;
        this.hashtag3 = hashtag3;
        this.place = place;
        this.price = price;
        this.date = date;
    }
    public OffreEmploi(Utilisateur utilisateur, String nomOffre, String descOffre, Set<OffreUtilisateur> offreUtilisateurs, String hashtag1, String hashtag2, String hashtag3
    ,String place , String price ,Date date) {
       this.utilisateur = utilisateur;
       this.nomOffre = nomOffre;
       this.descOffre = descOffre;
        this.place = place;
        this.price = price;
        this.date = date;
       this.offreUtilisateurs = offreUtilisateurs;
        this.hashtag1 = hashtag1;
        this.hashtag2 = hashtag2;
        this.hashtag3 = hashtag3;
    }

     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date", length=19, updatable=false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_recruteur", nullable=false)
    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }


    @Column(name="nom_offre", nullable=false, length=100)
    public String getNomOffre() {
        return this.nomOffre;
    }

    public void setNomOffre(String nomOffre) {
        this.nomOffre = nomOffre;
    }


    @Column(name="desc_offre", nullable=false, length=10000)
    public String getDescOffre() {
        return this.descOffre;
    }

    public void setDescOffre(String descOffre) {
        this.descOffre = descOffre;
    }

    @Column(name="hashtag1", length=1000)
    public String gethashtag1() {
        return this.hashtag1;
    }

    public void sethashtag1(String hashtag1) {
        this.hashtag1 = hashtag1;
    }

    @Column(name="hashtag2", length=1000)
    public String gethashtag2() {
        return this.hashtag2;
    }

    public void sethashtag2(String hashtag2) {
        this.hashtag2 = hashtag2;
    }

    @Column(name="hashtag3", length=1000)
    public String gethashtag3() {
        return this.hashtag3;
    }

    public void sethashtag3(String hashtag3) {
        this.hashtag3 = hashtag3;
    }



    @Column(name="place", length=1000)
    public String getplace() {
        return this.place;
    }

    public void setplace(String place) {
        this.place = place;
    }

    @Column(name="price", length=1000)
    public String getprice() {
        return this.price;
    }

    public void setprice(String price) {
        this.price = price;
    }


    @OneToMany(fetch=FetchType.EAGER)
    @JsonBackReference(value = "out")
    public Set<OffreUtilisateur> getOffreUtilisateurs() {
        return this.offreUtilisateurs;
    }

    public void setOffreUtilisateurs(Set<OffreUtilisateur> offreUtilisateurs) {
        this.offreUtilisateurs = offreUtilisateurs;
    }

}


