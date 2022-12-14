package uv.eu.photeditor;

import uv.eu.photoeditor.controller.PhotoEditorController;
import uv.eu.photoeditor.model.PhotoEditorModel;
import uv.eu.photoeditor.view.PhotoEditorView;

/**
 *
 * @author diaz
 */
public class PhotoEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhotoEditorModel model = new PhotoEditorModel();
        PhotoEditorView view = new PhotoEditorView(model);
        PhotoEditorController controlador = new PhotoEditorController(model, view);
    }
}
