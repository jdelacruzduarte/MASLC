/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.Connection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.Connection;


/**
 *
 * @author JesusMini
 */
public class ReportNominaPrincipal {
    private static JasperReport report;
    private static JasperPrint reportFiled;
    private static JasperViewer viewer;
    
public static void CrearReporteProductos()
    {
        
        conexion cc = new conexion();
        Connection cn = cc.obtener();
        try
        {            
            String path = "C:\\Users\\JesusMini\\Documents\\NetBeansProjects\\MASLC\\src\\Reportes\\NominaPrincipal.jasper";
            report = (JasperReport) JRLoader.loadObjectFromFile(path);            
            reportFiled = JasperFillManager.fillReport(report, null, cn);       
        }
        catch(JRException ex)
                {
                    ex.printStackTrace();
                }
    }
    
    public static void ShowViewerProductos()
    {       
            viewer = new JasperViewer (reportFiled, false);
            viewer.setVisible(true);  
            //JasperViewer visor = new JasperViewer(jp,false) ;
    }
}
