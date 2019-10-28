/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unapec.main;

import com.unapec.view.CineFrame;

/**
 *
 * @author JP317548
 */
public class System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CineFrame cineFrame = new CineFrame();
        cineFrame.setTitle("Cine App");
        cineFrame.setResizable(false);
        cineFrame.setVisible(true);
    }
    
}
