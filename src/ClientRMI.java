import tpmetier.rmi.Compte;
import tp.rmi.LBanqueRemote;

import java.rmi.Naming;




public class
ClientRMI {
    public static void main(String[] args) {
        try {
            LBanqueRemote banqueRemote = (LBanqueRemote) Naming.lookup("rmi://localhost/BanqueRMIService");

            // Call remote methods
            double convertedAmount = banqueRemote.conversion(10.0);
            Compte compte = banqueRemote.consulterCompte(256);
            // ...

            // Display results or perform further actions
            System.out.println("Résultat de conversion: " + convertedAmount);
            System.out.println("Code du compte: " + compte.getCode());
            System.out.println("Portefeuille: " + compte.getSolde());

            // ...

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}