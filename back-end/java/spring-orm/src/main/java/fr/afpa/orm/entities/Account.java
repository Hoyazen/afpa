package fr.afpa.orm.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Classe représentant le compte bancaire d'un utilisateur
 * 
 * TODO faire de cette classe une entité
 * Plus d'informations sur les entités ->
 * https://gayerie.dev/epsi-b3-orm/javaee_orm/jpa_entites.html
 * Attention de bien choisir les types en fonction de ceux du script SQL.
 */

@Entity
public class Account {
    /**
     * Identifiant unique du compte
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Date de création du compte
     */
    @Column(name = "creationTime")
    private LocalDateTime creationTime;

    /**
     * Balance du compte
     */
    @Column(name = "balance")
    private BigDecimal balance;

    /**
     * TODO ajout d'une association de type @ManyToOne : plusieurs comptes
     * différents peuvent être associés à la même personne
     * 
     * Tutoriel présentant l'utilisation d'une telle association :
     * https://koor.fr/Java/TutorialJEE/jee_jpa_many_to_one.wp
     */

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    public Account() {

    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    /*
     * TODO implémenter un constructeur vide --> obligatoire pour l'utilisation d'un
     * ORM
     */

    /*
     * TODO implémenter les getters et les setters
     */
}
