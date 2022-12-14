/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.eu.photoeditor.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import uv.eu.photoeditor.model.PhotoEditorModel;

/**
 *
 * @author hesham
 */
public class PhotoEditorView extends JFrame{
    private PhotoEditorMenuBar menu;
    private WidthPanel top;
    private SelectPanel select;
    private ImagenPanel image;
    private StatusPanel status; 
    private static PhotoEditorModel model;
    
    public PhotoEditorView(PhotoEditorModel model){
        this.model = model;
        
        setLayout(new BorderLayout());
        
        menu = new PhotoEditorMenuBar();
        top = new WidthPanel();
        select = new SelectPanel();
        image = new ImagenPanel(model);
        status = new StatusPanel();
        
        this.setJMenuBar(menu);
        
        add(top, BorderLayout.NORTH);
        add(select, BorderLayout.WEST);
        add(image, BorderLayout.CENTER);
        add(status, BorderLayout.SOUTH);
        
        this.setSize(900,900);
        this.setVisible(true);
    }
    public void setActionListener(ActionListener listener){
        
    }
}
