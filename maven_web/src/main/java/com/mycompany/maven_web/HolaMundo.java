/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven_web;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author Niko
 */
public class HolaMundo {
    public static void main(String[] args)throws Exception{
        URL urlobject;
        String codigo;
            urlobject=new URL("http://www.bandagayano.com");
            InputStreamReader isr=new InputStreamReader(urlobject.openStream());
            BufferedReader br = new BufferedReader(isr);
            
            while((codigo=br.readLine())!=null){
                System.out.println(codigo);
            }
            br.close();
    } 
}
