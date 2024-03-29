package tpmetier.rmi;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
    int code ;
    double solde ;
    Date dateCreation ;

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setCode(int code) {
        this.code = code;
    }

}