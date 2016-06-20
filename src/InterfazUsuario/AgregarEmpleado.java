package InterfazUsuario;

import Clases.conexion;
import InterfazUsuario.BuscarEmpleado;
import java.awt.Frame;
import static java.lang.Double.parseDouble;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class AgregarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form AgregarEmpleado
     */
    conexion cc = new conexion();
    Connection cn = cc.obtener();
    public AgregarEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Ministerio de Asistencia Social Luz en el Camino");
      //  setExtendedState(Frame.MAXIMIZED_BOTH);
    }
    
    void Limpiar (){
       // txtCodigo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtTelefono.setText("");
        txtCelular.setText("");
        txtNSS.setText("");
        txtFecha.setDate(null);
        txtSalario.setText("");
        txtTipoRemuneracion.setText("");
        txtAreNotas.setText("");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonGrupo = new javax.swing.ButtonGroup();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttGuardar = new javax.swing.JButton();
        buttLimpiar = new javax.swing.JButton();
        buttSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cmbEstado = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelCedula = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        LabelApellido = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        LabelFechaIngreso = new javax.swing.JLabel();
        LabelNSS = new javax.swing.JLabel();
        LabelSalario = new javax.swing.JLabel();
        txtTipoRemuneracion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreNotas = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        LabelTipoRemuneracion = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox();
        txtTelefono = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtCedula = new javax.swing.JFormattedTextField();
        txtNSS = new javax.swing.JFormattedTextField();
        txtSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbNomina = new javax.swing.JComboBox();
        txtFecha = new com.toedter.calendar.JDateChooser();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuAdministrar = new javax.swing.JMenu();
        MenuRegistrarEmpleado = new javax.swing.JMenuItem();
        MenuActualizarEmpleado = new javax.swing.JMenuItem();
        MenuConsultar = new javax.swing.JMenu();
        MenuBuscarEmpleado = new javax.swing.JMenuItem();
        MenuConsultaPago = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        MenuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(675, 470));
        setResizable(false);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo.setText("Sistema de registro de empleado");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttGuardar.setText("Guardar");
        buttGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttGuardarActionPerformed(evt);
            }
        });

        buttLimpiar.setText("Limpiar");
        buttLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttLimpiarActionPerformed(evt);
            }
        });

        buttSalir.setText("Salir");
        buttSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttGuardar)
                .addGap(18, 18, 18)
                .addComponent(buttLimpiar)
                .addGap(18, 18, 18)
                .addComponent(buttSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));

        jLabel5.setText("Estado");

        jLabel3.setText("Celular");

        jLabel2.setText("Telefono");

        LabelCedula.setText("Cedula");

        jLabel1.setText("Sexo");

        LabelApellido.setText("Apellido");

        LabelNombre.setText("Nombre");

        LabelFechaIngreso.setText("Fecha de ingreso");

        LabelNSS.setText("NSS");

        LabelSalario.setText("Salario");

        txtAreNotas.setColumns(20);
        txtAreNotas.setLineWrap(true);
        txtAreNotas.setRows(5);
        txtAreNotas.setTabSize(11);
        jScrollPane1.setViewportView(txtAreNotas);

        jLabel4.setText("Notas");

        LabelTipoRemuneracion.setText("Remuneracion");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtNSS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Nomina");

        cmbNomina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Principal", "Mirador del Ozama" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelApellido)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(LabelCedula))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApellido)
                                    .addComponent(cmbSexo, 0, 100, Short.MAX_VALUE)
                                    .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtCelular)
                                    .addComponent(txtCedula)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelNombre)
                                    .addComponent(LabelNSS))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtNSS, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelSalario, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelTipoRemuneracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(LabelFechaIngreso)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTipoRemuneracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNSS)
                            .addComponent(LabelFechaIngreso)
                            .addComponent(txtNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LabelNombre)
                                .addGap(2, 2, 2))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelApellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelCedula)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelSalario)
                                .addGap(28, 28, 28)
                                .addComponent(LabelTipoRemuneracion))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTipoRemuneracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbNomina, txtFecha});

        MenuAdministrar.setText("Adminsitrar");

        MenuRegistrarEmpleado.setText("Registrar Empleado");
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

        MenuAbout.setText("Contactos");
        MenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAboutActionPerformed(evt);
            }
        });
        MenuAyuda.add(MenuAbout);

        MenuPrincipal.add(MenuAyuda);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuscarEmpleadoActionPerformed
            BuscarEmpleado BusEmp = new BuscarEmpleado();
            BusEmp.setVisible(true);
            dispose();
    }//GEN-LAST:event_MenuBuscarEmpleadoActionPerformed

    private void buttSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttSalirActionPerformed

    private void buttGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttGuardarActionPerformed
        String nom,ape,sex,ced,tel,cel,estado,nss,remu,notas,nomina;
        double salario;
        
       // Date fecha =new Date();
        if (txtNombre.getText().equals("") || txtApellido.getText().equals("")||
            txtCedula.getText().equals("   -       - ")|| txtTelefono.getText().equals("   -   -    ")||
            txtCelular.getText().equals("   -   -    ")|| txtNSS.getText().equals("")|| 
            txtFecha.getDate().equals("")|| txtSalario.getText().equals("")|| 
            txtTipoRemuneracion.getText().equals("")|| txtAreNotas.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorio");
        }
        else{ 
            Date fecha;
            String sql="";
           // cod=txtCodigo.getText();           
            nom=txtNombre.getText();            
            ape=txtApellido.getText();
            sex=cmbSexo.getSelectedItem().toString();
            ced=txtCedula.getText();
            tel=txtTelefono.getText();
            cel=txtCelular.getText();
            estado=cmbEstado.getSelectedItem().toString();
            nss=txtNSS.getText();
            fecha=txtFecha.getDate();
            nomina=cmbNomina.getSelectedItem().toString();
            salario= Double.parseDouble(txtSalario.getText());
            remu=txtTipoRemuneracion.getText();
            notas=txtAreNotas.getText();
       
            sql="INSERT INTO empleados (nssEmpleado,nomEmpleado,apeEmpleado,"
                    + "sexoEmpleado,cedEmpleado,telEmpleado,celEmpleado,estadoEmpleado,"
                    + "fechaIngreso,tipoNomina,salario,remuneracion,nota) VALUES "
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {  
                            
            PreparedStatement pst  = cn.prepareStatement(sql);
            pst.setString(1, nss);
            pst.setString(2, nom);
            pst.setString(3, ape);
            pst.setString(4, sex);
            pst.setString(5, ced);
            pst.setString(6, tel);
            pst.setString(7, cel);
            pst.setString(8, estado);
            pst.setDate(9, new java.sql.Date(txtFecha.getDate().getTime()));
            pst.setString(10, nomina);
            pst.setDouble(11, salario);
            pst.setString(12, remu);
            pst.setString(13, notas);            
            
            int n=pst.executeUpdate();
            if(n>0){
            JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
            Limpiar();
            pst.close();
          //  codigos();

            }
          //  cargar("");
        } catch (SQLException ex) {
            Logger.getLogger(AgregarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //    } 
        }
    }//GEN-LAST:event_buttGuardarActionPerformed

    private void buttLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttLimpiarActionPerformed
                Limpiar();

    }//GEN-LAST:event_buttLimpiarActionPerformed

    private void MenuActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActualizarEmpleadoActionPerformed
        ModificarEmpleado ModEmp = new ModificarEmpleado();
        ModEmp.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuActualizarEmpleadoActionPerformed

    private void MenuConsultaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaPagoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "En proceso");
    }//GEN-LAST:event_MenuConsultaPagoActionPerformed

    private void MenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAboutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Contactos: jdelacruzduarte@gmail.com");
    }//GEN-LAST:event_MenuAboutActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BotonGrupo;
    private javax.swing.JLabel LabelApellido;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelFechaIngreso;
    private javax.swing.JLabel LabelNSS;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelSalario;
    private javax.swing.JLabel LabelTipoRemuneracion;
    private javax.swing.JMenuItem MenuAbout;
    private javax.swing.JMenuItem MenuActualizarEmpleado;
    private javax.swing.JMenu MenuAdministrar;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenuItem MenuBuscarEmpleado;
    private javax.swing.JMenuItem MenuConsultaPago;
    private javax.swing.JMenu MenuConsultar;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem MenuRegistrarEmpleado;
    private javax.swing.JButton buttGuardar;
    private javax.swing.JButton buttLimpiar;
    private javax.swing.JButton buttSalir;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JComboBox cmbNomina;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtAreNotas;
    private javax.swing.JFormattedTextField txtCedula;
    private javax.swing.JFormattedTextField txtCelular;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JFormattedTextField txtNSS;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JFormattedTextField txtTelefono;
    private javax.swing.JTextField txtTipoRemuneracion;
    // End of variables declaration//GEN-END:variables
}