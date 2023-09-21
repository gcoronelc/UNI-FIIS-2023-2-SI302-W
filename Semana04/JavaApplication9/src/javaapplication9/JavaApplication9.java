/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import javaapplication9.view.DemoView;

/**
 *
 * @author Metodos
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DemoView view = new DemoView();
        view.setVisible(true);
        DemoView.main(args);
    }
    
}
