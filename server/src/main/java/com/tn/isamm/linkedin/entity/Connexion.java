package com.tn.isamm.linkedin.entity;
// Generated Oct 21, 2018 10:21:03 AM by Hibernate Tools 4.3.1


import org.hibernate.annotations.SQLUpdate;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;


/**
 * Connexion generated by hbm2java
 */
@Entity
@Table(name="connexion"
        ,catalog="linkedin2"
)
public class Connexion  implements java.io.Serializable {


    private Integer id;
    private Integer ajout;
    private Utilisateur utilisateurByIdUtilisateur2;
    private Utilisateur utilisateurByIdUtilisateur1;

    public Connexion() {
    }

    public Connexion(Utilisateur utilisateurByIdUtilisateur2, Utilisateur utilisateurByIdUtilisateur1) {
        this.utilisateurByIdUtilisateur2 = utilisateurByIdUtilisateur2;
        this.utilisateurByIdUtilisateur1 = utilisateurByIdUtilisateur1;

    }

    @Id @GeneratedValue(strategy=IDENTITY)


    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_utilisateur2", nullable=false)
    public Utilisateur getUtilisateurByIdUtilisateur2() {
        return this.utilisateurByIdUtilisateur2;
    }

    public void setUtilisateurByIdUtilisateur2(Utilisateur utilisateurByIdUtilisateur2) {
        this.utilisateurByIdUtilisateur2 = utilisateurByIdUtilisateur2;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_utilisateur1", nullable=false)
    public Utilisateur getUtilisateurByIdUtilisateur1() {
        return this.utilisateurByIdUtilisateur1;
    }

    public void setUtilisateurByIdUtilisateur1(Utilisateur utilisateurByIdUtilisateur1) {
        this.utilisateurByIdUtilisateur1 = utilisateurByIdUtilisateur1;
    }


    @Column(name="ajout", updatable=true, nullable = true)
    public Integer getAjout() {
        return ajout;
    }

    public void setAjout(Integer ajout) {
        this.ajout = ajout;
    }
}