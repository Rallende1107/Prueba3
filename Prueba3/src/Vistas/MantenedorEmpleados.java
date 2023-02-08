package Vistas;

import Controladores.ControlErrores;
import Controladores.EmpleadoDAO;
import Modelos.Empleados;
import javax.swing.JOptionPane;

/**
 *
 * @authors Rene Allende Francisco Poblete Ulises Rosales
 */
public class MantenedorEmpleados extends javax.swing.JFrame {

    private Empleados emp;

    public MantenedorEmpleados() {
        emp = new Empleados();

        initComponents();
        setLocationRelativeTo(null);
        btnGuardar.setEnabled(false);
        creacion();

    }

    public void activarbotones() {
        if (!txtRut.getText().isEmpty() && !txtNombres.getText().isEmpty() && !txtApellidoPaterno.getText().isEmpty()
                && !txtApellidoMaterno.getText().isEmpty() && !txtTelefono.getText().isEmpty()) {
            btnGuardar.setEnabled(true);

        } else {
            btnGuardar.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbAccion = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtRut = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        cmbTipoEmpleado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO EMPLEADOS");
        setBackground(new java.awt.Color(0, 255, 102));
        setForeground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Formulario de Empleados");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("RUT:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Apellido Paterno:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tipo Emplado:");

        cmbAccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrar Empleado", "Eliminar Empleado", "Actualizar Empleado" }));
        cmbAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccionActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(102, 255, 102));
        btnGuardar.setText("ALMACENAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(102, 255, 204));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 153, 51));
        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnLista.setText("LISTAR EMPLEADOS");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutKeyReleased(evt);
            }
        });

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
        });

        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyReleased(evt);
            }
        });

        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyReleased(evt);
            }
        });

        cmbTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..", "Jefe TI", "Programador", "Cajera", "Supervisor" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Acciones:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Telefono:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Apellido Materno:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel3)))
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(btnLista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        // TODO add your handling code here:
        ListaEmpleados Lempleados = new ListaEmpleados();
        Lempleados.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnListaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        boolean isRutValido = ControlErrores.validarRut(txtRut.getText());
        boolean nombreValido = ControlErrores.largoNombre(txtNombres.getText());
        boolean apellidoPValido = ControlErrores.largoApellidoP(txtApellidoPaterno.getText());
        boolean apellidoMValido = ControlErrores.largoApellidoM(txtApellidoMaterno.getText());
        boolean telefonoValido = ControlErrores.largoTelefono(txtTelefono.getText());
        boolean validaLargoMinimo = ControlErrores.validaLargoMinino(txtNombres.getText(), txtApellidoPaterno.getText(), txtApellidoMaterno.getText(), txtTelefono.getText());
        boolean validacionComboBox = ControlErrores.valBox(cmbTipoEmpleado.getSelectedItem().toString());

        if (validaLargoMinimo == false) {
            JOptionPane.showMessageDialog(null, "El largo de los  campos no puede ser menor o igual a 2");
        } else if (txtRut.getText().length() < 9) {
            JOptionPane.showMessageDialog(null, "El largo del RUT no puede ser menor a 9");
        } else if (txtRut.getText().length() > 18) {
            JOptionPane.showMessageDialog(null, "El largo del RUT no puede ser mayor a 18");
        } else if (isRutValido == false) {
            JOptionPane.showMessageDialog(null, "RUT INVÁLIDO (XXXXXX-Y)");
        } else if (nombreValido == false) {
            JOptionPane.showMessageDialog(null, "El Largo del nombre no puede exeder los 60 caracteres");
        } else if (apellidoPValido == false) {
            JOptionPane.showMessageDialog(null, "El Largo del Apellido Paterno no puede exeder los 60 caracteres");
        } else if (apellidoMValido == false) {
            JOptionPane.showMessageDialog(null, "El Largo del Apellido Materno no puede exeder los 60 caracteres");
        } else if (telefonoValido == false) {
            JOptionPane.showMessageDialog(null, "El Largo del telefono no puede exeder los 9 caracteres");
        } else if (!validacionComboBox) {
            JOptionPane.showMessageDialog(null, "Debes Seleccionar un tipo de Empleado");
        } else {
            emp.setRut(txtRut.getText());
            emp.setNombres(txtNombres.getText());
            emp.setApellidoPaterno(txtApellidoPaterno.getText());
            emp.setApellidoMaterno(txtApellidoMaterno.getText());
            emp.setTelefono(txtTelefono.getText());
            emp.setTipoEmpleado(cmbTipoEmpleado.getSelectedItem().toString());
            EmpleadoDAO dao = new EmpleadoDAO();
            boolean resultado = dao.insertar(emp);

            System.out.println("insertado -> " + resultado);

            if (resultado) {

                JOptionPane.showMessageDialog(rootPane, "El usuario se registro de forma correcta");
               // limpiarcampos();

            } else {
                JOptionPane.showMessageDialog(rootPane, "El usuario no se registro");
            }

        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyReleased
        activarbotones();
    }//GEN-LAST:event_txtRutKeyReleased

    private void txtApellidoPaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyReleased
        activarbotones();
    }//GEN-LAST:event_txtApellidoPaternoKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        activarbotones();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtApellidoMaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyReleased
        activarbotones();
    }//GEN-LAST:event_txtApellidoMaternoKeyReleased

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased
        activarbotones();
    }//GEN-LAST:event_txtNombresKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       limpiarcampos();
       
       

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cmbAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccionActionPerformed
        // TODO add your handling code here:
        if ("Registrar Empleado".equals(cmbAccion.getSelectedItem())) {
            creacion();
            limpiarcampos();
        }
        if ("Actualizar Empleado".equals(cmbAccion.getSelectedItem())) {
            edicion();
            limpiarcampos();
        }
        if ("Eliminar Empleado".equals(cmbAccion.getSelectedItem())) {
            eliminacion();
            limpiarcampos();
        }

    }//GEN-LAST:event_cmbAccionActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        String pregunta = "Seguro desea elimimnar al empleado \nRUT: " + txtRut.getText();
        int confirmacion = JOptionPane.showConfirmDialog(null, pregunta, "Seguro???", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            Borrado(txtRut.getText());
        } else if (confirmacion == JOptionPane.NO_OPTION) {

            JOptionPane.showMessageDialog(null, "Eliminacion cancelada");
        }


    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String rut = txtRut.getText();

        EmpleadoDAO dao = new EmpleadoDAO();
        Empleados empl = dao.buscarPorRut(rut);

        if (empl != null) {
            accionBuscar();
            txtNombres.setText(empl.getNombres());
            txtApellidoPaterno.setText(empl.getApellidoPaterno());
            txtApellidoMaterno.setText(empl.getApellidoMaterno());
            txtTelefono.setText(empl.getTelefono());

            cmbTipoEmpleado.setSelectedItem(empl.getTipoEmpleado());
            btnBorrar.setEnabled(true);
          

        } else {
            JOptionPane.showMessageDialog(rootPane, "El usuario no se encuentra registrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        emp.setRut(txtRut.getText());
        emp.setNombres(txtNombres.getText());
        emp.setApellidoPaterno(txtApellidoPaterno.getText());
        emp.setApellidoMaterno(txtApellidoMaterno.getText());
        emp.setTelefono(txtTelefono.getText());
        emp.setTipoEmpleado(cmbTipoEmpleado.getSelectedItem().toString());

        EmpleadoDAO dao = new EmpleadoDAO();
        boolean resultado = dao.actualizar(emp);

        System.out.println(txtRut.getText());

        if (resultado) {

            JOptionPane.showMessageDialog(rootPane, "El usuario se registro de forma correcta");
          //  limpiarcampos();

        } else {
            JOptionPane.showMessageDialog(rootPane, "El usuario no se registro");
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void Borrado(String rut) {
        EmpleadoDAO dao = new EmpleadoDAO();

        boolean resultado = dao.borrar(rut);
        if (resultado) {

            JOptionPane.showMessageDialog(rootPane, "Usuario " + rut + " eliminado");
          //  limpiarcampos();
            eliminacion();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Usuario" + rut + " no se elimino");
        }

    }

    public void accionBuscar() {
        txtRut.setEnabled(false);

    }

    private void creacion() {

        btnBorrar.setVisible(false);
        btnActualizar.setVisible(false);
        btnGuardar.setVisible(true);
        btnGuardar.setEnabled(false);
        btnBuscar.setVisible(false);
        
        txtRut.setEnabled(true);
        txtRut.setEditable(true);
        txtNombres.setEnabled(true);
        txtApellidoPaterno.setEnabled(true);
        txtApellidoMaterno.setEnabled(true);
        txtTelefono.setEnabled(true);
        cmbTipoEmpleado.setEditable(true);
        cmbTipoEmpleado.setEnabled(true);

    }

    private void edicion() {
        btnBorrar.setVisible(false);
        btnActualizar.setVisible(true);
        btnGuardar.setVisible(false);
        btnBuscar.setVisible(true);
        btnGuardar.setVisible(false);

        txtRut.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidoPaterno.setEnabled(true);
        txtApellidoMaterno.setEnabled(true);
        txtTelefono.setEnabled(true);
        cmbTipoEmpleado.setEnabled(true);

    }

    private void eliminacion() {
        btnBorrar.setVisible(true);
        btnBorrar.setEnabled(false);
        btnActualizar.setVisible(false);
        btnGuardar.setVisible(false);
        btnBuscar.setVisible(true);
        
        
        txtRut.setEditable(true);
        txtNombres.setEnabled(false);
        txtApellidoPaterno.setEnabled(false);
        txtApellidoMaterno.setEnabled(false);
        txtTelefono.setEnabled(false);
        cmbTipoEmpleado.setEditable(false);
        cmbTipoEmpleado.setEnabled(false);

    }

    
        private void limpiarcampos() {

        txtRut.setText(null);
        txtNombres.setText(null);
        txtApellidoPaterno.setText(null);
        txtApellidoMaterno.setText(null);
        txtTelefono.setText(null);
        cmbTipoEmpleado.setSelectedIndex(0);


        
    }
    
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
            java.util.logging.Logger.getLogger(MantenedorEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorEmpleados().setVisible(true);
            }
        });
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbAccion;
    private javax.swing.JComboBox<String> cmbTipoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
