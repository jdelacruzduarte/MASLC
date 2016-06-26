
package InterfazUsuario;

import Clases.conexion;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Clases.ReportNominaPrincipal;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class BuscarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form BuscarEmpleado
     */
    conexion cc = new conexion();
    Connection cn = cc.obtener();
   
DefaultTableModel model;

    /**
     *
     */
    public BuscarEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        this.setTitle("Ministerio de Asistencia Social Luz en el Camino");
       // Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("C:\\Users\\Jesus\\Documents\\NetBeansProjects\\MASLC\\src\\Imagenes\\azure-registro.png"));
        //setIconImage(icon);
       
       // setIconImage(new ImageIcon(getClass().getResource("../imagenes/azure-registro.png")).getImage());
        
        
        setVisible(true);
        cargar("");
    }
    
    void cargar(String valor) {
        try{
            String [] titulos={"NSS","Nombre","Apellido","Sexo","Cedula","Telefono","Celular","Estado","Salario","Remuneracion"};
            String [] registros= new String[16];
            model=new DefaultTableModel(null,titulos);
            String nomina = cmbNomina.getSelectedItem().toString();
            String cons="select * from empleados WHERE tipoNomina='"+nomina+"' ORDER BY apeEmpleado";
            Statement st= cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while(rs.next()){
                registros[0]=rs.getString("nssEmpleado");
                registros[1]=rs.getString("nomEmpleado");
                registros[2]=rs.getString("apeEmpleado");
                registros[3]=rs.getString("sexoEmpleado");
                registros[4]=rs.getString("cedEmpleado");
                registros[5]=rs.getString("telEmpleado");
                registros[6]=rs.getString("celEmpleado");
                registros[7]=rs.getString("estadoEmpleado");
               // registros[8]=rs.getString("fechaIngreso");
                registros[8]=rs.getString("salario");
                registros[9]=rs.getString("remuneracion");
            //    registros[10]=rs.getString("nota");
             
                
                model.addRow(registros);      
            }
                tableEmpleado.setModel(model);
                tableEmpleado.getColumnModel().getColumn(0).setPreferredWidth(170);
                tableEmpleado.getColumnModel().getColumn(1).setPreferredWidth(150);
                tableEmpleado.getColumnModel().getColumn(2).setPreferredWidth(150);
                tableEmpleado.getColumnModel().getColumn(3).setPreferredWidth(150);
                tableEmpleado.getColumnModel().getColumn(4).setPreferredWidth(220);
                tableEmpleado.getColumnModel().getColumn(5).setPreferredWidth(200);
                tableEmpleado.getColumnModel().getColumn(6).setPreferredWidth(200);
                tableEmpleado.getColumnModel().getColumn(7).setPreferredWidth(100);
                tableEmpleado.getColumnModel().getColumn(8).setPreferredWidth(100);
                tableEmpleado.getColumnModel().getColumn(9).setPreferredWidth(200);
             //   tableEmpleado.getColumnModel().getColumn(10).setPreferredWidth(150);
              //  tableEmpleado.getColumnModel().getColumn(11).setPreferredWidth(150);
            }catch(Exception e){
                System.out.println(e.getMessage());
                 }     
    }
    
    private TableRowSorter trsFiltro;
    
    //metodo para filtrar la busqueda
    public void filtro() {
        int columnaABuscar = 0;
        if (cbxTipoBusqueda.getSelectedItem().toString().equals("Nombre")) {
            columnaABuscar = 1;
        }
        if (cbxTipoBusqueda.getSelectedItem().toString().equals("Cedula")) {
            columnaABuscar = 4;
        }
        if (cbxTipoBusqueda.getSelectedItem().toString().equals("NSS")) {
            columnaABuscar = 0;
        }
        
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), columnaABuscar));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxTipoBusqueda = new javax.swing.JComboBox();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmpleado = new javax.swing.JTable();
        ButtBuscarEmpleado = new javax.swing.JButton();
        buttExportar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbNomina = new javax.swing.JComboBox();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuAdministrar = new javax.swing.JMenu();
        MenuRegistrarEmpleado = new javax.swing.JMenuItem();
        MenuActualizarEmpleado = new javax.swing.JMenuItem();
        MenuConsultar = new javax.swing.JMenu();
        MenuBuscarEmpleado = new javax.swing.JMenuItem();
        MenuConsultaPago = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        MenuContactos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        cbxTipoBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxTipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Cedula", "NSS" }));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        tableEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEmpleado);

        ButtBuscarEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtBuscarEmpleado.setText("Salir");
        ButtBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtBuscarEmpleadoActionPerformed(evt);
            }
        });

        buttExportar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttExportar.setText("Exportar");
        buttExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttExportarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nomina");

        cmbNomina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Principal", "Mirador del Ozama" }));
        cmbNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNominaActionPerformed(evt);
            }
        });

        MenuAdministrar.setText("Adminsitrar");

        MenuRegistrarEmpleado.setText("Registrar Empleado");
        MenuRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistrarEmpleadoActionPerformed(evt);
            }
        });
        MenuAdministrar.add(MenuRegistrarEmpleado);

        MenuActualizarEmpleado.setText("Actualizar");
        MenuActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActualizarEmpleadoActionPerformed(evt);
            }
        });
        MenuAdministrar.add(MenuActualizarEmpleado);

        MenuPrincipal.add(MenuAdministrar);

        MenuConsultar.setText("Consultar");

        MenuBuscarEmpleado.setText("Buscar Empleado");
        MenuBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuscarEmpleadoActionPerformed(evt);
            }
        });
        MenuConsultar.add(MenuBuscarEmpleado);

        MenuConsultaPago.setText("Pagos");
        MenuConsultaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultaPagoActionPerformed(evt);
            }
        });
        MenuConsultar.add(MenuConsultaPago);

        MenuPrincipal.add(MenuConsultar);

        MenuAyuda.setText("Ayuda");

        MenuContactos.setText("Contactos");
        MenuContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuContactosActionPerformed(evt);
            }
        });
        MenuAyuda.add(MenuContactos);

        MenuPrincipal.add(MenuAyuda);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttExportar)
                        .addGap(18, 18, 18)
                        .addComponent(ButtBuscarEmpleado)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtBuscarEmpleado)
                    .addComponent(buttExportar)
                    .addComponent(jLabel1)
                    .addComponent(cmbNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtBuscarEmpleadoActionPerformed
                
        System.exit(0);
    }//GEN-LAST:event_ButtBuscarEmpleadoActionPerformed

    private void MenuRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistrarEmpleadoActionPerformed
            AgregarEmpleado AgrEmp = new AgregarEmpleado();
            AgrEmp.setVisible(true);
            dispose();
    }//GEN-LAST:event_MenuRegistrarEmpleadoActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
            txtBuscar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscar.getText());
                txtBuscar.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tableEmpleado.getModel());
        tableEmpleado.setRowSorter(trsFiltro);      }//GEN-LAST:event_txtBuscarKeyTyped

    private void cmbNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNominaActionPerformed
        
        cargar("");
        
    }//GEN-LAST:event_cmbNominaActionPerformed

    private void MenuActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActualizarEmpleadoActionPerformed
        ModificarEmpleado ModEmp = new ModificarEmpleado();
        ModEmp.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_MenuActualizarEmpleadoActionPerformed

    private void MenuConsultaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaPagoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "En proceso");
    }//GEN-LAST:event_MenuConsultaPagoActionPerformed

    private void MenuContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuContactosActionPerformed
        JOptionPane.showMessageDialog(null, "Contactos: jdelacruzduarte@gmail.com");

    }//GEN-LAST:event_MenuContactosActionPerformed

    private void tableEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmpleadoMouseClicked
        int filaseleccionada;
        try{
            filaseleccionada= tableEmpleado.getSelectedRow();
            if (filaseleccionada==-1){
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
            }else{
                DefaultTableModel modelotabla=(DefaultTableModel) tableEmpleado.getModel();
                String cod=(String)tableEmpleado.getValueAt(filaseleccionada, 0);
                ModificarEmpleado ModEmp = new ModificarEmpleado();
                ModEmp.setVisible(true);
                ModEmp.busqueda(cod);
                dispose();
            }
        }catch (HeadlessException ex){

            JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);        
        }
    }//GEN-LAST:event_tableEmpleadoMouseClicked

    private void buttExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttExportarActionPerformed
        Object nomina = JOptionPane.showInputDialog(null,"Selecccione una nomina",
            "Nomina", JOptionPane.QUESTION_MESSAGE, null,
            new Object[] { "Seleccione","Principal", "Mirador del Ozama" },"Seleccione");
        if (nomina.toString().equals("Principal")){
           // JOptionPane.showMessageDialog(null, "Nomina principal En proceso!!!!!");
            
            ReportNominaPrincipal.CrearReporteNomPrincipal();
            ReportNominaPrincipal.ShowViewerReporte(); 
            
        }else {
          //  JOptionPane.showMessageDialog(null, "Nomina Mirador del Ozama En proceso!!!!!");
            ReportNominaPrincipal.CrearReporteNomMirador();
            ReportNominaPrincipal.ShowViewerReporte();
            
            
        }
        
    }//GEN-LAST:event_buttExportarActionPerformed

    private void MenuBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuscarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuBuscarEmpleadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtBuscarEmpleado;
    private javax.swing.JMenuItem MenuActualizarEmpleado;
    private javax.swing.JMenu MenuAdministrar;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenuItem MenuBuscarEmpleado;
    private javax.swing.JMenuItem MenuConsultaPago;
    private javax.swing.JMenu MenuConsultar;
    private javax.swing.JMenuItem MenuContactos;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem MenuRegistrarEmpleado;
    private javax.swing.JButton buttExportar;
    private javax.swing.JComboBox cbxTipoBusqueda;
    private javax.swing.JComboBox cmbNomina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEmpleado;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
