/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.eu.photoeditor.view;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author hesham
 */
public class PhotoEditorMenuBar extends JMenuBar{
    private JMenu archivo, ayuda;
    private JMenuItem cargar, guardar, salir;
    
    public PhotoEditorMenuBar(){
        archivo = new JMenu("Archivo");
        ayuda = new JMenu("Ayuda");
        cargar = new JMenuItem("Cargar Imagen");
        guardar = new JMenuItem("Guardar Imagen");
        salir = new JMenuItem("Salir");
        
        archivo.add(cargar);
        archivo.add(guardar);
        archivo.add(salir);
        this.add(archivo);
        this.add(ayuda);
    }
    public void setActionListener(ActionListener actionListener){
        cargar.addActionListener(actionListener);
        guardar.addActionListener(actionListener);
        salir.addActionListener(actionListener);
    }
}
