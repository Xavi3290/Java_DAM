/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Categoria;
import model.Magatzem;
import model.Videojoc;
import view.Pantalla;
import view.PantallaLlista;

/**
 *
 * @author usuari
 */
public class BotigaCtl {

    private Pantalla pan;
    private Magatzem mgz;
    private final String nomFitxer = "videojocs.obj";
    private File fit = new File(nomFitxer);

    /**
     * Carrega el magatzem, carrega la pantalla i la fa visible.
     */
    public BotigaCtl() {
        this.pan = new Pantalla(this);
        //this.mgz = new Magatzem();
        this.pan.setVisible(true);
        if (fit.exists()) {
            final String[] boto = {"SI", "NO"};
            String missatge = "El fitxer " + nomFitxer + " ja existeix, desitja carregar-lo?";
            int i = JOptionPane.showOptionDialog(pan, missatge, "Aviso", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, boto, boto[0]);
            if (i == 0) {
                try {
                    mgz = cargarMagatzem(nomFitxer);
                } catch (Exception e) {
                    System.out.println("ERROR");
                }

            } else {
                mgz = new Magatzem();

            }

        } else {
            mgz = new Magatzem();

        }

    }

    /**
     * Afegeix un videojoc, mostra el magatzem i el guarda.
     *
     * @param vj videojoc
     */
    public void afegirVideojoc(Videojoc vj) {

        mgz.add(vj);
        mgz.mostrar();
        guardarMagatzem();
    }

    /**
     * Busca un videojoc a partir del codi
     *
     * @param codi codi que li pases per buscar
     * @return retorna el videojoc trobat
     */
    public Videojoc buscarVideojoc(int codi) {
        return mgz.buscarVideojoc(codi);
    }

    /**
     * Guarda el magatzem
     */
    public void guardarMagatzem() {
        try {
            FileOutputStream fos = new FileOutputStream(fit);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(mgz);
            oos.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    /**
     * Carrega el magatzem i el retorna
     *
     * @param nFitxer nom del fitxer
     * @return retorna el magatzem
     */
    public Magatzem cargarMagatzem(String nFitxer) {
        Magatzem mgz = null;
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(nFitxer);
            ois = new ObjectInputStream(fis);
            while (true) {
                mgz = (Magatzem) ois.readObject();
                mgz.toString();

            }
        } catch (EOFException exc) {
            System.out.println("\n**************** FIN ARXIU**************");
        } catch (Exception io) {
            System.out.println(io.toString());
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        return mgz;
    }

    /**
     * Valida si el codi esta buit
     *
     * @param text String
     * @return true si esta buit false si no
     */
    public boolean validarBuit(String text) {

        if (text.length() > 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Crea un table model filtrat per la categoria i el stock
     *
     * @param categoria categoria del combobox
     * @param qStock estoc per filtrar
     * @return tablemodel
     */
    public TableModel getVideojocsFiltreDataTable(String categoria, int qStock) {
        DefaultTableModel tm = new DefaultTableModel();
        tm.addColumn("Codi");
        tm.addColumn("Nom");
        tm.addColumn("Plataforma");
        tm.addColumn("Q.Stock");
        tm.addColumn("Preu");
        tm.addColumn("Oferta");
        tm.addColumn("Categoria");
        tm.addColumn("Tematica");
        Set<Videojoc> videojocs = mgz.getVideojocs();
        if (categoria == null) {
            for (Videojoc vj : videojocs) {
                if (vj.getQuantStock() < qStock) {
                    Object[] fila = new Object[8];
                    fila[0] = vj.getCodi();
                    fila[1] = vj.getNom();
                    fila[2] = vj.getPlataforma();
                    fila[3] = vj.getQuantStock();
                    fila[4] = vj.getPreu();
                    fila[5] = vj.getOferta();
                    fila[6] = vj.getCategoria();
                    fila[7] = vj.getTematica();
                    tm.addRow(fila);
                }
            }
        } else {
            for (Videojoc vj : videojocs) {
                if (vj.getCategoria().equals(categoria) && vj.getQuantStock() < qStock) {
                    Object[] fila = new Object[8];
                    fila[0] = vj.getCodi();
                    fila[1] = vj.getNom();
                    fila[2] = vj.getPlataforma();
                    fila[3] = vj.getQuantStock();
                    fila[4] = vj.getPreu();
                    fila[5] = vj.getOferta();
                    fila[6] = vj.getCategoria();
                    fila[7] = vj.getTematica();
                    tm.addRow(fila);
                }
            }
        }
        return tm;
    }

    /**
     * Crea un table model amb els parametres Codi, Nom, Plataforma, Q.Stock,
     * Preu, Oferta, Categoria, Tematica
     *
     * @return tablemodel
     */
    private TableModel getVideojocsDataTable() {
        DefaultTableModel tm = new DefaultTableModel();
        tm.addColumn("Codi");
        tm.addColumn("Nom");
        tm.addColumn("Plataforma");
        tm.addColumn("Q.Stock");
        tm.addColumn("Preu");
        tm.addColumn("Oferta");
        tm.addColumn("Categoria");
        tm.addColumn("Tematica");
        Set<Videojoc> videojocs = mgz.getVideojocs();
        for (Videojoc vj : videojocs) {
            Object[] fila = new Object[8]; // Hay tres columnas en la tabla
            // Se rellena cada posición del array con una atributo de Alumne.
            fila[0] = vj.getCodi();
            fila[1] = vj.getNom();
            fila[2] = vj.getPlataforma();
            fila[3] = vj.getQuantStock();
            fila[4] = vj.getPreu();
            fila[5] = vj.getOferta();
            fila[6] = vj.getCategoria();
            fila[7] = vj.getTematica();
            // Se añade al modelo la fila completa.     
            tm.addRow(fila);
        }
        return tm;
    }

    /**
     * Mostra la llista de la tablemodel i la fa visible
     */
    public void mostraLlista() {
        PantallaLlista dialog = new PantallaLlista(this.pan, true, this);
        TableModel tm = this.getVideojocsDataTable();
        dialog.setInfo(tm);
        dialog.setVisible(true);
    }

    /**
     * Calcula l'import total en double
     *
     * @return double
     */
    public double imporTotal() {
        return mgz.importTotal();
    }

//    }
//    public void pantallaLLista(){
//        PantallaLista dialog = new PantallaLlista(this.pan, true, this);
//        TableModel tm =
//    }
}
