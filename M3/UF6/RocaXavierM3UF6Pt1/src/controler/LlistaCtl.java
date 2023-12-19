/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.*;
import persist.*;
import view.*;

/**
 *
 * @author usuari
 */
public class LlistaCtl {

    private VistaPrincipal vPrin;

    public LlistaCtl() throws SQLException {
        // this.pan = new Pantalla(this);
        this.vPrin = new VistaPrincipal(this);
        this.vPrin.setCategoriaCombo();
        this.vPrin.setTable();
        this.vPrin.setVisible(true);
    }

    public TableModel getVaixellsDataTable(String cat, int ordre) {

        VaixellDAO vDao = new VaixellDAO();

        DefaultTableModel tm = new DefaultTableModel();
        tm.addColumn("Codi");
        tm.addColumn("Nom");
        tm.addColumn("Categoria");
        tm.addColumn("Rating");
        tm.addColumn("Club");
        tm.addColumn("Tipus");
        tm.addColumn("Senior");
        tm.addColumn("Temps");
        tm.addColumn("Temps Compensat");
        ArrayList<Vaixell> vaixells = vDao.getVaixellFiltratPerCategoriaYOrdenat(cat, ordre);
        DecimalFormat df = new DecimalFormat("#.00");
        for (Vaixell vai : vaixells) {
            Object[] fila = new Object[9]; // Hay tres columnas en la tabla
            // Se rellena cada posición del array con una atributo de Alumne.
            fila[0] = vai.getCodi();
            fila[1] = vai.getNom();
            fila[2] = vai.getCategoria().getNom();
            fila[3] = vai.getRating();
            fila[4] = vai.getClub();
            fila[5] = vai.getTipus();
            fila[6] = vai.isSenior();
            fila[7] = vai.getTemps();
            fila[8] = df.format(vai.getRating() * vai.getTemps());
            // fila[8] = ratin * temps 
            // Se añade al modelo la fila completa.     
            tm.addRow(fila);
        }
        return tm;
    }

    public DefaultComboBoxModel getCategorias() {

        CategoriaDAO catDao = new CategoriaDAO();
        DefaultComboBoxModel categorias = new DefaultComboBoxModel();
        ArrayList<Categoria> catArr = null;

        try {
            catArr = catDao.getCategoriaList();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        categorias.addElement("...");
        for (Categoria cat : catArr) {
            categorias.addElement(cat.getNom());
        }

        return categorias;
    }

    public void mostraVistaAf() {
        BmCtl bmctl = new BmCtl();
        VistaAfegirYModificar vam = new VistaAfegirYModificar(vPrin, true, bmctl);
        vam.setCategoriaCombo(getCategorias());
        bmctl.setVam(vam);
        this.vPrin.switchCategoriaYOrdre();
    }

    public void mostraVistaMod() {
        BmCtl bmctl = new BmCtl();
        String codi = this.vPrin.getCodi();
        VistaAfegirYModificar vam = new VistaAfegirYModificar(vPrin, true, bmctl, codi);
        vam.setCategoriaCombo(getCategorias());
        vam.setCamps(codi);
        bmctl.setVam(vam);
        this.vPrin.switchCategoriaYOrdre();

    }

    public void eliminarVaixell(int codi) {
        VaixellDAO vDao = new VaixellDAO();
        final String[] boto = {"SI", "NO"};
        String missatge = "Segur que vols borrar aquest vaixell amb codi " + codi;
        int i = JOptionPane.showOptionDialog(this.vPrin, missatge, "Aviso", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, boto, boto[0]);
        if (i == 0) {
            try {
                vDao.delete(codi);
            } catch (Exception e) {
                System.out.println(e.toString());
            }

            this.vPrin.switchCategoriaYOrdre();
        }

    }
}
