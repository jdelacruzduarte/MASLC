package InterfazUsuario;

import Clases.conexion;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Double.parseDouble;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class ModificarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form AgregarEmpleado
     */
    conexion cc = new conexion();
    Connection cn = cc.obtener();
    public static Statement st=null;
    public static ResultSet rs=null;
    public ModificarEmpleado() {
        initComponents();
        bloquearTXT();
        setLocationRelativeTo(null);
        this.setTitle("Ministerio de Asistencia Social Luz en el Camino");
        setExtendedState(Frame.MAXIMIZED_BOTH);
        //Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/azure-registro.png"));
        //setIconImage(icon);
         //       setIconImage(new ImageIcon(getClass().getResource("../imagenes/azure-registro.png")).getImage());

        carga();
        contador();
    }
    
    public void contador(){
        String nomina = cmbNomina_2.getSelectedItem().toString();
        String sql="select count(*) from empleados WHERE tipoNomina='"+nomina+"'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {               
                labelContadorMax.setText(rs.getString("count(*)"));                
            }
        }
             catch (SQLException ex) {
           // Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void busqueda (String nss){
        String sql="select * from empleados WHERE nssEmpleado='"+nss+"'";
       try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {               
                cmbSexo.setSelectedItem(rs.getString("sexoEmpleado"));
                cmbEstado.setSelectedItem(rs.getString("estadoEmpleado"));
                cmbNomina.setSelectedItem(rs.getString("tipoNomina"));
                txtNSS.setText(rs.getString("nssEmpleado"));
                txtNombre.setText(rs.getString("nomEmpleado"));
                txtApellido.setText(rs.getString("apeEmpleado"));            
                txtCedula.setText(rs.getString("cedEmpleado"));
                txtTelefono.setText(rs.getString("telEmpleado"));
                txtCelular.setText(rs.getString("celEmpleado"));
                txtFecha.setDate(rs.getDate("fechaIngreso"));
                txtSalario.setText(rs.getString("salario"));
                txtTipoRemuneracion.setText(rs.getString("remuneracion"));
                txtAreNotas.setText(rs.getString("nota"));
            }
        }
             catch (SQLException ex) {
           // Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void desbloquearTXT(){
      //txtNSS.setEnabled(true); // no se desbloquea para tomar este campo para realizar update
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtCedula.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtCelular.setEnabled(true);
        txtFecha.setEnabled(true);
        txtSalario.setEnabled(true);
        txtTipoRemuneracion.setEnabled(true);
        txtAreNotas.setEnabled(true);
        cmbSexo.setEnabled(true);
        cmbEstado.setEnabled(true);
        cmbNomina.setEnabled(true);
    }
    
    public void bloquearTXT(){
      //txtNSS.setEnabled(true); // no se desbloquea para tomar este campo para realizar update
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtCedula.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCelular.setEnabled(false);
        txtFecha.setEnabled(false);
        txtSalario.setEnabled(false);
        txtTipoRemuneracion.setEnabled(false);
        txtAreNotas.setEnabled(false);
        cmbSexo.setEnabled(false);
        cmbEstado.setEnabled(false);
        cmbNomina.setEnabled(false);
    }
    
    public void carga (){
        String nomina = cmbNomina_2.getSelectedItem().toString();
        String cons="select * from empleados WHERE tipoNomina='"+nomina+"' ";        
        try {            
             st= cn.createStatement();
             rs = st.executeQuery(cons);
             rs.first();
             labContador.setText(Integer.toString(rs.getRow()));
             llenarTXT();
        
        }catch(Exception e){
        JOptionPane.showMessageDialog(this, e.toString());
        }
        
    }
    void llenarTXT () {
        try{            
            cmbSexo.setSelectedItem(rs.getString("sexoEmpleado"));
            cmbEstado.setSelectedItem(rs.getString("estadoEmpleado"));
            cmbNomina.setSelectedItem(rs.getString("tipoNomina"));
            txtNSS.setText(rs.getString("nssEmpleado"));
            txtNombre.setText(rs.getString("nomEmpleado"));
            txtApellido.setText(rs.getString("apeEmpleado"));            
            txtCedula.setText(rs.getString("cedEmpleado"));
            txtTelefono.setText(rs.getString("telEmpleado"));
            txtCelular.setText(rs.getString("celEmpleado"));
            txtFecha.setDate(rs.getDate("fechaIngreso"));
            txtSalario.setText(rs.getString("salario"));
            txtTipoRemuneracion.setText(rs.getString("remuneracion"));
            txtAreNotas.setText(rs.getString("nota"));
            }catch(Exception e){
                System.out.println(e.getMessage());
                 }     
    }
    void Limpiar (){
        //txtCodigo.setText("");
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
        java.awt.GridBagConstraints gridBagConstraints;

        BotonGrupo = new javax.swing.ButtonGroup();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttGuardar = new javax.swing.JButton();
        buttLimpiar = new javax.swing.JButton();
        buttSalir = new javax.swing.JButton();
        buttEditar = new javax.swing.JButton();
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
        buttBack = new javax.swing.JButton();
        buttNext = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        labContador = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelContadorMax = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbNomina_2 = new javax.swing.JComboBox();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuAdministrar = new javax.swing.JMenu();
        MenuRegistrarEmpleado = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuConsultar = new javax.swing.JMenu();
        MenuBuscarEmpleado = new javax.swing.JMenuItem();
        MenuConsultaPago = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        MenuContactos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 0, 5)); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo.setText("Actualizar de empleado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 110, 0, 0);
        getContentPane().add(labelTitulo, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttGuardar.setText("Actualizar");
        buttGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttGuardarActionPerformed(evt);
            }
        });

        buttLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttLimpiar.setText("Limpiar");
        buttLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttLimpiarActionPerformed(evt);
            }
        });

        buttSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttSalir.setText("Salir");
        buttSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttSalirActionPerformed(evt);
            }
        });

        buttEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttEditar.setText("Editar");
        buttEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(buttEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(buttEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 16);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmbEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        cmbEstado.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Estado");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Celular");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Telefono");

        LabelCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelCedula.setText("Cedula");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Sexo");

        txtApellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtApellido.setEnabled(false);

        LabelApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelApellido.setText("Apellido");

        LabelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNombre.setText("Nombre");

        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombre.setEnabled(false);

        LabelFechaIngreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelFechaIngreso.setText("Fecha de ingreso");

        LabelNSS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNSS.setText("NSS");

        LabelSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelSalario.setText("Salario");

        txtTipoRemuneracion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTipoRemuneracion.setEnabled(false);

        txtAreNotas.setColumns(20);
        txtAreNotas.setLineWrap(true);
        txtAreNotas.setRows(5);
        txtAreNotas.setTabSize(11);
        txtAreNotas.setEnabled(false);
        jScrollPane1.setViewportView(txtAreNotas);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Notas");

        LabelTipoRemuneracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelTipoRemuneracion.setText("Remuneracion");

        cmbSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        cmbSexo.setEnabled(false);

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefono.setEnabled(false);

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCelular.setEnabled(false);

        try {
            txtCedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCedula.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCedula.setEnabled(false);

        try {
            txtNSS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNSS.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNSS.setEnabled(false);

        txtSalario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSalario.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nomina");

        cmbNomina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Principal", "Mirador del Ozama" }));
        cmbNomina.setEnabled(false);

        buttBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-izq_2.png"))); // NOI18N
        buttBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttBackActionPerformed(evt);
            }
        });

        buttNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-der_2.png"))); // NOI18N
        buttNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttNextActionPerformed(evt);
            }
        });

        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        labContador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labContador.setText("1");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("De");

        labelContadorMax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelContadorMax.setText("1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelApellido)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(LabelCedula)
                            .addComponent(LabelNombre)
                            .addComponent(LabelNSS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtCelular)
                            .addComponent(txtTelefono)
                            .addComponent(txtCedula)
                            .addComponent(cmbSexo, 0, 1, Short.MAX_VALUE)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addComponent(txtNSS)
                            .addComponent(cmbEstado, 0, 85, Short.MAX_VALUE)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTipoRemuneracion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelSalario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LabelFechaIngreso)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTipoRemuneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labContador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelContadorMax, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
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
                            .addComponent(jLabel1)
                            .addComponent(LabelTipoRemuneracion))
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
                        .addGap(5, 5, 5)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSalario))
                        .addGap(22, 22, 22)
                        .addComponent(txtTipoRemuneracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labContador)
                            .addComponent(jLabel9)
                            .addComponent(labelContadorMax))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 127;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 14, 30, 0);
        getContentPane().add(jPanel2, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nomina");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 15, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        cmbNomina_2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Principal", "Mirador del Ozama" }));
        cmbNomina_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNomina_2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        getContentPane().add(cmbNomina_2, gridBagConstraints);

        MenuAdministrar.setText("Adminsitrar");

        MenuRegistrarEmpleado.setText("Registrar Empleado");
        MenuRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistrarEmpleadoActionPerformed(evt);
            }
        });
        MenuAdministrar.add(MenuRegistrarEmpleado);

        jMenuItem1.setText("Actualizar");
        MenuAdministrar.add(jMenuItem1);

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
        
        String sql="UPDATE empleados SET nomEmpleado= '"+txtNombre.getText()+"', apeEmpleado= '"+txtApellido.getText()+"',sexoEmpleado ='"+cmbSexo.getSelectedItem().toString()+"',cedEmpleado = '"+txtCedula.getText()+"',telEmpleado='"+txtTelefono.getText()+"',celEmpleado='"+txtCelular.getText()+"',estadoEmpleado='"+cmbEstado.getSelectedItem().toString()+"',fechaIngreso='"+new java.sql.Date(txtFecha.getDate().getTime())+"',tipoNomina='"+cmbNomina.getSelectedItem().toString()+"',salario='"+txtSalario.getText()+"',remuneracion='"+txtTipoRemuneracion.getText()+"',nota='"+txtAreNotas.getText()+"' WHERE nssEmpleado = '"+txtNSS.getText()+"'";
       try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro actualizado");
            Limpiar();
            BuscarEmpleado BusEmp = new BuscarEmpleado();
            BusEmp.setVisible(true);
            dispose();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Error al guardar");

        } 
    }//GEN-LAST:event_buttGuardarActionPerformed

    private void buttLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttLimpiarActionPerformed
                Limpiar();
    }//GEN-LAST:event_buttLimpiarActionPerformed

    private void MenuRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistrarEmpleadoActionPerformed
        AgregarEmpleado AgrEmp = new AgregarEmpleado();
        AgrEmp.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuRegistrarEmpleadoActionPerformed

    private void buttEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttEditarActionPerformed
        desbloquearTXT();
    }//GEN-LAST:event_buttEditarActionPerformed

    private void cmbNomina_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNomina_2ActionPerformed
        carga();
        bloquearTXT();
        contador();
    }//GEN-LAST:event_cmbNomina_2ActionPerformed

    private void buttNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttNextActionPerformed
         try{
            if (rs.isLast()){
                JOptionPane.showMessageDialog(null, "Ultimo registro");}
            else{
                rs.next();                
                labContador.setText(Integer.toString(rs.getRow()));
                llenarTXT();
                bloquearTXT();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_buttNextActionPerformed

    private void buttBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttBackActionPerformed
        try{
            if (rs.isFirst()){
                JOptionPane.showMessageDialog(null, "Primer registro");
            }
                else {
                rs.previous();
                labContador.setText(Integer.toString(rs.getRow()));
                llenarTXT();
                bloquearTXT();
                        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_buttBackActionPerformed

    private void MenuConsultaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaPagoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "En proceso");

    }//GEN-LAST:event_MenuConsultaPagoActionPerformed

    private void MenuContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuContactosActionPerformed
        JOptionPane.showMessageDialog(null, "Contactos: jdelacruzduarte@gmail.com");

    }//GEN-LAST:event_MenuContactosActionPerformed

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
    private javax.swing.JMenu MenuAdministrar;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenuItem MenuBuscarEmpleado;
    private javax.swing.JMenuItem MenuConsultaPago;
    private javax.swing.JMenu MenuConsultar;
    private javax.swing.JMenuItem MenuContactos;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem MenuRegistrarEmpleado;
    private javax.swing.JButton buttBack;
    private javax.swing.JButton buttEditar;
    private javax.swing.JButton buttGuardar;
    private javax.swing.JButton buttLimpiar;
    private javax.swing.JButton buttNext;
    private javax.swing.JButton buttSalir;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JComboBox cmbNomina;
    private javax.swing.JComboBox cmbNomina_2;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labContador;
    private javax.swing.JLabel labelContadorMax;
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
