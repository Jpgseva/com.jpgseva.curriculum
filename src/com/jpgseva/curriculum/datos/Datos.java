/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpgseva.curriculum.datos;

import com.jpgseva.curriculum.categorias.Aptitud;
import com.jpgseva.curriculum.categorias.Estudio;
import com.jpgseva.curriculum.categorias.Trabajo;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Esta clase contiene los datos que se muestran en la aplicación
 * @author Jorge
 */
public class Datos {
    
    //Método para crear Aptitudes
    public static Aptitud[] misAptitudes() {
         
         Aptitud java = new Aptitud("Java");
         Aptitud oracle = new Aptitud("Base de datos Oracle");
         Aptitud scrum = new Aptitud("Scrum Master");
         Aptitud python = new Aptitud("Phython");
         Aptitud salesforce = new Aptitud("Salesforce");
         Aptitud hibernate = new Aptitud("Hibernate");
         Aptitud maven = new Aptitud("Maven");        
         Aptitud solidWorks = new Aptitud("SolidWorks");
         Aptitud cad = new Aptitud("CAD");
         Aptitud sig = new Aptitud("SIG");
         Aptitud sql = new Aptitud("SQL");
         Aptitud lean = new Aptitud("Lean Manufacturing");
         Aptitud m5s = new Aptitud("5S");
         Aptitud jit = new Aptitud("JIT");
         Aptitud carpinteria = new Aptitud("Software de carpintería");
         Aptitud mecanizados = new Aptitud("Programación de mecanizados");
         Aptitud angular = new Aptitud("Angular");
         Aptitud[] aptitudes = {java,oracle,scrum,python,salesforce,hibernate,
                        maven,solidWorks,cad,sig,sql,lean,m5s,jit,carpinteria,mecanizados,angular};
         
         return aptitudes;
    }
    
    //Método para crear Estudios
    public static List<Estudio> misEstudios() {
        List<Estudio> estudios = new ArrayList();
        Aptitud[] aptitudes = misAptitudes(); 
        
        estudios.add(new Estudio("Herramientas de gestión del suelo. Sistemas de Información Geográfica (GvSIG)",
            "UPA Murcia", 2020, 1,
            " Software de Sistemas de Información Geográfica avanzado",
            new ArrayList(Arrays.asList(aptitudes[9])))); 
        
        estudios.add(new Estudio("Formación Salesforce developer y administrador",
            "Plataforma Trailhead", 2020, 1,
            "Rango Mountaineer en la plataforma Trailhead en:\n" +
            "- Salesforce developer\n" +
            "- Salesforce administrador",
            new ArrayList(Arrays.asList(aptitudes[4])))); 
        
        estudios.add(new Estudio("Máster en Java y Administración de Bases de Datos Oficial de Oracle. MJO",
            "Cice", 2019, 1,
            "El Máster está diseñado para proporcionar una sólida base en el "
            + "desarrollo de aplicaciones y procesos que funcionen "
            + "en multitud de dispositivos con Java,\n mediante "
            + "la programación con Java y bases de datos Oracle,\n"
            + "un lenguaje de última generación basado en la "
            + "programación orientada a objetos.", new ArrayList(Arrays.asList(aptitudes[0],
            aptitudes[1],aptitudes[5],aptitudes[6],aptitudes[7],aptitudes[16]))));
        
        estudios.add(new Estudio("Curso de Scrum Master",
            "Cice", 2019, 1,
            "Curso de técnicas y buenas prácticas del proceso Scrum,\n"
            + " características, procedimientos e implantación.",
            new ArrayList(Arrays.asList(aptitudes[2])))); 
        
        estudios.add(new Estudio("Curso de Python",
            "Cice", 2019, 1,
            "Iniciación y desarrollo en el lenguaje Phyton.",
            new ArrayList(Arrays.asList(aptitudes[3])))); 
        
        estudios.add(new Estudio("Curso de SolidWorks y Curso de SolidWorks avanzado",
            "Instituto Galego de Formación", 2019, 1,
            "Se ha trabajado con SolidWorks comenzando por dibujar croquis 2D y 3D, \n"
            + "para luego a trabajar con la diferentes operaciones de modelado de sólidos,\n "
            + "chapa metálica, piezas soldadas, ensamblajes para finalmente obtener los planos necesarios. ",
            new ArrayList(Arrays.asList(aptitudes[7], aptitudes[8])))); 
                
        estudios.add(new Estudio("Implantación de herramientas LEAN",
            "Team and Time", 2014, 1,
            "Implantación de herramientas LEAN Manufacturing, 5s, "
                    + "Just in Time, gestión de stock \n"
                    + "y otras destinadas a mejorar el rendimiento de la empresa y disminuir costes.",
            new ArrayList(Arrays.asList(aptitudes[11], aptitudes[12], aptitudes[13])))); 
        
        return estudios;
        
    }
    
    //Método para crear Trabajos
    public static List<Trabajo> misEmpleos() {
        
        List<Trabajo> trabajos = new ArrayList();
        Aptitud[] aptitudes = misAptitudes(); 
        
        trabajos.add(new Trabajo("Técnico",
            "Induplan", 2015, 5,
            "Valoración, diseño y programación de mecanizados de carpintería de PVC y aluminio.\n" +
            "Usuario avanzado en software de integral de carpintería \n"
            + "(Expernet - Hetmo Informática, Progest, Cortizo Software).",
            new ArrayList(Arrays.asList(aptitudes[10],aptitudes[14],aptitudes[15]))));  

        trabajos.add(new Trabajo("Estudio de costes y mejora de la producción",
           "Maderas Hermanos García Rocha", 2014, 1,
           "Proyecto de costes de producción y optimización \n de procesos dentro de la beca Reacciona del IGAPE.",
           new ArrayList(Arrays.asList(aptitudes[11], aptitudes[12], aptitudes[13])))); 
        
        trabajos.add(new Trabajo("Asesor en implantación de LEAN, 5S, JIT, etc",
           "Team and Time", 2013, 1,
           "Asesoramiento de PYMES Gallegas para la mejora de la productividad y \n "
           + "reducción de costes mediante la implantación de técnicas LEAN,\n "
           + "5S, Just in time, etc. Proyectos de 2 meses por empresa.",
           new ArrayList(Arrays.asList(aptitudes[11], aptitudes[12], aptitudes[13]))));
         
        return trabajos;
    }
    
}
