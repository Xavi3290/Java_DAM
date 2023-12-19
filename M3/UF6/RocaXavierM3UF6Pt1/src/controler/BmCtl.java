/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.*;
import view.*;
import persist.*;

/**
 *
 * @author usuari
 */
public class BmCtl {

    private VistaAfegirYModificar vam;

    public BmCtl() {

    }

    public boolean validarBuit(String text) {

        if (text.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarBuit(int num) {

        if (String.valueOf(num).length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Vaixell getVaixell(int codi) {
        VaixellDAO vDao = new VaixellDAO();
        return vDao.getVaixell(codi);
    }

    public void afegirVaixell(Vaixell vai) {
        VaixellDAO vDao = new VaixellDAO();
        int count = vDao.insert(vai);
        if (count != 0) {
            JOptionPane.showMessageDialog(vam, "S'ha afegit correctament");
        } else {
            JOptionPane.showMessageDialog(vam, "No s'ha afegit");
        }
    }

    public void modificarVaixell(Vaixell vai) throws SQLException {
        VaixellDAO vDao = new VaixellDAO();
        int count = vDao.update(vai);
        if (count != 0) {
            JOptionPane.showMessageDialog(vam, "S'ha modificat correctament");
            vam.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(vam, "No s'ha modificat");
        }
    }

    public void setVam(VistaAfegirYModificar vam) {
        this.vam = vam;
        vam.setVisible(true);
    }

}
